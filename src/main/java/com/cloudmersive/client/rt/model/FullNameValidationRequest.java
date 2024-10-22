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
 * Request to validate a full name string
 */
@JsonPropertyOrder({
  FullNameValidationRequest.JSON_PROPERTY_FULL_NAME_STRING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:48.283468600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FullNameValidationRequest {
  public static final String JSON_PROPERTY_FULL_NAME_STRING = "FullNameString";
  private String fullNameString;

  public FullNameValidationRequest() {
  }

  public FullNameValidationRequest fullNameString(String fullNameString) {
    
    this.fullNameString = fullNameString;
    return this;
  }

  /**
   * Full name to process as a free-form string; supports many components such as First Name, Middle Name, Last Name, Title, Nickname, Suffix, and Display Name
   * @return fullNameString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullNameString() {
    return fullNameString;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullNameString(String fullNameString) {
    this.fullNameString = fullNameString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullNameValidationRequest fullNameValidationRequest = (FullNameValidationRequest) o;
    return Objects.equals(this.fullNameString, fullNameValidationRequest.fullNameString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullNameString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullNameValidationRequest {\n");
    sb.append("    fullNameString: ").append(toIndentedString(fullNameString)).append("\n");
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

