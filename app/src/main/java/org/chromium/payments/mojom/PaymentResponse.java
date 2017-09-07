
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


public final class PaymentResponse extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String methodName;
    public String stringifiedDetails;
    public PaymentAddress shippingAddress;
    public String shippingOption;
    public String payerName;
    public String payerEmail;
    public String payerPhone;

    private PaymentResponse(int version) {
        super(STRUCT_SIZE, version);
    }

    public PaymentResponse() {
        this(0);
    }

    public static PaymentResponse deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static PaymentResponse deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static PaymentResponse decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        PaymentResponse result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new PaymentResponse(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.methodName = decoder0.readString(8, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.stringifiedDetails = decoder0.readString(16, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.shippingAddress = PaymentAddress.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.shippingOption = decoder0.readString(32, true);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.payerName = decoder0.readString(40, true);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.payerEmail = decoder0.readString(48, true);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.payerPhone = decoder0.readString(56, true);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(methodName, 8, false);
        
        encoder0.encode(stringifiedDetails, 16, false);
        
        encoder0.encode(shippingAddress, 24, true);
        
        encoder0.encode(shippingOption, 32, true);
        
        encoder0.encode(payerName, 40, true);
        
        encoder0.encode(payerEmail, 48, true);
        
        encoder0.encode(payerPhone, 56, true);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        PaymentResponse other = (PaymentResponse) object;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.methodName, other.methodName))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.stringifiedDetails, other.stringifiedDetails))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.shippingAddress, other.shippingAddress))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.shippingOption, other.shippingOption))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.payerName, other.payerName))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.payerEmail, other.payerEmail))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.payerPhone, other.payerPhone))
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(methodName);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(stringifiedDetails);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(shippingAddress);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(shippingOption);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(payerName);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(payerEmail);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(payerPhone);
        return result;
    }
}