/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.rt.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.rt.model.DrawRectangleInstance;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request to draw one or more rectangles on a base image
 */
@JsonPropertyOrder({
  DrawRectangleRequest.JSON_PROPERTY_BASE_IMAGE_BYTES,
  DrawRectangleRequest.JSON_PROPERTY_BASE_IMAGE_URL,
  DrawRectangleRequest.JSON_PROPERTY_RECTANGLES_TO_DRAW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DrawRectangleRequest {
  public static final String JSON_PROPERTY_BASE_IMAGE_BYTES = "BaseImageBytes";
  private byte[] baseImageBytes;

  public static final String JSON_PROPERTY_BASE_IMAGE_URL = "BaseImageUrl";
  private String baseImageUrl;

  public static final String JSON_PROPERTY_RECTANGLES_TO_DRAW = "RectanglesToDraw";
  private List<DrawRectangleInstance> rectanglesToDraw = new ArrayList<>();

  public DrawRectangleRequest() {
  }

  public DrawRectangleRequest baseImageBytes(byte[] baseImageBytes) {
    
    this.baseImageBytes = baseImageBytes;
    return this;
  }

  /**
   * Image to draw rectangles on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL
   * @return baseImageBytes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_IMAGE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getBaseImageBytes() {
    return baseImageBytes;
  }


  @JsonProperty(JSON_PROPERTY_BASE_IMAGE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseImageBytes(byte[] baseImageBytes) {
    this.baseImageBytes = baseImageBytes;
  }

  public DrawRectangleRequest baseImageUrl(String baseImageUrl) {
    
    this.baseImageUrl = baseImageUrl;
    return this;
  }

  /**
   * Image to draw rectangles on, as an HTTP or HTTPS fully-qualified URL
   * @return baseImageUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBaseImageUrl() {
    return baseImageUrl;
  }


  @JsonProperty(JSON_PROPERTY_BASE_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseImageUrl(String baseImageUrl) {
    this.baseImageUrl = baseImageUrl;
  }

  public DrawRectangleRequest rectanglesToDraw(List<DrawRectangleInstance> rectanglesToDraw) {
    
    this.rectanglesToDraw = rectanglesToDraw;
    return this;
  }

  public DrawRectangleRequest addRectanglesToDrawItem(DrawRectangleInstance rectanglesToDrawItem) {
    if (this.rectanglesToDraw == null) {
      this.rectanglesToDraw = new ArrayList<>();
    }
    this.rectanglesToDraw.add(rectanglesToDrawItem);
    return this;
  }

  /**
   * Rectangles to draw on the image.  Rectangles are drawn in index order.
   * @return rectanglesToDraw
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECTANGLES_TO_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DrawRectangleInstance> getRectanglesToDraw() {
    return rectanglesToDraw;
  }


  @JsonProperty(JSON_PROPERTY_RECTANGLES_TO_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRectanglesToDraw(List<DrawRectangleInstance> rectanglesToDraw) {
    this.rectanglesToDraw = rectanglesToDraw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawRectangleRequest drawRectangleRequest = (DrawRectangleRequest) o;
    return Arrays.equals(this.baseImageBytes, drawRectangleRequest.baseImageBytes) &&
        Objects.equals(this.baseImageUrl, drawRectangleRequest.baseImageUrl) &&
        Objects.equals(this.rectanglesToDraw, drawRectangleRequest.rectanglesToDraw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(baseImageBytes), baseImageUrl, rectanglesToDraw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawRectangleRequest {\n");
    sb.append("    baseImageBytes: ").append(toIndentedString(baseImageBytes)).append("\n");
    sb.append("    baseImageUrl: ").append(toIndentedString(baseImageUrl)).append("\n");
    sb.append("    rectanglesToDraw: ").append(toIndentedString(rectanglesToDraw)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

