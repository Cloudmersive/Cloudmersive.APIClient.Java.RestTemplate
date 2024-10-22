/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
import com.cloudmersive.client.rt.model.PresentationAdvancedResult;
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
 * Result of splitting a single PowerPoint Presentation PPTX into Separate Presentations
 */
@JsonPropertyOrder({
  PptxSplitAdvancedResponse.JSON_PROPERTY_RESULT_PRESENTATIONS,
  PptxSplitAdvancedResponse.JSON_PROPERTY_SUCCESSFUL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PptxSplitAdvancedResponse {
  public static final String JSON_PROPERTY_RESULT_PRESENTATIONS = "ResultPresentations";
  private List<PresentationAdvancedResult> resultPresentations = new ArrayList<>();

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public PptxSplitAdvancedResponse() {
  }

  public PptxSplitAdvancedResponse resultPresentations(List<PresentationAdvancedResult> resultPresentations) {
    
    this.resultPresentations = resultPresentations;
    return this;
  }

  public PptxSplitAdvancedResponse addResultPresentationsItem(PresentationAdvancedResult resultPresentationsItem) {
    if (this.resultPresentations == null) {
      this.resultPresentations = new ArrayList<>();
    }
    this.resultPresentations.add(resultPresentationsItem);
    return this;
  }

  /**
   * Get resultPresentations
   * @return resultPresentations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_PRESENTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PresentationAdvancedResult> getResultPresentations() {
    return resultPresentations;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_PRESENTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultPresentations(List<PresentationAdvancedResult> resultPresentations) {
    this.resultPresentations = resultPresentations;
  }

  public PptxSplitAdvancedResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the operation was successful, false otherwise
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PptxSplitAdvancedResponse pptxSplitAdvancedResponse = (PptxSplitAdvancedResponse) o;
    return Objects.equals(this.resultPresentations, pptxSplitAdvancedResponse.resultPresentations) &&
        Objects.equals(this.successful, pptxSplitAdvancedResponse.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultPresentations, successful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PptxSplitAdvancedResponse {\n");
    sb.append("    resultPresentations: ").append(toIndentedString(resultPresentations)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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
