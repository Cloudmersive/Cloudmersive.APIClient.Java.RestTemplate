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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Handlebar style form fields to fill in; form field that is handlebar style, such as \&quot;{{FieldName}}\&quot;
 */
@JsonPropertyOrder({
  FillHandlebarFormField.JSON_PROPERTY_FIELD_NAME,
  FillHandlebarFormField.JSON_PROPERTY_VALUE_TO_FILL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FillHandlebarFormField {
  public static final String JSON_PROPERTY_FIELD_NAME = "FieldName";
  private String fieldName;

  public static final String JSON_PROPERTY_VALUE_TO_FILL = "ValueToFill";
  private String valueToFill;

  public FillHandlebarFormField() {
  }

  public FillHandlebarFormField fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Name of the field without the curly braces, e.g. \&quot;FieldName\&quot; for a field that is included in the text of the DOCX as \&quot;{{FieldName}}\&quot;
   * @return fieldName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldName() {
    return fieldName;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public FillHandlebarFormField valueToFill(String valueToFill) {
    
    this.valueToFill = valueToFill;
    return this;
  }

  /**
   * Text value to fill in for the field in the resulting document
   * @return valueToFill
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_TO_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueToFill() {
    return valueToFill;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_TO_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueToFill(String valueToFill) {
    this.valueToFill = valueToFill;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FillHandlebarFormField fillHandlebarFormField = (FillHandlebarFormField) o;
    return Objects.equals(this.fieldName, fillHandlebarFormField.fieldName) &&
        Objects.equals(this.valueToFill, fillHandlebarFormField.valueToFill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, valueToFill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FillHandlebarFormField {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    valueToFill: ").append(toIndentedString(valueToFill)).append("\n");
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

