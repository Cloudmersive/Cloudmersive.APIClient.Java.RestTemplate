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
 * Result of creating a viewer
 */
@JsonPropertyOrder({
  ViewerResponse.JSON_PROPERTY_HTML_EMBED,
  ViewerResponse.JSON_PROPERTY_SUCCESSFUL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ViewerResponse {
  public static final String JSON_PROPERTY_HTML_EMBED = "HtmlEmbed";
  private String htmlEmbed;

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public ViewerResponse() {
  }

  public ViewerResponse htmlEmbed(String htmlEmbed) {
    
    this.htmlEmbed = htmlEmbed;
    return this;
  }

  /**
   * Get htmlEmbed
   * @return htmlEmbed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_EMBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlEmbed() {
    return htmlEmbed;
  }


  @JsonProperty(JSON_PROPERTY_HTML_EMBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlEmbed(String htmlEmbed) {
    this.htmlEmbed = htmlEmbed;
  }

  public ViewerResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * Get successful
   * @return successful
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewerResponse viewerResponse = (ViewerResponse) o;
    return Objects.equals(this.htmlEmbed, viewerResponse.htmlEmbed) &&
        Objects.equals(this.successful, viewerResponse.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlEmbed, successful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewerResponse {\n");
    sb.append("    htmlEmbed: ").append(toIndentedString(htmlEmbed)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

