
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/interfaces/sensor_provider.mojom
//

package org.chromium.device.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


class SensorProvider_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SensorProvider, SensorProvider.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SensorProvider, SensorProvider.Proxy>() {
    
        public String getName() {
            return "device::mojom::SensorProvider";
        }
    
        public int getVersion() {
          return 0;
        }
    
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        public Stub buildStub(org.chromium.mojo.system.Core core, SensorProvider impl) {
            return new Stub(core, impl);
        }
    
        public SensorProvider[] buildArray(int size) {
          return new SensorProvider[size];
        }
    };


    private static final int GET_SENSOR_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SensorProvider.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void getSensor(
int type, org.chromium.mojo.bindings.InterfaceRequest<Sensor> sensorRequest, 
GetSensorResponse callback) {

            SensorProviderGetSensorParams _message = new SensorProviderGetSensorParams();

            _message.type = type;

            _message.sensorRequest = sensorRequest;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_SENSOR_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new SensorProviderGetSensorResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SensorProvider> {

        Stub(org.chromium.mojo.system.Core core, SensorProvider impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                SensorProvider_Internal.MANAGER, messageWithHeader);
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), SensorProvider_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
            
                    case GET_SENSOR_ORDINAL: {
            
                        SensorProviderGetSensorParams data =
                                SensorProviderGetSensorParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().getSensor(data.type, data.sensorRequest, new SensorProviderGetSensorResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class SensorProviderGetSensorParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int type;
        public org.chromium.mojo.bindings.InterfaceRequest<Sensor> sensorRequest;
    
        private SensorProviderGetSensorParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public SensorProviderGetSensorParams() {
            this(0);
        }
    
        public static SensorProviderGetSensorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SensorProviderGetSensorParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static SensorProviderGetSensorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SensorProviderGetSensorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new SensorProviderGetSensorParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.type = decoder0.readInt(8);
                        SensorType.validate(result.type);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.sensorRequest = decoder0.readInterfaceRequest(12, false);
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
            
            encoder0.encode(type, 8);
            
            encoder0.encode(sensorRequest, 12, false);
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
            SensorProviderGetSensorParams other = (SensorProviderGetSensorParams) object;
            if (this.type!= other.type)
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.sensorRequest, other.sensorRequest))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(type);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(sensorRequest);
            return result;
        }
    }



    
    static final class SensorProviderGetSensorResponseParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public SensorInitParams initParams;
        public org.chromium.mojo.bindings.InterfaceRequest<SensorClient> clientRequest;
    
        private SensorProviderGetSensorResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public SensorProviderGetSensorResponseParams() {
            this(0);
        }
    
        public static SensorProviderGetSensorResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SensorProviderGetSensorResponseParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static SensorProviderGetSensorResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SensorProviderGetSensorResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new SensorProviderGetSensorResponseParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.initParams = SensorInitParams.decode(decoder1);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.clientRequest = decoder0.readInterfaceRequest(16, true);
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
            
            encoder0.encode(initParams, 8, true);
            
            encoder0.encode(clientRequest, 16, true);
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
            SensorProviderGetSensorResponseParams other = (SensorProviderGetSensorResponseParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.initParams, other.initParams))
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.clientRequest, other.clientRequest))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(initParams);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(clientRequest);
            return result;
        }
    }

    static class SensorProviderGetSensorResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final SensorProvider.GetSensorResponse mCallback;

        SensorProviderGetSensorResponseParamsForwardToCallback(SensorProvider.GetSensorResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_SENSOR_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                SensorProviderGetSensorResponseParams response = SensorProviderGetSensorResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.initParams, response.clientRequest);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class SensorProviderGetSensorResponseParamsProxyToResponder implements SensorProvider.GetSensorResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SensorProviderGetSensorResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(SensorInitParams initParams, org.chromium.mojo.bindings.InterfaceRequest<SensorClient> clientRequest) {
            SensorProviderGetSensorResponseParams _response = new SensorProviderGetSensorResponseParams();

            _response.initParams = initParams;

            _response.clientRequest = clientRequest;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_SENSOR_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
