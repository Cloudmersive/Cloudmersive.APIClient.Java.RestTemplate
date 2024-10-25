/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * Result of performing a merge document batch job
 */
@JsonPropertyOrder({
  MergeBatchJobCreateResult.JSON_PROPERTY_SUCCESSFUL,
  MergeBatchJobCreateResult.JSON_PROPERTY_ASYNC_JOB_I_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MergeBatchJobCreateResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ASYNC_JOB_I_D = "AsyncJobID";
  private String asyncJobID;

  public MergeBatchJobCreateResult() {
  }

  public MergeBatchJobCreateResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if successful, false otherwise
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

  public MergeBatchJobCreateResult asyncJobID(String asyncJobID) {
    
    this.asyncJobID = asyncJobID;
    return this;
  }

  /**
   * When creating a job, an Async Job ID is returned.  Use the GetAsyncJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes
   * @return asyncJobID
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASYNC_JOB_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsyncJobID() {
    return asyncJobID;
  }


  @JsonProperty(JSON_PROPERTY_ASYNC_JOB_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeBatchJobCreateResult mergeBatchJobCreateResult = (MergeBatchJobCreateResult) o;
    return Objects.equals(this.successful, mergeBatchJobCreateResult.successful) &&
        Objects.equals(this.asyncJobID, mergeBatchJobCreateResult.asyncJobID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, asyncJobID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeBatchJobCreateResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    asyncJobID: ").append(toIndentedString(asyncJobID)).append("\n");
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

