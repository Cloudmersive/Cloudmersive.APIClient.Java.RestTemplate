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
 * Word tagged in a POS tag
 */
@JsonPropertyOrder({
  PosTaggedWord.JSON_PROPERTY_WORD,
  PosTaggedWord.JSON_PROPERTY_TAG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:58.214933200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PosTaggedWord {
  public static final String JSON_PROPERTY_WORD = "Word";
  private Object word;

  public static final String JSON_PROPERTY_TAG = "Tag";
  private Object tag;

  public PosTaggedWord() {
  }

  public PosTaggedWord word(Object word) {
    
    this.word = word;
    return this;
  }

  /**
   * Word that was tagged
   * @return word
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getWord() {
    return word;
  }


  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWord(Object word) {
    this.word = word;
  }

  public PosTaggedWord tag(Object tag) {
    
    this.tag = tag;
    return this;
  }

  /**
   * Penn Treebank tag applied to the word
   * @return tag
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(Object tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosTaggedWord posTaggedWord = (PosTaggedWord) o;
    return Objects.equals(this.word, posTaggedWord.word) &&
        Objects.equals(this.tag, posTaggedWord.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosTaggedWord {\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

