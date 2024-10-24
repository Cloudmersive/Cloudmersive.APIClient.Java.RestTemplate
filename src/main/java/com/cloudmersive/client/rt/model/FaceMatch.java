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
 * Location of one face in an image, along with match results
 */
@JsonPropertyOrder({
  FaceMatch.JSON_PROPERTY_LEFT_X,
  FaceMatch.JSON_PROPERTY_TOP_Y,
  FaceMatch.JSON_PROPERTY_RIGHT_X,
  FaceMatch.JSON_PROPERTY_BOTTOM_Y,
  FaceMatch.JSON_PROPERTY_HIGH_CONFIDENCE_MATCH,
  FaceMatch.JSON_PROPERTY_MATCH_SCORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FaceMatch {
  public static final String JSON_PROPERTY_LEFT_X = "LeftX";
  private Integer leftX;

  public static final String JSON_PROPERTY_TOP_Y = "TopY";
  private Integer topY;

  public static final String JSON_PROPERTY_RIGHT_X = "RightX";
  private Integer rightX;

  public static final String JSON_PROPERTY_BOTTOM_Y = "BottomY";
  private Integer bottomY;

  public static final String JSON_PROPERTY_HIGH_CONFIDENCE_MATCH = "HighConfidenceMatch";
  private Boolean highConfidenceMatch;

  public static final String JSON_PROPERTY_MATCH_SCORE = "MatchScore";
  private Double matchScore;

  public FaceMatch() {
  }

  public FaceMatch leftX(Integer leftX) {
    
    this.leftX = leftX;
    return this;
  }

  /**
   * X coordinate of the left side of the face
   * @return leftX
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLeftX() {
    return leftX;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftX(Integer leftX) {
    this.leftX = leftX;
  }

  public FaceMatch topY(Integer topY) {
    
    this.topY = topY;
    return this;
  }

  /**
   * Y coordinate of the top side of the face
   * @return topY
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopY() {
    return topY;
  }


  @JsonProperty(JSON_PROPERTY_TOP_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopY(Integer topY) {
    this.topY = topY;
  }

  public FaceMatch rightX(Integer rightX) {
    
    this.rightX = rightX;
    return this;
  }

  /**
   * X coordinate of the right side of the face
   * @return rightX
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRightX() {
    return rightX;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightX(Integer rightX) {
    this.rightX = rightX;
  }

  public FaceMatch bottomY(Integer bottomY) {
    
    this.bottomY = bottomY;
    return this;
  }

  /**
   * Y coordinate of the bottom side of the face
   * @return bottomY
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOTTOM_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBottomY() {
    return bottomY;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomY(Integer bottomY) {
    this.bottomY = bottomY;
  }

  public FaceMatch highConfidenceMatch(Boolean highConfidenceMatch) {
    
    this.highConfidenceMatch = highConfidenceMatch;
    return this;
  }

  /**
   * True if there is a high confidence match, false otherwise
   * @return highConfidenceMatch
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_CONFIDENCE_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHighConfidenceMatch() {
    return highConfidenceMatch;
  }


  @JsonProperty(JSON_PROPERTY_HIGH_CONFIDENCE_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighConfidenceMatch(Boolean highConfidenceMatch) {
    this.highConfidenceMatch = highConfidenceMatch;
  }

  public FaceMatch matchScore(Double matchScore) {
    
    this.matchScore = matchScore;
    return this;
  }

  /**
   * Match score from 0.0 to 1.0 with higher scores indicating a greater match; scores above 0.7 indicate a match
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceMatch faceMatch = (FaceMatch) o;
    return Objects.equals(this.leftX, faceMatch.leftX) &&
        Objects.equals(this.topY, faceMatch.topY) &&
        Objects.equals(this.rightX, faceMatch.rightX) &&
        Objects.equals(this.bottomY, faceMatch.bottomY) &&
        Objects.equals(this.highConfidenceMatch, faceMatch.highConfidenceMatch) &&
        Objects.equals(this.matchScore, faceMatch.matchScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftX, topY, rightX, bottomY, highConfidenceMatch, matchScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceMatch {\n");
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    rightX: ").append(toIndentedString(rightX)).append("\n");
    sb.append("    bottomY: ").append(toIndentedString(bottomY)).append("\n");
    sb.append("    highConfidenceMatch: ").append(toIndentedString(highConfidenceMatch)).append("\n");
    sb.append("    matchScore: ").append(toIndentedString(matchScore)).append("\n");
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

