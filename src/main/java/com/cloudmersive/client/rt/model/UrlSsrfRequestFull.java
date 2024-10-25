/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request to determine if a URL is an SSRF threat check
 */
@JsonPropertyOrder({
  UrlSsrfRequestFull.JSON_PROPERTY_U_R_L,
  UrlSsrfRequestFull.JSON_PROPERTY_BLOCKED_DOMAINS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UrlSsrfRequestFull {
  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public static final String JSON_PROPERTY_BLOCKED_DOMAINS = "BlockedDomains";
  private List<String> blockedDomains = new ArrayList<>();

  public UrlSsrfRequestFull() {
  }

  public UrlSsrfRequestFull URL(String URL) {
    
    this.URL = URL;
    return this;
  }

  /**
   * URL to validate
   * @return URL
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setURL(String URL) {
    this.URL = URL;
  }

  public UrlSsrfRequestFull blockedDomains(List<String> blockedDomains) {
    
    this.blockedDomains = blockedDomains;
    return this;
  }

  public UrlSsrfRequestFull addBlockedDomainsItem(String blockedDomainsItem) {
    if (this.blockedDomains == null) {
      this.blockedDomains = new ArrayList<>();
    }
    this.blockedDomains.add(blockedDomainsItem);
    return this;
  }

  /**
   * Top level domains that you do not want to allow access to, e.g. mydomain.com - will block all subdomains as well
   * @return blockedDomains
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBlockedDomains() {
    return blockedDomains;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockedDomains(List<String> blockedDomains) {
    this.blockedDomains = blockedDomains;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSsrfRequestFull urlSsrfRequestFull = (UrlSsrfRequestFull) o;
    return Objects.equals(this.URL, urlSsrfRequestFull.URL) &&
        Objects.equals(this.blockedDomains, urlSsrfRequestFull.blockedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL, blockedDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSsrfRequestFull {\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    blockedDomains: ").append(toIndentedString(blockedDomains)).append("\n");
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

