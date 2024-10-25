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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Individual regular expression match result of finding a target regex in a longer text string
 */
@JsonPropertyOrder({
  FindRegexMatch.JSON_PROPERTY_CHARACTER_OFFSET_START,
  FindRegexMatch.JSON_PROPERTY_CHARACTER_OFFSET_END,
  FindRegexMatch.JSON_PROPERTY_CONTAINING_LINE,
  FindRegexMatch.JSON_PROPERTY_MATCH_VALUE,
  FindRegexMatch.JSON_PROPERTY_MATCH_GROUPS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FindRegexMatch {
  public static final String JSON_PROPERTY_CHARACTER_OFFSET_START = "CharacterOffsetStart";
  private Integer characterOffsetStart;

  public static final String JSON_PROPERTY_CHARACTER_OFFSET_END = "CharacterOffsetEnd";
  private Integer characterOffsetEnd;

  public static final String JSON_PROPERTY_CONTAINING_LINE = "ContainingLine";
  private String containingLine;

  public static final String JSON_PROPERTY_MATCH_VALUE = "MatchValue";
  private String matchValue;

  public static final String JSON_PROPERTY_MATCH_GROUPS = "MatchGroups";
  private List<String> matchGroups = new ArrayList<>();

  public FindRegexMatch() {
  }

  public FindRegexMatch characterOffsetStart(Integer characterOffsetStart) {
    
    this.characterOffsetStart = characterOffsetStart;
    return this;
  }

  /**
   * 0-based index of the start of the match
   * @return characterOffsetStart
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARACTER_OFFSET_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCharacterOffsetStart() {
    return characterOffsetStart;
  }


  @JsonProperty(JSON_PROPERTY_CHARACTER_OFFSET_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharacterOffsetStart(Integer characterOffsetStart) {
    this.characterOffsetStart = characterOffsetStart;
  }

  public FindRegexMatch characterOffsetEnd(Integer characterOffsetEnd) {
    
    this.characterOffsetEnd = characterOffsetEnd;
    return this;
  }

  /**
   * 0-based index of the end of the match
   * @return characterOffsetEnd
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARACTER_OFFSET_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCharacterOffsetEnd() {
    return characterOffsetEnd;
  }


  @JsonProperty(JSON_PROPERTY_CHARACTER_OFFSET_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharacterOffsetEnd(Integer characterOffsetEnd) {
    this.characterOffsetEnd = characterOffsetEnd;
  }

  public FindRegexMatch containingLine(String containingLine) {
    
    this.containingLine = containingLine;
    return this;
  }

  /**
   * Text content of the line containing the match
   * @return containingLine
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINING_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContainingLine() {
    return containingLine;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINING_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainingLine(String containingLine) {
    this.containingLine = containingLine;
  }

  public FindRegexMatch matchValue(String matchValue) {
    
    this.matchValue = matchValue;
    return this;
  }

  /**
   * The match value
   * @return matchValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMatchValue() {
    return matchValue;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchValue(String matchValue) {
    this.matchValue = matchValue;
  }

  public FindRegexMatch matchGroups(List<String> matchGroups) {
    
    this.matchGroups = matchGroups;
    return this;
  }

  public FindRegexMatch addMatchGroupsItem(String matchGroupsItem) {
    if (this.matchGroups == null) {
      this.matchGroups = new ArrayList<>();
    }
    this.matchGroups.add(matchGroupsItem);
    return this;
  }

  /**
   * Regular expression regex match groups; these correspond to the match values
   * @return matchGroups
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMatchGroups() {
    return matchGroups;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchGroups(List<String> matchGroups) {
    this.matchGroups = matchGroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindRegexMatch findRegexMatch = (FindRegexMatch) o;
    return Objects.equals(this.characterOffsetStart, findRegexMatch.characterOffsetStart) &&
        Objects.equals(this.characterOffsetEnd, findRegexMatch.characterOffsetEnd) &&
        Objects.equals(this.containingLine, findRegexMatch.containingLine) &&
        Objects.equals(this.matchValue, findRegexMatch.matchValue) &&
        Objects.equals(this.matchGroups, findRegexMatch.matchGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterOffsetStart, characterOffsetEnd, containingLine, matchValue, matchGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindRegexMatch {\n");
    sb.append("    characterOffsetStart: ").append(toIndentedString(characterOffsetStart)).append("\n");
    sb.append("    characterOffsetEnd: ").append(toIndentedString(characterOffsetEnd)).append("\n");
    sb.append("    containingLine: ").append(toIndentedString(containingLine)).append("\n");
    sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
    sb.append("    matchGroups: ").append(toIndentedString(matchGroups)).append("\n");
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

