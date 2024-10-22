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
import com.cloudmersive.client.rt.model.SplitPptxPresentationResult;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of performing a batch job operation
 */
@JsonPropertyOrder({
  JobStatusResult.JSON_PROPERTY_SUCCESSFUL,
  JobStatusResult.JSON_PROPERTY_ASYNC_JOB_STATUS,
  JobStatusResult.JSON_PROPERTY_ASYNC_JOB_I_D,
  JobStatusResult.JSON_PROPERTY_PPTX_RESULT,
  JobStatusResult.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class JobStatusResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ASYNC_JOB_STATUS = "AsyncJobStatus";
  private String asyncJobStatus;

  public static final String JSON_PROPERTY_ASYNC_JOB_I_D = "AsyncJobID";
  private String asyncJobID;

  public static final String JSON_PROPERTY_PPTX_RESULT = "PptxResult";
  private SplitPptxPresentationResult pptxResult;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "ErrorMessage";
  private String errorMessage;

  public JobStatusResult() {
  }

  public JobStatusResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the operation to check the status of the job was successful, false otherwise
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

  public JobStatusResult asyncJobStatus(String asyncJobStatus) {
    
    this.asyncJobStatus = asyncJobStatus;
    return this;
  }

  /**
   * Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED
   * @return asyncJobStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASYNC_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsyncJobStatus() {
    return asyncJobStatus;
  }


  @JsonProperty(JSON_PROPERTY_ASYNC_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsyncJobStatus(String asyncJobStatus) {
    this.asyncJobStatus = asyncJobStatus;
  }

  public JobStatusResult asyncJobID(String asyncJobID) {
    
    this.asyncJobID = asyncJobID;
    return this;
  }

  /**
   * When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes
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

  public JobStatusResult pptxResult(SplitPptxPresentationResult pptxResult) {
    
    this.pptxResult = pptxResult;
    return this;
  }

  /**
   * Get pptxResult
   * @return pptxResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PPTX_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SplitPptxPresentationResult getPptxResult() {
    return pptxResult;
  }


  @JsonProperty(JSON_PROPERTY_PPTX_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPptxResult(SplitPptxPresentationResult pptxResult) {
    this.pptxResult = pptxResult;
  }

  public JobStatusResult errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Error message (if any)
   * @return errorMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatusResult jobStatusResult = (JobStatusResult) o;
    return Objects.equals(this.successful, jobStatusResult.successful) &&
        Objects.equals(this.asyncJobStatus, jobStatusResult.asyncJobStatus) &&
        Objects.equals(this.asyncJobID, jobStatusResult.asyncJobID) &&
        Objects.equals(this.pptxResult, jobStatusResult.pptxResult) &&
        Objects.equals(this.errorMessage, jobStatusResult.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, asyncJobStatus, asyncJobID, pptxResult, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatusResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    asyncJobStatus: ").append(toIndentedString(asyncJobStatus)).append("\n");
    sb.append("    asyncJobID: ").append(toIndentedString(asyncJobID)).append("\n");
    sb.append("    pptxResult: ").append(toIndentedString(pptxResult)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

