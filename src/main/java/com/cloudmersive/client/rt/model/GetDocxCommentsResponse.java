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
import com.cloudmersive.client.rt.model.DocxComment;
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
 * Result of getting comments from a Word Document DOCX
 */
@ApiModel(description = "Result of getting comments from a Word Document DOCX")
@JsonPropertyOrder({
  GetDocxCommentsResponse.JSON_PROPERTY_SUCCESSFUL,
  GetDocxCommentsResponse.JSON_PROPERTY_COMMENTS,
  GetDocxCommentsResponse.JSON_PROPERTY_COMMENT_COUNT
})
@JsonTypeName("GetDocxCommentsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class GetDocxCommentsResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_COMMENTS = "Comments";
  private List<DocxComment> comments = null;

  public static final String JSON_PROPERTY_COMMENT_COUNT = "CommentCount";
  private Integer commentCount;


  public GetDocxCommentsResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public GetDocxCommentsResponse comments(List<DocxComment> comments) {
    
    this.comments = comments;
    return this;
  }

  public GetDocxCommentsResponse addCommentsItem(DocxComment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<DocxComment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Comments in the document
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comments in the document")
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxComment> getComments() {
    return comments;
  }


  public void setComments(List<DocxComment> comments) {
    this.comments = comments;
  }


  public GetDocxCommentsResponse commentCount(Integer commentCount) {
    
    this.commentCount = commentCount;
    return this;
  }

   /**
   * The number of comments in the document
   * @return commentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of comments in the document")
  @JsonProperty(JSON_PROPERTY_COMMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCommentCount() {
    return commentCount;
  }


  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxCommentsResponse getDocxCommentsResponse = (GetDocxCommentsResponse) o;
    return Objects.equals(this.successful, getDocxCommentsResponse.successful) &&
        Objects.equals(this.comments, getDocxCommentsResponse.comments) &&
        Objects.equals(this.commentCount, getDocxCommentsResponse.commentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, comments, commentCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxCommentsResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
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

