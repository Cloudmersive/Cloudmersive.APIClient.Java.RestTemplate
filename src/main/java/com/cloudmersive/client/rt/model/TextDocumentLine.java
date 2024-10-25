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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A single line of a Text document
 */
@JsonPropertyOrder({
  TextDocumentLine.JSON_PROPERTY_LINE_NUMBER,
  TextDocumentLine.JSON_PROPERTY_LINE_CONTENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TextDocumentLine {
  public static final String JSON_PROPERTY_LINE_NUMBER = "LineNumber";
  private Integer lineNumber;

  public static final String JSON_PROPERTY_LINE_CONTENTS = "LineContents";
  private String lineContents;

  public TextDocumentLine() {
  }

  public TextDocumentLine lineNumber(Integer lineNumber) {
    
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * The 1-based line index of the line
   * @return lineNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLineNumber() {
    return lineNumber;
  }


  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public TextDocumentLine lineContents(String lineContents) {
    
    this.lineContents = lineContents;
    return this;
  }

  /**
   * The text contents of a single line of a text file
   * @return lineContents
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLineContents() {
    return lineContents;
  }


  @JsonProperty(JSON_PROPERTY_LINE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineContents(String lineContents) {
    this.lineContents = lineContents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDocumentLine textDocumentLine = (TextDocumentLine) o;
    return Objects.equals(this.lineNumber, textDocumentLine.lineNumber) &&
        Objects.equals(this.lineContents, textDocumentLine.lineContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineNumber, lineContents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDocumentLine {\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    lineContents: ").append(toIndentedString(lineContents)).append("\n");
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

