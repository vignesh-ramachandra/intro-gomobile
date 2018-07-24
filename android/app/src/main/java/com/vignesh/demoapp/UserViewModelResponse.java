// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserViewModel.proto

package com.vignesh.demoapp;

public final class UserViewModelResponse {
  private UserViewModelResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface UserViewModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prototype.UserViewModel)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code prototype.UserViewModel}
   */
  public  static final class UserViewModel extends
      com.google.protobuf.GeneratedMessageLite<
          UserViewModel, UserViewModel.Builder> implements
      // @@protoc_insertion_point(message_implements:prototype.UserViewModel)
      UserViewModelOrBuilder {
    private UserViewModel() {
      name_ = "";
    }
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.String name_;
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <code>string name = 1;</code>
     */
    private void setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
    }
    /**
     * <code>string name = 1;</code>
     */
    private void clearName() {
      
      name_ = getDefaultInstance().getName();
    }
    /**
     * <code>string name = 1;</code>
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!name_.isEmpty()) {
        output.writeString(1, getName());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!name_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getName());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.vignesh.demoapp.UserViewModelResponse.UserViewModel prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code prototype.UserViewModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.vignesh.demoapp.UserViewModelResponse.UserViewModel, Builder> implements
        // @@protoc_insertion_point(builder_implements:prototype.UserViewModel)
        com.vignesh.demoapp.UserViewModelResponse.UserViewModelOrBuilder {
      // Construct using com.vignesh.demoapp.UserViewModelResponse.UserViewModel.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <code>string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:prototype.UserViewModel)
    }
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.vignesh.demoapp.UserViewModelResponse.UserViewModel();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.vignesh.demoapp.UserViewModelResponse.UserViewModel other = (com.vignesh.demoapp.UserViewModelResponse.UserViewModel) arg1;
          name_ = visitor.visitString(!name_.isEmpty(), name_,
              !other.name_.isEmpty(), other.name_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  java.lang.String s = input.readStringRequireUtf8();

                  name_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.vignesh.demoapp.UserViewModelResponse.UserViewModel.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:prototype.UserViewModel)
    private static final com.vignesh.demoapp.UserViewModelResponse.UserViewModel DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new UserViewModel();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.vignesh.demoapp.UserViewModelResponse.UserViewModel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UserViewModel> PARSER;

    public static com.google.protobuf.Parser<UserViewModel> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
