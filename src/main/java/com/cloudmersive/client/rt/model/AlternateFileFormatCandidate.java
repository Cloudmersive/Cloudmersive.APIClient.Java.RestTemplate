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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Alternate file format possibility
 */
@JsonPropertyOrder({
  AlternateFileFormatCandidate.JSON_PROPERTY_PROBABILITY,
  AlternateFileFormatCandidate.JSON_PROPERTY_DETECTED_FILE_EXTENSION,
  AlternateFileFormatCandidate.JSON_PROPERTY_DETECTED_MIME_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AlternateFileFormatCandidate {
  public static final String JSON_PROPERTY_PROBABILITY = "Probability";
  private Double probability;

  public static final String JSON_PROPERTY_DETECTED_FILE_EXTENSION = "DetectedFileExtension";
  private String detectedFileExtension;

  public static final String JSON_PROPERTY_DETECTED_MIME_TYPE = "DetectedMimeType";
  private String detectedMimeType;

  public AlternateFileFormatCandidate() {
  }

  public AlternateFileFormatCandidate probability(Double probability) {
    
    this.probability = probability;
    return this;
  }

  /**
   * Probability that this extension is the right one; possible values are between 0.0 (lowest confidence) and 1.0 (highest confidence)
   * @return probability
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getProbability() {
    return probability;
  }


  @JsonProperty(JSON_PROPERTY_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProbability(Double probability) {
    this.probability = probability;
  }

  public AlternateFileFormatCandidate detectedFileExtension(String detectedFileExtension) {
    
    this.detectedFileExtension = detectedFileExtension;
    return this;
  }

  /**
   * Detected file extension of the file format, with a leading period
   * @return detectedFileExtension
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTED_FILE_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetectedFileExtension() {
    return detectedFileExtension;
  }


  @JsonProperty(JSON_PROPERTY_DETECTED_FILE_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetectedFileExtension(String detectedFileExtension) {
    this.detectedFileExtension = detectedFileExtension;
  }

  public AlternateFileFormatCandidate detectedMimeType(String detectedMimeType) {
    
    this.detectedMimeType = detectedMimeType;
    return this;
  }

  /**
   * MIME type of this file extension
   * @return detectedMimeType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTED_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetectedMimeType() {
    return detectedMimeType;
  }


  @JsonProperty(JSON_PROPERTY_DETECTED_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetectedMimeType(String detectedMimeType) {
    this.detectedMimeType = detectedMimeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternateFileFormatCandidate alternateFileFormatCandidate = (AlternateFileFormatCandidate) o;
    return Objects.equals(this.probability, alternateFileFormatCandidate.probability) &&
        Objects.equals(this.detectedFileExtension, alternateFileFormatCandidate.detectedFileExtension) &&
        Objects.equals(this.detectedMimeType, alternateFileFormatCandidate.detectedMimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probability, detectedFileExtension, detectedMimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternateFileFormatCandidate {\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    detectedFileExtension: ").append(toIndentedString(detectedFileExtension)).append("\n");
    sb.append("    detectedMimeType: ").append(toIndentedString(detectedMimeType)).append("\n");
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

