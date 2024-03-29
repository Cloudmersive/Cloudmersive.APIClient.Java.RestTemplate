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


package com.cloudmersive.client.rt.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.rt.model.VirusFound;
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
 * Result of running a website scan
 */
@ApiModel(description = "Result of running a website scan")
@JsonPropertyOrder({
  WebsiteScanResult.JSON_PROPERTY_CLEAN_RESULT,
  WebsiteScanResult.JSON_PROPERTY_WEBSITE_THREAT_TYPE,
  WebsiteScanResult.JSON_PROPERTY_FOUND_VIRUSES,
  WebsiteScanResult.JSON_PROPERTY_WEBSITE_HTTP_RESPONSE_CODE
})
@JsonTypeName("WebsiteScanResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:32.056-07:00[America/Los_Angeles]")
public class WebsiteScanResult {
  public static final String JSON_PROPERTY_CLEAN_RESULT = "CleanResult";
  private Boolean cleanResult;

  /**
   * Type of threat returned; can be None, Malware, ForcedDownload or Phishing
   */
  public enum WebsiteThreatTypeEnum {
    NONE("None"),
    
    MALWARE("Malware"),
    
    PHISHING("Phishing"),
    
    FORCEDDOWNLOAD("ForcedDownload"),
    
    UNABLETOCONNECT("UnableToConnect");

    private String value;

    WebsiteThreatTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WebsiteThreatTypeEnum fromValue(String value) {
      for (WebsiteThreatTypeEnum b : WebsiteThreatTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEBSITE_THREAT_TYPE = "WebsiteThreatType";
  private WebsiteThreatTypeEnum websiteThreatType;

  public static final String JSON_PROPERTY_FOUND_VIRUSES = "FoundViruses";
  private List<VirusFound> foundViruses = null;

  public static final String JSON_PROPERTY_WEBSITE_HTTP_RESPONSE_CODE = "WebsiteHttpResponseCode";
  private Integer websiteHttpResponseCode;


  public WebsiteScanResult cleanResult(Boolean cleanResult) {
    
    this.cleanResult = cleanResult;
    return this;
  }

   /**
   * True if the scan contained no threats, false otherwise
   * @return cleanResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the scan contained no threats, false otherwise")
  @JsonProperty(JSON_PROPERTY_CLEAN_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCleanResult() {
    return cleanResult;
  }


  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }


  public WebsiteScanResult websiteThreatType(WebsiteThreatTypeEnum websiteThreatType) {
    
    this.websiteThreatType = websiteThreatType;
    return this;
  }

   /**
   * Type of threat returned; can be None, Malware, ForcedDownload or Phishing
   * @return websiteThreatType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of threat returned; can be None, Malware, ForcedDownload or Phishing")
  @JsonProperty(JSON_PROPERTY_WEBSITE_THREAT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebsiteThreatTypeEnum getWebsiteThreatType() {
    return websiteThreatType;
  }


  public void setWebsiteThreatType(WebsiteThreatTypeEnum websiteThreatType) {
    this.websiteThreatType = websiteThreatType;
  }


  public WebsiteScanResult foundViruses(List<VirusFound> foundViruses) {
    
    this.foundViruses = foundViruses;
    return this;
  }

  public WebsiteScanResult addFoundVirusesItem(VirusFound foundVirusesItem) {
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


  public WebsiteScanResult websiteHttpResponseCode(Integer websiteHttpResponseCode) {
    
    this.websiteHttpResponseCode = websiteHttpResponseCode;
    return this;
  }

   /**
   * The remote server URL HTTP reasponse code; useful for debugging issues with scanning; typically if the remote server returns a 200 or 300-series code this means a successful response, while a 400 or 500 series code would represent an error returned from the remote server for the provided URL.
   * @return websiteHttpResponseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The remote server URL HTTP reasponse code; useful for debugging issues with scanning; typically if the remote server returns a 200 or 300-series code this means a successful response, while a 400 or 500 series code would represent an error returned from the remote server for the provided URL.")
  @JsonProperty(JSON_PROPERTY_WEBSITE_HTTP_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWebsiteHttpResponseCode() {
    return websiteHttpResponseCode;
  }


  public void setWebsiteHttpResponseCode(Integer websiteHttpResponseCode) {
    this.websiteHttpResponseCode = websiteHttpResponseCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteScanResult websiteScanResult = (WebsiteScanResult) o;
    return Objects.equals(this.cleanResult, websiteScanResult.cleanResult) &&
        Objects.equals(this.websiteThreatType, websiteScanResult.websiteThreatType) &&
        Objects.equals(this.foundViruses, websiteScanResult.foundViruses) &&
        Objects.equals(this.websiteHttpResponseCode, websiteScanResult.websiteHttpResponseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanResult, websiteThreatType, foundViruses, websiteHttpResponseCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsiteScanResult {\n");
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    websiteThreatType: ").append(toIndentedString(websiteThreatType)).append("\n");
    sb.append("    foundViruses: ").append(toIndentedString(foundViruses)).append("\n");
    sb.append("    websiteHttpResponseCode: ").append(toIndentedString(websiteHttpResponseCode)).append("\n");
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

