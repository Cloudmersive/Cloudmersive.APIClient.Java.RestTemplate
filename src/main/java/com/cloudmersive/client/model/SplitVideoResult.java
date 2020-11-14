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
import com.cloudmersive.client.model.VideoFile;
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
 * The result of splitting a video
 */
@ApiModel(description = "The result of splitting a video")
@JsonPropertyOrder({
  SplitVideoResult.JSON_PROPERTY_SUCCESSFUL,
  SplitVideoResult.JSON_PROPERTY_VIDEOS
})
@JsonTypeName("SplitVideoResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:37.488-08:00[America/Los_Angeles]")
public class SplitVideoResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_VIDEOS = "Videos";
  private List<VideoFile> videos = null;


  public SplitVideoResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public SplitVideoResult videos(List<VideoFile> videos) {
    
    this.videos = videos;
    return this;
  }

  public SplitVideoResult addVideosItem(VideoFile videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<VideoFile>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * Individual video files resulting from the split operation
   * @return videos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Individual video files resulting from the split operation")
  @JsonProperty(JSON_PROPERTY_VIDEOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VideoFile> getVideos() {
    return videos;
  }


  public void setVideos(List<VideoFile> videos) {
    this.videos = videos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitVideoResult splitVideoResult = (SplitVideoResult) o;
    return Objects.equals(this.successful, splitVideoResult.successful) &&
        Objects.equals(this.videos, splitVideoResult.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, videos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitVideoResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

