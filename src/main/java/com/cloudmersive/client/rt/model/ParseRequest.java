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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Linguistic parse request
 */
@ApiModel(description = "Linguistic parse request")
@JsonPropertyOrder({
  ParseRequest.JSON_PROPERTY_INPUT_STRING
})
@JsonTypeName("ParseRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:00.734-07:00[America/Los_Angeles]")
public class ParseRequest {
  public static final String JSON_PROPERTY_INPUT_STRING = "InputString";
  private String inputString;


  public ParseRequest inputString(String inputString) {
    
    this.inputString = inputString;
    return this;
  }

   /**
   * Input string to linguistically parse
   * @return inputString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input string to linguistically parse")
  @JsonProperty(JSON_PROPERTY_INPUT_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputString() {
    return inputString;
  }


  public void setInputString(String inputString) {
    this.inputString = inputString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseRequest parseRequest = (ParseRequest) o;
    return Objects.equals(this.inputString, parseRequest.inputString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseRequest {\n");
    sb.append("    inputString: ").append(toIndentedString(inputString)).append("\n");
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

