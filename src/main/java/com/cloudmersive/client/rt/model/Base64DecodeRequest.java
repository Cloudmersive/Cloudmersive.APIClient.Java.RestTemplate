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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to decode content from Base 64 into binary
 */
@ApiModel(description = "Request to decode content from Base 64 into binary")
@JsonPropertyOrder({
  Base64DecodeRequest.JSON_PROPERTY_BASE64_CONTENT_TO_DECODE
})
@JsonTypeName("Base64DecodeRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class Base64DecodeRequest {
  public static final String JSON_PROPERTY_BASE64_CONTENT_TO_DECODE = "Base64ContentToDecode";
  private String base64ContentToDecode;


  public Base64DecodeRequest base64ContentToDecode(String base64ContentToDecode) {
    
    this.base64ContentToDecode = base64ContentToDecode;
    return this;
  }

   /**
   * Input content to decode from Base 64 into binary
   * @return base64ContentToDecode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input content to decode from Base 64 into binary")
  @JsonProperty(JSON_PROPERTY_BASE64_CONTENT_TO_DECODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBase64ContentToDecode() {
    return base64ContentToDecode;
  }


  public void setBase64ContentToDecode(String base64ContentToDecode) {
    this.base64ContentToDecode = base64ContentToDecode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64DecodeRequest base64DecodeRequest = (Base64DecodeRequest) o;
    return Objects.equals(this.base64ContentToDecode, base64DecodeRequest.base64ContentToDecode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64ContentToDecode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64DecodeRequest {\n");
    sb.append("    base64ContentToDecode: ").append(toIndentedString(base64ContentToDecode)).append("\n");
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

