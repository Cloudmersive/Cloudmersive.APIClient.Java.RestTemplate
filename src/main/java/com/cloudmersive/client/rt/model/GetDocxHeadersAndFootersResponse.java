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
import com.cloudmersive.client.rt.model.DocxFooter;
import com.cloudmersive.client.rt.model.DocxHeader;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of running a Get-Tables command
 */
@JsonPropertyOrder({
  GetDocxHeadersAndFootersResponse.JSON_PROPERTY_SUCCESSFUL,
  GetDocxHeadersAndFootersResponse.JSON_PROPERTY_HEADERS,
  GetDocxHeadersAndFootersResponse.JSON_PROPERTY_FOOTERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetDocxHeadersAndFootersResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_HEADERS = "Headers";
  private List<DocxHeader> headers = new ArrayList<>();

  public static final String JSON_PROPERTY_FOOTERS = "Footers";
  private List<DocxFooter> footers = new ArrayList<>();

  public GetDocxHeadersAndFootersResponse() {
  }

  public GetDocxHeadersAndFootersResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if successful, false otherwise
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

  public GetDocxHeadersAndFootersResponse headers(List<DocxHeader> headers) {
    
    this.headers = headers;
    return this;
  }

  public GetDocxHeadersAndFootersResponse addHeadersItem(DocxHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxHeader> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(List<DocxHeader> headers) {
    this.headers = headers;
  }

  public GetDocxHeadersAndFootersResponse footers(List<DocxFooter> footers) {
    
    this.footers = footers;
    return this;
  }

  public GetDocxHeadersAndFootersResponse addFootersItem(DocxFooter footersItem) {
    if (this.footers == null) {
      this.footers = new ArrayList<>();
    }
    this.footers.add(footersItem);
    return this;
  }

  /**
   * Get footers
   * @return footers
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOOTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxFooter> getFooters() {
    return footers;
  }


  @JsonProperty(JSON_PROPERTY_FOOTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFooters(List<DocxFooter> footers) {
    this.footers = footers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxHeadersAndFootersResponse getDocxHeadersAndFootersResponse = (GetDocxHeadersAndFootersResponse) o;
    return Objects.equals(this.successful, getDocxHeadersAndFootersResponse.successful) &&
        Objects.equals(this.headers, getDocxHeadersAndFootersResponse.headers) &&
        Objects.equals(this.footers, getDocxHeadersAndFootersResponse.footers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, headers, footers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxHeadersAndFootersResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    footers: ").append(toIndentedString(footers)).append("\n");
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

