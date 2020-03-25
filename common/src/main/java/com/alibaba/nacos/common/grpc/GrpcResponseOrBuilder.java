// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base_grpc_service.proto

package com.alibaba.nacos.common.grpc;

public interface GrpcResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GrpcResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1;</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 1;</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string request_id = 2;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <code>string request_id = 2;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <code>string source = 3;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>string source = 3;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>int32 code = 4;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>.google.protobuf.Any message = 5;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.google.protobuf.Any message = 5;</code>
   * @return The message.
   */
  com.google.protobuf.Any getMessage();
  /**
   * <code>.google.protobuf.Any message = 5;</code>
   */
  com.google.protobuf.AnyOrBuilder getMessageOrBuilder();

  /**
   * <code>.GrpcMetadata metadata = 6;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.GrpcMetadata metadata = 6;</code>
   * @return The metadata.
   */
  com.alibaba.nacos.common.grpc.GrpcMetadata getMetadata();
  /**
   * <code>.GrpcMetadata metadata = 6;</code>
   */
  com.alibaba.nacos.common.grpc.GrpcMetadataOrBuilder getMetadataOrBuilder();
}
