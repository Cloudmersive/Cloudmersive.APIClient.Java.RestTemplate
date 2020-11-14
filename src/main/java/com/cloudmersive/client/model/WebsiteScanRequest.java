/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
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
 * Request to scan a website for malicious content
 */
@ApiModel(description = "Request to scan a website for malicious content")
@JsonPropertyOrder({
  WebsiteScanRequest.JSON_PROPERTY_URL
})
@JsonTypeName("WebsiteScanRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:33.425-08:00[America/Los_Angeles]")
public class WebsiteScanRequest {
  public static final String JSON_PROPERTY_URL = "Url";
  private String url;


  public WebsiteScanRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the website to scan; should begin with http:// or https://
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the website to scan; should begin with http:// or https://")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteScanRequest websiteScanRequest = (WebsiteScanRequest) o;
    return Objects.equals(this.url, websiteScanRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsiteScanRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
