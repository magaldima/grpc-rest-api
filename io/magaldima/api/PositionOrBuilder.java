// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: portfolio.proto

package io.magaldima.api;

public interface PositionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.Position)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string assetId = 2;</code>
   */
  java.lang.String getAssetId();
  /**
   * <code>string assetId = 2;</code>
   */
  com.google.protobuf.ByteString
      getAssetIdBytes();

  /**
   * <code>repeated .api.AssetIdentifier identifiers = 3;</code>
   */
  java.util.List<io.magaldima.api.AssetIdentifier> 
      getIdentifiersList();
  /**
   * <code>repeated .api.AssetIdentifier identifiers = 3;</code>
   */
  io.magaldima.api.AssetIdentifier getIdentifiers(int index);
  /**
   * <code>repeated .api.AssetIdentifier identifiers = 3;</code>
   */
  int getIdentifiersCount();
  /**
   * <code>repeated .api.AssetIdentifier identifiers = 3;</code>
   */
  java.util.List<? extends io.magaldima.api.AssetIdentifierOrBuilder> 
      getIdentifiersOrBuilderList();
  /**
   * <code>repeated .api.AssetIdentifier identifiers = 3;</code>
   */
  io.magaldima.api.AssetIdentifierOrBuilder getIdentifiersOrBuilder(
      int index);

  /**
   * <code>double marketValue = 4;</code>
   */
  double getMarketValue();

  /**
   * <code>double quantity = 5;</code>
   */
  double getQuantity();
}