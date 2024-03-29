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
 * Input to a similarity analysis operation
 */
@ApiModel(description = "Input to a similarity analysis operation")
@JsonPropertyOrder({
  SimilarityAnalysisRequest.JSON_PROPERTY_TEXT_TO_ANALYZE1,
  SimilarityAnalysisRequest.JSON_PROPERTY_TEXT_TO_ANALYZE2
})
@JsonTypeName("SimilarityAnalysisRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:00.734-07:00[America/Los_Angeles]")
public class SimilarityAnalysisRequest {
  public static final String JSON_PROPERTY_TEXT_TO_ANALYZE1 = "TextToAnalyze1";
  private String textToAnalyze1;

  public static final String JSON_PROPERTY_TEXT_TO_ANALYZE2 = "TextToAnalyze2";
  private String textToAnalyze2;


  public SimilarityAnalysisRequest textToAnalyze1(String textToAnalyze1) {
    
    this.textToAnalyze1 = textToAnalyze1;
    return this;
  }

   /**
   * First text to analyze
   * @return textToAnalyze1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First text to analyze")
  @JsonProperty(JSON_PROPERTY_TEXT_TO_ANALYZE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextToAnalyze1() {
    return textToAnalyze1;
  }


  public void setTextToAnalyze1(String textToAnalyze1) {
    this.textToAnalyze1 = textToAnalyze1;
  }


  public SimilarityAnalysisRequest textToAnalyze2(String textToAnalyze2) {
    
    this.textToAnalyze2 = textToAnalyze2;
    return this;
  }

   /**
   * Second text to analyze
   * @return textToAnalyze2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Second text to analyze")
  @JsonProperty(JSON_PROPERTY_TEXT_TO_ANALYZE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextToAnalyze2() {
    return textToAnalyze2;
  }


  public void setTextToAnalyze2(String textToAnalyze2) {
    this.textToAnalyze2 = textToAnalyze2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityAnalysisRequest similarityAnalysisRequest = (SimilarityAnalysisRequest) o;
    return Objects.equals(this.textToAnalyze1, similarityAnalysisRequest.textToAnalyze1) &&
        Objects.equals(this.textToAnalyze2, similarityAnalysisRequest.textToAnalyze2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textToAnalyze1, textToAnalyze2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityAnalysisRequest {\n");
    sb.append("    textToAnalyze1: ").append(toIndentedString(textToAnalyze1)).append("\n");
    sb.append("    textToAnalyze2: ").append(toIndentedString(textToAnalyze2)).append("\n");
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

