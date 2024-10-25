/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.rt.model.FaceWithLandmarks;
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
 * Results of locating faces in an image
 */
@JsonPropertyOrder({
  FaceLocateWithLandmarksResponse.JSON_PROPERTY_SUCCESSFUL,
  FaceLocateWithLandmarksResponse.JSON_PROPERTY_FACES,
  FaceLocateWithLandmarksResponse.JSON_PROPERTY_FACE_COUNT,
  FaceLocateWithLandmarksResponse.JSON_PROPERTY_ERROR_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FaceLocateWithLandmarksResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_FACES = "Faces";
  private List<FaceWithLandmarks> faces = new ArrayList<>();

  public static final String JSON_PROPERTY_FACE_COUNT = "FaceCount";
  private Integer faceCount;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "ErrorDetails";
  private String errorDetails;

  public FaceLocateWithLandmarksResponse() {
  }

  public FaceLocateWithLandmarksResponse successful(Boolean successful) {
    
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

  public FaceLocateWithLandmarksResponse faces(List<FaceWithLandmarks> faces) {
    
    this.faces = faces;
    return this;
  }

  public FaceLocateWithLandmarksResponse addFacesItem(FaceWithLandmarks facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<>();
    }
    this.faces.add(facesItem);
    return this;
  }

  /**
   * Array of faces found in the image
   * @return faces
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FaceWithLandmarks> getFaces() {
    return faces;
  }


  @JsonProperty(JSON_PROPERTY_FACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaces(List<FaceWithLandmarks> faces) {
    this.faces = faces;
  }

  public FaceLocateWithLandmarksResponse faceCount(Integer faceCount) {
    
    this.faceCount = faceCount;
    return this;
  }

  /**
   * Number of faces found in the image
   * @return faceCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFaceCount() {
    return faceCount;
  }


  @JsonProperty(JSON_PROPERTY_FACE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceCount(Integer faceCount) {
    this.faceCount = faceCount;
  }

  public FaceLocateWithLandmarksResponse errorDetails(String errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Details of any errors that occurred
   * @return errorDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceLocateWithLandmarksResponse faceLocateWithLandmarksResponse = (FaceLocateWithLandmarksResponse) o;
    return Objects.equals(this.successful, faceLocateWithLandmarksResponse.successful) &&
        Objects.equals(this.faces, faceLocateWithLandmarksResponse.faces) &&
        Objects.equals(this.faceCount, faceLocateWithLandmarksResponse.faceCount) &&
        Objects.equals(this.errorDetails, faceLocateWithLandmarksResponse.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, faces, faceCount, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceLocateWithLandmarksResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
    sb.append("    faceCount: ").append(toIndentedString(faceCount)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

