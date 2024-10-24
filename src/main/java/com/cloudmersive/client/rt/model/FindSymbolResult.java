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
 * Result of a find symbol operation on an input image
 */
@JsonPropertyOrder({
  FindSymbolResult.JSON_PROPERTY_SUCCESSFUL,
  FindSymbolResult.JSON_PROPERTY_MATCH_SCORE,
  FindSymbolResult.JSON_PROPERTY_XLEFT,
  FindSymbolResult.JSON_PROPERTY_YTOP,
  FindSymbolResult.JSON_PROPERTY_WIDTH,
  FindSymbolResult.JSON_PROPERTY_HEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FindSymbolResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_MATCH_SCORE = "MatchScore";
  private Double matchScore;

  public static final String JSON_PROPERTY_XLEFT = "XLeft";
  private Integer xleft;

  public static final String JSON_PROPERTY_YTOP = "YTop";
  private Integer ytop;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public FindSymbolResult() {
  }

  public FindSymbolResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if successful, false otherwise
   * @return successful
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FindSymbolResult matchScore(Double matchScore) {
    
    this.matchScore = matchScore;
    return this;
  }

  /**
   * Score between 0.0 and 1.0 that measures how closely the symbol matched; scores above 0.2 are good
   * @return matchScore
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMatchScore() {
    return matchScore;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchScore(Double matchScore) {
    this.matchScore = matchScore;
  }

  public FindSymbolResult xleft(Integer xleft) {
    
    this.xleft = xleft;
    return this;
  }

  /**
   * X location of the left edge of the found location in pixels
   * @return xleft
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XLEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getXleft() {
    return xleft;
  }


  @JsonProperty(JSON_PROPERTY_XLEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXleft(Integer xleft) {
    this.xleft = xleft;
  }

  public FindSymbolResult ytop(Integer ytop) {
    
    this.ytop = ytop;
    return this;
  }

  /**
   * Y location of the top edge of the found location in pixels
   * @return ytop
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYtop() {
    return ytop;
  }


  @JsonProperty(JSON_PROPERTY_YTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYtop(Integer ytop) {
    this.ytop = ytop;
  }

  public FindSymbolResult width(Integer width) {
    
    this.width = width;
    return this;
  }

  /**
   * Width of the found location in pixels
   * @return width
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }

  public FindSymbolResult height(Integer height) {
    
    this.height = height;
    return this;
  }

  /**
   * Height of the found location in pixels
   * @return height
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindSymbolResult findSymbolResult = (FindSymbolResult) o;
    return Objects.equals(this.successful, findSymbolResult.successful) &&
        Objects.equals(this.matchScore, findSymbolResult.matchScore) &&
        Objects.equals(this.xleft, findSymbolResult.xleft) &&
        Objects.equals(this.ytop, findSymbolResult.ytop) &&
        Objects.equals(this.width, findSymbolResult.width) &&
        Objects.equals(this.height, findSymbolResult.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matchScore, xleft, ytop, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindSymbolResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matchScore: ").append(toIndentedString(matchScore)).append("\n");
    sb.append("    xleft: ").append(toIndentedString(xleft)).append("\n");
    sb.append("    ytop: ").append(toIndentedString(ytop)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

