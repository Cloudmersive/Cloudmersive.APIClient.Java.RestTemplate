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
import com.cloudmersive.client.rt.model.PdfAnnotation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of retrieving annotations from a PDF document
 */
@ApiModel(description = "Result of retrieving annotations from a PDF document")
@JsonPropertyOrder({
  GetPdfAnnotationsResult.JSON_PROPERTY_SUCCESSFUL,
  GetPdfAnnotationsResult.JSON_PROPERTY_ANNOTATIONS
})
@JsonTypeName("GetPdfAnnotationsResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class GetPdfAnnotationsResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ANNOTATIONS = "Annotations";
  private List<PdfAnnotation> annotations = null;


  public GetPdfAnnotationsResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public GetPdfAnnotationsResult annotations(List<PdfAnnotation> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public GetPdfAnnotationsResult addAnnotationsItem(PdfAnnotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<PdfAnnotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Annotations in the PDF file, ordered by placement from start to finish in the document
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations in the PDF file, ordered by placement from start to finish in the document")
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PdfAnnotation> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(List<PdfAnnotation> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPdfAnnotationsResult getPdfAnnotationsResult = (GetPdfAnnotationsResult) o;
    return Objects.equals(this.successful, getPdfAnnotationsResult.successful) &&
        Objects.equals(this.annotations, getPdfAnnotationsResult.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, annotations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPdfAnnotationsResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

