
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/modules/payments/payment_request.mojom
//

package org.chromium.payments.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface PaymentRequest extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PaymentRequest, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PaymentRequest, PaymentRequest.Proxy> MANAGER = PaymentRequest_Internal.MANAGER;


    void init(
PaymentRequestClient client, PaymentMethodData[] methodData, PaymentDetails details, PaymentOptions options);



    void show(
);



    void updateWith(
PaymentDetails details);



    void abort(
);



    void complete(
int result);



    void canMakePayment(
);


}
