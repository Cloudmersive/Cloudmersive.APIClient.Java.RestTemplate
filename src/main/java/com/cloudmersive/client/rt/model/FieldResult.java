/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.rt.model.FormFieldDefinition;
import com.cloudmersive.client.rt.model.OcrPhotoTextElement;
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
 * A pairing target field and actual value read from form
 */
@ApiModel(description = "A pairing target field and actual value read from form")
@JsonPropertyOrder({
  FieldResult.JSON_PROPERTY_TARGET_FIELD,
  FieldResult.JSON_PROPERTY_FIELD_VALUES
})
@JsonTypeName("FieldResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:17.009-07:00[America/Los_Angeles]")
public class FieldResult {
  public static final String JSON_PROPERTY_TARGET_FIELD = "TargetField";
  private FormFieldDefinition targetField;

  public static final String JSON_PROPERTY_FIELD_VALUES = "FieldValues";
  private List<OcrPhotoTextElement> fieldValues = null;


  public FieldResult targetField(FormFieldDefinition targetField) {
    
    this.targetField = targetField;
    return this;
  }

   /**
   * Get targetField
   * @return targetField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFieldDefinition getTargetField() {
    return targetField;
  }


  public void setTargetField(FormFieldDefinition targetField) {
    this.targetField = targetField;
  }


  public FieldResult fieldValues(List<OcrPhotoTextElement> fieldValues) {
    
    this.fieldValues = fieldValues;
    return this;
  }

  public FieldResult addFieldValuesItem(OcrPhotoTextElement fieldValuesItem) {
    if (this.fieldValues == null) {
      this.fieldValues = new ArrayList<OcrPhotoTextElement>();
    }
    this.fieldValues.add(fieldValuesItem);
    return this;
  }

   /**
   * Result field value(s) extracted
   * @return fieldValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result field value(s) extracted")
  @JsonProperty(JSON_PROPERTY_FIELD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcrPhotoTextElement> getFieldValues() {
    return fieldValues;
  }


  public void setFieldValues(List<OcrPhotoTextElement> fieldValues) {
    this.fieldValues = fieldValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldResult fieldResult = (FieldResult) o;
    return Objects.equals(this.targetField, fieldResult.targetField) &&
        Objects.equals(this.fieldValues, fieldResult.fieldValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetField, fieldValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldResult {\n");
    sb.append("    targetField: ").append(toIndentedString(targetField)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
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

