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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Output of a language detection operation
 */
@JsonPropertyOrder({
  LanguageDetectionResponse.JSON_PROPERTY_SUCCESSFUL,
  LanguageDetectionResponse.JSON_PROPERTY_DETECTED_LANGUAGE_THREE_LETTER_CODE,
  LanguageDetectionResponse.JSON_PROPERTY_DETECTED_LANGUAGE_FULL_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:58.214933200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LanguageDetectionResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_DETECTED_LANGUAGE_THREE_LETTER_CODE = "DetectedLanguage_ThreeLetterCode";
  private String detectedLanguageThreeLetterCode;

  public static final String JSON_PROPERTY_DETECTED_LANGUAGE_FULL_NAME = "DetectedLanguage_FullName";
  private String detectedLanguageFullName;

  public LanguageDetectionResponse() {
  }

  public LanguageDetectionResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the language detection operation was successful, false otherwise
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

  public LanguageDetectionResponse detectedLanguageThreeLetterCode(String detectedLanguageThreeLetterCode) {
    
    this.detectedLanguageThreeLetterCode = detectedLanguageThreeLetterCode;
    return this;
  }

  /**
   * ISO 639 three letter language code
   * @return detectedLanguageThreeLetterCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTED_LANGUAGE_THREE_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetectedLanguageThreeLetterCode() {
    return detectedLanguageThreeLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_DETECTED_LANGUAGE_THREE_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetectedLanguageThreeLetterCode(String detectedLanguageThreeLetterCode) {
    this.detectedLanguageThreeLetterCode = detectedLanguageThreeLetterCode;
  }

  public LanguageDetectionResponse detectedLanguageFullName(String detectedLanguageFullName) {
    
    this.detectedLanguageFullName = detectedLanguageFullName;
    return this;
  }

  /**
   * The full name (in English) of the detected language
   * @return detectedLanguageFullName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTED_LANGUAGE_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetectedLanguageFullName() {
    return detectedLanguageFullName;
  }


  @JsonProperty(JSON_PROPERTY_DETECTED_LANGUAGE_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetectedLanguageFullName(String detectedLanguageFullName) {
    this.detectedLanguageFullName = detectedLanguageFullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageDetectionResponse languageDetectionResponse = (LanguageDetectionResponse) o;
    return Objects.equals(this.successful, languageDetectionResponse.successful) &&
        Objects.equals(this.detectedLanguageThreeLetterCode, languageDetectionResponse.detectedLanguageThreeLetterCode) &&
        Objects.equals(this.detectedLanguageFullName, languageDetectionResponse.detectedLanguageFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, detectedLanguageThreeLetterCode, detectedLanguageFullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDetectionResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    detectedLanguageThreeLetterCode: ").append(toIndentedString(detectedLanguageThreeLetterCode)).append("\n");
    sb.append("    detectedLanguageFullName: ").append(toIndentedString(detectedLanguageFullName)).append("\n");
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

