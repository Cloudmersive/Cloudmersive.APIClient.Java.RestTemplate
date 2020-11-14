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
 * Result of performing an identifier validation operation
 */
@ApiModel(description = "Result of performing an identifier validation operation")
@JsonPropertyOrder({
  ValidateIdentifierResponse.JSON_PROPERTY_VALID_IDENTIFIER,
  ValidateIdentifierResponse.JSON_PROPERTY_ERROR
})
@JsonTypeName("ValidateIdentifierResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:16.115-08:00[America/Los_Angeles]")
public class ValidateIdentifierResponse {
  public static final String JSON_PROPERTY_VALID_IDENTIFIER = "ValidIdentifier";
  private Boolean validIdentifier;

  public static final String JSON_PROPERTY_ERROR = "Error";
  private String error;


  public ValidateIdentifierResponse validIdentifier(Boolean validIdentifier) {
    
    this.validIdentifier = validIdentifier;
    return this;
  }

   /**
   * True if the input identifier is valid, false otherwise
   * @return validIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input identifier is valid, false otherwise")
  @JsonProperty(JSON_PROPERTY_VALID_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidIdentifier() {
    return validIdentifier;
  }


  public void setValidIdentifier(Boolean validIdentifier) {
    this.validIdentifier = validIdentifier;
  }


  public ValidateIdentifierResponse error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Resulting error from the identifier validation; possible errors are: \&quot;InputIsEmpty\&quot;, \&quot;ContainsWhitespace\&quot;, \&quot;ContainsNumbers\&quot;, \&quot;ContainsHyphen\&quot;, \&quot;ContainsUnderscore\&quot;, \&quot;ContainsPeriod\&quot;, \&quot;TooShort\&quot;, \&quot;TooLong\&quot;, \&quot;ContainsSpecialCharacters\&quot;
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resulting error from the identifier validation; possible errors are: \"InputIsEmpty\", \"ContainsWhitespace\", \"ContainsNumbers\", \"ContainsHyphen\", \"ContainsUnderscore\", \"ContainsPeriod\", \"TooShort\", \"TooLong\", \"ContainsSpecialCharacters\"")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateIdentifierResponse validateIdentifierResponse = (ValidateIdentifierResponse) o;
    return Objects.equals(this.validIdentifier, validateIdentifierResponse.validIdentifier) &&
        Objects.equals(this.error, validateIdentifierResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validIdentifier, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateIdentifierResponse {\n");
    sb.append("    validIdentifier: ").append(toIndentedString(validIdentifier)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

