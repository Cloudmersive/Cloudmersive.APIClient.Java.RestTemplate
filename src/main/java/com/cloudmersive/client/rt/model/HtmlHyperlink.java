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
 * Individual hyperlink in an HTML File
 */
@ApiModel(description = "Individual hyperlink in an HTML File")
@JsonPropertyOrder({
  HtmlHyperlink.JSON_PROPERTY_ANCHORTEXT,
  HtmlHyperlink.JSON_PROPERTY_URL
})
@JsonTypeName("HtmlHyperlink")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class HtmlHyperlink {
  public static final String JSON_PROPERTY_ANCHORTEXT = "Anchortext";
  private String anchortext;

  public static final String JSON_PROPERTY_URL = "Url";
  private String url;


  public HtmlHyperlink anchortext(String anchortext) {
    
    this.anchortext = anchortext;
    return this;
  }

   /**
   * Anchor text of the hyperlink, e.g. Click Here
   * @return anchortext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anchor text of the hyperlink, e.g. Click Here")
  @JsonProperty(JSON_PROPERTY_ANCHORTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnchortext() {
    return anchortext;
  }


  public void setAnchortext(String anchortext) {
    this.anchortext = anchortext;
  }


  public HtmlHyperlink url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the hyperlink; fully-qualified if possible, otherwise relative
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the hyperlink; fully-qualified if possible, otherwise relative")
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
    HtmlHyperlink htmlHyperlink = (HtmlHyperlink) o;
    return Objects.equals(this.anchortext, htmlHyperlink.anchortext) &&
        Objects.equals(this.url, htmlHyperlink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchortext, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlHyperlink {\n");
    sb.append("    anchortext: ").append(toIndentedString(anchortext)).append("\n");
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

