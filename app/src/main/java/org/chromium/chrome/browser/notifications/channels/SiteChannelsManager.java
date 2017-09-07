// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.notifications.channels;

import android.app.NotificationManager;
import android.content.Context;
import android.support.annotation.Nullable;

import org.chromium.base.ContextUtils;
import org.chromium.base.VisibleForTesting;
import org.chromium.chrome.browser.notifications.NotificationChannelStatus;
import org.chromium.chrome.browser.notifications.NotificationManagerProxy;
import org.chromium.chrome.browser.notifications.NotificationManagerProxyImpl;
import org.chromium.chrome.browser.notifications.NotificationSettingsBridge.SiteChannel;
import org.chromium.chrome.browser.preferences.website.WebsiteAddress;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates/deletes and queries our notification channels for websites.
 */
public class SiteChannelsManager {
    private static final String CHANNEL_ID_SEPARATOR = ";";

    private final NotificationManagerProxy mNotificationManager;

    public static SiteChannelsManager getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        public static final SiteChannelsManager INSTANCE =
                new SiteChannelsManager(new NotificationManagerProxyImpl(
                        (NotificationManager) ContextUtils.getApplicationContext().getSystemService(
                                Context.NOTIFICATION_SERVICE)));
    }

    @VisibleForTesting
    SiteChannelsManager(NotificationManagerProxy notificationManagerProxy) {
        mNotificationManager = notificationManagerProxy;
    }

    /**
     * Creates a channel for the given origin, unless a channel for this origin
     * already exists. The channel will appear within the Sites channel
     * group, with default importance, or no importance if created as blocked.
     * @param origin The site origin, to be used as the channel's user-visible name.
     * @param creationTime A string representing the time of channel creation.
     * @param enabled Determines whether the channel will be created as enabled or blocked.
     * @return The channel created for the given origin.
     */
    public SiteChannel createSiteChannel(String origin, long creationTime, boolean enabled) {
        SiteChannel preexistingChannel = getSiteChannelForOrigin(origin);
        if (preexistingChannel != null) {
            return preexistingChannel;
        }
        // Channel group must be created before the channel.
        mNotificationManager.createNotificationChannelGroup(
                ChannelDefinitions.getChannelGroup(ChannelDefinitions.CHANNEL_GROUP_ID_SITES));
        SiteChannel siteChannel = new SiteChannel(createChannelId(origin, creationTime), origin,
                creationTime,
                enabled ? NotificationChannelStatus.ENABLED : NotificationChannelStatus.BLOCKED);
        mNotificationManager.createNotificationChannel(siteChannel.toChannel());
        return siteChannel;
    }

    private @Nullable SiteChannel getSiteChannelForOrigin(String origin) {
        String normalizedOrigin = WebsiteAddress.create(origin).getOrigin();
        for (SiteChannel channel : getSiteChannels()) {
            if (channel.getOrigin().equals(normalizedOrigin)) {
                return channel;
            }
        }
        return null;
    }

    /**
     * Deletes the channel associated with this channel ID.
     */
    public void deleteSiteChannel(String channelId) {
        mNotificationManager.deleteNotificationChannel(channelId);
    }

    /**
     * Gets the status of the channel associated with this channelId.
     * @return ALLOW, BLOCKED, or UNAVAILABLE (if the channel was never created or was deleted).
     */
    public @NotificationChannelStatus int getChannelStatus(String channelId) {
        Channel channel = mNotificationManager.getNotificationChannel(channelId);
        if (channel == null) return NotificationChannelStatus.UNAVAILABLE;
        return toChannelStatus(channel.getImportance());
    }

    /**
     * Gets an array of active site channels (i.e. they have been created on the notification
     * manager). This includes enabled and blocked channels.
     */
    public SiteChannel[] getSiteChannels() {
        List<Channel> channels = mNotificationManager.getNotificationChannels();
        List<SiteChannel> siteChannels = new ArrayList<>();
        for (Channel channel : channels) {
            if (isValidSiteChannelId(channel.getId())) {
                siteChannels.add(toSiteChannel(channel));
            }
        }
        return siteChannels.toArray(new SiteChannel[siteChannels.size()]);
    }

    private static SiteChannel toSiteChannel(Channel channel) {
        String originAndTimestamp =
                channel.getId().substring(ChannelDefinitions.CHANNEL_ID_PREFIX_SITES.length());
        String[] parts = originAndTimestamp.split(CHANNEL_ID_SEPARATOR);
        assert parts.length == 2;
        return new SiteChannel(channel.getId(), parts[0], Long.parseLong(parts[1]),
                toChannelStatus(channel.getImportance()));
    }

    static boolean isValidSiteChannelId(String channelId) {
        return channelId.startsWith(ChannelDefinitions.CHANNEL_ID_PREFIX_SITES)
                && channelId.substring(ChannelDefinitions.CHANNEL_ID_PREFIX_SITES.length())
                           .contains(CHANNEL_ID_SEPARATOR);
    }

    /**
     * Converts a site's origin and creation timestamp to a canonical channel id.
     */
    public static String createChannelId(String origin, long creationTime) {
        return ChannelDefinitions.CHANNEL_ID_PREFIX_SITES
                + WebsiteAddress.create(origin).getOrigin() + CHANNEL_ID_SEPARATOR + creationTime;
    }

    /**
     * Converts the channel id of a notification channel to a site origin. This is only valid for
     * site notification channels, i.e. channels with ids beginning with
     * {@link ChannelDefinitions#CHANNEL_ID_PREFIX_SITES}.
     */
    public static String toSiteOrigin(String channelId) {
        assert channelId.startsWith(ChannelDefinitions.CHANNEL_ID_PREFIX_SITES);
        return channelId.substring(ChannelDefinitions.CHANNEL_ID_PREFIX_SITES.length())
                .split(CHANNEL_ID_SEPARATOR)[0];
    }

    /**
     * Converts a notification channel's importance to ENABLED or BLOCKED.
     */
    private static @NotificationChannelStatus int toChannelStatus(int importance) {
        switch (importance) {
            case NotificationManager.IMPORTANCE_NONE:
                return NotificationChannelStatus.BLOCKED;
            default:
                return NotificationChannelStatus.ENABLED;
        }
    }

    public String getChannelIdForOrigin(String origin) {
        SiteChannel channel = getSiteChannelForOrigin(origin);
        // Fall back to generic Sites channel if a channel for this origin doesn't exist.
        return channel == null ? ChannelDefinitions.CHANNEL_ID_SITES : channel.getId();
    }
}
