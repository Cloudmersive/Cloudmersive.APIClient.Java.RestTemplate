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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Re-use the output from a previously-completed task
 */
@JsonPropertyOrder({
  TaskOutputReference.JSON_PROPERTY_TASK_NAME,
  TaskOutputReference.JSON_PROPERTY_TARGET_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:49.143497200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TaskOutputReference {
  public static final String JSON_PROPERTY_TASK_NAME = "TaskName";
  private String taskName;

  public static final String JSON_PROPERTY_TARGET_TYPE = "TargetType";
  private String targetType;

  public TaskOutputReference() {
  }

  public TaskOutputReference taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

  /**
   * Name of the task to use the output from
   * @return taskName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskName() {
    return taskName;
  }


  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public TaskOutputReference targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

  /**
   * Type to convert the output from the referenced task to; possible values are string, binary
   * @return targetType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetType() {
    return targetType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskOutputReference taskOutputReference = (TaskOutputReference) o;
    return Objects.equals(this.taskName, taskOutputReference.taskName) &&
        Objects.equals(this.targetType, taskOutputReference.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskOutputReference {\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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

