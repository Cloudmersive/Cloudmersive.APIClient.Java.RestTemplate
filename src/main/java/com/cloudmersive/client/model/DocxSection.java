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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Section of a Word Document (DOCX)
 */
@ApiModel(description = "Section of a Word Document (DOCX)")
@JsonPropertyOrder({
  DocxSection.JSON_PROPERTY_STARTING_PAGE_NUMBERS,
  DocxSection.JSON_PROPERTY_PATH
})
@JsonTypeName("DocxSection")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
public class DocxSection {
  public static final String JSON_PROPERTY_STARTING_PAGE_NUMBERS = "StartingPageNumbers";
  private List<Integer> startingPageNumbers = null;

  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;


  public DocxSection startingPageNumbers(List<Integer> startingPageNumbers) {
    
    this.startingPageNumbers = startingPageNumbers;
    return this;
  }

  public DocxSection addStartingPageNumbersItem(Integer startingPageNumbersItem) {
    if (this.startingPageNumbers == null) {
      this.startingPageNumbers = new ArrayList<Integer>();
    }
    this.startingPageNumbers.add(startingPageNumbersItem);
    return this;
  }

   /**
   * Page numbers that the section starts at, typically just one
   * @return startingPageNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page numbers that the section starts at, typically just one")
  @JsonProperty(JSON_PROPERTY_STARTING_PAGE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getStartingPageNumbers() {
    return startingPageNumbers;
  }


  public void setStartingPageNumbers(List<Integer> startingPageNumbers) {
    this.startingPageNumbers = startingPageNumbers;
  }


  public DocxSection path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxSection docxSection = (DocxSection) o;
    return Objects.equals(this.startingPageNumbers, docxSection.startingPageNumbers) &&
        Objects.equals(this.path, docxSection.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startingPageNumbers, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxSection {\n");
    sb.append("    startingPageNumbers: ").append(toIndentedString(startingPageNumbers)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

