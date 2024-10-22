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
 * Result of performing an XSS protection operation
 */
@JsonPropertyOrder({
  XssProtectionResult.JSON_PROPERTY_SUCCESSFUL,
  XssProtectionResult.JSON_PROPERTY_CONTAINED_XSS,
  XssProtectionResult.JSON_PROPERTY_ORIGINAL_INPUT,
  XssProtectionResult.JSON_PROPERTY_NORMALIZED_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:48.283468600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class XssProtectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTAINED_XSS = "ContainedXss";
  private Boolean containedXss;

  public static final String JSON_PROPERTY_ORIGINAL_INPUT = "OriginalInput";
  private String originalInput;

  public static final String JSON_PROPERTY_NORMALIZED_RESULT = "NormalizedResult";
  private String normalizedResult;

  public XssProtectionResult() {
  }

  public XssProtectionResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the operation was successful, false otherwise
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

  public XssProtectionResult containedXss(Boolean containedXss) {
    
    this.containedXss = containedXss;
    return this;
  }

  /**
   * True if the input contained XSS scripting, false otherwise
   * @return containedXss
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINED_XSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedXss() {
    return containedXss;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINED_XSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainedXss(Boolean containedXss) {
    this.containedXss = containedXss;
  }

  public XssProtectionResult originalInput(String originalInput) {
    
    this.originalInput = originalInput;
    return this;
  }

  /**
   * Original input string
   * @return originalInput
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalInput() {
    return originalInput;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalInput(String originalInput) {
    this.originalInput = originalInput;
  }

  public XssProtectionResult normalizedResult(String normalizedResult) {
    
    this.normalizedResult = normalizedResult;
    return this;
  }

  /**
   * Normalized string result, with XSS removed
   * @return normalizedResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NORMALIZED_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNormalizedResult() {
    return normalizedResult;
  }


  @JsonProperty(JSON_PROPERTY_NORMALIZED_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizedResult(String normalizedResult) {
    this.normalizedResult = normalizedResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XssProtectionResult xssProtectionResult = (XssProtectionResult) o;
    return Objects.equals(this.successful, xssProtectionResult.successful) &&
        Objects.equals(this.containedXss, xssProtectionResult.containedXss) &&
        Objects.equals(this.originalInput, xssProtectionResult.originalInput) &&
        Objects.equals(this.normalizedResult, xssProtectionResult.normalizedResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedXss, originalInput, normalizedResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XssProtectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedXss: ").append(toIndentedString(containedXss)).append("\n");
    sb.append("    originalInput: ").append(toIndentedString(originalInput)).append("\n");
    sb.append("    normalizedResult: ").append(toIndentedString(normalizedResult)).append("\n");
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

