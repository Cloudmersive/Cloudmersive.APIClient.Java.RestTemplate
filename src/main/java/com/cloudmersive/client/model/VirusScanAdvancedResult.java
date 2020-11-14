/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.VirusFound;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of running an advanced virus scan
 */
@ApiModel(description = "Result of running an advanced virus scan")
@JsonPropertyOrder({
  VirusScanAdvancedResult.JSON_PROPERTY_CLEAN_RESULT,
  VirusScanAdvancedResult.JSON_PROPERTY_CONTAINS_EXECUTABLE,
  VirusScanAdvancedResult.JSON_PROPERTY_CONTAINS_INVALID_FILE,
  VirusScanAdvancedResult.JSON_PROPERTY_CONTAINS_SCRIPT,
  VirusScanAdvancedResult.JSON_PROPERTY_CONTAINS_PASSWORD_PROTECTED_FILE,
  VirusScanAdvancedResult.JSON_PROPERTY_CONTAINS_RESTRICTED_FILE_FORMAT,
  VirusScanAdvancedResult.JSON_PROPERTY_VERIFIED_FILE_FORMAT,
  VirusScanAdvancedResult.JSON_PROPERTY_FOUND_VIRUSES
})
@JsonTypeName("VirusScanAdvancedResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:33.425-08:00[America/Los_Angeles]")
public class VirusScanAdvancedResult {
  public static final String JSON_PROPERTY_CLEAN_RESULT = "CleanResult";
  private Boolean cleanResult;

  public static final String JSON_PROPERTY_CONTAINS_EXECUTABLE = "ContainsExecutable";
  private Boolean containsExecutable;

  public static final String JSON_PROPERTY_CONTAINS_INVALID_FILE = "ContainsInvalidFile";
  private Boolean containsInvalidFile;

  public static final String JSON_PROPERTY_CONTAINS_SCRIPT = "ContainsScript";
  private Boolean containsScript;

  public static final String JSON_PROPERTY_CONTAINS_PASSWORD_PROTECTED_FILE = "ContainsPasswordProtectedFile";
  private Boolean containsPasswordProtectedFile;

  public static final String JSON_PROPERTY_CONTAINS_RESTRICTED_FILE_FORMAT = "ContainsRestrictedFileFormat";
  private Boolean containsRestrictedFileFormat;

  public static final String JSON_PROPERTY_VERIFIED_FILE_FORMAT = "VerifiedFileFormat";
  private String verifiedFileFormat;

  public static final String JSON_PROPERTY_FOUND_VIRUSES = "FoundViruses";
  private List<VirusFound> foundViruses = null;


  public VirusScanAdvancedResult cleanResult(Boolean cleanResult) {
    
    this.cleanResult = cleanResult;
    return this;
  }

