// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: portfolio.proto

package io.magaldima.aw.apis;

public interface PortfolioOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aw.apis.Portfolio)
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
   * <code>string currency = 2;</code>
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 2;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>repeated .aw.apis.Position positions = 3;</code>
   */
  java.util.List<io.magaldima.aw.apis.Position> 
      getPositionsList();
  /**
   * <code>repeated .aw.apis.Position positions = 3;</code>
   */
  io.magaldima.aw.apis.Position getPositions(int index);
  /**
   * <code>repeated .aw.apis.Position positions = 3;</code>
   */
  int getPositionsCount();
  /**
   * <code>repeated .aw.apis.Position positions = 3;</code>
   */
  java.util.List<? extends io.magaldima.aw.apis.PositionOrBuilder> 
      getPositionsOrBuilderList();
  /**
   * <code>repeated .aw.apis.Position positions = 3;</code>
   */
  io.magaldima.aw.apis.PositionOrBuilder getPositionsOrBuilder(
      int index);
}
