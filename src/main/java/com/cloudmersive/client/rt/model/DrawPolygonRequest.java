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
import com.cloudmersive.client.rt.model.DrawPolygonInstance;
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
 * Request to draw one or more polygons on a base image
 */
@JsonPropertyOrder({
  DrawPolygonRequest.JSON_PROPERTY_BASE_IMAGE_BYTES,
  DrawPolygonRequest.JSON_PROPERTY_BASE_IMAGE_URL,
  DrawPolygonRequest.JSON_PROPERTY_POLYGONS_TO_DRAW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DrawPolygonRequest {
  public static final String JSON_PROPERTY_BASE_IMAGE_BYTES = "BaseImageBytes";
  private byte[] baseImageBytes;

  public static final String JSON_PROPERTY_BASE_IMAGE_URL = "BaseImageUrl";
  private String baseImageUrl;

  public static final String JSON_PROPERTY_POLYGONS_TO_DRAW = "PolygonsToDraw";
  private List<DrawPolygonInstance> polygonsToDraw = new ArrayList<>();

  public DrawPolygonRequest() {
  }

  public DrawPolygonRequest baseImageBytes(byte[] baseImageBytes) {
    
    this.baseImageBytes = baseImageBytes;
    return this;
  }

  /**
   * Image to draw polygons on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL
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

  public DrawPolygonRequest baseImageUrl(String baseImageUrl) {
    
    this.baseImageUrl = baseImageUrl;
    return this;
  }

  /**
   * Image to draw polygons on, as an HTTP or HTTPS fully-qualified URL
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

  public DrawPolygonRequest polygonsToDraw(List<DrawPolygonInstance> polygonsToDraw) {
    
    this.polygonsToDraw = polygonsToDraw;
    return this;
  }

  public DrawPolygonRequest addPolygonsToDrawItem(DrawPolygonInstance polygonsToDrawItem) {
    if (this.polygonsToDraw == null) {
      this.polygonsToDraw = new ArrayList<>();
    }
    this.polygonsToDraw.add(polygonsToDrawItem);
    return this;
  }

  /**
   * Polygons to draw on the image.  Polygons are drawn in index order.
   * @return polygonsToDraw
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLYGONS_TO_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DrawPolygonInstance> getPolygonsToDraw() {
    return polygonsToDraw;
  }


  @JsonProperty(JSON_PROPERTY_POLYGONS_TO_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolygonsToDraw(List<DrawPolygonInstance> polygonsToDraw) {
    this.polygonsToDraw = polygonsToDraw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawPolygonRequest drawPolygonRequest = (DrawPolygonRequest) o;
    return Arrays.equals(this.baseImageBytes, drawPolygonRequest.baseImageBytes) &&
        Objects.equals(this.baseImageUrl, drawPolygonRequest.baseImageUrl) &&
        Objects.equals(this.polygonsToDraw, drawPolygonRequest.polygonsToDraw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(baseImageBytes), baseImageUrl, polygonsToDraw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawPolygonRequest {\n");
    sb.append("    baseImageBytes: ").append(toIndentedString(baseImageBytes)).append("\n");
    sb.append("    baseImageUrl: ").append(toIndentedString(baseImageUrl)).append("\n");
    sb.append("    polygonsToDraw: ").append(toIndentedString(polygonsToDraw)).append("\n");
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

