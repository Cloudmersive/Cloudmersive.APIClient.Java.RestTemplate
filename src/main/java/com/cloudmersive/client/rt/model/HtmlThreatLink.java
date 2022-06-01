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
 * Threat assessment for a hyperlink URL
 */
@ApiModel(description = "Threat assessment for a hyperlink URL")
@JsonPropertyOrder({
  HtmlThreatLink.JSON_PROPERTY_LINK_URL,
  HtmlThreatLink.JSON_PROPERTY_THREAT_LEVEL
})
@JsonTypeName("HtmlThreatLink")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class HtmlThreatLink {
  public static final String JSON_PROPERTY_LINK_URL = "LinkUrl";
  private String linkUrl;

  public static final String JSON_PROPERTY_THREAT_LEVEL = "ThreatLevel";
  private String threatLevel;


  public HtmlThreatLink linkUrl(String linkUrl) {
    
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * URL of the link
   * @return linkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the link")
  @JsonProperty(JSON_PROPERTY_LINK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkUrl() {
    return linkUrl;
  }


  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public HtmlThreatLink threatLevel(String threatLevel) {
    
    this.threatLevel = threatLevel;
    return this;
  }

   /**
   * Threat assessment level; possible values are None, Low, Medium and High
   * @return threatLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Threat assessment level; possible values are None, Low, Medium and High")
  @JsonProperty(JSON_PROPERTY_THREAT_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreatLevel() {
    return threatLevel;
  }


  public void setThreatLevel(String threatLevel) {
    this.threatLevel = threatLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlThreatLink htmlThreatLink = (HtmlThreatLink) o;
    return Objects.equals(this.linkUrl, htmlThreatLink.linkUrl) &&
        Objects.equals(this.threatLevel, htmlThreatLink.threatLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkUrl, threatLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlThreatLink {\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    threatLevel: ").append(toIndentedString(threatLevel)).append("\n");
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
