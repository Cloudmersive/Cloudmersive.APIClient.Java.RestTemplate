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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Spelling correction check result
 */
@JsonPropertyOrder({
  CheckWordResponse.JSON_PROPERTY_CORRECT,
  CheckWordResponse.JSON_PROPERTY_SUGGESTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:53.174056400Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CheckWordResponse {
  public static final String JSON_PROPERTY_CORRECT = "Correct";
  private Boolean correct;

  public static final String JSON_PROPERTY_SUGGESTIONS = "Suggestions";
  private List<String> suggestions = new ArrayList<>();

  public CheckWordResponse() {
  }

  public CheckWordResponse correct(Boolean correct) {
    
    this.correct = correct;
    return this;
  }

  /**
   * True if the word is spelled correctly, false otherwise
   * @return correct
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorrect() {
    return correct;
  }


  @JsonProperty(JSON_PROPERTY_CORRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

  public CheckWordResponse suggestions(List<String> suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

  public CheckWordResponse addSuggestionsItem(String suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

  /**
   * Suggested spelling corrections
   * @return suggestions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSuggestions() {
    return suggestions;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckWordResponse checkWordResponse = (CheckWordResponse) o;
    return Objects.equals(this.correct, checkWordResponse.correct) &&
        Objects.equals(this.suggestions, checkWordResponse.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correct, suggestions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckWordResponse {\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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

