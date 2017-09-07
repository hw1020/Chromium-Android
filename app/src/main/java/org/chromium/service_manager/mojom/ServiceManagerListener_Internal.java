
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/service_manager/public/interfaces/service_manager.mojom
//

package org.chromium.service_manager.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


class ServiceManagerListener_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ServiceManagerListener, ServiceManagerListener.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ServiceManagerListener, ServiceManagerListener.Proxy>() {
    
        public String getName() {
            return "service_manager::mojom::ServiceManagerListener";
        }
    
        public int getVersion() {
          return 0;
        }
    
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        public Stub buildStub(org.chromium.mojo.system.Core core, ServiceManagerListener impl) {
            return new Stub(core, impl);
        }
    
        public ServiceManagerListener[] buildArray(int size) {
          return new ServiceManagerListener[size];
        }
    };


    private static final int ON_INIT_ORDINAL = 0;

    private static final int ON_SERVICE_CREATED_ORDINAL = 1;

    private static final int ON_SERVICE_STARTED_ORDINAL = 2;

    private static final int ON_SERVICE_PID_RECEIVED_ORDINAL = 3;

    private static final int ON_SERVICE_FAILED_TO_START_ORDINAL = 4;

    private static final int ON_SERVICE_STOPPED_ORDINAL = 5;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ServiceManagerListener.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onInit(
RunningServiceInfo[] runningServices) {

            ServiceManagerListenerOnInitParams _message = new ServiceManagerListenerOnInitParams();

            _message.runningServices = runningServices;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_INIT_ORDINAL)));

        }


        @Override
        public void onServiceCreated(
RunningServiceInfo service) {

            ServiceManagerListenerOnServiceCreatedParams _message = new ServiceManagerListenerOnServiceCreatedParams();

            _message.service = service;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SERVICE_CREATED_ORDINAL)));

        }


        @Override
        public void onServiceStarted(
Identity identity, int pid) {

            ServiceManagerListenerOnServiceStartedParams _message = new ServiceManagerListenerOnServiceStartedParams();

            _message.identity = identity;

            _message.pid = pid;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SERVICE_STARTED_ORDINAL)));

        }


        @Override
        public void onServicePidReceived(
Identity identity, int pid) {

            ServiceManagerListenerOnServicePidReceivedParams _message = new ServiceManagerListenerOnServicePidReceivedParams();

            _message.identity = identity;

            _message.pid = pid;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SERVICE_PID_RECEIVED_ORDINAL)));

        }


        @Override
        public void onServiceFailedToStart(
Identity identity) {

            ServiceManagerListenerOnServiceFailedToStartParams _message = new ServiceManagerListenerOnServiceFailedToStartParams();

            _message.identity = identity;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SERVICE_FAILED_TO_START_ORDINAL)));

        }


        @Override
        public void onServiceStopped(
Identity identity) {

            ServiceManagerListenerOnServiceStoppedParams _message = new ServiceManagerListenerOnServiceStoppedParams();

            _message.identity = identity;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SERVICE_STOPPED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ServiceManagerListener> {

        Stub(org.chromium.mojo.system.Core core, ServiceManagerListener impl) {
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
                                ServiceManagerListener_Internal.MANAGER, messageWithHeader);
            
            
            
            
            
                    case ON_INIT_ORDINAL: {
            
                        ServiceManagerListenerOnInitParams data =
                                ServiceManagerListenerOnInitParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().onInit(data.runningServices);
                        return true;
                    }
            
            
            
            
            
                    case ON_SERVICE_CREATED_ORDINAL: {
            
                        ServiceManagerListenerOnServiceCreatedParams data =
                                ServiceManagerListenerOnServiceCreatedParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().onServiceCreated(data.service);
                        return true;
                    }
            
            
            
            
            
                    case ON_SERVICE_STARTED_ORDINAL: {
            
                        ServiceManagerListenerOnServiceStartedParams data =
                                ServiceManagerListenerOnServiceStartedParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().onServiceStarted(data.identity, data.pid);
                        return true;
                    }
            
            
            
            
            
                    case ON_SERVICE_PID_RECEIVED_ORDINAL: {
            
                        ServiceManagerListenerOnServicePidReceivedParams data =
                                ServiceManagerListenerOnServicePidReceivedParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().onServicePidReceived(data.identity, data.pid);
                        return true;
                    }
            
            
            
            
            
                    case ON_SERVICE_FAILED_TO_START_ORDINAL: {
            
                        ServiceManagerListenerOnServiceFailedToStartParams data =
                                ServiceManagerListenerOnServiceFailedToStartParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().onServiceFailedToStart(data.identity);
                        return true;
                    }
            
            
            
            
            
                    case ON_SERVICE_STOPPED_ORDINAL: {
            
                        ServiceManagerListenerOnServiceStoppedParams data =
                                ServiceManagerListenerOnServiceStoppedParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().onServiceStopped(data.identity);
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
                                getCore(), ServiceManagerListener_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class ServiceManagerListenerOnInitParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public RunningServiceInfo[] runningServices;
    
        private ServiceManagerListenerOnInitParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceManagerListenerOnInitParams() {
            this(0);
        }
    
        public static ServiceManagerListenerOnInitParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceManagerListenerOnInitParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceManagerListenerOnInitParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceManagerListenerOnInitParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceManagerListenerOnInitParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.runningServices = new RunningServiceInfo[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.runningServices[i1] = RunningServiceInfo.decode(decoder2);
                        }
                    }
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
            
            if (runningServices == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(runningServices.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < runningServices.length; ++i0) {
                    
                    encoder1.encode(runningServices[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
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
            ServiceManagerListenerOnInitParams other = (ServiceManagerListenerOnInitParams) object;
            if (!java.util.Arrays.deepEquals(this.runningServices, other.runningServices))
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
            result = prime * result + java.util.Arrays.deepHashCode(runningServices);
            return result;
        }
    }



    
    static final class ServiceManagerListenerOnServiceCreatedParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public RunningServiceInfo service;
    
        private ServiceManagerListenerOnServiceCreatedParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceManagerListenerOnServiceCreatedParams() {
            this(0);
        }
    
        public static ServiceManagerListenerOnServiceCreatedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceManagerListenerOnServiceCreatedParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceManagerListenerOnServiceCreatedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceManagerListenerOnServiceCreatedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceManagerListenerOnServiceCreatedParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.service = RunningServiceInfo.decode(decoder1);
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
            
            encoder0.encode(service, 8, false);
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
            ServiceManagerListenerOnServiceCreatedParams other = (ServiceManagerListenerOnServiceCreatedParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.service, other.service))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(service);
            return result;
        }
    }



    
    static final class ServiceManagerListenerOnServiceStartedParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public Identity identity;
        public int pid;
    
        private ServiceManagerListenerOnServiceStartedParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceManagerListenerOnServiceStartedParams() {
            this(0);
        }
    
        public static ServiceManagerListenerOnServiceStartedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceManagerListenerOnServiceStartedParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceManagerListenerOnServiceStartedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceManagerListenerOnServiceStartedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceManagerListenerOnServiceStartedParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.identity = Identity.decode(decoder1);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.pid = decoder0.readInt(16);
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
            
            encoder0.encode(identity, 8, false);
            
            encoder0.encode(pid, 16);
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
            ServiceManagerListenerOnServiceStartedParams other = (ServiceManagerListenerOnServiceStartedParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.identity, other.identity))
                return false;
            if (this.pid!= other.pid)
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(identity);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(pid);
            return result;
        }
    }



    
    static final class ServiceManagerListenerOnServicePidReceivedParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public Identity identity;
        public int pid;
    
        private ServiceManagerListenerOnServicePidReceivedParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceManagerListenerOnServicePidReceivedParams() {
            this(0);
        }
    
        public static ServiceManagerListenerOnServicePidReceivedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceManagerListenerOnServicePidReceivedParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceManagerListenerOnServicePidReceivedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceManagerListenerOnServicePidReceivedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceManagerListenerOnServicePidReceivedParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.identity = Identity.decode(decoder1);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.pid = decoder0.readInt(16);
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
            
            encoder0.encode(identity, 8, false);
            
            encoder0.encode(pid, 16);
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
            ServiceManagerListenerOnServicePidReceivedParams other = (ServiceManagerListenerOnServicePidReceivedParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.identity, other.identity))
                return false;
            if (this.pid!= other.pid)
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(identity);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(pid);
            return result;
        }
    }



    
    static final class ServiceManagerListenerOnServiceFailedToStartParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public Identity identity;
    
        private ServiceManagerListenerOnServiceFailedToStartParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceManagerListenerOnServiceFailedToStartParams() {
            this(0);
        }
    
        public static ServiceManagerListenerOnServiceFailedToStartParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceManagerListenerOnServiceFailedToStartParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceManagerListenerOnServiceFailedToStartParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceManagerListenerOnServiceFailedToStartParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceManagerListenerOnServiceFailedToStartParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.identity = Identity.decode(decoder1);
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
            
            encoder0.encode(identity, 8, false);
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
            ServiceManagerListenerOnServiceFailedToStartParams other = (ServiceManagerListenerOnServiceFailedToStartParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.identity, other.identity))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(identity);
            return result;
        }
    }



    
    static final class ServiceManagerListenerOnServiceStoppedParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public Identity identity;
    
        private ServiceManagerListenerOnServiceStoppedParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceManagerListenerOnServiceStoppedParams() {
            this(0);
        }
    
        public static ServiceManagerListenerOnServiceStoppedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceManagerListenerOnServiceStoppedParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceManagerListenerOnServiceStoppedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceManagerListenerOnServiceStoppedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceManagerListenerOnServiceStoppedParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.identity = Identity.decode(decoder1);
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
            
            encoder0.encode(identity, 8, false);
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
            ServiceManagerListenerOnServiceStoppedParams other = (ServiceManagerListenerOnServiceStoppedParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.identity, other.identity))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(identity);
            return result;
        }
    }



}
