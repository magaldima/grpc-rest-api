// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: portfolio.proto

package io.magaldima.api;

/**
 * Protobuf type {@code api.Portfolio}
 */
public  final class Portfolio extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.Portfolio)
    PortfolioOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Portfolio.newBuilder() to construct.
  private Portfolio(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Portfolio() {
    id_ = "";
    currency_ = "";
    positions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Portfolio(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            currency_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              positions_ = new java.util.ArrayList<io.magaldima.api.Position>();
              mutable_bitField0_ |= 0x00000004;
            }
            positions_.add(
                input.readMessage(io.magaldima.api.Position.parser(), extensionRegistry));
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
        positions_ = java.util.Collections.unmodifiableList(positions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.magaldima.api.PortfoliosProto.internal_static_api_Portfolio_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.magaldima.api.PortfoliosProto.internal_static_api_Portfolio_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.magaldima.api.Portfolio.class, io.magaldima.api.Portfolio.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENCY_FIELD_NUMBER = 2;
  private volatile java.lang.Object currency_;
  /**
   * <code>string currency = 2;</code>
   */
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   * <code>string currency = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSITIONS_FIELD_NUMBER = 3;
  private java.util.List<io.magaldima.api.Position> positions_;
  /**
   * <code>repeated .api.Position positions = 3;</code>
   */
  public java.util.List<io.magaldima.api.Position> getPositionsList() {
    return positions_;
  }
  /**
   * <code>repeated .api.Position positions = 3;</code>
   */
  public java.util.List<? extends io.magaldima.api.PositionOrBuilder> 
      getPositionsOrBuilderList() {
    return positions_;
  }
  /**
   * <code>repeated .api.Position positions = 3;</code>
   */
  public int getPositionsCount() {
    return positions_.size();
  }
  /**
   * <code>repeated .api.Position positions = 3;</code>
   */
  public io.magaldima.api.Position getPositions(int index) {
    return positions_.get(index);
  }
  /**
   * <code>repeated .api.Position positions = 3;</code>
   */
  public io.magaldima.api.PositionOrBuilder getPositionsOrBuilder(
      int index) {
    return positions_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, currency_);
    }
    for (int i = 0; i < positions_.size(); i++) {
      output.writeMessage(3, positions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, currency_);
    }
    for (int i = 0; i < positions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, positions_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.magaldima.api.Portfolio)) {
      return super.equals(obj);
    }
    io.magaldima.api.Portfolio other = (io.magaldima.api.Portfolio) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getCurrency()
        .equals(other.getCurrency());
    result = result && getPositionsList()
        .equals(other.getPositionsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    if (getPositionsCount() > 0) {
      hash = (37 * hash) + POSITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPositionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.magaldima.api.Portfolio parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.magaldima.api.Portfolio parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.magaldima.api.Portfolio parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.magaldima.api.Portfolio parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.magaldima.api.Portfolio parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.magaldima.api.Portfolio parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.magaldima.api.Portfolio parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.magaldima.api.Portfolio parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.magaldima.api.Portfolio parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.magaldima.api.Portfolio parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.magaldima.api.Portfolio parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.magaldima.api.Portfolio parseFrom(
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
  public static Builder newBuilder(io.magaldima.api.Portfolio prototype) {
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
   * Protobuf type {@code api.Portfolio}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.Portfolio)
      io.magaldima.api.PortfolioOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.magaldima.api.PortfoliosProto.internal_static_api_Portfolio_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.magaldima.api.PortfoliosProto.internal_static_api_Portfolio_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.magaldima.api.Portfolio.class, io.magaldima.api.Portfolio.Builder.class);
    }

    // Construct using io.magaldima.api.Portfolio.newBuilder()
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
        getPositionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = "";

      currency_ = "";

      if (positionsBuilder_ == null) {
        positions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        positionsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.magaldima.api.PortfoliosProto.internal_static_api_Portfolio_descriptor;
    }

    public io.magaldima.api.Portfolio getDefaultInstanceForType() {
      return io.magaldima.api.Portfolio.getDefaultInstance();
    }

    public io.magaldima.api.Portfolio build() {
      io.magaldima.api.Portfolio result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.magaldima.api.Portfolio buildPartial() {
      io.magaldima.api.Portfolio result = new io.magaldima.api.Portfolio(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.currency_ = currency_;
      if (positionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.positions_ = positions_;
      } else {
        result.positions_ = positionsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.magaldima.api.Portfolio) {
        return mergeFrom((io.magaldima.api.Portfolio)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.magaldima.api.Portfolio other) {
      if (other == io.magaldima.api.Portfolio.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        onChanged();
      }
      if (positionsBuilder_ == null) {
        if (!other.positions_.isEmpty()) {
          if (positions_.isEmpty()) {
            positions_ = other.positions_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePositionsIsMutable();
            positions_.addAll(other.positions_);
          }
          onChanged();
        }
      } else {
        if (!other.positions_.isEmpty()) {
          if (positionsBuilder_.isEmpty()) {
            positionsBuilder_.dispose();
            positionsBuilder_ = null;
            positions_ = other.positions_;
            bitField0_ = (bitField0_ & ~0x00000004);
            positionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPositionsFieldBuilder() : null;
          } else {
            positionsBuilder_.addAllMessages(other.positions_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.magaldima.api.Portfolio parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.magaldima.api.Portfolio) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object currency_ = "";
    /**
     * <code>string currency = 2;</code>
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currency = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder setCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder clearCurrency() {
      
      currency_ = getDefaultInstance().getCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder setCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currency_ = value;
      onChanged();
      return this;
    }

    private java.util.List<io.magaldima.api.Position> positions_ =
      java.util.Collections.emptyList();
    private void ensurePositionsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        positions_ = new java.util.ArrayList<io.magaldima.api.Position>(positions_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.magaldima.api.Position, io.magaldima.api.Position.Builder, io.magaldima.api.PositionOrBuilder> positionsBuilder_;

    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public java.util.List<io.magaldima.api.Position> getPositionsList() {
      if (positionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(positions_);
      } else {
        return positionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public int getPositionsCount() {
      if (positionsBuilder_ == null) {
        return positions_.size();
      } else {
        return positionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public io.magaldima.api.Position getPositions(int index) {
      if (positionsBuilder_ == null) {
        return positions_.get(index);
      } else {
        return positionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder setPositions(
        int index, io.magaldima.api.Position value) {
      if (positionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionsIsMutable();
        positions_.set(index, value);
        onChanged();
      } else {
        positionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder setPositions(
        int index, io.magaldima.api.Position.Builder builderForValue) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        positions_.set(index, builderForValue.build());
        onChanged();
      } else {
        positionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder addPositions(io.magaldima.api.Position value) {
      if (positionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionsIsMutable();
        positions_.add(value);
        onChanged();
      } else {
        positionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder addPositions(
        int index, io.magaldima.api.Position value) {
      if (positionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionsIsMutable();
        positions_.add(index, value);
        onChanged();
      } else {
        positionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder addPositions(
        io.magaldima.api.Position.Builder builderForValue) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        positions_.add(builderForValue.build());
        onChanged();
      } else {
        positionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder addPositions(
        int index, io.magaldima.api.Position.Builder builderForValue) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        positions_.add(index, builderForValue.build());
        onChanged();
      } else {
        positionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder addAllPositions(
        java.lang.Iterable<? extends io.magaldima.api.Position> values) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, positions_);
        onChanged();
      } else {
        positionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder clearPositions() {
      if (positionsBuilder_ == null) {
        positions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        positionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public Builder removePositions(int index) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        positions_.remove(index);
        onChanged();
      } else {
        positionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public io.magaldima.api.Position.Builder getPositionsBuilder(
        int index) {
      return getPositionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public io.magaldima.api.PositionOrBuilder getPositionsOrBuilder(
        int index) {
      if (positionsBuilder_ == null) {
        return positions_.get(index);  } else {
        return positionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public java.util.List<? extends io.magaldima.api.PositionOrBuilder> 
         getPositionsOrBuilderList() {
      if (positionsBuilder_ != null) {
        return positionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(positions_);
      }
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public io.magaldima.api.Position.Builder addPositionsBuilder() {
      return getPositionsFieldBuilder().addBuilder(
          io.magaldima.api.Position.getDefaultInstance());
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public io.magaldima.api.Position.Builder addPositionsBuilder(
        int index) {
      return getPositionsFieldBuilder().addBuilder(
          index, io.magaldima.api.Position.getDefaultInstance());
    }
    /**
     * <code>repeated .api.Position positions = 3;</code>
     */
    public java.util.List<io.magaldima.api.Position.Builder> 
         getPositionsBuilderList() {
      return getPositionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.magaldima.api.Position, io.magaldima.api.Position.Builder, io.magaldima.api.PositionOrBuilder> 
        getPositionsFieldBuilder() {
      if (positionsBuilder_ == null) {
        positionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.magaldima.api.Position, io.magaldima.api.Position.Builder, io.magaldima.api.PositionOrBuilder>(
                positions_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        positions_ = null;
      }
      return positionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.Portfolio)
  }

  // @@protoc_insertion_point(class_scope:api.Portfolio)
  private static final io.magaldima.api.Portfolio DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.magaldima.api.Portfolio();
  }

  public static io.magaldima.api.Portfolio getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Portfolio>
      PARSER = new com.google.protobuf.AbstractParser<Portfolio>() {
    public Portfolio parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Portfolio(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Portfolio> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Portfolio> getParserForType() {
    return PARSER;
  }

  public io.magaldima.api.Portfolio getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
