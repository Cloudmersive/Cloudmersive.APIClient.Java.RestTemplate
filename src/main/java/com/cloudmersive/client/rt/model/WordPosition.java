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
 * WordPosition
 */
@JsonPropertyOrder({
  WordPosition.JSON_PROPERTY_WORD,
  WordPosition.JSON_PROPERTY_WORD_INDEX,
  WordPosition.JSON_PROPERTY_START_POSITION,
  WordPosition.JSON_PROPERTY_END_POSITION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:53.174056400Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class WordPosition {
  public static final String JSON_PROPERTY_WORD = "Word";
  private String word;

  public static final String JSON_PROPERTY_WORD_INDEX = "WordIndex";
  private Integer wordIndex;

  public static final String JSON_PROPERTY_START_POSITION = "StartPosition";
  private Integer startPosition;

  public static final String JSON_PROPERTY_END_POSITION = "EndPosition";
  private Integer endPosition;

  public WordPosition() {
  }

  public WordPosition word(String word) {
    
    this.word = word;
    return this;
  }

  /**
   * Word as a string
   * @return word
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWord() {
    return word;
  }


  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWord(String word) {
    this.word = word;
  }

  public WordPosition wordIndex(Integer wordIndex) {
    
    this.wordIndex = wordIndex;
    return this;
  }

  /**
   * Zero-based index of the word; first word has index 0, second word has index 1 and so on
   * @return wordIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORD_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWordIndex() {
    return wordIndex;
  }


  @JsonProperty(JSON_PROPERTY_WORD_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWordIndex(Integer wordIndex) {
    this.wordIndex = wordIndex;
  }

  public WordPosition startPosition(Integer startPosition) {
    
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Zero-based character offset at which the word begins in the input string
   * @return startPosition
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartPosition() {
    return startPosition;
  }


  @JsonProperty(JSON_PROPERTY_START_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public WordPosition endPosition(Integer endPosition) {
    
    this.endPosition = endPosition;
    return this;
  }

  /**
   * Zero-based character offset at which the word ends in the input string
   * @return endPosition
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndPosition() {
    return endPosition;
  }


  @JsonProperty(JSON_PROPERTY_END_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndPosition(Integer endPosition) {
    this.endPosition = endPosition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordPosition wordPosition = (WordPosition) o;
    return Objects.equals(this.word, wordPosition.word) &&
        Objects.equals(this.wordIndex, wordPosition.wordIndex) &&
        Objects.equals(this.startPosition, wordPosition.startPosition) &&
        Objects.equals(this.endPosition, wordPosition.endPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, wordIndex, startPosition, endPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordPosition {\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    wordIndex: ").append(toIndentedString(wordIndex)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
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

