/*
 * videoapi
 * The video APIs help you convert, encode, and transcode videos.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of retrieving information about a video or audio file
 */
@JsonPropertyOrder({
  MediaInformation.JSON_PROPERTY_SUCCESSFUL,
  MediaInformation.JSON_PROPERTY_FILE_FORMAT,
  MediaInformation.JSON_PROPERTY_FILE_FORMAT_FULL,
  MediaInformation.JSON_PROPERTY_VALID_FILE_FORMATS,
  MediaInformation.JSON_PROPERTY_WIDTH,
  MediaInformation.JSON_PROPERTY_HEIGHT,
  MediaInformation.JSON_PROPERTY_SIZE,
  MediaInformation.JSON_PROPERTY_BIT_RATE,
  MediaInformation.JSON_PROPERTY_DURATION,
  MediaInformation.JSON_PROPERTY_START_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:57.246622Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MediaInformation {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_FILE_FORMAT = "FileFormat";
  private String fileFormat;

  public static final String JSON_PROPERTY_FILE_FORMAT_FULL = "FileFormatFull";
  private String fileFormatFull;

  public static final String JSON_PROPERTY_VALID_FILE_FORMATS = "ValidFileFormats";
  private List<String> validFileFormats = new ArrayList<>();

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Integer size;

  public static final String JSON_PROPERTY_BIT_RATE = "BitRate";
  private Integer bitRate;

  public static final String JSON_PROPERTY_DURATION = "Duration";
  private Double duration;

  public static final String JSON_PROPERTY_START_TIME = "StartTime";
  private Double startTime;

  public MediaInformation() {
  }

  public MediaInformation successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the operation was successful, false otherwise
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

  public MediaInformation fileFormat(String fileFormat) {
    
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * The file&#39;s short format name
   * @return fileFormat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileFormat() {
    return fileFormat;
  }


  @JsonProperty(JSON_PROPERTY_FILE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public MediaInformation fileFormatFull(String fileFormatFull) {
    
    this.fileFormatFull = fileFormatFull;
    return this;
  }

  /**
   * The file&#39;s full format name
   * @return fileFormatFull
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_FORMAT_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileFormatFull() {
    return fileFormatFull;
  }


  @JsonProperty(JSON_PROPERTY_FILE_FORMAT_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileFormatFull(String fileFormatFull) {
    this.fileFormatFull = fileFormatFull;
  }

  public MediaInformation validFileFormats(List<String> validFileFormats) {
    
    this.validFileFormats = validFileFormats;
    return this;
  }

  public MediaInformation addValidFileFormatsItem(String validFileFormatsItem) {
    if (this.validFileFormats == null) {
      this.validFileFormats = new ArrayList<>();
    }
    this.validFileFormats.add(validFileFormatsItem);
    return this;
  }

  /**
   * A list of the file&#39;s valid formats
   * @return validFileFormats
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_FILE_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValidFileFormats() {
    return validFileFormats;
  }


  @JsonProperty(JSON_PROPERTY_VALID_FILE_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidFileFormats(List<String> validFileFormats) {
    this.validFileFormats = validFileFormats;
  }

  public MediaInformation width(Integer width) {
    
    this.width = width;
    return this;
  }

  /**
   * The video&#39;s width, if file is a video
   * @return width
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }

  public MediaInformation height(Integer height) {
    
    this.height = height;
    return this;
  }

  /**
   * The video&#39;s height, if file is a video
   * @return height
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }

  public MediaInformation size(Integer size) {
    
    this.size = size;
    return this;
  }

  /**
   * The file&#39;s size in bytes
   * @return size
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }

  public MediaInformation bitRate(Integer bitRate) {
    
    this.bitRate = bitRate;
    return this;
  }

  /**
   * The file&#39;s bit rate
   * @return bitRate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIT_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBitRate() {
    return bitRate;
  }


  @JsonProperty(JSON_PROPERTY_BIT_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBitRate(Integer bitRate) {
    this.bitRate = bitRate;
  }

  public MediaInformation duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

  /**
   * The file&#39;s duration in seconds
   * @return duration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public MediaInformation startTime(Double startTime) {
    
    this.startTime = startTime;
    return this;
  }

  /**
   * The file&#39;s media start time
   * @return startTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(Double startTime) {
    this.startTime = startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaInformation mediaInformation = (MediaInformation) o;
    return Objects.equals(this.successful, mediaInformation.successful) &&
        Objects.equals(this.fileFormat, mediaInformation.fileFormat) &&
        Objects.equals(this.fileFormatFull, mediaInformation.fileFormatFull) &&
        Objects.equals(this.validFileFormats, mediaInformation.validFileFormats) &&
        Objects.equals(this.width, mediaInformation.width) &&
        Objects.equals(this.height, mediaInformation.height) &&
        Objects.equals(this.size, mediaInformation.size) &&
        Objects.equals(this.bitRate, mediaInformation.bitRate) &&
        Objects.equals(this.duration, mediaInformation.duration) &&
        Objects.equals(this.startTime, mediaInformation.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, fileFormat, fileFormatFull, validFileFormats, width, height, size, bitRate, duration, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaInformation {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    fileFormatFull: ").append(toIndentedString(fileFormatFull)).append("\n");
    sb.append("    validFileFormats: ").append(toIndentedString(validFileFormats)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

