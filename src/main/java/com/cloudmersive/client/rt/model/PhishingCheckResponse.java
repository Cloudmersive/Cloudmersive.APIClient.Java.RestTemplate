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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of checking a URL for Phishing threats
 */
@JsonPropertyOrder({
  PhishingCheckResponse.JSON_PROPERTY_CLEAN_U_R_L,
  PhishingCheckResponse.JSON_PROPERTY_THREAT_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PhishingCheckResponse {
  public static final String JSON_PROPERTY_CLEAN_U_R_L = "CleanURL";
  private Boolean cleanURL;

  public static final String JSON_PROPERTY_THREAT_TYPE = "ThreatType";
  private String threatType;

  public PhishingCheckResponse() {
  }

  public PhishingCheckResponse cleanURL(Boolean cleanURL) {
    
    this.cleanURL = cleanURL;
    return this;
  }

  /**
   * True if the URL is clean, false if it is at risk of containing a Phishing threat or attack
   * @return cleanURL
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLEAN_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCleanURL() {
    return cleanURL;
  }


  @JsonProperty(JSON_PROPERTY_CLEAN_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
  }

  public PhishingCheckResponse threatType(String threatType) {
    
    this.threatType = threatType;
    return this;
  }

  /**
   * Threat type of the Phishing threat; possible values are VerifiedPhishingURL, UnverifiedPhishingURL, or VerifiedPhishingDomain
   * @return threatType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreatType() {
    return threatType;
  }


  @JsonProperty(JSON_PROPERTY_THREAT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreatType(String threatType) {
    this.threatType = threatType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhishingCheckResponse phishingCheckResponse = (PhishingCheckResponse) o;
    return Objects.equals(this.cleanURL, phishingCheckResponse.cleanURL) &&
        Objects.equals(this.threatType, phishingCheckResponse.threatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanURL, threatType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhishingCheckResponse {\n");
    sb.append("    cleanURL: ").append(toIndentedString(cleanURL)).append("\n");
    sb.append("    threatType: ").append(toIndentedString(threatType)).append("\n");
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

