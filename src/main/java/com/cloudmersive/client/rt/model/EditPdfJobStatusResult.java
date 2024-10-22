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
 * Result of performing a batch job operation
 */
@JsonPropertyOrder({
  EditPdfJobStatusResult.JSON_PROPERTY_SUCCESSFUL,
  EditPdfJobStatusResult.JSON_PROPERTY_ASYNC_JOB_STATUS,
  EditPdfJobStatusResult.JSON_PROPERTY_ASYNC_JOB_I_D,
  EditPdfJobStatusResult.JSON_PROPERTY_OUTPUT_FILE_RESULT,
  EditPdfJobStatusResult.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class EditPdfJobStatusResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ASYNC_JOB_STATUS = "AsyncJobStatus";
  private String asyncJobStatus;

  public static final String JSON_PROPERTY_ASYNC_JOB_I_D = "AsyncJobID";
  private String asyncJobID;

  public static final String JSON_PROPERTY_OUTPUT_FILE_RESULT = "OutputFileResult";
  private byte[] outputFileResult;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "ErrorMessage";
  private String errorMessage;

  public EditPdfJobStatusResult() {
  }

  public EditPdfJobStatusResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * Tru eif the operation to check the status of the job was successful, false otherwise
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

  public EditPdfJobStatusResult asyncJobStatus(String asyncJobStatus) {
    
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

  public EditPdfJobStatusResult asyncJobID(String asyncJobID) {
    
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

  public EditPdfJobStatusResult outputFileResult(byte[] outputFileResult) {
    
    this.outputFileResult = outputFileResult;
    return this;
  }

  /**
   * Output file result (if applicable)
   * @return outputFileResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_FILE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getOutputFileResult() {
    return outputFileResult;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_FILE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputFileResult(byte[] outputFileResult) {
    this.outputFileResult = outputFileResult;
  }

  public EditPdfJobStatusResult errorMessage(String errorMessage) {
    
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
    EditPdfJobStatusResult editPdfJobStatusResult = (EditPdfJobStatusResult) o;
    return Objects.equals(this.successful, editPdfJobStatusResult.successful) &&
        Objects.equals(this.asyncJobStatus, editPdfJobStatusResult.asyncJobStatus) &&
        Objects.equals(this.asyncJobID, editPdfJobStatusResult.asyncJobID) &&
        Arrays.equals(this.outputFileResult, editPdfJobStatusResult.outputFileResult) &&
        Objects.equals(this.errorMessage, editPdfJobStatusResult.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, asyncJobStatus, asyncJobID, Arrays.hashCode(outputFileResult), errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditPdfJobStatusResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    asyncJobStatus: ").append(toIndentedString(asyncJobStatus)).append("\n");
    sb.append("    asyncJobID: ").append(toIndentedString(asyncJobID)).append("\n");
    sb.append("    outputFileResult: ").append(toIndentedString(outputFileResult)).append("\n");
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
