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
 * Defines an x-www-form-urlencoded parameter
 */
@ApiModel(description = "Defines an x-www-form-urlencoded parameter")
@JsonPropertyOrder({
  HttpWwwFormUrlEncodedParameter.JSON_PROPERTY_KEY_NAME,
  HttpWwwFormUrlEncodedParameter.JSON_PROPERTY_KEY_VALUE,
  HttpWwwFormUrlEncodedParameter.JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK
})
@JsonTypeName("HttpWwwFormUrlEncodedParameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:42.299-07:00[America/Los_Angeles]")
public class HttpWwwFormUrlEncodedParameter {
  public static final String JSON_PROPERTY_KEY_NAME = "KeyName";
  private String keyName;

  public static final String JSON_PROPERTY_KEY_VALUE = "KeyValue";
  private String keyValue;

  public static final String JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK = "UseOutputFromPreviousTask";
  private TaskOutputReference useOutputFromPreviousTask;


  public HttpWwwFormUrlEncodedParameter keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Key name of the parameter
   * @return keyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key name of the parameter")
  @JsonProperty(JSON_PROPERTY_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public HttpWwwFormUrlEncodedParameter keyValue(String keyValue) {
    
    this.keyValue = keyValue;
    return this;
  }

   /**
   * Key value of the paramer (must be of type text); if set, do not use UseOutputFromPreviousTask
   * @return keyValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key value of the paramer (must be of type text); if set, do not use UseOutputFromPreviousTask")
  @JsonProperty(JSON_PROPERTY_KEY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyValue() {
    return keyValue;
  }


  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }


  public HttpWwwFormUrlEncodedParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    
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
    HttpWwwFormUrlEncodedParameter httpWwwFormUrlEncodedParameter = (HttpWwwFormUrlEncodedParameter) o;
    return Objects.equals(this.keyName, httpWwwFormUrlEncodedParameter.keyName) &&
        Objects.equals(this.keyValue, httpWwwFormUrlEncodedParameter.keyValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpWwwFormUrlEncodedParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName, keyValue, useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpWwwFormUrlEncodedParameter {\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
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

