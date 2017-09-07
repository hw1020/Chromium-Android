
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/ui_metrics/sadtab_metrics_types.h

package org.chromium.chrome.browser.tab;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SadTabEvent.DISPLAYED, SadTabEvent.BUTTON_CLICKED, SadTabEvent.HELP_LINK_CLICKED,
    SadTabEvent.MAX_SAD_TAB_EVENT
})
@Retention(RetentionPolicy.SOURCE)
public @interface SadTabEvent {
  /**
   * Records that the Sad Tab was displayed.
   */
  int DISPLAYED = 0;
  /**
   * Records that the main Sad Tab button was triggered.
   */
  int BUTTON_CLICKED = 1;
  /**
   * Records that the Sad Tab help link was triggered.
   */
  int HELP_LINK_CLICKED = 2;
  /**
   * Enum end marker.
   */
  int MAX_SAD_TAB_EVENT = 3;
}
