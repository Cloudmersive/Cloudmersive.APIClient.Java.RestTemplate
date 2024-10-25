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
 * Identifier validation request, including the input identifier as well as various identifier rules
 */
@JsonPropertyOrder({
  ValidateIdentifierRequest.JSON_PROPERTY_INPUT,
  ValidateIdentifierRequest.JSON_PROPERTY_ALLOW_WHITESPACE,
  ValidateIdentifierRequest.JSON_PROPERTY_ALLOW_HYPHENS,
  ValidateIdentifierRequest.JSON_PROPERTY_ALLOW_UNDERSCORE,
  ValidateIdentifierRequest.JSON_PROPERTY_ALLOW_NUMBERS,
  ValidateIdentifierRequest.JSON_PROPERTY_ALLOW_PERIODS,
  ValidateIdentifierRequest.JSON_PROPERTY_MAX_LENGTH,
  ValidateIdentifierRequest.JSON_PROPERTY_MIN_LENGTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ValidateIdentifierRequest {
  public static final String JSON_PROPERTY_INPUT = "Input";
  private String input;

  public static final String JSON_PROPERTY_ALLOW_WHITESPACE = "AllowWhitespace";
  private Boolean allowWhitespace;

  public static final String JSON_PROPERTY_ALLOW_HYPHENS = "AllowHyphens";
  private Boolean allowHyphens;

  public static final String JSON_PROPERTY_ALLOW_UNDERSCORE = "AllowUnderscore";
  private Boolean allowUnderscore;

  public static final String JSON_PROPERTY_ALLOW_NUMBERS = "AllowNumbers";
  private Boolean allowNumbers;

  public static final String JSON_PROPERTY_ALLOW_PERIODS = "AllowPeriods";
  private Boolean allowPeriods;

  public static final String JSON_PROPERTY_MAX_LENGTH = "MaxLength";
  private Integer maxLength;

  public static final String JSON_PROPERTY_MIN_LENGTH = "MinLength";
  private Integer minLength;

  public ValidateIdentifierRequest() {
  }

  public ValidateIdentifierRequest input(String input) {
    
    this.input = input;
    return this;
  }

  /**
   * Text string identifier input
   * @return input
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInput() {
    return input;
  }


  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInput(String input) {
    this.input = input;
  }

  public ValidateIdentifierRequest allowWhitespace(Boolean allowWhitespace) {
    
    this.allowWhitespace = allowWhitespace;
    return this;
  }

  /**
   * True if whitespace is allowed in the identifier, false otherwise
   * @return allowWhitespace
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_WHITESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowWhitespace() {
    return allowWhitespace;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_WHITESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowWhitespace(Boolean allowWhitespace) {
    this.allowWhitespace = allowWhitespace;
  }

  public ValidateIdentifierRequest allowHyphens(Boolean allowHyphens) {
    
    this.allowHyphens = allowHyphens;
    return this;
  }

  /**
   * True if hyphens are allowd in the identifier, false otherwise
   * @return allowHyphens
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_HYPHENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowHyphens() {
    return allowHyphens;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_HYPHENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowHyphens(Boolean allowHyphens) {
    this.allowHyphens = allowHyphens;
  }

  public ValidateIdentifierRequest allowUnderscore(Boolean allowUnderscore) {
    
    this.allowUnderscore = allowUnderscore;
    return this;
  }

  /**
   * True if underscores are allowed in the identifier, false otherwise
   * @return allowUnderscore
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_UNDERSCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowUnderscore() {
    return allowUnderscore;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_UNDERSCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowUnderscore(Boolean allowUnderscore) {
    this.allowUnderscore = allowUnderscore;
  }

  public ValidateIdentifierRequest allowNumbers(Boolean allowNumbers) {
    
    this.allowNumbers = allowNumbers;
    return this;
  }

  /**
   * True if numbers are allowed in the identifier, false otherwise
   * @return allowNumbers
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowNumbers() {
    return allowNumbers;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowNumbers(Boolean allowNumbers) {
    this.allowNumbers = allowNumbers;
  }

  public ValidateIdentifierRequest allowPeriods(Boolean allowPeriods) {
    
    this.allowPeriods = allowPeriods;
    return this;
  }

  /**
   * True if periods are allowed in the identifier, false otherwise
   * @return allowPeriods
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowPeriods() {
    return allowPeriods;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowPeriods(Boolean allowPeriods) {
    this.allowPeriods = allowPeriods;
  }

  public ValidateIdentifierRequest maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Optional; maximum length, if any, of the identifier
   * @return maxLength
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxLength() {
    return maxLength;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public ValidateIdentifierRequest minLength(Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

  /**
   * Optional; minimum length, if any, of the identifier
   * @return minLength
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinLength() {
    return minLength;
  }


  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateIdentifierRequest validateIdentifierRequest = (ValidateIdentifierRequest) o;
    return Objects.equals(this.input, validateIdentifierRequest.input) &&
        Objects.equals(this.allowWhitespace, validateIdentifierRequest.allowWhitespace) &&
        Objects.equals(this.allowHyphens, validateIdentifierRequest.allowHyphens) &&
        Objects.equals(this.allowUnderscore, validateIdentifierRequest.allowUnderscore) &&
        Objects.equals(this.allowNumbers, validateIdentifierRequest.allowNumbers) &&
        Objects.equals(this.allowPeriods, validateIdentifierRequest.allowPeriods) &&
        Objects.equals(this.maxLength, validateIdentifierRequest.maxLength) &&
        Objects.equals(this.minLength, validateIdentifierRequest.minLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, allowWhitespace, allowHyphens, allowUnderscore, allowNumbers, allowPeriods, maxLength, minLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateIdentifierRequest {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    allowWhitespace: ").append(toIndentedString(allowWhitespace)).append("\n");
    sb.append("    allowHyphens: ").append(toIndentedString(allowHyphens)).append("\n");
    sb.append("    allowUnderscore: ").append(toIndentedString(allowUnderscore)).append("\n");
    sb.append("    allowNumbers: ").append(toIndentedString(allowNumbers)).append("\n");
    sb.append("    allowPeriods: ").append(toIndentedString(allowPeriods)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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

