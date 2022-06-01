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
import com.cloudmersive.client.rt.model.WordPosition;
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
 * A word in a sentence
 */
@ApiModel(description = "A word in a sentence")
@JsonPropertyOrder({
  CorrectWordInSentence.JSON_PROPERTY_WORD,
  CorrectWordInSentence.JSON_PROPERTY_CORRECT,
  CorrectWordInSentence.JSON_PROPERTY_SUGGESTIONS
})
@JsonTypeName("CorrectWordInSentence")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:00.734-07:00[America/Los_Angeles]")
public class CorrectWordInSentence {
  public static final String JSON_PROPERTY_WORD = "Word";
  private WordPosition word;

  public static final String JSON_PROPERTY_CORRECT = "Correct";
  private Boolean correct;

  public static final String JSON_PROPERTY_SUGGESTIONS = "Suggestions";
  private List<String> suggestions = null;


  public CorrectWordInSentence word(WordPosition word) {
    
    this.word = word;
    return this;
  }

   /**
   * Get word
   * @return word
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WordPosition getWord() {
    return word;
  }


  public void setWord(WordPosition word) {
    this.word = word;
  }


  public CorrectWordInSentence correct(Boolean correct) {
    
    this.correct = correct;
    return this;
  }

   /**
   * True if the word is spelled correctly, false otherwise
   * @return correct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the word is spelled correctly, false otherwise")
  @JsonProperty(JSON_PROPERTY_CORRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorrect() {
    return correct;
  }


  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }


  public CorrectWordInSentence suggestions(List<String> suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

  public CorrectWordInSentence addSuggestionsItem(String suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<String>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * Suggested spelling improvements
   * @return suggestions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suggested spelling improvements")
  @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSuggestions() {
    return suggestions;
  }


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
    CorrectWordInSentence correctWordInSentence = (CorrectWordInSentence) o;
    return Objects.equals(this.word, correctWordInSentence.word) &&
        Objects.equals(this.correct, correctWordInSentence.correct) &&
        Objects.equals(this.suggestions, correctWordInSentence.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, correct, suggestions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectWordInSentence {\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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

