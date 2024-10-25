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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A single still frame from a video
 */
@JsonPropertyOrder({
  StillFrame.JSON_PROPERTY_FRAME_NUMBER,
  StillFrame.JSON_PROPERTY_TIME_STAMP,
  StillFrame.JSON_PROPERTY_CONTENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:57.246622Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class StillFrame {
  public static final String JSON_PROPERTY_FRAME_NUMBER = "FrameNumber";
  private Integer frameNumber;

  public static final String JSON_PROPERTY_TIME_STAMP = "TimeStamp";
  private String timeStamp;

  public static final String JSON_PROPERTY_CONTENT = "Content";
  private byte[] content;

  public StillFrame() {
  }

  public StillFrame frameNumber(Integer frameNumber) {
    
    this.frameNumber = frameNumber;
    return this;
  }

  /**
   * The number of the current frame
   * @return frameNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAME_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFrameNumber() {
    return frameNumber;
  }


  @JsonProperty(JSON_PROPERTY_FRAME_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrameNumber(Integer frameNumber) {
    this.frameNumber = frameNumber;
  }

  public StillFrame timeStamp(String timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * The playback time of the current frame
   * @return timeStamp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeStamp() {
    return timeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public StillFrame content(byte[] content) {
    
    this.content = content;
    return this;
  }

  /**
   * The still frame in PNG format as a byte array
   * @return content
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(byte[] content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StillFrame stillFrame = (StillFrame) o;
    return Objects.equals(this.frameNumber, stillFrame.frameNumber) &&
        Objects.equals(this.timeStamp, stillFrame.timeStamp) &&
        Arrays.equals(this.content, stillFrame.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameNumber, timeStamp, Arrays.hashCode(content));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StillFrame {\n");
    sb.append("    frameNumber: ").append(toIndentedString(frameNumber)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

