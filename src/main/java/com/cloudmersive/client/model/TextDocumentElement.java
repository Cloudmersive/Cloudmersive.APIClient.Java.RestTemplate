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


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A single element of a Text document
 */
@ApiModel(description = "A single element of a Text document")
@JsonPropertyOrder({
  TextDocumentElement.JSON_PROPERTY_ELEMENT_NUMBER,
  TextDocumentElement.JSON_PROPERTY_ELEMENT_CONTENTS
})
@JsonTypeName("TextDocumentElement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
public class TextDocumentElement {
  public static final String JSON_PROPERTY_ELEMENT_NUMBER = "ElementNumber";
  private Integer elementNumber;

  public static final String JSON_PROPERTY_ELEMENT_CONTENTS = "ElementContents";
  private String elementContents;


  public TextDocumentElement elementNumber(Integer elementNumber) {
    
    this.elementNumber = elementNumber;
    return this;
  }

   /**
   * The 1-based line index of the element
   * @return elementNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 1-based line index of the element")
  @JsonProperty(JSON_PROPERTY_ELEMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getElementNumber() {
    return elementNumber;
  }


  public void setElementNumber(Integer elementNumber) {
    this.elementNumber = elementNumber;
  }


  public TextDocumentElement elementContents(String elementContents) {
    
    this.elementContents = elementContents;
    return this;
  }

   /**
   * The text contents of a single element of a text file
   * @return elementContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text contents of a single element of a text file")
  @JsonProperty(JSON_PROPERTY_ELEMENT_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElementContents() {
    return elementContents;
  }


  public void setElementContents(String elementContents) {
    this.elementContents = elementContents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDocumentElement textDocumentElement = (TextDocumentElement) o;
    return Objects.equals(this.elementNumber, textDocumentElement.elementNumber) &&
        Objects.equals(this.elementContents, textDocumentElement.elementContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementNumber, elementContents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDocumentElement {\n");
    sb.append("    elementNumber: ").append(toIndentedString(elementNumber)).append("\n");
    sb.append("    elementContents: ").append(toIndentedString(elementContents)).append("\n");
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

