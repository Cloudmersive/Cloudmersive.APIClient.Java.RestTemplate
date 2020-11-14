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


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A video file
 */
@ApiModel(description = "A video file")
@JsonPropertyOrder({
  VideoFile.JSON_PROPERTY_VIDEO_NUMBER,
  VideoFile.JSON_PROPERTY_CONTENT
})
@JsonTypeName("VideoFile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:37.488-08:00[America/Los_Angeles]")
public class VideoFile {
  public static final String JSON_PROPERTY_VIDEO_NUMBER = "VideoNumber";
  private Integer videoNumber;

  public static final String JSON_PROPERTY_CONTENT = "Content";
  private byte[] content;


  public VideoFile videoNumber(Integer videoNumber) {
    
    this.videoNumber = videoNumber;
    return this;
  }

   /**
   * Sequence number of the video
   * @return videoNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sequence number of the video")
  @JsonProperty(JSON_PROPERTY_VIDEO_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVideoNumber() {
    return videoNumber;
  }


  public void setVideoNumber(Integer videoNumber) {
    this.videoNumber = videoNumber;
  }


  public VideoFile content(byte[] content) {
    
    this.content = content;
    return this;
  }

   /**
   * The video file as a byte array
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The video file as a byte array")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getContent() {
    return content;
  }


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
    VideoFile videoFile = (VideoFile) o;
    return Objects.equals(this.videoNumber, videoFile.videoNumber) &&
        Arrays.equals(this.content, videoFile.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoNumber, Arrays.hashCode(content));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoFile {\n");
    sb.append("    videoNumber: ").append(toIndentedString(videoNumber)).append("\n");
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

