package com.le.test.service;

public final class RpcObject {
  private RpcObject() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface request_NetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.leehongee.netserver.net.bean.request_Net)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string cla = 1;</code>
     */
    boolean hasCla();
    /**
     * <code>required string cla = 1;</code>
     */
    java.lang.String getCla();
    /**
     * <code>required string cla = 1;</code>
     */
    com.google.protobuf.ByteString
        getClaBytes();

    /**
     * <code>required string methodName = 2;</code>
     */
    boolean hasMethodName();
    /**
     * <code>required string methodName = 2;</code>
     */
    java.lang.String getMethodName();
    /**
     * <code>required string methodName = 2;</code>
     */
    com.google.protobuf.ByteString
        getMethodNameBytes();

    /**
     * <code>repeated string args = 3;</code>
     */
    java.util.List<java.lang.String>
        getArgsList();
    /**
     * <code>repeated string args = 3;</code>
     */
    int getArgsCount();
    /**
     * <code>repeated string args = 3;</code>
     */
    java.lang.String getArgs(int index);
    /**
     * <code>repeated string args = 3;</code>
     */
    com.google.protobuf.ByteString
        getArgsBytes(int index);
  }
  /**
   * Protobuf type {@code com.leehongee.netserver.net.bean.request_Net}
   */
  public  static final class request_Net extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.leehongee.netserver.net.bean.request_Net)
      request_NetOrBuilder {
    // Use request_Net.newBuilder() to construct.
    private request_Net(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private request_Net() {
      cla_ = "";
      methodName_ = "";
      args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private request_Net(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              cla_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              methodName_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                args_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              args_.add(bs);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          args_ = args_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.le.test.service.RpcObject.internal_static_com_leehongee_netserver_net_bean_request_Net_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.le.test.service.RpcObject.internal_static_com_leehongee_netserver_net_bean_request_Net_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.le.test.service.RpcObject.request_Net.class, com.le.test.service.RpcObject.request_Net.Builder.class);
    }

    private int bitField0_;
    public static final int CLA_FIELD_NUMBER = 1;
    private volatile java.lang.Object cla_;
    /**
     * <code>required string cla = 1;</code>
     */
    public boolean hasCla() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string cla = 1;</code>
     */
    public java.lang.String getCla() {
      java.lang.Object ref = cla_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          cla_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string cla = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClaBytes() {
      java.lang.Object ref = cla_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cla_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int METHODNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object methodName_;
    /**
     * <code>required string methodName = 2;</code>
     */
    public boolean hasMethodName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string methodName = 2;</code>
     */
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          methodName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string methodName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ARGS_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList args_;
    /**
     * <code>repeated string args = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getArgsList() {
      return args_;
    }
    /**
     * <code>repeated string args = 3;</code>
     */
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <code>repeated string args = 3;</code>
     */
    public java.lang.String getArgs(int index) {
      return args_.get(index);
    }
    /**
     * <code>repeated string args = 3;</code>
     */
    public com.google.protobuf.ByteString
        getArgsBytes(int index) {
      return args_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCla()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMethodName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cla_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, methodName_);
      }
      for (int i = 0; i < args_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, args_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cla_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, methodName_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < args_.size(); i++) {
          dataSize += computeStringSizeNoTag(args_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getArgsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.le.test.service.RpcObject.request_Net)) {
        return super.equals(obj);
      }
      com.le.test.service.RpcObject.request_Net other = (com.le.test.service.RpcObject.request_Net) obj;

      boolean result = true;
      result = result && (hasCla() == other.hasCla());
      if (hasCla()) {
        result = result && getCla()
            .equals(other.getCla());
      }
      result = result && (hasMethodName() == other.hasMethodName());
      if (hasMethodName()) {
        result = result && getMethodName()
            .equals(other.getMethodName());
      }
      result = result && getArgsList()
          .equals(other.getArgsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasCla()) {
        hash = (37 * hash) + CLA_FIELD_NUMBER;
        hash = (53 * hash) + getCla().hashCode();
      }
      if (hasMethodName()) {
        hash = (37 * hash) + METHODNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMethodName().hashCode();
      }
      if (getArgsCount() > 0) {
        hash = (37 * hash) + ARGS_FIELD_NUMBER;
        hash = (53 * hash) + getArgsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.le.test.service.RpcObject.request_Net parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.le.test.service.RpcObject.request_Net parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.le.test.service.RpcObject.request_Net parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.le.test.service.RpcObject.request_Net parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.le.test.service.RpcObject.request_Net parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.le.test.service.RpcObject.request_Net parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.le.test.service.RpcObject.request_Net parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.le.test.service.RpcObject.request_Net parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.le.test.service.RpcObject.request_Net parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.le.test.service.RpcObject.request_Net parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.le.test.service.RpcObject.request_Net prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.leehongee.netserver.net.bean.request_Net}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.leehongee.netserver.net.bean.request_Net)
        com.le.test.service.RpcObject.request_NetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.le.test.service.RpcObject.internal_static_com_leehongee_netserver_net_bean_request_Net_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.le.test.service.RpcObject.internal_static_com_leehongee_netserver_net_bean_request_Net_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.le.test.service.RpcObject.request_Net.class, com.le.test.service.RpcObject.request_Net.Builder.class);
      }

      // Construct using com.le.test.service.RpcObject.request_Net.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        cla_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        methodName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.le.test.service.RpcObject.internal_static_com_leehongee_netserver_net_bean_request_Net_descriptor;
      }

      public com.le.test.service.RpcObject.request_Net getDefaultInstanceForType() {
        return com.le.test.service.RpcObject.request_Net.getDefaultInstance();
      }

      public com.le.test.service.RpcObject.request_Net build() {
        com.le.test.service.RpcObject.request_Net result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.le.test.service.RpcObject.request_Net buildPartial() {
        com.le.test.service.RpcObject.request_Net result = new com.le.test.service.RpcObject.request_Net(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cla_ = cla_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.methodName_ = methodName_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          args_ = args_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.args_ = args_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.le.test.service.RpcObject.request_Net) {
          return mergeFrom((com.le.test.service.RpcObject.request_Net)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.le.test.service.RpcObject.request_Net other) {
        if (other == com.le.test.service.RpcObject.request_Net.getDefaultInstance()) return this;
        if (other.hasCla()) {
          bitField0_ |= 0x00000001;
          cla_ = other.cla_;
          onChanged();
        }
        if (other.hasMethodName()) {
          bitField0_ |= 0x00000002;
          methodName_ = other.methodName_;
          onChanged();
        }
        if (!other.args_.isEmpty()) {
          if (args_.isEmpty()) {
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureArgsIsMutable();
            args_.addAll(other.args_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCla()) {
          return false;
        }
        if (!hasMethodName()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.le.test.service.RpcObject.request_Net parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.le.test.service.RpcObject.request_Net) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object cla_ = "";
      /**
       * <code>required string cla = 1;</code>
       */
      public boolean hasCla() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string cla = 1;</code>
       */
      public java.lang.String getCla() {
        java.lang.Object ref = cla_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            cla_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string cla = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClaBytes() {
        java.lang.Object ref = cla_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cla_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string cla = 1;</code>
       */
      public Builder setCla(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        cla_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string cla = 1;</code>
       */
      public Builder clearCla() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cla_ = getDefaultInstance().getCla();
        onChanged();
        return this;
      }
      /**
       * <code>required string cla = 1;</code>
       */
      public Builder setClaBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        cla_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object methodName_ = "";
      /**
       * <code>required string methodName = 2;</code>
       */
      public boolean hasMethodName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string methodName = 2;</code>
       */
      public java.lang.String getMethodName() {
        java.lang.Object ref = methodName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            methodName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string methodName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMethodNameBytes() {
        java.lang.Object ref = methodName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          methodName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string methodName = 2;</code>
       */
      public Builder setMethodName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        methodName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string methodName = 2;</code>
       */
      public Builder clearMethodName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        methodName_ = getDefaultInstance().getMethodName();
        onChanged();
        return this;
      }
      /**
       * <code>required string methodName = 2;</code>
       */
      public Builder setMethodNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        methodName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureArgsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          args_ = new com.google.protobuf.LazyStringArrayList(args_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getArgsList() {
        return args_.getUnmodifiableView();
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public int getArgsCount() {
        return args_.size();
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public java.lang.String getArgs(int index) {
        return args_.get(index);
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public com.google.protobuf.ByteString
          getArgsBytes(int index) {
        return args_.getByteString(index);
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public Builder setArgs(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
        args_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public Builder addArgs(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
        args_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public Builder addAllArgs(
          java.lang.Iterable<java.lang.String> values) {
        ensureArgsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, args_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public Builder clearArgs() {
        args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string args = 3;</code>
       */
      public Builder addArgsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
        args_.add(value);
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.leehongee.netserver.net.bean.request_Net)
    }

    // @@protoc_insertion_point(class_scope:com.leehongee.netserver.net.bean.request_Net)
    private static final com.le.test.service.RpcObject.request_Net DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.le.test.service.RpcObject.request_Net();
    }

    public static com.le.test.service.RpcObject.request_Net getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<request_Net>
        PARSER = new com.google.protobuf.AbstractParser<request_Net>() {
      public request_Net parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new request_Net(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<request_Net> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<request_Net> getParserForType() {
      return PARSER;
    }

    public com.le.test.service.RpcObject.request_Net getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_leehongee_netserver_net_bean_request_Net_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_leehongee_netserver_net_bean_request_Net_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rRequest.proto\022 com.leehongee.netserver" +
      ".net.bean\"<\n\013request_Net\022\013\n\003cla\030\001 \002(\t\022\022\n" +
      "\nmethodName\030\002 \002(\t\022\014\n\004args\030\003 \003(\tB \n\023com.l" +
      "e.test.serviceB\tRpcObject"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_leehongee_netserver_net_bean_request_Net_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_leehongee_netserver_net_bean_request_Net_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_leehongee_netserver_net_bean_request_Net_descriptor,
        new java.lang.String[] { "Cla", "MethodName", "Args", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
