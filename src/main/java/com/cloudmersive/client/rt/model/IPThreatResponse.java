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
 * Result of performing a IP threat check on an IP address
 */
@JsonPropertyOrder({
  IPThreatResponse.JSON_PROPERTY_IS_THREAT,
  IPThreatResponse.JSON_PROPERTY_THREAT_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IPThreatResponse {
  public static final String JSON_PROPERTY_IS_THREAT = "IsThreat";
  private Boolean isThreat;

  public static final String JSON_PROPERTY_THREAT_TYPE = "ThreatType";
  private String threatType;

  public IPThreatResponse() {
  }

  public IPThreatResponse isThreat(Boolean isThreat) {
    
    this.isThreat = isThreat;
    return this;
  }

  /**
   * True if the input IP address is a threat, false otherwise
   * @return isThreat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsThreat() {
    return isThreat;
  }


  @JsonProperty(JSON_PROPERTY_IS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsThreat(Boolean isThreat) {
    this.isThreat = isThreat;
  }

  public IPThreatResponse threatType(String threatType) {
    
    this.threatType = threatType;
    return this;
  }

  /**
   * Specifies the type of IP threat; possible values include Blocklist, Botnet, WebBot
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
    IPThreatResponse ipThreatResponse = (IPThreatResponse) o;
    return Objects.equals(this.isThreat, ipThreatResponse.isThreat) &&
        Objects.equals(this.threatType, ipThreatResponse.threatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isThreat, threatType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPThreatResponse {\n");
    sb.append("    isThreat: ").append(toIndentedString(isThreat)).append("\n");
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

