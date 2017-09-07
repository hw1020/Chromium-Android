
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/interfaces/wake_lock_provider.mojom
//

package org.chromium.device.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface WakeLockProvider extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends WakeLockProvider, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WakeLockProvider, WakeLockProvider.Proxy> MANAGER = WakeLockProvider_Internal.MANAGER;


    void getWakeLockContextForId(
int contextId, org.chromium.mojo.bindings.InterfaceRequest<WakeLockContext> context);



    void getWakeLockWithoutContext(
int type, int reason, String description, org.chromium.mojo.bindings.InterfaceRequest<WakeLock> wakeLock);


}
