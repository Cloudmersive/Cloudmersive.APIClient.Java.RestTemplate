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
 * Request to detect if input content is base 64 encoded
 */
@ApiModel(description = "Request to detect if input content is base 64 encoded")
@JsonPropertyOrder({
  Base64DetectRequest.JSON_PROPERTY_BASE64_CONTENT_TO_DETECT
})
@JsonTypeName("Base64DetectRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
public class Base64DetectRequest {
  public static final String JSON_PROPERTY_BASE64_CONTENT_TO_DETECT = "Base64ContentToDetect";
  private String base64ContentToDetect;


  public Base64DetectRequest base64ContentToDetect(String base64ContentToDetect) {
    
    this.base64ContentToDetect = base64ContentToDetect;
    return this;
  }

   /**
   * Input content text to detect if it is base 64 encoded
   * @return base64ContentToDetect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input content text to detect if it is base 64 encoded")
  @JsonProperty(JSON_PROPERTY_BASE64_CONTENT_TO_DETECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBase64ContentToDetect() {
    return base64ContentToDetect;
  }


  public void setBase64ContentToDetect(String base64ContentToDetect) {
    this.base64ContentToDetect = base64ContentToDetect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64DetectRequest base64DetectRequest = (Base64DetectRequest) o;
    return Objects.equals(this.base64ContentToDetect, base64DetectRequest.base64ContentToDetect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64ContentToDetect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64DetectRequest {\n");
    sb.append("    base64ContentToDetect: ").append(toIndentedString(base64ContentToDetect)).append("\n");
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

