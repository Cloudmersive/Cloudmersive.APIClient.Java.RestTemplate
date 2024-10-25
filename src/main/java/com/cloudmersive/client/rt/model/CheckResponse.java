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
 * Result of a validation operation
 */
@JsonPropertyOrder({
  CheckResponse.JSON_PROPERTY_VALID_DOMAIN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CheckResponse {
  public static final String JSON_PROPERTY_VALID_DOMAIN = "ValidDomain";
  private Boolean validDomain;

  public CheckResponse() {
  }

  public CheckResponse validDomain(Boolean validDomain) {
    
    this.validDomain = validDomain;
    return this;
  }

  /**
   * True if the domain name was valid, false if it is not
   * @return validDomain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidDomain() {
    return validDomain;
  }


  @JsonProperty(JSON_PROPERTY_VALID_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckResponse checkResponse = (CheckResponse) o;
    return Objects.equals(this.validDomain, checkResponse.validDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckResponse {\n");
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
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

