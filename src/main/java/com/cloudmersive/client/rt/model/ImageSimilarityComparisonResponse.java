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
 * Result of performing an image similarity operation
 */
@JsonPropertyOrder({
  ImageSimilarityComparisonResponse.JSON_PROPERTY_SUCCESSFUL,
  ImageSimilarityComparisonResponse.JSON_PROPERTY_ARE_IMAGES_SIMILAR,
  ImageSimilarityComparisonResponse.JSON_PROPERTY_IMAGE_SIMILARITY_SCORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ImageSimilarityComparisonResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ARE_IMAGES_SIMILAR = "AreImagesSimilar";
  private Boolean areImagesSimilar;

  public static final String JSON_PROPERTY_IMAGE_SIMILARITY_SCORE = "ImageSimilarityScore";
  private Double imageSimilarityScore;

  public ImageSimilarityComparisonResponse() {
  }

  public ImageSimilarityComparisonResponse successful(Boolean successful) {
    
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

  public ImageSimilarityComparisonResponse areImagesSimilar(Boolean areImagesSimilar) {
    
    this.areImagesSimilar = areImagesSimilar;
    return this;
  }

  /**
   * True if images are similar, false otherwise
   * @return areImagesSimilar
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARE_IMAGES_SIMILAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAreImagesSimilar() {
    return areImagesSimilar;
  }


  @JsonProperty(JSON_PROPERTY_ARE_IMAGES_SIMILAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAreImagesSimilar(Boolean areImagesSimilar) {
    this.areImagesSimilar = areImagesSimilar;
  }

  public ImageSimilarityComparisonResponse imageSimilarityScore(Double imageSimilarityScore) {
    
    this.imageSimilarityScore = imageSimilarityScore;
    return this;
  }

  /**
   * Similarity score between 0.0 and 1.0, with 1.0 meaning highly similar and 0.0 meaning highly dissimilar
   * @return imageSimilarityScore
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_SIMILARITY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImageSimilarityScore() {
    return imageSimilarityScore;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_SIMILARITY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageSimilarityScore(Double imageSimilarityScore) {
    this.imageSimilarityScore = imageSimilarityScore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSimilarityComparisonResponse imageSimilarityComparisonResponse = (ImageSimilarityComparisonResponse) o;
    return Objects.equals(this.successful, imageSimilarityComparisonResponse.successful) &&
        Objects.equals(this.areImagesSimilar, imageSimilarityComparisonResponse.areImagesSimilar) &&
        Objects.equals(this.imageSimilarityScore, imageSimilarityComparisonResponse.imageSimilarityScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, areImagesSimilar, imageSimilarityScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSimilarityComparisonResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    areImagesSimilar: ").append(toIndentedString(areImagesSimilar)).append("\n");
    sb.append("    imageSimilarityScore: ").append(toIndentedString(imageSimilarityScore)).append("\n");
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

