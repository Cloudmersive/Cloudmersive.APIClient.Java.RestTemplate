/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
import com.cloudmersive.client.rt.model.TaskOutputReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Raw binary parameter that defines the entire body oft he HTTP payload; cannot be used with other parameter types
 */
@JsonPropertyOrder({
  HttpRawBinaryParameter.JSON_PROPERTY_PARAMETER_VALUE,
  HttpRawBinaryParameter.JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:49.143497200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class HttpRawBinaryParameter {
  public static final String JSON_PROPERTY_PARAMETER_VALUE = "ParameterValue";
  private byte[] parameterValue;

  public static final String JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK = "UseOutputFromPreviousTask";
  private TaskOutputReference useOutputFromPreviousTask;

  public HttpRawBinaryParameter() {
  }

  public HttpRawBinaryParameter parameterValue(byte[] parameterValue) {
    
    this.parameterValue = parameterValue;
    return this;
  }

  /**
   * Binary bytes value of the parameter
   * @return parameterValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getParameterValue() {
    return parameterValue;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterValue(byte[] parameterValue) {
    this.parameterValue = parameterValue;
  }

  public HttpRawBinaryParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

  /**
   * Get useOutputFromPreviousTask
   * @return useOutputFromPreviousTask
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }


  @JsonProperty(JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpRawBinaryParameter httpRawBinaryParameter = (HttpRawBinaryParameter) o;
    return Arrays.equals(this.parameterValue, httpRawBinaryParameter.parameterValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpRawBinaryParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(parameterValue), useOutputFromPreviousTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpRawBinaryParameter {\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
    sb.append("    useOutputFromPreviousTask: ").append(toIndentedString(useOutputFromPreviousTask)).append("\n");
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

