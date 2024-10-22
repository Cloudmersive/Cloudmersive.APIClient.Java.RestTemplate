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
  LanguageTranslationResponse.JSON_PROPERTY_SUCCESSFUL,
  LanguageTranslationResponse.JSON_PROPERTY_TRANSLATED_TEXT_RESULT,
  LanguageTranslationResponse.JSON_PROPERTY_SENTENCE_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:58.214933200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LanguageTranslationResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TRANSLATED_TEXT_RESULT = "TranslatedTextResult";
  private String translatedTextResult;

  public static final String JSON_PROPERTY_SENTENCE_COUNT = "SentenceCount";
  private Integer sentenceCount;

  public LanguageTranslationResponse() {
  }

  public LanguageTranslationResponse successful(Boolean successful) {
    
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

  public LanguageTranslationResponse translatedTextResult(String translatedTextResult) {
    
    this.translatedTextResult = translatedTextResult;
    return this;
  }

  /**
   * Translated text in target language
   * @return translatedTextResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSLATED_TEXT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTranslatedTextResult() {
    return translatedTextResult;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATED_TEXT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslatedTextResult(String translatedTextResult) {
    this.translatedTextResult = translatedTextResult;
  }

  public LanguageTranslationResponse sentenceCount(Integer sentenceCount) {
    
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
    LanguageTranslationResponse languageTranslationResponse = (LanguageTranslationResponse) o;
    return Objects.equals(this.successful, languageTranslationResponse.successful) &&
        Objects.equals(this.translatedTextResult, languageTranslationResponse.translatedTextResult) &&
        Objects.equals(this.sentenceCount, languageTranslationResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, translatedTextResult, sentenceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageTranslationResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    translatedTextResult: ").append(toIndentedString(translatedTextResult)).append("\n");
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

