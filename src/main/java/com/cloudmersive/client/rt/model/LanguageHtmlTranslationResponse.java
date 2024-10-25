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
 * Output of a language translation operation
 */
@JsonPropertyOrder({
  LanguageHtmlTranslationResponse.JSON_PROPERTY_SUCCESSFUL,
  LanguageHtmlTranslationResponse.JSON_PROPERTY_TRANSLATED_HTML_RESULT,
  LanguageHtmlTranslationResponse.JSON_PROPERTY_SENTENCE_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:53.174056400Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LanguageHtmlTranslationResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TRANSLATED_HTML_RESULT = "TranslatedHtmlResult";
  private String translatedHtmlResult;

  public static final String JSON_PROPERTY_SENTENCE_COUNT = "SentenceCount";
  private Integer sentenceCount;

  public LanguageHtmlTranslationResponse() {
  }

  public LanguageHtmlTranslationResponse successful(Boolean successful) {
    
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

  public LanguageHtmlTranslationResponse translatedHtmlResult(String translatedHtmlResult) {
    
    this.translatedHtmlResult = translatedHtmlResult;
    return this;
  }

  /**
   * Translated text in target language
   * @return translatedHtmlResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSLATED_HTML_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTranslatedHtmlResult() {
    return translatedHtmlResult;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATED_HTML_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslatedHtmlResult(String translatedHtmlResult) {
    this.translatedHtmlResult = translatedHtmlResult;
  }

  public LanguageHtmlTranslationResponse sentenceCount(Integer sentenceCount) {
    
    this.sentenceCount = sentenceCount;
    return this;
  }

  /**
   * Number of sentences in input text
   * @return sentenceCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENTENCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSentenceCount() {
    return sentenceCount;
  }


  @JsonProperty(JSON_PROPERTY_SENTENCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    LanguageHtmlTranslationResponse languageHtmlTranslationResponse = (LanguageHtmlTranslationResponse) o;
    return Objects.equals(this.successful, languageHtmlTranslationResponse.successful) &&
        Objects.equals(this.translatedHtmlResult, languageHtmlTranslationResponse.translatedHtmlResult) &&
        Objects.equals(this.sentenceCount, languageHtmlTranslationResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, translatedHtmlResult, sentenceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageHtmlTranslationResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    translatedHtmlResult: ").append(toIndentedString(translatedHtmlResult)).append("\n");
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

