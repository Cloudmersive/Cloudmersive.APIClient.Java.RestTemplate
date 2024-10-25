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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A single word in an OCR document
 */
@JsonPropertyOrder({
  OcrWordElement.JSON_PROPERTY_WORD_TEXT,
  OcrWordElement.JSON_PROPERTY_LINE_NUMBER,
  OcrWordElement.JSON_PROPERTY_WORD_NUMBER,
  OcrWordElement.JSON_PROPERTY_XLEFT,
  OcrWordElement.JSON_PROPERTY_YTOP,
  OcrWordElement.JSON_PROPERTY_WIDTH,
  OcrWordElement.JSON_PROPERTY_HEIGHT,
  OcrWordElement.JSON_PROPERTY_CONFIDENCE_LEVEL,
  OcrWordElement.JSON_PROPERTY_BLOCK_NUMBER,
  OcrWordElement.JSON_PROPERTY_PARAGRAPH_NUMBER,
  OcrWordElement.JSON_PROPERTY_PAGE_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:02.095460100Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OcrWordElement {
  public static final String JSON_PROPERTY_WORD_TEXT = "WordText";
  private String wordText;

  public static final String JSON_PROPERTY_LINE_NUMBER = "LineNumber";
  private Integer lineNumber;

  public static final String JSON_PROPERTY_WORD_NUMBER = "WordNumber";
  private Integer wordNumber;

  public static final String JSON_PROPERTY_XLEFT = "XLeft";
  private Integer xleft;

  public static final String JSON_PROPERTY_YTOP = "YTop";
  private Integer ytop;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "ConfidenceLevel";
  private Double confidenceLevel;

  public static final String JSON_PROPERTY_BLOCK_NUMBER = "BlockNumber";
  private Integer blockNumber;

  public static final String JSON_PROPERTY_PARAGRAPH_NUMBER = "ParagraphNumber";
  private Integer paragraphNumber;

  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public OcrWordElement() {
  }

  public OcrWordElement wordText(String wordText) {
    
    this.wordText = wordText;
    return this;
  }

  /**
   * Text of the word
   * @return wordText
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORD_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWordText() {
    return wordText;
  }


  @JsonProperty(JSON_PROPERTY_WORD_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWordText(String wordText) {
    this.wordText = wordText;
  }

  public OcrWordElement lineNumber(Integer lineNumber) {
    
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Line number of the word
   * @return lineNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLineNumber() {
    return lineNumber;
  }


  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public OcrWordElement wordNumber(Integer wordNumber) {
    
    this.wordNumber = wordNumber;
    return this;
  }

  /**
   * Index of the word in the line
   * @return wordNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWordNumber() {
    return wordNumber;
  }


  @JsonProperty(JSON_PROPERTY_WORD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWordNumber(Integer wordNumber) {
    this.wordNumber = wordNumber;
  }

  public OcrWordElement xleft(Integer xleft) {
    
    this.xleft = xleft;
    return this;
  }

  /**
   * X location of the left edge of the word in pixels
   * @return xleft
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XLEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getXleft() {
    return xleft;
  }


  @JsonProperty(JSON_PROPERTY_XLEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXleft(Integer xleft) {
    this.xleft = xleft;
  }

  public OcrWordElement ytop(Integer ytop) {
    
    this.ytop = ytop;
    return this;
  }

  /**
   * Y location of the top edge of the word in pixels
   * @return ytop
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYtop() {
    return ytop;
  }


  @JsonProperty(JSON_PROPERTY_YTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYtop(Integer ytop) {
    this.ytop = ytop;
  }

  public OcrWordElement width(Integer width) {
    
    this.width = width;
    return this;
  }

  /**
   * Width of the word in pixels
   * @return width
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }

  public OcrWordElement height(Integer height) {
    
    this.height = height;
    return this;
  }

  /**
   * Height of the word in pixels
   * @return height
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }

  public OcrWordElement confidenceLevel(Double confidenceLevel) {
    
    this.confidenceLevel = confidenceLevel;
    return this;
  }

  /**
   * Confidence level of the machine learning result; possible values are 0.0 (lowest accuracy) - 1.0 (highest accuracy)
   * @return confidenceLevel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConfidenceLevel() {
    return confidenceLevel;
  }


  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  public OcrWordElement blockNumber(Integer blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

  /**
   * Index of the containing block
   * @return blockNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBlockNumber() {
    return blockNumber;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockNumber(Integer blockNumber) {
    this.blockNumber = blockNumber;
  }

  public OcrWordElement paragraphNumber(Integer paragraphNumber) {
    
    this.paragraphNumber = paragraphNumber;
    return this;
  }

  /**
   * Index of the containing paragraph
   * @return paragraphNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAGRAPH_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParagraphNumber() {
    return paragraphNumber;
  }


  @JsonProperty(JSON_PROPERTY_PARAGRAPH_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParagraphNumber(Integer paragraphNumber) {
    this.paragraphNumber = paragraphNumber;
  }

  public OcrWordElement pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Index of the containing page
   * @return pageNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrWordElement ocrWordElement = (OcrWordElement) o;
    return Objects.equals(this.wordText, ocrWordElement.wordText) &&
        Objects.equals(this.lineNumber, ocrWordElement.lineNumber) &&
        Objects.equals(this.wordNumber, ocrWordElement.wordNumber) &&
        Objects.equals(this.xleft, ocrWordElement.xleft) &&
        Objects.equals(this.ytop, ocrWordElement.ytop) &&
        Objects.equals(this.width, ocrWordElement.width) &&
        Objects.equals(this.height, ocrWordElement.height) &&
        Objects.equals(this.confidenceLevel, ocrWordElement.confidenceLevel) &&
        Objects.equals(this.blockNumber, ocrWordElement.blockNumber) &&
        Objects.equals(this.paragraphNumber, ocrWordElement.paragraphNumber) &&
        Objects.equals(this.pageNumber, ocrWordElement.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordText, lineNumber, wordNumber, xleft, ytop, width, height, confidenceLevel, blockNumber, paragraphNumber, pageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrWordElement {\n");
    sb.append("    wordText: ").append(toIndentedString(wordText)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    wordNumber: ").append(toIndentedString(wordNumber)).append("\n");
    sb.append("    xleft: ").append(toIndentedString(xleft)).append("\n");
    sb.append("    ytop: ").append(toIndentedString(ytop)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    paragraphNumber: ").append(toIndentedString(paragraphNumber)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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

