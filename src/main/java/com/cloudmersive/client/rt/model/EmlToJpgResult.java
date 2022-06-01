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
import com.cloudmersive.client.rt.model.ConvertedJpgPage;
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
 * Result of converting an EML input to a JPG array
 */
@ApiModel(description = "Result of converting an EML input to a JPG array")
@JsonPropertyOrder({
  EmlToJpgResult.JSON_PROPERTY_SUCCESSFUL,
  EmlToJpgResult.JSON_PROPERTY_JPG_RESULT_PAGES
})
@JsonTypeName("EmlToJpgResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class EmlToJpgResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_JPG_RESULT_PAGES = "JpgResultPages";
  private List<ConvertedJpgPage> jpgResultPages = null;


  public EmlToJpgResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public EmlToJpgResult jpgResultPages(List<ConvertedJpgPage> jpgResultPages) {
    
    this.jpgResultPages = jpgResultPages;
    return this;
  }

  public EmlToJpgResult addJpgResultPagesItem(ConvertedJpgPage jpgResultPagesItem) {
    if (this.jpgResultPages == null) {
      this.jpgResultPages = new ArrayList<ConvertedJpgPage>();
    }
    this.jpgResultPages.add(jpgResultPagesItem);
    return this;
  }

   /**
   * Array of converted pages
   * @return jpgResultPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of converted pages")
  @JsonProperty(JSON_PROPERTY_JPG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConvertedJpgPage> getJpgResultPages() {
    return jpgResultPages;
  }


  public void setJpgResultPages(List<ConvertedJpgPage> jpgResultPages) {
    this.jpgResultPages = jpgResultPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmlToJpgResult emlToJpgResult = (EmlToJpgResult) o;
    return Objects.equals(this.successful, emlToJpgResult.successful) &&
        Objects.equals(this.jpgResultPages, emlToJpgResult.jpgResultPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, jpgResultPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmlToJpgResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    jpgResultPages: ").append(toIndentedString(jpgResultPages)).append("\n");
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

