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
 * HTTP header to add to the HTTP request
 */
@JsonPropertyOrder({
  HttpOrchestrationHeader.JSON_PROPERTY_HEADER_NAME,
  HttpOrchestrationHeader.JSON_PROPERTY_HEADER_VALUE,
  HttpOrchestrationHeader.JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:49.143497200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class HttpOrchestrationHeader {
  public static final String JSON_PROPERTY_HEADER_NAME = "HeaderName";
  private String headerName;

  public static final String JSON_PROPERTY_HEADER_VALUE = "HeaderValue";
  private String headerValue;

  public static final String JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK = "UseOutputFromPreviousTask";
  private TaskOutputReference useOutputFromPreviousTask;

  public HttpOrchestrationHeader() {
  }

  public HttpOrchestrationHeader headerName(String headerName) {
    
    this.headerName = headerName;
    return this;
  }

  /**
   * Name of the HTTP header, e.g. \&quot;Content-Type\&quot;
   * @return headerName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeaderName() {
    return headerName;
  }


  @JsonProperty(JSON_PROPERTY_HEADER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }

  public HttpOrchestrationHeader headerValue(String headerValue) {
    
    this.headerValue = headerValue;
    return this;
  }

  /**
   * Value of the HTTP header
   * @return headerValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeaderValue() {
    return headerValue;
  }


  @JsonProperty(JSON_PROPERTY_HEADER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaderValue(String headerValue) {
    this.headerValue = headerValue;
  }

  public HttpOrchestrationHeader useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    
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
    HttpOrchestrationHeader httpOrchestrationHeader = (HttpOrchestrationHeader) o;
    return Objects.equals(this.headerName, httpOrchestrationHeader.headerName) &&
        Objects.equals(this.headerValue, httpOrchestrationHeader.headerValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpOrchestrationHeader.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerName, headerValue, useOutputFromPreviousTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpOrchestrationHeader {\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
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

