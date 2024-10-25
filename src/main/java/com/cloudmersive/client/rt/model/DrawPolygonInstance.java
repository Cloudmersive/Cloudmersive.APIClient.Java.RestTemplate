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
import com.cloudmersive.client.rt.model.PolygonPoint;
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
 * Polygon instance to draw on an image
 */
@JsonPropertyOrder({
  DrawPolygonInstance.JSON_PROPERTY_BORDER_COLOR,
  DrawPolygonInstance.JSON_PROPERTY_BORDER_WIDTH,
  DrawPolygonInstance.JSON_PROPERTY_FILL_COLOR,
  DrawPolygonInstance.JSON_PROPERTY_POINTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DrawPolygonInstance {
  public static final String JSON_PROPERTY_BORDER_COLOR = "BorderColor";
  private String borderColor;

  public static final String JSON_PROPERTY_BORDER_WIDTH = "BorderWidth";
  private Double borderWidth;

  public static final String JSON_PROPERTY_FILL_COLOR = "FillColor";
  private String fillColor;

  public static final String JSON_PROPERTY_POINTS = "Points";
  private List<PolygonPoint> points = new ArrayList<>();

  public DrawPolygonInstance() {
  }

  public DrawPolygonInstance borderColor(String borderColor) {
    
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Border Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.
   * @return borderColor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBorderColor() {
    return borderColor;
  }


  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }

  public DrawPolygonInstance borderWidth(Double borderWidth) {
    
    this.borderWidth = borderWidth;
    return this;
  }

  /**
   * Width in pixels of the border.  Pass in 0 to draw a polygon with no border
   * @return borderWidth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BORDER_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBorderWidth() {
    return borderWidth;
  }


  @JsonProperty(JSON_PROPERTY_BORDER_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
  }

  public DrawPolygonInstance fillColor(String fillColor) {
    
    this.fillColor = fillColor;
    return this;
  }

  /**
   * Fill Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.  Leave blank to not fill the polygon.
   * @return fillColor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFillColor() {
    return fillColor;
  }


  @JsonProperty(JSON_PROPERTY_FILL_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  public DrawPolygonInstance points(List<PolygonPoint> points) {
    
    this.points = points;
    return this;
  }

  public DrawPolygonInstance addPointsItem(PolygonPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

  /**
   * Points (vertices) which comprise the polygon; valid polygons must have at least 3 points
   * @return points
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PolygonPoint> getPoints() {
    return points;
  }


  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoints(List<PolygonPoint> points) {
    this.points = points;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawPolygonInstance drawPolygonInstance = (DrawPolygonInstance) o;
    return Objects.equals(this.borderColor, drawPolygonInstance.borderColor) &&
        Objects.equals(this.borderWidth, drawPolygonInstance.borderWidth) &&
        Objects.equals(this.fillColor, drawPolygonInstance.fillColor) &&
        Objects.equals(this.points, drawPolygonInstance.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderColor, borderWidth, fillColor, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawPolygonInstance {\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

