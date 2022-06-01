/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Output of a similarity analysis operation
 */
@ApiModel(description = "Output of a similarity analysis operation")
@JsonPropertyOrder({
  SimilarityAnalysisResponse.JSON_PROPERTY_SUCCESSFUL,
  SimilarityAnalysisResponse.JSON_PROPERTY_SIMILARITY_SCORE_RESULT,
  SimilarityAnalysisResponse.JSON_PROPERTY_SENTENCE_COUNT
})
@JsonTypeName("SimilarityAnalysisResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:00.734-07:00[America/Los_Angeles]")
public class SimilarityAnalysisResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_SIMILARITY_SCORE_RESULT = "SimilarityScoreResult";
  private Double similarityScoreResult;

  public static final String JSON_PROPERTY_SENTENCE_COUNT = "SentenceCount";
  private Integer sentenceCount;


  public SimilarityAnalysisResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the similarity analysis operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the similarity analysis operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public SimilarityAnalysisResponse similarityScoreResult(Double similarityScoreResult) {
    
    this.similarityScoreResult = similarityScoreResult;
    return this;
  }

   /**
   * Similarity score between 0.0 and 1.0 where scores closer to zero have a low probability of semantic similarity, while scores close to 1.0 have a high probability of semantic similarity.
   * @return similarityScoreResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Similarity score between 0.0 and 1.0 where scores closer to zero have a low probability of semantic similarity, while scores close to 1.0 have a high probability of semantic similarity.")
  @JsonProperty(JSON_PROPERTY_SIMILARITY_SCORE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSimilarityScoreResult() {
    return similarityScoreResult;
  }


  public void setSimilarityScoreResult(Double similarityScoreResult) {
    this.similarityScoreResult = similarityScoreResult;
  }


  public SimilarityAnalysisResponse sentenceCount(Integer sentenceCount) {
    
    this.sentenceCount = sentenceCount;
    return this;
  }

   /**
   * Number of sentences in input text
   * @return sentenceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of sentences in input text")
  @JsonProperty(JSON_PROPERTY_SENTENCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSentenceCount() {
    return sentenceCount;
  }


  public void setSentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityAnalysisResponse similarityAnalysisResponse = (SimilarityAnalysisResponse) o;
    return Objects.equals(this.successful, similarityAnalysisResponse.successful) &&
        Objects.equals(this.similarityScoreResult, similarityAnalysisResponse.similarityScoreResult) &&
        Objects.equals(this.sentenceCount, similarityAnalysisResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, similarityScoreResult, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityAnalysisResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    similarityScoreResult: ").append(toIndentedString(similarityScoreResult)).append("\n");
    sb.append("    sentenceCount: ").append(toIndentedString(sentenceCount)).append("\n");
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

