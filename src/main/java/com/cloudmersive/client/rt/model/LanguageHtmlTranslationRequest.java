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
 * Input to a language translation operation
 */
@JsonPropertyOrder({
  LanguageHtmlTranslationRequest.JSON_PROPERTY_HTML_STRING_TO_TRANSLATE,
  LanguageHtmlTranslationRequest.JSON_PROPERTY_HTML_URL_TO_TRANSLATE,
  LanguageHtmlTranslationRequest.JSON_PROPERTY_INPUT_LANGUAGE_CODE,
  LanguageHtmlTranslationRequest.JSON_PROPERTY_OUTPUT_LANGUAGE_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:53.174056400Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LanguageHtmlTranslationRequest {
  public static final String JSON_PROPERTY_HTML_STRING_TO_TRANSLATE = "HtmlStringToTranslate";
  private String htmlStringToTranslate;

  public static final String JSON_PROPERTY_HTML_URL_TO_TRANSLATE = "HtmlUrlToTranslate";
  private String htmlUrlToTranslate;

  public static final String JSON_PROPERTY_INPUT_LANGUAGE_CODE = "InputLanguageCode";
  private String inputLanguageCode;

  public static final String JSON_PROPERTY_OUTPUT_LANGUAGE_CODE = "OutputLanguageCode";
  private String outputLanguageCode;

  public LanguageHtmlTranslationRequest() {
  }

  public LanguageHtmlTranslationRequest htmlStringToTranslate(String htmlStringToTranslate) {
    
    this.htmlStringToTranslate = htmlStringToTranslate;
    return this;
  }

  /**
   * Text to translate
   * @return htmlStringToTranslate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_STRING_TO_TRANSLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlStringToTranslate() {
    return htmlStringToTranslate;
  }


  @JsonProperty(JSON_PROPERTY_HTML_STRING_TO_TRANSLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlStringToTranslate(String htmlStringToTranslate) {
    this.htmlStringToTranslate = htmlStringToTranslate;
  }

  public LanguageHtmlTranslationRequest htmlUrlToTranslate(String htmlUrlToTranslate) {
    
    this.htmlUrlToTranslate = htmlUrlToTranslate;
    return this;
  }

  /**
   * Get htmlUrlToTranslate
   * @return htmlUrlToTranslate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_URL_TO_TRANSLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlUrlToTranslate() {
    return htmlUrlToTranslate;
  }


  @JsonProperty(JSON_PROPERTY_HTML_URL_TO_TRANSLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlUrlToTranslate(String htmlUrlToTranslate) {
    this.htmlUrlToTranslate = htmlUrlToTranslate;
  }

  public LanguageHtmlTranslationRequest inputLanguageCode(String inputLanguageCode) {
    
    this.inputLanguageCode = inputLanguageCode;
    return this;
  }

  /**
   * Get inputLanguageCode
   * @return inputLanguageCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_LANGUAGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputLanguageCode() {
    return inputLanguageCode;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_LANGUAGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputLanguageCode(String inputLanguageCode) {
    this.inputLanguageCode = inputLanguageCode;
  }

  public LanguageHtmlTranslationRequest outputLanguageCode(String outputLanguageCode) {
    
    this.outputLanguageCode = outputLanguageCode;
    return this;
  }

  /**
   * Get outputLanguageCode
   * @return outputLanguageCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_LANGUAGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutputLanguageCode() {
    return outputLanguageCode;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_LANGUAGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputLanguageCode(String outputLanguageCode) {
    this.outputLanguageCode = outputLanguageCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageHtmlTranslationRequest languageHtmlTranslationRequest = (LanguageHtmlTranslationRequest) o;
    return Objects.equals(this.htmlStringToTranslate, languageHtmlTranslationRequest.htmlStringToTranslate) &&
        Objects.equals(this.htmlUrlToTranslate, languageHtmlTranslationRequest.htmlUrlToTranslate) &&
        Objects.equals(this.inputLanguageCode, languageHtmlTranslationRequest.inputLanguageCode) &&
        Objects.equals(this.outputLanguageCode, languageHtmlTranslationRequest.outputLanguageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlStringToTranslate, htmlUrlToTranslate, inputLanguageCode, outputLanguageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageHtmlTranslationRequest {\n");
    sb.append("    htmlStringToTranslate: ").append(toIndentedString(htmlStringToTranslate)).append("\n");
    sb.append("    htmlUrlToTranslate: ").append(toIndentedString(htmlUrlToTranslate)).append("\n");
    sb.append("    inputLanguageCode: ").append(toIndentedString(inputLanguageCode)).append("\n");
    sb.append("    outputLanguageCode: ").append(toIndentedString(outputLanguageCode)).append("\n");
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

