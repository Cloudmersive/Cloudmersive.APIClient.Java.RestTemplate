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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of performing an SQL Injection protection operation
 */
@ApiModel(description = "Result of performing an SQL Injection protection operation")
@JsonPropertyOrder({
  SqlInjectionDetectionResult.JSON_PROPERTY_SUCCESSFUL,
  SqlInjectionDetectionResult.JSON_PROPERTY_CONTAINED_SQL_INJECTION_ATTACK,
  SqlInjectionDetectionResult.JSON_PROPERTY_ORIGINAL_INPUT
})
@JsonTypeName("SqlInjectionDetectionResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:52:45.902-07:00[America/Los_Angeles]")
public class SqlInjectionDetectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTAINED_SQL_INJECTION_ATTACK = "ContainedSqlInjectionAttack";
  private Boolean containedSqlInjectionAttack;

  public static final String JSON_PROPERTY_ORIGINAL_INPUT = "OriginalInput";
  private String originalInput;


  public SqlInjectionDetectionResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public SqlInjectionDetectionResult containedSqlInjectionAttack(Boolean containedSqlInjectionAttack) {
    
    this.containedSqlInjectionAttack = containedSqlInjectionAttack;
    return this;
  }

   /**
   * True if the input contained SQL Injection attacks, false otherwise
   * @return containedSqlInjectionAttack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input contained SQL Injection attacks, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINED_SQL_INJECTION_ATTACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedSqlInjectionAttack() {
    return containedSqlInjectionAttack;
  }


  public void setContainedSqlInjectionAttack(Boolean containedSqlInjectionAttack) {
    this.containedSqlInjectionAttack = containedSqlInjectionAttack;
  }


  public SqlInjectionDetectionResult originalInput(String originalInput) {
    
    this.originalInput = originalInput;
    return this;
  }

   /**
   * Original input string
   * @return originalInput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Original input string")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalInput() {
    return originalInput;
  }


  public void setOriginalInput(String originalInput) {
    this.originalInput = originalInput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlInjectionDetectionResult sqlInjectionDetectionResult = (SqlInjectionDetectionResult) o;
    return Objects.equals(this.successful, sqlInjectionDetectionResult.successful) &&
        Objects.equals(this.containedSqlInjectionAttack, sqlInjectionDetectionResult.containedSqlInjectionAttack) &&
        Objects.equals(this.originalInput, sqlInjectionDetectionResult.originalInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedSqlInjectionAttack, originalInput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlInjectionDetectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedSqlInjectionAttack: ").append(toIndentedString(containedSqlInjectionAttack)).append("\n");
    sb.append("    originalInput: ").append(toIndentedString(originalInput)).append("\n");
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

