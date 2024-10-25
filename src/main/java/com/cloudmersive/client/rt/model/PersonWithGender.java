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
import com.cloudmersive.client.rt.model.Face;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A person identified in an image gender classification operation
 */
@JsonPropertyOrder({
  PersonWithGender.JSON_PROPERTY_FACE_LOCATION,
  PersonWithGender.JSON_PROPERTY_GENDER_CLASSIFICATION_CONFIDENCE,
  PersonWithGender.JSON_PROPERTY_GENDER_CLASS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PersonWithGender {
  public static final String JSON_PROPERTY_FACE_LOCATION = "FaceLocation";
  private Face faceLocation;

  public static final String JSON_PROPERTY_GENDER_CLASSIFICATION_CONFIDENCE = "GenderClassificationConfidence";
  private Double genderClassificationConfidence;

  public static final String JSON_PROPERTY_GENDER_CLASS = "GenderClass";
  private String genderClass;

  public PersonWithGender() {
  }

  public PersonWithGender faceLocation(Face faceLocation) {
    
    this.faceLocation = faceLocation;
    return this;
  }

  /**
   * Get faceLocation
   * @return faceLocation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Face getFaceLocation() {
    return faceLocation;
  }


  @JsonProperty(JSON_PROPERTY_FACE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceLocation(Face faceLocation) {
    this.faceLocation = faceLocation;
  }

  public PersonWithGender genderClassificationConfidence(Double genderClassificationConfidence) {
    
    this.genderClassificationConfidence = genderClassificationConfidence;
    return this;
  }

  /**
   * Confidence level of gender classification; possible values are between 0.0 and 1.0; higher is better, with values &amp;gt; 0.50 being high confidence results
   * @return genderClassificationConfidence
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER_CLASSIFICATION_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getGenderClassificationConfidence() {
    return genderClassificationConfidence;
  }


  @JsonProperty(JSON_PROPERTY_GENDER_CLASSIFICATION_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenderClassificationConfidence(Double genderClassificationConfidence) {
    this.genderClassificationConfidence = genderClassificationConfidence;
  }

  public PersonWithGender genderClass(String genderClass) {
    
    this.genderClass = genderClass;
    return this;
  }

  /**
   * The person&#39;s identified gender; possible values are \&quot;Male\&quot;, \&quot;Female\&quot; and \&quot;Unknown\&quot;
   * @return genderClass
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGenderClass() {
    return genderClass;
  }


  @JsonProperty(JSON_PROPERTY_GENDER_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenderClass(String genderClass) {
    this.genderClass = genderClass;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonWithGender personWithGender = (PersonWithGender) o;
    return Objects.equals(this.faceLocation, personWithGender.faceLocation) &&
        Objects.equals(this.genderClassificationConfidence, personWithGender.genderClassificationConfidence) &&
        Objects.equals(this.genderClass, personWithGender.genderClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceLocation, genderClassificationConfidence, genderClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonWithGender {\n");
    sb.append("    faceLocation: ").append(toIndentedString(faceLocation)).append("\n");
    sb.append("    genderClassificationConfidence: ").append(toIndentedString(genderClassificationConfidence)).append("\n");
    sb.append("    genderClass: ").append(toIndentedString(genderClass)).append("\n");
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

