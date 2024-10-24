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
 * Definition of a form field for OCR data extraction from images
 */
@JsonPropertyOrder({
  FormFieldDefinition.JSON_PROPERTY_FIELD_I_D,
  FormFieldDefinition.JSON_PROPERTY_LEFT_ANCHOR,
  FormFieldDefinition.JSON_PROPERTY_TOP_ANCHOR,
  FormFieldDefinition.JSON_PROPERTY_BOTTOM_ANCHOR,
  FormFieldDefinition.JSON_PROPERTY_ALTERNATE_ANCHOR,
  FormFieldDefinition.JSON_PROPERTY_ANCHOR_MODE,
  FormFieldDefinition.JSON_PROPERTY_DATA_TYPE,
  FormFieldDefinition.JSON_PROPERTY_TARGET_DIGIT_COUNT,
  FormFieldDefinition.JSON_PROPERTY_MINIMUM_CHARACTER_COUNT,
  FormFieldDefinition.JSON_PROPERTY_ALLOW_NUMERIC_DIGITS,
  FormFieldDefinition.JSON_PROPERTY_VERTICAL_ALIGNMENT_TYPE,
  FormFieldDefinition.JSON_PROPERTY_HORIZONTAL_ALIGNMENT_TYPE,
  FormFieldDefinition.JSON_PROPERTY_TARGET_FIELD_WIDTH_RELATIVE,
  FormFieldDefinition.JSON_PROPERTY_TARGET_FIELD_HEIGHT_RELATIVE,
  FormFieldDefinition.JSON_PROPERTY_TARGET_FIELD_HORIZONTAL_ADJUSTMENT,
  FormFieldDefinition.JSON_PROPERTY_TARGET_FIELD_VERTICAL_ADJUSTMENT,
  FormFieldDefinition.JSON_PROPERTY_IGNORE,
  FormFieldDefinition.JSON_PROPERTY_OPTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:02.095460100Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FormFieldDefinition {
  public static final String JSON_PROPERTY_FIELD_I_D = "FieldID";
  private String fieldID;

  public static final String JSON_PROPERTY_LEFT_ANCHOR = "LeftAnchor";
  private String leftAnchor;

  public static final String JSON_PROPERTY_TOP_ANCHOR = "TopAnchor";
  private String topAnchor;

  public static final String JSON_PROPERTY_BOTTOM_ANCHOR = "BottomAnchor";
  private String bottomAnchor;

  public static final String JSON_PROPERTY_ALTERNATE_ANCHOR = "AlternateAnchor";
  private String alternateAnchor;

  public static final String JSON_PROPERTY_ANCHOR_MODE = "AnchorMode";
  private String anchorMode;

  public static final String JSON_PROPERTY_DATA_TYPE = "DataType";
  private String dataType;

  public static final String JSON_PROPERTY_TARGET_DIGIT_COUNT = "TargetDigitCount";
  private Integer targetDigitCount;

  public static final String JSON_PROPERTY_MINIMUM_CHARACTER_COUNT = "MinimumCharacterCount";
  private Integer minimumCharacterCount;

  public static final String JSON_PROPERTY_ALLOW_NUMERIC_DIGITS = "AllowNumericDigits";
  private Boolean allowNumericDigits;

  public static final String JSON_PROPERTY_VERTICAL_ALIGNMENT_TYPE = "VerticalAlignmentType";
  private String verticalAlignmentType;

  public static final String JSON_PROPERTY_HORIZONTAL_ALIGNMENT_TYPE = "HorizontalAlignmentType";
  private String horizontalAlignmentType;

  public static final String JSON_PROPERTY_TARGET_FIELD_WIDTH_RELATIVE = "TargetFieldWidth_Relative";
  private Double targetFieldWidthRelative;

  public static final String JSON_PROPERTY_TARGET_FIELD_HEIGHT_RELATIVE = "TargetFieldHeight_Relative";
  private Double targetFieldHeightRelative;

  public static final String JSON_PROPERTY_TARGET_FIELD_HORIZONTAL_ADJUSTMENT = "TargetFieldHorizontalAdjustment";
  private Double targetFieldHorizontalAdjustment;

  public static final String JSON_PROPERTY_TARGET_FIELD_VERTICAL_ADJUSTMENT = "TargetFieldVerticalAdjustment";
  private Double targetFieldVerticalAdjustment;

  public static final String JSON_PROPERTY_IGNORE = "Ignore";
  private List<String> ignore = new ArrayList<>();

  public static final String JSON_PROPERTY_OPTIONS = "Options";
  private String options;

  public FormFieldDefinition() {
  }

  public FormFieldDefinition fieldID(String fieldID) {
    
    this.fieldID = fieldID;
    return this;
  }

  /**
   * The identifier of the field; use this to identify which field is being referenced.  Set to SkipField if you do not wish to return the value of this field in the result.
   * @return fieldID
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldID() {
    return fieldID;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldID(String fieldID) {
    this.fieldID = fieldID;
  }

  public FormFieldDefinition leftAnchor(String leftAnchor) {
    
    this.leftAnchor = leftAnchor;
    return this;
  }

  /**
   * Optional - the left-hand anchor of the field
   * @return leftAnchor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEFT_ANCHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLeftAnchor() {
    return leftAnchor;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_ANCHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftAnchor(String leftAnchor) {
    this.leftAnchor = leftAnchor;
  }

  public FormFieldDefinition topAnchor(String topAnchor) {
    
    this.topAnchor = topAnchor;
    return this;
  }

  /**
   * Optional - the top anchor of the field
   * @return topAnchor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_ANCHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopAnchor() {
    return topAnchor;
  }


  @JsonProperty(JSON_PROPERTY_TOP_ANCHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopAnchor(String topAnchor) {
    this.topAnchor = topAnchor;
  }

  public FormFieldDefinition bottomAnchor(String bottomAnchor) {
    
    this.bottomAnchor = bottomAnchor;
    return this;
  }

  /**
   * Optional - the bottom anchor of the field
   * @return bottomAnchor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOTTOM_ANCHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBottomAnchor() {
    return bottomAnchor;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_ANCHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomAnchor(String bottomAnchor) {
    this.bottomAnchor = bottomAnchor;
  }

  public FormFieldDefinition alternateAnchor(String alternateAnchor) {
    
    this.alternateAnchor = alternateAnchor;
    return this;
  }

  /**
   * Optional - alterate match text for the specified anchor
   * @return alternateAnchor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALTERNATE_ANCHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlternateAnchor() {
    return alternateAnchor;
  }


  @JsonProperty(JSON_PROPERTY_ALTERNATE_ANCHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlternateAnchor(String alternateAnchor) {
    this.alternateAnchor = alternateAnchor;
  }

  public FormFieldDefinition anchorMode(String anchorMode) {
    
    this.anchorMode = anchorMode;
    return this;
  }

  /**
   * Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match) and Horizontal (anchor must be laid out horizontally).  Default is Partial.
   * @return anchorMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANCHOR_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnchorMode() {
    return anchorMode;
  }


  @JsonProperty(JSON_PROPERTY_ANCHOR_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnchorMode(String anchorMode) {
    this.anchorMode = anchorMode;
  }

  public FormFieldDefinition dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

  /**
   * The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace)
   * @return dataType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public FormFieldDefinition targetDigitCount(Integer targetDigitCount) {
    
    this.targetDigitCount = targetDigitCount;
    return this;
  }

  /**
   * Optional - the target number of digits in the field; useful for fixed-length fields
   * @return targetDigitCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_DIGIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTargetDigitCount() {
    return targetDigitCount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_DIGIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetDigitCount(Integer targetDigitCount) {
    this.targetDigitCount = targetDigitCount;
  }

  public FormFieldDefinition minimumCharacterCount(Integer minimumCharacterCount) {
    
    this.minimumCharacterCount = minimumCharacterCount;
    return this;
  }

  /**
   * Optional - the target number of digits in the field; useful for fixed-length fields
   * @return minimumCharacterCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_CHARACTER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimumCharacterCount() {
    return minimumCharacterCount;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_CHARACTER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumCharacterCount(Integer minimumCharacterCount) {
    this.minimumCharacterCount = minimumCharacterCount;
  }

  public FormFieldDefinition allowNumericDigits(Boolean allowNumericDigits) {
    
    this.allowNumericDigits = allowNumericDigits;
    return this;
  }

  /**
   * Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits
   * @return allowNumericDigits
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_NUMERIC_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowNumericDigits() {
    return allowNumericDigits;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_NUMERIC_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowNumericDigits(Boolean allowNumericDigits) {
    this.allowNumericDigits = allowNumericDigits;
  }

  public FormFieldDefinition verticalAlignmentType(String verticalAlignmentType) {
    
    this.verticalAlignmentType = verticalAlignmentType;
    return this;
  }

  /**
   * Vertical alignment of target value area relative to the field anchor; Possible values are VCenter, Top, Bottom
   * @return verticalAlignmentType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERTICAL_ALIGNMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerticalAlignmentType() {
    return verticalAlignmentType;
  }


  @JsonProperty(JSON_PROPERTY_VERTICAL_ALIGNMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerticalAlignmentType(String verticalAlignmentType) {
    this.verticalAlignmentType = verticalAlignmentType;
  }

  public FormFieldDefinition horizontalAlignmentType(String horizontalAlignmentType) {
    
    this.horizontalAlignmentType = horizontalAlignmentType;
    return this;
  }

  /**
   * Horizontal alignment of target value area relative to the field anchor; Possible values are Left, Right
   * @return horizontalAlignmentType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HORIZONTAL_ALIGNMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHorizontalAlignmentType() {
    return horizontalAlignmentType;
  }


  @JsonProperty(JSON_PROPERTY_HORIZONTAL_ALIGNMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHorizontalAlignmentType(String horizontalAlignmentType) {
    this.horizontalAlignmentType = horizontalAlignmentType;
  }

  public FormFieldDefinition targetFieldWidthRelative(Double targetFieldWidthRelative) {
    
    this.targetFieldWidthRelative = targetFieldWidthRelative;
    return this;
  }

  /**
   * Optional - scale factor for target field width - relative to width of field title; a value of 1.0 indicates the target value area has the same width as the field value as occurring in the image; a value of 2.0 would indicate that the target value area has 2 times the width of the field value as occurring in the image.
   * @return targetFieldWidthRelative
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FIELD_WIDTH_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTargetFieldWidthRelative() {
    return targetFieldWidthRelative;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_FIELD_WIDTH_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetFieldWidthRelative(Double targetFieldWidthRelative) {
    this.targetFieldWidthRelative = targetFieldWidthRelative;
  }

  public FormFieldDefinition targetFieldHeightRelative(Double targetFieldHeightRelative) {
    
    this.targetFieldHeightRelative = targetFieldHeightRelative;
    return this;
  }

  /**
   * Optional - scale factor for target field height - relative to height of field title
   * @return targetFieldHeightRelative
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FIELD_HEIGHT_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTargetFieldHeightRelative() {
    return targetFieldHeightRelative;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_FIELD_HEIGHT_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetFieldHeightRelative(Double targetFieldHeightRelative) {
    this.targetFieldHeightRelative = targetFieldHeightRelative;
  }

  public FormFieldDefinition targetFieldHorizontalAdjustment(Double targetFieldHorizontalAdjustment) {
    
    this.targetFieldHorizontalAdjustment = targetFieldHorizontalAdjustment;
    return this;
  }

  /**
   * Optional - horizontal adjestment in relative width of the field
   * @return targetFieldHorizontalAdjustment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FIELD_HORIZONTAL_ADJUSTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTargetFieldHorizontalAdjustment() {
    return targetFieldHorizontalAdjustment;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_FIELD_HORIZONTAL_ADJUSTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetFieldHorizontalAdjustment(Double targetFieldHorizontalAdjustment) {
    this.targetFieldHorizontalAdjustment = targetFieldHorizontalAdjustment;
  }

  public FormFieldDefinition targetFieldVerticalAdjustment(Double targetFieldVerticalAdjustment) {
    
    this.targetFieldVerticalAdjustment = targetFieldVerticalAdjustment;
    return this;
  }

  /**
   * Optional - vertical adjestment in relative height of the field
   * @return targetFieldVerticalAdjustment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FIELD_VERTICAL_ADJUSTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTargetFieldVerticalAdjustment() {
    return targetFieldVerticalAdjustment;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_FIELD_VERTICAL_ADJUSTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetFieldVerticalAdjustment(Double targetFieldVerticalAdjustment) {
    this.targetFieldVerticalAdjustment = targetFieldVerticalAdjustment;
  }

  public FormFieldDefinition ignore(List<String> ignore) {
    
    this.ignore = ignore;
    return this;
  }

  public FormFieldDefinition addIgnoreItem(String ignoreItem) {
    if (this.ignore == null) {
      this.ignore = new ArrayList<>();
    }
    this.ignore.add(ignoreItem);
    return this;
  }

  /**
   * Optional - Ignore any result items that contain a partial or complete match with these text strings
   * @return ignore
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIgnore() {
    return ignore;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnore(List<String> ignore) {
    this.ignore = ignore;
  }

  public FormFieldDefinition options(String options) {
    
    this.options = options;
    return this;
  }

  /**
   * Optional - additional options that can be set for this field definition, separated by commas.  Possible values are AllowMultiMatch (allow the same anchor to be matched to multiple fields)
   * @return options
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(String options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormFieldDefinition formFieldDefinition = (FormFieldDefinition) o;
    return Objects.equals(this.fieldID, formFieldDefinition.fieldID) &&
        Objects.equals(this.leftAnchor, formFieldDefinition.leftAnchor) &&
        Objects.equals(this.topAnchor, formFieldDefinition.topAnchor) &&
        Objects.equals(this.bottomAnchor, formFieldDefinition.bottomAnchor) &&
        Objects.equals(this.alternateAnchor, formFieldDefinition.alternateAnchor) &&
        Objects.equals(this.anchorMode, formFieldDefinition.anchorMode) &&
        Objects.equals(this.dataType, formFieldDefinition.dataType) &&
        Objects.equals(this.targetDigitCount, formFieldDefinition.targetDigitCount) &&
        Objects.equals(this.minimumCharacterCount, formFieldDefinition.minimumCharacterCount) &&
        Objects.equals(this.allowNumericDigits, formFieldDefinition.allowNumericDigits) &&
        Objects.equals(this.verticalAlignmentType, formFieldDefinition.verticalAlignmentType) &&
        Objects.equals(this.horizontalAlignmentType, formFieldDefinition.horizontalAlignmentType) &&
        Objects.equals(this.targetFieldWidthRelative, formFieldDefinition.targetFieldWidthRelative) &&
        Objects.equals(this.targetFieldHeightRelative, formFieldDefinition.targetFieldHeightRelative) &&
        Objects.equals(this.targetFieldHorizontalAdjustment, formFieldDefinition.targetFieldHorizontalAdjustment) &&
        Objects.equals(this.targetFieldVerticalAdjustment, formFieldDefinition.targetFieldVerticalAdjustment) &&
        Objects.equals(this.ignore, formFieldDefinition.ignore) &&
        Objects.equals(this.options, formFieldDefinition.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldID, leftAnchor, topAnchor, bottomAnchor, alternateAnchor, anchorMode, dataType, targetDigitCount, minimumCharacterCount, allowNumericDigits, verticalAlignmentType, horizontalAlignmentType, targetFieldWidthRelative, targetFieldHeightRelative, targetFieldHorizontalAdjustment, targetFieldVerticalAdjustment, ignore, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldDefinition {\n");
    sb.append("    fieldID: ").append(toIndentedString(fieldID)).append("\n");
    sb.append("    leftAnchor: ").append(toIndentedString(leftAnchor)).append("\n");
    sb.append("    topAnchor: ").append(toIndentedString(topAnchor)).append("\n");
    sb.append("    bottomAnchor: ").append(toIndentedString(bottomAnchor)).append("\n");
    sb.append("    alternateAnchor: ").append(toIndentedString(alternateAnchor)).append("\n");
    sb.append("    anchorMode: ").append(toIndentedString(anchorMode)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    targetDigitCount: ").append(toIndentedString(targetDigitCount)).append("\n");
    sb.append("    minimumCharacterCount: ").append(toIndentedString(minimumCharacterCount)).append("\n");
    sb.append("    allowNumericDigits: ").append(toIndentedString(allowNumericDigits)).append("\n");
    sb.append("    verticalAlignmentType: ").append(toIndentedString(verticalAlignmentType)).append("\n");
    sb.append("    horizontalAlignmentType: ").append(toIndentedString(horizontalAlignmentType)).append("\n");
    sb.append("    targetFieldWidthRelative: ").append(toIndentedString(targetFieldWidthRelative)).append("\n");
    sb.append("    targetFieldHeightRelative: ").append(toIndentedString(targetFieldHeightRelative)).append("\n");
    sb.append("    targetFieldHorizontalAdjustment: ").append(toIndentedString(targetFieldHorizontalAdjustment)).append("\n");
    sb.append("    targetFieldVerticalAdjustment: ").append(toIndentedString(targetFieldVerticalAdjustment)).append("\n");
    sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

