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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Query string parameter
 */
@ApiModel(description = "Query string parameter")
@JsonPropertyOrder({
  HttpGetParameter.JSON_PROPERTY_PARAMETER_NAME,
  HttpGetParameter.JSON_PROPERTY_PARAMETER_VALUE,
  HttpGetParameter.JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK
})
@JsonTypeName("HttpGetParameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:26.703-08:00[America/Los_Angeles]")
public class HttpGetParameter {
  public static final String JSON_PROPERTY_PARAMETER_NAME = "ParameterName";
  private String parameterName;

  public static final String JSON_PROPERTY_PARAMETER_VALUE = "ParameterValue";
  private String parameterValue;

  public static final String JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK = "UseOutputFromPreviousTask";
  private TaskOutputReference useOutputFromPreviousTask;


  public HttpGetParameter parameterName(String parameterName) {
    
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Name of the parameter
   * @return parameterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the parameter")
  @JsonProperty(JSON_PROPERTY_PARAMETER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameterName() {
    return parameterName;
  }


  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public HttpGetParameter parameterValue(String parameterValue) {
    
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Value of the parameter
   * @return parameterValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the parameter")
  @JsonProperty(JSON_PROPERTY_PARAMETER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameterValue() {
    return parameterValue;
  }


  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }


  public HttpGetParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

   /**
   * Get useOutputFromPreviousTask
   * @return useOutputFromPreviousTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }


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
    HttpGetParameter httpGetParameter = (HttpGetParameter) o;
    return Objects.equals(this.parameterName, httpGetParameter.parameterName) &&
        Objects.equals(this.parameterValue, httpGetParameter.parameterValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpGetParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, parameterValue, useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpGetParameter {\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
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
