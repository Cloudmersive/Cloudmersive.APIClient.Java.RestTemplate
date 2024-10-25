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
import com.cloudmersive.client.rt.model.DocxImage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Input to set-footer command
 */
@JsonPropertyOrder({
  DocxInsertImageRequest.JSON_PROPERTY_INPUT_DOCUMENT_FILE_BYTES,
  DocxInsertImageRequest.JSON_PROPERTY_INPUT_DOCUMENT_FILE_URL,
  DocxInsertImageRequest.JSON_PROPERTY_INPUT_IMAGE_FILE_BYTES,
  DocxInsertImageRequest.JSON_PROPERTY_INPUT_IMAGE_FILE_URL,
  DocxInsertImageRequest.JSON_PROPERTY_IMAGE_TO_ADD,
  DocxInsertImageRequest.JSON_PROPERTY_INSERT_PLACEMENT,
  DocxInsertImageRequest.JSON_PROPERTY_INSERT_PATH,
  DocxInsertImageRequest.JSON_PROPERTY_WIDTH_IN_E_M_US,
  DocxInsertImageRequest.JSON_PROPERTY_HEIGHT_IN_E_M_US
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DocxInsertImageRequest {
  public static final String JSON_PROPERTY_INPUT_DOCUMENT_FILE_BYTES = "InputDocumentFileBytes";
  private byte[] inputDocumentFileBytes;

  public static final String JSON_PROPERTY_INPUT_DOCUMENT_FILE_URL = "InputDocumentFileUrl";
  private String inputDocumentFileUrl;

  public static final String JSON_PROPERTY_INPUT_IMAGE_FILE_BYTES = "InputImageFileBytes";
  private byte[] inputImageFileBytes;

  public static final String JSON_PROPERTY_INPUT_IMAGE_FILE_URL = "InputImageFileUrl";
  private String inputImageFileUrl;

  public static final String JSON_PROPERTY_IMAGE_TO_ADD = "ImageToAdd";
  private DocxImage imageToAdd;

  public static final String JSON_PROPERTY_INSERT_PLACEMENT = "InsertPlacement";
  private String insertPlacement;

  public static final String JSON_PROPERTY_INSERT_PATH = "InsertPath";
  private String insertPath;

  public static final String JSON_PROPERTY_WIDTH_IN_E_M_US = "WidthInEMUs";
  private Long widthInEMUs;

  public static final String JSON_PROPERTY_HEIGHT_IN_E_M_US = "HeightInEMUs";
  private Long heightInEMUs;

  public DocxInsertImageRequest() {
  }

  public DocxInsertImageRequest inputDocumentFileBytes(byte[] inputDocumentFileBytes) {
    
    this.inputDocumentFileBytes = inputDocumentFileBytes;
    return this;
  }

  /**
   * Optional: Bytes of the input file to operate on
   * @return inputDocumentFileBytes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_DOCUMENT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputDocumentFileBytes() {
    return inputDocumentFileBytes;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_DOCUMENT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputDocumentFileBytes(byte[] inputDocumentFileBytes) {
    this.inputDocumentFileBytes = inputDocumentFileBytes;
  }

  public DocxInsertImageRequest inputDocumentFileUrl(String inputDocumentFileUrl) {
    
    this.inputDocumentFileUrl = inputDocumentFileUrl;
    return this;
  }

  /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputDocumentFileUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_DOCUMENT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputDocumentFileUrl() {
    return inputDocumentFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_DOCUMENT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputDocumentFileUrl(String inputDocumentFileUrl) {
    this.inputDocumentFileUrl = inputDocumentFileUrl;
  }

  public DocxInsertImageRequest inputImageFileBytes(byte[] inputImageFileBytes) {
    
    this.inputImageFileBytes = inputImageFileBytes;
    return this;
  }

  /**
   * Optional: Bytes of the input image file to operate on; if you supply this value do not supply InputImageFileUrl or ImageToAdd.
   * @return inputImageFileBytes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_IMAGE_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputImageFileBytes() {
    return inputImageFileBytes;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_IMAGE_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputImageFileBytes(byte[] inputImageFileBytes) {
    this.inputImageFileBytes = inputImageFileBytes;
  }

  public DocxInsertImageRequest inputImageFileUrl(String inputImageFileUrl) {
    
    this.inputImageFileUrl = inputImageFileUrl;
    return this;
  }

  /**
   * Optional: URL of an image file to operate on as input; if you supply this value do not supply InputImageFileBytes or ImageToAdd.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputImageFileUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_IMAGE_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputImageFileUrl() {
    return inputImageFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_IMAGE_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputImageFileUrl(String inputImageFileUrl) {
    this.inputImageFileUrl = inputImageFileUrl;
  }

  public DocxInsertImageRequest imageToAdd(DocxImage imageToAdd) {
    
    this.imageToAdd = imageToAdd;
    return this;
  }

  /**
   * Get imageToAdd
   * @return imageToAdd
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_TO_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocxImage getImageToAdd() {
    return imageToAdd;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_TO_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageToAdd(DocxImage imageToAdd) {
    this.imageToAdd = imageToAdd;
  }

  public DocxInsertImageRequest insertPlacement(String insertPlacement) {
    
    this.insertPlacement = insertPlacement;
    return this;
  }

  /**
   * Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)
   * @return insertPlacement
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSERT_PLACEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsertPlacement() {
    return insertPlacement;
  }


  @JsonProperty(JSON_PROPERTY_INSERT_PLACEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
  }

  public DocxInsertImageRequest insertPath(String insertPath) {
    
    this.insertPath = insertPath;
    return this;
  }

  /**
   * Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject
   * @return insertPath
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSERT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsertPath() {
    return insertPath;
  }


  @JsonProperty(JSON_PROPERTY_INSERT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsertPath(String insertPath) {
    this.insertPath = insertPath;
  }

  public DocxInsertImageRequest widthInEMUs(Long widthInEMUs) {
    
    this.widthInEMUs = widthInEMUs;
    return this;
  }

  /**
   * Optional: The width of the image in EMUs
   * @return widthInEMUs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH_IN_E_M_US)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWidthInEMUs() {
    return widthInEMUs;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH_IN_E_M_US)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidthInEMUs(Long widthInEMUs) {
    this.widthInEMUs = widthInEMUs;
  }

  public DocxInsertImageRequest heightInEMUs(Long heightInEMUs) {
    
    this.heightInEMUs = heightInEMUs;
    return this;
  }

  /**
   * Optional: The height of the image in EMUs
   * @return heightInEMUs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT_IN_E_M_US)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeightInEMUs() {
    return heightInEMUs;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT_IN_E_M_US)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeightInEMUs(Long heightInEMUs) {
    this.heightInEMUs = heightInEMUs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxInsertImageRequest docxInsertImageRequest = (DocxInsertImageRequest) o;
    return Arrays.equals(this.inputDocumentFileBytes, docxInsertImageRequest.inputDocumentFileBytes) &&
        Objects.equals(this.inputDocumentFileUrl, docxInsertImageRequest.inputDocumentFileUrl) &&
        Arrays.equals(this.inputImageFileBytes, docxInsertImageRequest.inputImageFileBytes) &&
        Objects.equals(this.inputImageFileUrl, docxInsertImageRequest.inputImageFileUrl) &&
        Objects.equals(this.imageToAdd, docxInsertImageRequest.imageToAdd) &&
        Objects.equals(this.insertPlacement, docxInsertImageRequest.insertPlacement) &&
        Objects.equals(this.insertPath, docxInsertImageRequest.insertPath) &&
        Objects.equals(this.widthInEMUs, docxInsertImageRequest.widthInEMUs) &&
        Objects.equals(this.heightInEMUs, docxInsertImageRequest.heightInEMUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputDocumentFileBytes), inputDocumentFileUrl, Arrays.hashCode(inputImageFileBytes), inputImageFileUrl, imageToAdd, insertPlacement, insertPath, widthInEMUs, heightInEMUs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxInsertImageRequest {\n");
    sb.append("    inputDocumentFileBytes: ").append(toIndentedString(inputDocumentFileBytes)).append("\n");
    sb.append("    inputDocumentFileUrl: ").append(toIndentedString(inputDocumentFileUrl)).append("\n");
    sb.append("    inputImageFileBytes: ").append(toIndentedString(inputImageFileBytes)).append("\n");
    sb.append("    inputImageFileUrl: ").append(toIndentedString(inputImageFileUrl)).append("\n");
    sb.append("    imageToAdd: ").append(toIndentedString(imageToAdd)).append("\n");
    sb.append("    insertPlacement: ").append(toIndentedString(insertPlacement)).append("\n");
    sb.append("    insertPath: ").append(toIndentedString(insertPath)).append("\n");
    sb.append("    widthInEMUs: ").append(toIndentedString(widthInEMUs)).append("\n");
    sb.append("    heightInEMUs: ").append(toIndentedString(heightInEMUs)).append("\n");
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