   /**
   * True if the scan contained no viruses, false otherwise
   * @return cleanResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the scan contained no viruses, false otherwise")
  @JsonProperty(JSON_PROPERTY_CLEAN_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCleanResult() {
    return cleanResult;
  }


  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }


  public VirusScanAdvancedResult containsExecutable(Boolean containsExecutable) {
    
    this.containsExecutable = containsExecutable;
    return this;
  }

   /**
   * True if the scan contained an executable (application code), which can be a significant risk factor
   * @return containsExecutable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the scan contained an executable (application code), which can be a significant risk factor")
  @JsonProperty(JSON_PROPERTY_CONTAINS_EXECUTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsExecutable() {
    return containsExecutable;
  }


  public void setContainsExecutable(Boolean containsExecutable) {
    this.containsExecutable = containsExecutable;
  }


  public VirusScanAdvancedResult containsInvalidFile(Boolean containsInvalidFile) {
    
    this.containsInvalidFile = containsInvalidFile;
    return this;
  }

   /**
   * True if the scan contained an invalid file (such as a PDF that is not a valid PDF, Word Document that is not a valid Word Document, etc.), which can be a significant risk factor
   * @return containsInvalidFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the scan contained an invalid file (such as a PDF that is not a valid PDF, Word Document that is not a valid Word Document, etc.), which can be a significant risk factor")
  @JsonProperty(JSON_PROPERTY_CONTAINS_INVALID_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsInvalidFile() {
    return containsInvalidFile;
  }


  public void setContainsInvalidFile(Boolean containsInvalidFile) {
    this.containsInvalidFile = containsInvalidFile;
  }


  public VirusScanAdvancedResult containsScript(Boolean containsScript) {
    
    this.containsScript = containsScript;
    return this;
  }

   /**
   * True if the scan contained a script (such as a PHP script, Python script, etc.) which can be a significant risk factor
   * @return containsScript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the scan contained a script (such as a PHP script, Python script, etc.) which can be a significant risk factor")
  @JsonProperty(JSON_PROPERTY_CONTAINS_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsScript() {
    return containsScript;
  }


  public void setContainsScript(Boolean containsScript) {
    this.containsScript = containsScript;
  }


  public VirusScanAdvancedResult containsPasswordProtectedFile(Boolean containsPasswordProtectedFile) {
    
    this.containsPasswordProtectedFile = containsPasswordProtectedFile;
    return this;
  }

   /**
   * True if the scan contained a password protected or encrypted file, which can be a significant risk factor
   * @return containsPasswordProtectedFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the scan contained a password protected or encrypted file, which can be a significant risk factor")
  @JsonProperty(JSON_PROPERTY_CONTAINS_PASSWORD_PROTECTED_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsPasswordProtectedFile() {
    return containsPasswordProtectedFile;
  }


  public void setContainsPasswordProtectedFile(Boolean containsPasswordProtectedFile) {
    this.containsPasswordProtectedFile = containsPasswordProtectedFile;
  }


  public VirusScanAdvancedResult containsRestrictedFileFormat(Boolean containsRestrictedFileFormat) {
    
    this.containsRestrictedFileFormat = containsRestrictedFileFormat;
    return this;
  }

   /**
   * True if the uploaded file is of a type that is not allowed based on the optional restrictFileTypes parameter, false otherwise; if restrictFileTypes is not set, this will always be false
   * @return containsRestrictedFileFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the uploaded file is of a type that is not allowed based on the optional restrictFileTypes parameter, false otherwise; if restrictFileTypes is not set, this will always be false")
  @JsonProperty(JSON_PROPERTY_CONTAINS_RESTRICTED_FILE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsRestrictedFileFormat() {
    return containsRestrictedFileFormat;
  }


  public void setContainsRestrictedFileFormat(Boolean containsRestrictedFileFormat) {
    this.containsRestrictedFileFormat = containsRestrictedFileFormat;
  }


  public VirusScanAdvancedResult verifiedFileFormat(String verifiedFileFormat) {
    
    this.verifiedFileFormat = verifiedFileFormat;
    return this;
  }

   /**
   * For file format verification-supported file formats, the contents-verified file format of the file.  Null indicates that the file format is not supported for contents verification.  If a Virus or Malware is found, this field will always be set to Null.
   * @return verifiedFileFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For file format verification-supported file formats, the contents-verified file format of the file.  Null indicates that the file format is not supported for contents verification.  If a Virus or Malware is found, this field will always be set to Null.")
  @JsonProperty(JSON_PROPERTY_VERIFIED_FILE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerifiedFileFormat() {
    return verifiedFileFormat;
  }


  public void setVerifiedFileFormat(String verifiedFileFormat) {
    this.verifiedFileFormat = verifiedFileFormat;
  }


  public VirusScanAdvancedResult foundViruses(List<VirusFound> foundViruses) {
    
    this.foundViruses = foundViruses;
    return this;
  }

  public VirusScanAdvancedResult addFoundVirusesItem(VirusFound foundVirusesItem) {
    if (this.foundViruses == null) {
      this.foundViruses = new ArrayList<VirusFound>();
    }
    this.foundViruses.add(foundVirusesItem);
    return this;
  }

   /**
   * Array of viruses found, if any
   * @return foundViruses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of viruses found, if any")
  @JsonProperty(JSON_PROPERTY_FOUND_VIRUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VirusFound> getFoundViruses() {
    return foundViruses;
  }


  public void setFoundViruses(List<VirusFound> foundViruses) {
    this.foundViruses = foundViruses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirusScanAdvancedResult virusScanAdvancedResult = (VirusScanAdvancedResult) o;
    return Objects.equals(this.cleanResult, virusScanAdvancedResult.cleanResult) &&
        Objects.equals(this.containsExecutable, virusScanAdvancedResult.containsExecutable) &&
        Objects.equals(this.containsInvalidFile, virusScanAdvancedResult.containsInvalidFile) &&
        Objects.equals(this.containsScript, virusScanAdvancedResult.containsScript) &&
        Objects.equals(this.containsPasswordProtectedFile, virusScanAdvancedResult.containsPasswordProtectedFile) &&
        Objects.equals(this.containsRestrictedFileFormat, virusScanAdvancedResult.containsRestrictedFileFormat) &&
        Objects.equals(this.verifiedFileFormat, virusScanAdvancedResult.verifiedFileFormat) &&
        Objects.equals(this.foundViruses, virusScanAdvancedResult.foundViruses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanResult, containsExecutable, containsInvalidFile, containsScript, containsPasswordProtectedFile, containsRestrictedFileFormat, verifiedFileFormat, foundViruses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirusScanAdvancedResult {\n");
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    containsExecutable: ").append(toIndentedString(containsExecutable)).append("\n");
    sb.append("    containsInvalidFile: ").append(toIndentedString(containsInvalidFile)).append("\n");
    sb.append("    containsScript: ").append(toIndentedString(containsScript)).append("\n");
    sb.append("    containsPasswordProtectedFile: ").append(toIndentedString(containsPasswordProtectedFile)).append("\n");
    sb.append("    containsRestrictedFileFormat: ").append(toIndentedString(containsRestrictedFileFormat)).append("\n");
    sb.append("    verifiedFileFormat: ").append(toIndentedString(verifiedFileFormat)).append("\n");
    sb.append("    foundViruses: ").append(toIndentedString(foundViruses)).append("\n");
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

