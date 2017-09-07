
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     skia/public/interfaces/bitmap.mojom
//

package org.chromium.skia.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public final class Bitmap extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int colorType;
    public int alphaType;
    public int profileType;
    public int width;
    public int height;
    public long rowBytes;
    public byte[] pixelData;

    private Bitmap(int version) {
        super(STRUCT_SIZE, version);
    }

    public Bitmap() {
        this(0);
    }

    public static Bitmap deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static Bitmap deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static Bitmap decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        Bitmap result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new Bitmap(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.colorType = decoder0.readInt(8);
                    ColorType.validate(result.colorType);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.alphaType = decoder0.readInt(12);
                    AlphaType.validate(result.alphaType);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.profileType = decoder0.readInt(16);
                    ColorProfileType.validate(result.profileType);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.width = decoder0.readInt(20);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.height = decoder0.readInt(24);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.rowBytes = decoder0.readLong(32);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.pixelData = decoder0.readBytes(40, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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
        
        encoder0.encode(colorType, 8);
        
        encoder0.encode(alphaType, 12);
        
        encoder0.encode(profileType, 16);
        
        encoder0.encode(width, 20);
        
        encoder0.encode(height, 24);
        
        encoder0.encode(rowBytes, 32);
        
        encoder0.encode(pixelData, 40, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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
        Bitmap other = (Bitmap) object;
        if (this.colorType!= other.colorType)
            return false;
        if (this.alphaType!= other.alphaType)
            return false;
        if (this.profileType!= other.profileType)
            return false;
        if (this.width!= other.width)
            return false;
        if (this.height!= other.height)
            return false;
        if (this.rowBytes!= other.rowBytes)
            return false;
        if (!java.util.Arrays.equals(this.pixelData, other.pixelData))
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
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(colorType);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(alphaType);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(profileType);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(width);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(height);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(rowBytes);
        result = prime * result + java.util.Arrays.hashCode(pixelData);
        return result;
    }
}