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
import com.cloudmersive.client.rt.model.PosSentence;
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
 * Part of speech tag result
 */
@JsonPropertyOrder({
  PosResponse.JSON_PROPERTY_TAGGED_SENTENCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:53.174056400Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PosResponse {
  public static final String JSON_PROPERTY_TAGGED_SENTENCES = "TaggedSentences";
  private List<PosSentence> taggedSentences = new ArrayList<>();

  public PosResponse() {
  }

  public PosResponse taggedSentences(List<PosSentence> taggedSentences) {
    
    this.taggedSentences = taggedSentences;
    return this;
  }

  public PosResponse addTaggedSentencesItem(PosSentence taggedSentencesItem) {
    if (this.taggedSentences == null) {
      this.taggedSentences = new ArrayList<>();
    }
    this.taggedSentences.add(taggedSentencesItem);
    return this;
  }

  /**
   * Sentences in the string
   * @return taggedSentences
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGGED_SENTENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PosSentence> getTaggedSentences() {
    return taggedSentences;
  }


  @JsonProperty(JSON_PROPERTY_TAGGED_SENTENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaggedSentences(List<PosSentence> taggedSentences) {
    this.taggedSentences = taggedSentences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosResponse posResponse = (PosResponse) o;
    return Objects.equals(this.taggedSentences, posResponse.taggedSentences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taggedSentences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosResponse {\n");
    sb.append("    taggedSentences: ").append(toIndentedString(taggedSentences)).append("\n");
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

