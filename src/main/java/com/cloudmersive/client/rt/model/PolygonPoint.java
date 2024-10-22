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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * One point in a polygon
 */
@JsonPropertyOrder({
  PolygonPoint.JSON_PROPERTY_X,
  PolygonPoint.JSON_PROPERTY_Y
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:18.398235Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PolygonPoint {
  public static final String JSON_PROPERTY_X = "X";
  private Double X;

  public static final String JSON_PROPERTY_Y = "Y";
  private Double Y;

  public PolygonPoint() {
  }

  public PolygonPoint X(Double X) {
    
    this.X = X;
    return this;
  }

  /**
   * X location in pixels of this point in the polygon
   * @return X
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getX() {
    return X;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(Double X) {
    this.X = X;
  }

  public PolygonPoint Y(Double Y) {
    
    this.Y = Y;
    return this;
  }

  /**
   * Y location in pixels of this point in the polygon
   * @return Y
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getY() {
    return Y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(Double Y) {
    this.Y = Y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolygonPoint polygonPoint = (PolygonPoint) o;
    return Objects.equals(this.X, polygonPoint.X) &&
        Objects.equals(this.Y, polygonPoint.Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolygonPoint {\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
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

