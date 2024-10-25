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
import com.cloudmersive.client.rt.model.PersonWithGender;
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
 * Result from classifying the Gender of people in an image
 */
@JsonPropertyOrder({
  GenderDetectionResult.JSON_PROPERTY_SUCCESSFUL,
  GenderDetectionResult.JSON_PROPERTY_PERSON_WITH_GENDER,
  GenderDetectionResult.JSON_PROPERTY_PEOPLE_IDENTIFIED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GenderDetectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PERSON_WITH_GENDER = "PersonWithGender";
  private List<PersonWithGender> personWithGender = new ArrayList<>();

  public static final String JSON_PROPERTY_PEOPLE_IDENTIFIED = "PeopleIdentified";
  private Integer peopleIdentified;

  public GenderDetectionResult() {
  }

  public GenderDetectionResult successful(Boolean successful) {
    
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

  public GenderDetectionResult personWithGender(List<PersonWithGender> personWithGender) {
    
    this.personWithGender = personWithGender;
    return this;
  }

  public GenderDetectionResult addPersonWithGenderItem(PersonWithGender personWithGenderItem) {
    if (this.personWithGender == null) {
      this.personWithGender = new ArrayList<>();
    }
    this.personWithGender.add(personWithGenderItem);
    return this;
  }

  /**
   * People in the image annotated with gender information
   * @return personWithGender
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSON_WITH_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PersonWithGender> getPersonWithGender() {
    return personWithGender;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_WITH_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonWithGender(List<PersonWithGender> personWithGender) {
    this.personWithGender = personWithGender;
  }

  public GenderDetectionResult peopleIdentified(Integer peopleIdentified) {
    
    this.peopleIdentified = peopleIdentified;
    return this;
  }

  /**
   * Number of people identified in the image with a gender
   * @return peopleIdentified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PEOPLE_IDENTIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeopleIdentified() {
    return peopleIdentified;
  }


  @JsonProperty(JSON_PROPERTY_PEOPLE_IDENTIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeopleIdentified(Integer peopleIdentified) {
    this.peopleIdentified = peopleIdentified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderDetectionResult genderDetectionResult = (GenderDetectionResult) o;
    return Objects.equals(this.successful, genderDetectionResult.successful) &&
        Objects.equals(this.personWithGender, genderDetectionResult.personWithGender) &&
        Objects.equals(this.peopleIdentified, genderDetectionResult.peopleIdentified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, personWithGender, peopleIdentified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderDetectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    personWithGender: ").append(toIndentedString(personWithGender)).append("\n");
    sb.append("    peopleIdentified: ").append(toIndentedString(peopleIdentified)).append("\n");
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

