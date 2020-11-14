package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.AutodetectGetInfoResult;
import com.cloudmersive.client.rt.model.AutodetectToJpgResult;
import com.cloudmersive.client.rt.model.AutodetectToPngResult;
import com.cloudmersive.client.rt.model.AutodetectToThumbnailsResult;
import com.cloudmersive.client.rt.model.CsvCollection;
import com.cloudmersive.client.rt.model.DocxToJpgResult;
import com.cloudmersive.client.rt.model.DocxToPngResult;
import com.cloudmersive.client.rt.model.EmlToHtmlResult;
import com.cloudmersive.client.rt.model.EmlToJpgResult;
import com.cloudmersive.client.rt.model.EmlToPngResult;
import java.io.File;
import com.cloudmersive.client.rt.model.GetFileTypeIconResult;
import com.cloudmersive.client.rt.model.KeynoteToJpgResult;
import com.cloudmersive.client.rt.model.KeynoteToPngResult;
import com.cloudmersive.client.rt.model.MsgToHtmlResult;
import com.cloudmersive.client.rt.model.MsgToJpgResult;
import com.cloudmersive.client.rt.model.MsgToPngResult;
import com.cloudmersive.client.rt.model.OdpToJpgResult;
import com.cloudmersive.client.rt.model.OdpToPngResult;
import com.cloudmersive.client.rt.model.OdsToJpgResult;
import com.cloudmersive.client.rt.model.OdsToPngResult;
import com.cloudmersive.client.rt.model.OdtToJpgResult;
import com.cloudmersive.client.rt.model.OdtToPngResult;
import com.cloudmersive.client.rt.model.PdfToJpgResult;
import com.cloudmersive.client.rt.model.PdfToPngResult;
import com.cloudmersive.client.rt.model.PptxToPngResult;
import com.cloudmersive.client.rt.model.RtfToJpgResult;
import com.cloudmersive.client.rt.model.RtfToPngResult;
import com.cloudmersive.client.rt.model.TextConversionResult;
import com.cloudmersive.client.rt.model.XlsxToPngResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:19.979-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.ConvertDocumentApi")
public class ConvertDocumentApi {
    private ApiClient apiClient;

    public ConvertDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get document type information
     * Auto-detects a document&#39;s type information; does not require file extension.  Analyzes file contents to confirm file type.  Even if no file extension is present, the auto-detect system will reliably analyze the contents of the file and identify its file type.  Supports over 100 image file formats, Office document file formats, PDF, and more.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return AutodetectGetInfoResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AutodetectGetInfoResult convertDocumentAutodetectGetInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentAutodetectGetInfoWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get document type information
     * Auto-detects a document&#39;s type information; does not require file extension.  Analyzes file contents to confirm file type.  Even if no file extension is present, the auto-detect system will reliably analyze the contents of the file and identify its file type.  Supports over 100 image file formats, Office document file formats, PDF, and more.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;AutodetectGetInfoResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AutodetectGetInfoResult> convertDocumentAutodetectGetInfoWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentAutodetectGetInfo");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/get-info", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<AutodetectGetInfoResult> returnType = new ParameterizedTypeReference<AutodetectGetInfoResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Document to JPG/JPEG image array
     * Automatically detect file type and convert it to an array of JPG/JPEG Images.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return AutodetectToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AutodetectToJpgResult convertDocumentAutodetectToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentAutodetectToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert Document to JPG/JPEG image array
     * Automatically detect file type and convert it to an array of JPG/JPEG Images.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;AutodetectToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AutodetectToJpgResult> convertDocumentAutodetectToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToJpg");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<AutodetectToJpgResult> returnType = new ParameterizedTypeReference<AutodetectToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Document to PDF
     * Automatically detect file type and convert it to PDF.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentAutodetectToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentAutodetectToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Document to PDF
     * Automatically detect file type and convert it to PDF.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentAutodetectToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPdf");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Document to PNG array
     * Automatically detect file type and convert it to an array of PNG images.  Supports all of the major Office document file formats, over 100 image formats, and even multi-page TIFF files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return AutodetectToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AutodetectToPngResult convertDocumentAutodetectToPngArray(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentAutodetectToPngArrayWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Document to PNG array
     * Automatically detect file type and convert it to an array of PNG images.  Supports all of the major Office document file formats, over 100 image formats, and even multi-page TIFF files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;AutodetectToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AutodetectToPngResult> convertDocumentAutodetectToPngArrayWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPngArray");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<AutodetectToPngResult> returnType = new ParameterizedTypeReference<AutodetectToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert File to Thumbnail Image
     * Automatically detect file type and convert it to a PNG thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128. (optional)
     * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128. (optional)
     * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentAutodetectToThumbnail(org.springframework.core.io.Resource inputFile, Integer maxWidth, Integer maxHeight, String extension) throws RestClientException {
        return convertDocumentAutodetectToThumbnailWithHttpInfo(inputFile, maxWidth, maxHeight, extension).getBody();
    }

    /**
     * Convert File to Thumbnail Image
     * Automatically detect file type and convert it to a PNG thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128. (optional)
     * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128. (optional)
     * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentAutodetectToThumbnailWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer maxWidth, Integer maxHeight, String extension) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToThumbnail");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/to/thumbnail", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (extension != null)
        headerParams.add("extension", apiClient.parameterToString(extension));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert File to Thumbnail Image Object
     * Automatically detect file type and convert it to an array of PNG thumbnails, returned as an object. May specify the number of pages for multiple thumbnails; default is one thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param pages Optional; Specify how many pages of the document will be converted to thumbnails. Default is 1 page. (optional)
     * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128. (optional)
     * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128. (optional)
     * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon. (optional)
     * @return AutodetectToThumbnailsResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AutodetectToThumbnailsResult convertDocumentAutodetectToThumbnailsAdvanced(org.springframework.core.io.Resource inputFile, Integer pages, Integer maxWidth, Integer maxHeight, String extension) throws RestClientException {
        return convertDocumentAutodetectToThumbnailsAdvancedWithHttpInfo(inputFile, pages, maxWidth, maxHeight, extension).getBody();
    }

    /**
     * Convert File to Thumbnail Image Object
     * Automatically detect file type and convert it to an array of PNG thumbnails, returned as an object. May specify the number of pages for multiple thumbnails; default is one thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param pages Optional; Specify how many pages of the document will be converted to thumbnails. Default is 1 page. (optional)
     * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128. (optional)
     * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128. (optional)
     * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon. (optional)
     * @return ResponseEntity&lt;AutodetectToThumbnailsResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AutodetectToThumbnailsResult> convertDocumentAutodetectToThumbnailsAdvancedWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer pages, Integer maxWidth, Integer maxHeight, String extension) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToThumbnailsAdvanced");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/to/thumbnail/advanced", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (pages != null)
        headerParams.add("pages", apiClient.parameterToString(pages));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (extension != null)
        headerParams.add("extension", apiClient.parameterToString(extension));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<AutodetectToThumbnailsResult> returnType = new ParameterizedTypeReference<AutodetectToThumbnailsResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Document to Text (txt)
     * Automatically detect file type and convert it to Text.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT) and PDF files.  For spreadsheets, all worksheets will be included.  If you wish to exclude certain pages, worksheets, slides, etc. use the Split document API first, or the delete pages/slides/worksheet APIs first to adjust the document to the target state prior to converting to text.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;. (optional)
     * @return TextConversionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextConversionResult convertDocumentAutodetectToTxt(org.springframework.core.io.Resource inputFile, String textFormattingMode) throws RestClientException {
        return convertDocumentAutodetectToTxtWithHttpInfo(inputFile, textFormattingMode).getBody();
    }

    /**
     * Convert Document to Text (txt)
     * Automatically detect file type and convert it to Text.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT) and PDF files.  For spreadsheets, all worksheets will be included.  If you wish to exclude certain pages, worksheets, slides, etc. use the Split document API first, or the delete pages/slides/worksheet APIs first to adjust the document to the target state prior to converting to text.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;. (optional)
     * @return ResponseEntity&lt;TextConversionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextConversionResult> convertDocumentAutodetectToTxtWithHttpInfo(org.springframework.core.io.Resource inputFile, String textFormattingMode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToTxt");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (textFormattingMode != null)
        headerParams.add("textFormattingMode", apiClient.parameterToString(textFormattingMode));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextConversionResult> returnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Multiple CSV Files into a Single XLSX Spreadsheet
     * Convert multiple Comma-Separated Values (CSV) files into a single Excel XLSX Spreadsheet, with one worksheet corresponding to each CSV file.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param worksheetNames Optional; Specify the name of each CSV&#39;s worksheet in order, separated with commas (e.g. \&quot;worksheet1,worksheet2,worksheet3\&quot;). Defaults to the names of the input CSV files. Recommended when inputting the files directly, without file names. (optional)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentCsvMultiToXlsx(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, String worksheetNames, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return convertDocumentCsvMultiToXlsxWithHttpInfo(inputFile1, inputFile2, worksheetNames, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Convert Multiple CSV Files into a Single XLSX Spreadsheet
     * Convert multiple Comma-Separated Values (CSV) files into a single Excel XLSX Spreadsheet, with one worksheet corresponding to each CSV file.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param worksheetNames Optional; Specify the name of each CSV&#39;s worksheet in order, separated with commas (e.g. \&quot;worksheet1,worksheet2,worksheet3\&quot;). Defaults to the names of the input CSV files. Recommended when inputting the files directly, without file names. (optional)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentCsvMultiToXlsxWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, String worksheetNames, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling convertDocumentCsvMultiToXlsx");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling convertDocumentCsvMultiToXlsx");
        }
        
        String path = apiClient.expandPath("/convert/csv/multi/to/xlsx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (worksheetNames != null)
        headerParams.add("worksheetNames", apiClient.parameterToString(worksheetNames));

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert CSV to HTML document
     * Convert Comma-Separated Values (CSV) file to HTML document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentCsvToHtml(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentCsvToHtmlWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert CSV to HTML document
     * Convert Comma-Separated Values (CSV) file to HTML document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentCsvToHtmlWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentCsvToHtml");
        }
        
        String path = apiClient.expandPath("/convert/csv/to/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert CSV to PDF document
     * Convert Comma-Separated Values (CSV) file to PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentCsvToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentCsvToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert CSV to PDF document
     * Convert Comma-Separated Values (CSV) file to PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentCsvToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentCsvToPdf");
        }
        
        String path = apiClient.expandPath("/convert/csv/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert CSV to Excel XLSX Spreadsheet
     * Convert CSV file to Office Excel XLSX Workbooks file format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentCsvToXlsx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentCsvToXlsxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert CSV to Excel XLSX Spreadsheet
     * Convert CSV file to Office Excel XLSX Workbooks file format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentCsvToXlsxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentCsvToXlsx");
        }
        
        String path = apiClient.expandPath("/convert/csv/to/xlsx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOC (97-03) Document to DOCX
     * Convert/upgrade Office Word (97-2003 Format) Documents (doc) to the modern DOCX format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentDocToDocx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentDocToDocxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Word DOC (97-03) Document to DOCX
     * Convert/upgrade Office Word (97-2003 Format) Documents (doc) to the modern DOCX format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentDocToDocxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocToDocx");
        }
        
        String path = apiClient.expandPath("/convert/doc/to/docx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOC (97-03) Document to PDF
     * Convert Office Word (97-2003 Format) Documents (doc) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentDocToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentDocToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Word DOC (97-03) Document to PDF
     * Convert Office Word (97-2003 Format) Documents (doc) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentDocToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocToPdf");
        }
        
        String path = apiClient.expandPath("/convert/doc/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOC (97-03) Document to Text (txt)
     * Convert Office Word DOC (97-03) Document (doc) to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return TextConversionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextConversionResult convertDocumentDocToTxt(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentDocToTxtWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Word DOC (97-03) Document to Text (txt)
     * Convert Office Word DOC (97-03) Document (doc) to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;TextConversionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextConversionResult> convertDocumentDocToTxtWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocToTxt");
        }
        
        String path = apiClient.expandPath("/convert/doc/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextConversionResult> returnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOCX Document to Legacy Word DOC (97-03)
     * Convert/downgrade modern Office Word DOCX Documents (DOCX) to the legacy Word DOC (97-2003 Format) format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentDocxToDoc(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentDocxToDocWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Word DOCX Document to Legacy Word DOC (97-03)
     * Convert/downgrade modern Office Word DOCX Documents (DOCX) to the legacy Word DOC (97-2003 Format) format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentDocxToDocWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocxToDoc");
        }
        
        String path = apiClient.expandPath("/convert/docx/to/doc", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOCX Document to HTML Document
     * Convert Office Word Document (DOCX) to HTML Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentDocxToHtml(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentDocxToHtmlWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Word DOCX Document to HTML Document
     * Convert Office Word Document (DOCX) to HTML Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentDocxToHtmlWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocxToHtml");
        }
        
        String path = apiClient.expandPath("/convert/docx/to/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOCX Document to JPG/JPEG image array
     * Converts an Office Word Document (DOCX) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return DocxToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocxToJpgResult convertDocumentDocxToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentDocxToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert Word DOCX Document to JPG/JPEG image array
     * Converts an Office Word Document (DOCX) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;DocxToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocxToJpgResult> convertDocumentDocxToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocxToJpg");
        }
        
        String path = apiClient.expandPath("/convert/docx/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DocxToJpgResult> returnType = new ParameterizedTypeReference<DocxToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOCX Document to PDF
     * Convert Office Word Documents (docx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentDocxToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentDocxToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Word DOCX Document to PDF
     * Convert Office Word Documents (docx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentDocxToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocxToPdf");
        }
        
        String path = apiClient.expandPath("/convert/docx/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOCX Document to PNG image array
     * Converts an Office Word Document (DOCX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocxToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocxToPngResult convertDocumentDocxToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentDocxToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Word DOCX Document to PNG image array
     * Converts an Office Word Document (DOCX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocxToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocxToPngResult> convertDocumentDocxToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocxToPng");
        }
        
        String path = apiClient.expandPath("/convert/docx/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DocxToPngResult> returnType = new ParameterizedTypeReference<DocxToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOCX Document to RTF
     * Convert an Office Word Document (DOCX) to Rich Text Format Document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentDocxToRtf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentDocxToRtfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Word DOCX Document to RTF
     * Convert an Office Word Document (DOCX) to Rich Text Format Document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentDocxToRtfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocxToRtf");
        }
        
        String path = apiClient.expandPath("/convert/docx/to/rtf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Word DOCX Document to Text (txt)
     * Convert Office Word Documents (docx) to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;minimizeWhitespace&#39;. (optional)
     * @return TextConversionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextConversionResult convertDocumentDocxToTxt(org.springframework.core.io.Resource inputFile, String textFormattingMode) throws RestClientException {
        return convertDocumentDocxToTxtWithHttpInfo(inputFile, textFormattingMode).getBody();
    }

    /**
     * Convert Word DOCX Document to Text (txt)
     * Convert Office Word Documents (docx) to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;minimizeWhitespace&#39;. (optional)
     * @return ResponseEntity&lt;TextConversionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextConversionResult> convertDocumentDocxToTxtWithHttpInfo(org.springframework.core.io.Resource inputFile, String textFormattingMode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocxToTxt");
        }
        
        String path = apiClient.expandPath("/convert/docx/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (textFormattingMode != null)
        headerParams.add("textFormattingMode", apiClient.parameterToString(textFormattingMode));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextConversionResult> returnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Email EML file to HTML string
     * Convert Outlook Email EML file to HTML string and attachments. Supports images if they are base 64 inline.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false. (optional)
     * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true. (optional)
     * @return EmlToHtmlResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EmlToHtmlResult convertDocumentEmlToHtml(org.springframework.core.io.Resource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws RestClientException {
        return convertDocumentEmlToHtmlWithHttpInfo(inputFile, bodyOnly, includeAttachments).getBody();
    }

    /**
     * Convert Email EML file to HTML string
     * Convert Outlook Email EML file to HTML string and attachments. Supports images if they are base 64 inline.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false. (optional)
     * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true. (optional)
     * @return ResponseEntity&lt;EmlToHtmlResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EmlToHtmlResult> convertDocumentEmlToHtmlWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentEmlToHtml");
        }
        
        String path = apiClient.expandPath("/convert/eml/to/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bodyOnly != null)
        headerParams.add("bodyOnly", apiClient.parameterToString(bodyOnly));
        if (includeAttachments != null)
        headerParams.add("includeAttachments", apiClient.parameterToString(includeAttachments));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<EmlToHtmlResult> returnType = new ParameterizedTypeReference<EmlToHtmlResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Email EML file to JPG/JPEG image array
     * Converts an Outlook Email File (EML) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return EmlToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EmlToJpgResult convertDocumentEmlToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentEmlToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert Email EML file to JPG/JPEG image array
     * Converts an Outlook Email File (EML) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;EmlToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EmlToJpgResult> convertDocumentEmlToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentEmlToJpg");
        }
        
        String path = apiClient.expandPath("/convert/eml/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<EmlToJpgResult> returnType = new ParameterizedTypeReference<EmlToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Email EML file to PDF document
     * Convert Outlook Email EML file to PDF document. Supports images if they are base 64 inline.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentEmlToPdf(org.springframework.core.io.Resource inputFile, Boolean bodyOnly) throws RestClientException {
        return convertDocumentEmlToPdfWithHttpInfo(inputFile, bodyOnly).getBody();
    }

    /**
     * Convert Email EML file to PDF document
     * Convert Outlook Email EML file to PDF document. Supports images if they are base 64 inline.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentEmlToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean bodyOnly) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentEmlToPdf");
        }
        
        String path = apiClient.expandPath("/convert/eml/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bodyOnly != null)
        headerParams.add("bodyOnly", apiClient.parameterToString(bodyOnly));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Email EML file to PNG image array
     * Converts an Outlook Email File (EML) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return EmlToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EmlToPngResult convertDocumentEmlToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentEmlToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Email EML file to PNG image array
     * Converts an Outlook Email File (EML) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;EmlToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EmlToPngResult> convertDocumentEmlToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentEmlToPng");
        }
        
        String path = apiClient.expandPath("/convert/eml/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<EmlToPngResult> returnType = new ParameterizedTypeReference<EmlToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get PNG icon file for the file extension
     * Returns a PNG icon for the given file format extension as a file for download. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
     * <p><b>200</b> - OK
     * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters. (required)
     * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentGetFileTypeIcon(String fileExtension, Integer iconSize) throws RestClientException {
        return convertDocumentGetFileTypeIconWithHttpInfo(fileExtension, iconSize).getBody();
    }

    /**
     * Get PNG icon file for the file extension
     * Returns a PNG icon for the given file format extension as a file for download. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
     * <p><b>200</b> - OK
     * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters. (required)
     * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentGetFileTypeIconWithHttpInfo(String fileExtension, Integer iconSize) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'fileExtension' is set
        if (fileExtension == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileExtension' when calling convertDocumentGetFileTypeIcon");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/get-icon", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileExtension != null)
        headerParams.add("fileExtension", apiClient.parameterToString(fileExtension));
        if (iconSize != null)
        headerParams.add("iconSize", apiClient.parameterToString(iconSize));

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get PNG icon byte array for the file extension
     * Returns a PNG icon for the given file format extension directly as a byte array. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
     * <p><b>200</b> - OK
     * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters. (required)
     * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio. (optional)
     * @return GetFileTypeIconResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetFileTypeIconResult convertDocumentGetFileTypeIconAdvanced(String fileExtension, Integer iconSize) throws RestClientException {
        return convertDocumentGetFileTypeIconAdvancedWithHttpInfo(fileExtension, iconSize).getBody();
    }

    /**
     * Get PNG icon byte array for the file extension
     * Returns a PNG icon for the given file format extension directly as a byte array. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
     * <p><b>200</b> - OK
     * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters. (required)
     * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio. (optional)
     * @return ResponseEntity&lt;GetFileTypeIconResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetFileTypeIconResult> convertDocumentGetFileTypeIconAdvancedWithHttpInfo(String fileExtension, Integer iconSize) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'fileExtension' is set
        if (fileExtension == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileExtension' when calling convertDocumentGetFileTypeIconAdvanced");
        }
        
        String path = apiClient.expandPath("/convert/autodetect/get-icon/advanced", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileExtension != null)
        headerParams.add("fileExtension", apiClient.parameterToString(fileExtension));
        if (iconSize != null)
        headerParams.add("iconSize", apiClient.parameterToString(iconSize));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GetFileTypeIconResult> returnType = new ParameterizedTypeReference<GetFileTypeIconResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert HTML document file to PDF Document
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to PDF.  To use external files such as images, use an absolute URL to the file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param includeBackgroundGraphics Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true. (optional)
     * @param scaleFactor Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentHtmlToPdf(org.springframework.core.io.Resource inputFile, Boolean includeBackgroundGraphics, Integer scaleFactor) throws RestClientException {
        return convertDocumentHtmlToPdfWithHttpInfo(inputFile, includeBackgroundGraphics, scaleFactor).getBody();
    }

    /**
     * Convert HTML document file to PDF Document
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to PDF.  To use external files such as images, use an absolute URL to the file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param includeBackgroundGraphics Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true. (optional)
     * @param scaleFactor Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentHtmlToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean includeBackgroundGraphics, Integer scaleFactor) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentHtmlToPdf");
        }
        
        String path = apiClient.expandPath("/convert/html/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (includeBackgroundGraphics != null)
        headerParams.add("includeBackgroundGraphics", apiClient.parameterToString(includeBackgroundGraphics));
        if (scaleFactor != null)
        headerParams.add("scaleFactor", apiClient.parameterToString(scaleFactor));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert HTML document file to PNG image array
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to an array of PNG images, one for each page.  To use external files in your HTML such as images, use an absolute URL to the file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return PdfToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PdfToPngResult convertDocumentHtmlToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentHtmlToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert HTML document file to PNG image array
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to an array of PNG images, one for each page.  To use external files in your HTML such as images, use an absolute URL to the file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;PdfToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PdfToPngResult> convertDocumentHtmlToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentHtmlToPng");
        }
        
        String path = apiClient.expandPath("/convert/html/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PdfToPngResult> returnType = new ParameterizedTypeReference<PdfToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * HTML Document file to Text (txt)
     * HTML document to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return TextConversionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextConversionResult convertDocumentHtmlToTxt(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentHtmlToTxtWithHttpInfo(inputFile).getBody();
    }

    /**
     * HTML Document file to Text (txt)
     * HTML document to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;TextConversionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextConversionResult> convertDocumentHtmlToTxtWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentHtmlToTxt");
        }
        
        String path = apiClient.expandPath("/convert/html/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextConversionResult> returnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Keynote Presentation (KEY) to JPG/JPEG image array
     * Converts a Mac Keynote Presentation (KEY) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return KeynoteToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public KeynoteToJpgResult convertDocumentKeynoteToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentKeynoteToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert Keynote Presentation (KEY) to JPG/JPEG image array
     * Converts a Mac Keynote Presentation (KEY) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;KeynoteToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<KeynoteToJpgResult> convertDocumentKeynoteToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToJpg");
        }
        
        String path = apiClient.expandPath("/convert/key/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<KeynoteToJpgResult> returnType = new ParameterizedTypeReference<KeynoteToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Keynote Presentation (KEY) to PDF
     * Convert Mac Keynote Presentation (KEY) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentKeynoteToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentKeynoteToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Keynote Presentation (KEY) to PDF
     * Convert Mac Keynote Presentation (KEY) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentKeynoteToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPdf");
        }
        
        String path = apiClient.expandPath("/convert/key/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Keynote Presentation (KEY) to PNG image array
     * Converts a Mac Keynote Presentation (KEY) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return KeynoteToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public KeynoteToPngResult convertDocumentKeynoteToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentKeynoteToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Keynote Presentation (KEY) to PNG image array
     * Converts a Mac Keynote Presentation (KEY) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;KeynoteToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<KeynoteToPngResult> convertDocumentKeynoteToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPng");
        }
        
        String path = apiClient.expandPath("/convert/key/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<KeynoteToPngResult> returnType = new ParameterizedTypeReference<KeynoteToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Keynote Presentation (KEY) to PPTX
     * Convert Mac Keynote Presentation (KEY) to PowerPoint Presentation (PPTX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentKeynoteToPptx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentKeynoteToPptxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Keynote Presentation (KEY) to PPTX
     * Convert Mac Keynote Presentation (KEY) to PowerPoint Presentation (PPTX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentKeynoteToPptxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPptx");
        }
        
        String path = apiClient.expandPath("/convert/key/to/pptx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Email MSG file to HTML string
     * Convert Outlook Email MSG file to HTML string and attachments. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the MSG. Other information such as subject will still be given as properties in the response object. Default is false. (optional)
     * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true. (optional)
     * @return MsgToHtmlResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MsgToHtmlResult convertDocumentMsgToHtml(org.springframework.core.io.Resource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws RestClientException {
        return convertDocumentMsgToHtmlWithHttpInfo(inputFile, bodyOnly, includeAttachments).getBody();
    }

    /**
     * Convert Email MSG file to HTML string
     * Convert Outlook Email MSG file to HTML string and attachments. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the MSG. Other information such as subject will still be given as properties in the response object. Default is false. (optional)
     * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true. (optional)
     * @return ResponseEntity&lt;MsgToHtmlResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MsgToHtmlResult> convertDocumentMsgToHtmlWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentMsgToHtml");
        }
        
        String path = apiClient.expandPath("/convert/msg/to/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bodyOnly != null)
        headerParams.add("bodyOnly", apiClient.parameterToString(bodyOnly));
        if (includeAttachments != null)
        headerParams.add("includeAttachments", apiClient.parameterToString(includeAttachments));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<MsgToHtmlResult> returnType = new ParameterizedTypeReference<MsgToHtmlResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Email MSG file to JPG/JPEG image array
     * Converts an Outlook Message File (MSG) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return MsgToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MsgToJpgResult convertDocumentMsgToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentMsgToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert Email MSG file to JPG/JPEG image array
     * Converts an Outlook Message File (MSG) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;MsgToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MsgToJpgResult> convertDocumentMsgToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentMsgToJpg");
        }
        
        String path = apiClient.expandPath("/convert/msg/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<MsgToJpgResult> returnType = new ParameterizedTypeReference<MsgToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Email MSG file to PDF document
     * Convert Outlook Email MSG file to PDF document. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentMsgToPdf(org.springframework.core.io.Resource inputFile, Boolean bodyOnly) throws RestClientException {
        return convertDocumentMsgToPdfWithHttpInfo(inputFile, bodyOnly).getBody();
    }

    /**
     * Convert Email MSG file to PDF document
     * Convert Outlook Email MSG file to PDF document. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentMsgToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean bodyOnly) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentMsgToPdf");
        }
        
        String path = apiClient.expandPath("/convert/msg/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bodyOnly != null)
        headerParams.add("bodyOnly", apiClient.parameterToString(bodyOnly));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Email MSG file to PNG image array
     * Converts an Outlook Email Message File (MSG) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return MsgToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MsgToPngResult convertDocumentMsgToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentMsgToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Email MSG file to PNG image array
     * Converts an Outlook Email Message File (MSG) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;MsgToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MsgToPngResult> convertDocumentMsgToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentMsgToPng");
        }
        
        String path = apiClient.expandPath("/convert/msg/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<MsgToPngResult> returnType = new ParameterizedTypeReference<MsgToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODP Presentation to JPG/JPEG image array
     * Converts an Open Document Presentation (ODP) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return OdpToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OdpToJpgResult convertDocumentOdpToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentOdpToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert ODP Presentation to JPG/JPEG image array
     * Converts an Open Document Presentation (ODP) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;OdpToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OdpToJpgResult> convertDocumentOdpToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdpToJpg");
        }
        
        String path = apiClient.expandPath("/convert/odp/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdpToJpgResult> returnType = new ParameterizedTypeReference<OdpToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODP Presentation to PDF
     * Convert Office Open Document Presentation (ODP) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentOdpToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdpToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODP Presentation to PDF
     * Convert Office Open Document Presentation (ODP) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentOdpToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdpToPdf");
        }
        
        String path = apiClient.expandPath("/convert/odp/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODP Presentation to PNG image array
     * Converts an Office Open Document Presentation (ODP) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return OdpToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OdpToPngResult convertDocumentOdpToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdpToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODP Presentation to PNG image array
     * Converts an Office Open Document Presentation (ODP) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;OdpToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OdpToPngResult> convertDocumentOdpToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdpToPng");
        }
        
        String path = apiClient.expandPath("/convert/odp/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdpToPngResult> returnType = new ParameterizedTypeReference<OdpToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODP Presentation to PPTX
     * Convert Office Open Document Presentation (ODP) to PowerPoint Presentation (PPTX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentOdpToPptx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdpToPptxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODP Presentation to PPTX
     * Convert Office Open Document Presentation (ODP) to PowerPoint Presentation (PPTX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentOdpToPptxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdpToPptx");
        }
        
        String path = apiClient.expandPath("/convert/odp/to/pptx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODS Spreadsheet to JPG/JPEG image array
     * Converts an Open Document Spreadsheet (ODS) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return OdsToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OdsToJpgResult convertDocumentOdsToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentOdsToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert ODS Spreadsheet to JPG/JPEG image array
     * Converts an Open Document Spreadsheet (ODS) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;OdsToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OdsToJpgResult> convertDocumentOdsToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdsToJpg");
        }
        
        String path = apiClient.expandPath("/convert/ods/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdsToJpgResult> returnType = new ParameterizedTypeReference<OdsToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODS Spreadsheet to PDF
     * Convert Office Open Document Spreadsheet (ODS) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentOdsToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdsToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODS Spreadsheet to PDF
     * Convert Office Open Document Spreadsheet (ODS) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentOdsToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdsToPdf");
        }
        
        String path = apiClient.expandPath("/convert/ods/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODS Spreadsheet to PNG image array
     * Converts an Office Open Document Spreadsheet (ODS) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return OdsToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OdsToPngResult convertDocumentOdsToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdsToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODS Spreadsheet to PNG image array
     * Converts an Office Open Document Spreadsheet (ODS) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;OdsToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OdsToPngResult> convertDocumentOdsToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdsToPng");
        }
        
        String path = apiClient.expandPath("/convert/ods/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdsToPngResult> returnType = new ParameterizedTypeReference<OdsToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODS Spreadsheet to XLSX
     * Convert Office Open Document Spreadsheet (ODS) to Excel Spreadsheet (XLSX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentOdsToXlsx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdsToXlsxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODS Spreadsheet to XLSX
     * Convert Office Open Document Spreadsheet (ODS) to Excel Spreadsheet (XLSX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentOdsToXlsxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdsToXlsx");
        }
        
        String path = apiClient.expandPath("/convert/ods/to/xlsx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODT Text File to Word DOCX
     * Convert Office Open Document Text File (ODT) to Word DOCX Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentOdtToDocx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdtToDocxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODT Text File to Word DOCX
     * Convert Office Open Document Text File (ODT) to Word DOCX Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentOdtToDocxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdtToDocx");
        }
        
        String path = apiClient.expandPath("/convert/odt/to/docx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODT Text File to JPG/JPEG image array
     * Converts an Open Document Text File (ODT) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return OdtToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OdtToJpgResult convertDocumentOdtToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentOdtToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert ODT Text File to JPG/JPEG image array
     * Converts an Open Document Text File (ODT) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;OdtToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OdtToJpgResult> convertDocumentOdtToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdtToJpg");
        }
        
        String path = apiClient.expandPath("/convert/odt/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdtToJpgResult> returnType = new ParameterizedTypeReference<OdtToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODT Text File to PDF
     * Convert Office Open Document Text File (ODT) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentOdtToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdtToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODT Text File to PDF
     * Convert Office Open Document Text File (ODT) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentOdtToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdtToPdf");
        }
        
        String path = apiClient.expandPath("/convert/odt/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert ODT Text File to PNG image array
     * Converts an Office Open Document Text File (ODT) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return OdtToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OdtToPngResult convertDocumentOdtToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentOdtToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert ODT Text File to PNG image array
     * Converts an Office Open Document Text File (ODT) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;OdtToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OdtToPngResult> convertDocumentOdtToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentOdtToPng");
        }
        
        String path = apiClient.expandPath("/convert/odt/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdtToPngResult> returnType = new ParameterizedTypeReference<OdtToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PDF to Word DOCX Document
     * Convert standard PDF to Office Word Documents (docx).    Converts a PDF at high fidelity into Word format, where it can be easily edited and processed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentPdfToDocx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPdfToDocxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PDF to Word DOCX Document
     * Convert standard PDF to Office Word Documents (docx).    Converts a PDF at high fidelity into Word format, where it can be easily edited and processed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentPdfToDocxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPdfToDocx");
        }
        
        String path = apiClient.expandPath("/convert/pdf/to/docx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PDF to Word DOCX Document based on rasterized version of the PDF
     * Convert standard PDF to Office Word Documents (docx), but first rasterize the PDF.    Converts a PDF at high fidelity into Word format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentPdfToDocxRasterize(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPdfToDocxRasterizeWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PDF to Word DOCX Document based on rasterized version of the PDF
     * Convert standard PDF to Office Word Documents (docx), but first rasterize the PDF.    Converts a PDF at high fidelity into Word format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentPdfToDocxRasterizeWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPdfToDocxRasterize");
        }
        
        String path = apiClient.expandPath("/convert/pdf/to/docx/rasterize", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PDF to JPG/JPEG image array
     * Converts a PDF Document to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return PdfToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PdfToJpgResult convertDocumentPdfToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentPdfToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert PDF to JPG/JPEG image array
     * Converts a PDF Document to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;PdfToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PdfToJpgResult> convertDocumentPdfToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPdfToJpg");
        }
        
        String path = apiClient.expandPath("/convert/pdf/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PdfToJpgResult> returnType = new ParameterizedTypeReference<PdfToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PDF to PNG Image Array
     * Convert PDF document to PNG array, one image per page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return PdfToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PdfToPngResult convertDocumentPdfToPngArray(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPdfToPngArrayWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PDF to PNG Image Array
     * Convert PDF document to PNG array, one image per page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;PdfToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PdfToPngResult> convertDocumentPdfToPngArrayWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPdfToPngArray");
        }
        
        String path = apiClient.expandPath("/convert/pdf/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PdfToPngResult> returnType = new ParameterizedTypeReference<PdfToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PDF to Single PNG image
     * Convert PDF document to a single tall PNG image, by stacking/concatenating the images vertically into a single \&quot;tall\&quot; image
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentPdfToPngSingle(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPdfToPngSingleWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PDF to Single PNG image
     * Convert PDF document to a single tall PNG image, by stacking/concatenating the images vertically into a single \&quot;tall\&quot; image
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentPdfToPngSingleWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPdfToPngSingle");
        }
        
        String path = apiClient.expandPath("/convert/pdf/to/png/merge-single", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PDF to PowerPoint PPTX Presentation
     * Convert standard PDF to Office PowerPoint Presentation (pptx).  Converts a PDF file at high fidelity into PowerPoint format, where it can be easily edited and processed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentPdfToPptx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPdfToPptxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PDF to PowerPoint PPTX Presentation
     * Convert standard PDF to Office PowerPoint Presentation (pptx).  Converts a PDF file at high fidelity into PowerPoint format, where it can be easily edited and processed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentPdfToPptxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPdfToPptx");
        }
        
        String path = apiClient.expandPath("/convert/pdf/to/pptx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PDF Document to Text (txt)
     * PDF document to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting PDF to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;. (optional)
     * @return TextConversionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextConversionResult convertDocumentPdfToTxt(org.springframework.core.io.Resource inputFile, String textFormattingMode) throws RestClientException {
        return convertDocumentPdfToTxtWithHttpInfo(inputFile, textFormattingMode).getBody();
    }

    /**
     * Convert PDF Document to Text (txt)
     * PDF document to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting PDF to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;. (optional)
     * @return ResponseEntity&lt;TextConversionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextConversionResult> convertDocumentPdfToTxtWithHttpInfo(org.springframework.core.io.Resource inputFile, String textFormattingMode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPdfToTxt");
        }
        
        String path = apiClient.expandPath("/convert/pdf/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (textFormattingMode != null)
        headerParams.add("textFormattingMode", apiClient.parameterToString(textFormattingMode));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextConversionResult> returnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PNG Array to PDF
     * Convert an array of PNG images, one image per page, into a newly-created PDF.  Supports images of different sizes as input.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentPngArrayToPdf(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return convertDocumentPngArrayToPdfWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Convert PNG Array to PDF
     * Convert an array of PNG images, one image per page, into a newly-created PDF.  Supports images of different sizes as input.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentPngArrayToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling convertDocumentPngArrayToPdf");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling convertDocumentPngArrayToPdf");
        }
        
        String path = apiClient.expandPath("/convert/png/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PowerPoint PPT (97-03) Presentation to PDF
     * Convert Office PowerPoint (97-2003) Documents (ppt) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentPptToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPptToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PowerPoint PPT (97-03) Presentation to PDF
     * Convert Office PowerPoint (97-2003) Documents (ppt) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentPptToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPptToPdf");
        }
        
        String path = apiClient.expandPath("/convert/ppt/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PowerPoint PPT (97-03) Presentation to PPTX
     * Convert/upgrade Office PowerPoint (97-2003) Documents (ppt) to modern PPTX
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentPptToPptx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPptToPptxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PowerPoint PPT (97-03) Presentation to PPTX
     * Convert/upgrade Office PowerPoint (97-2003) Documents (ppt) to modern PPTX
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentPptToPptxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPptToPptx");
        }
        
        String path = apiClient.expandPath("/convert/ppt/to/pptx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PowerPoint PPTX Presentation to PDF
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentPptxToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPptxToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PowerPoint PPTX Presentation to PDF
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentPptxToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPptxToPdf");
        }
        
        String path = apiClient.expandPath("/convert/pptx/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PowerPoint PPTX to PNG image array
     * Converts a PowerPoint Presentation (PPTX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return PptxToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PptxToPngResult convertDocumentPptxToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPptxToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PowerPoint PPTX to PNG image array
     * Converts a PowerPoint Presentation (PPTX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;PptxToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PptxToPngResult> convertDocumentPptxToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPptxToPng");
        }
        
        String path = apiClient.expandPath("/convert/pptx/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PptxToPngResult> returnType = new ParameterizedTypeReference<PptxToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PowerPoint PPTX presentation to Legacy PowerPoint PPT (97-03)
     * Convert/downgrade modern Office PowerPoint PPTX Presentation to the legacy PowerPoint PPT (97-2003 Format) format
     * <p><b>200</b> - OK
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object convertDocumentPptxToPpt() throws RestClientException {
        return convertDocumentPptxToPptWithHttpInfo().getBody();
    }

    /**
     * Convert PowerPoint PPTX presentation to Legacy PowerPoint PPT (97-03)
     * Convert/downgrade modern Office PowerPoint PPTX Presentation to the legacy PowerPoint PPT (97-2003 Format) format
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> convertDocumentPptxToPptWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/convert/pptx/to/ppt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert PowerPoint PPTX Presentation to Text (txt)
     * Convert Office PowerPoint Documents (pptx) to standard Text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return TextConversionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextConversionResult convertDocumentPptxToTxt(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentPptxToTxtWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert PowerPoint PPTX Presentation to Text (txt)
     * Convert Office PowerPoint Documents (pptx) to standard Text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;TextConversionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextConversionResult> convertDocumentPptxToTxtWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPptxToTxt");
        }
        
        String path = apiClient.expandPath("/convert/pptx/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextConversionResult> returnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Rich Text Format RTF to DOCX Document
     * Convert Rich Text Format Document (RTF) to Word DOCX Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentRtfToDocx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentRtfToDocxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Rich Text Format RTF to DOCX Document
     * Convert Rich Text Format Document (RTF) to Word DOCX Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentRtfToDocxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentRtfToDocx");
        }
        
        String path = apiClient.expandPath("/convert/rtf/to/docx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Rich Text Format RTF to HTML Document
     * Convert Rich Text Format Document (RTF) to HTML Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentRtfToHtml(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentRtfToHtmlWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Rich Text Format RTF to HTML Document
     * Convert Rich Text Format Document (RTF) to HTML Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentRtfToHtmlWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentRtfToHtml");
        }
        
        String path = apiClient.expandPath("/convert/rtf/to/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Rich Text Format RTF to JPG/JPEG image array
     * Converts a Rich Text Format Document (RTF) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return RtfToJpgResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RtfToJpgResult convertDocumentRtfToJpg(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        return convertDocumentRtfToJpgWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Convert Rich Text Format RTF to JPG/JPEG image array
     * Converts a Rich Text Format Document (RTF) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75. (optional)
     * @return ResponseEntity&lt;RtfToJpgResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RtfToJpgResult> convertDocumentRtfToJpgWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer quality) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentRtfToJpg");
        }
        
        String path = apiClient.expandPath("/convert/rtf/to/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<RtfToJpgResult> returnType = new ParameterizedTypeReference<RtfToJpgResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Rich Text Format RTF to PDF
     * Convert Rich Text Format Document (RTF) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentRtfToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentRtfToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Rich Text Format RTF to PDF
     * Convert Rich Text Format Document (RTF) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentRtfToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentRtfToPdf");
        }
        
        String path = apiClient.expandPath("/convert/rtf/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Rich Text Format RTF to PNG image array
     * Converts a Rich Text Format Document (RTF) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return RtfToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RtfToPngResult convertDocumentRtfToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentRtfToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Rich Text Format RTF to PNG image array
     * Converts a Rich Text Format Document (RTF) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;RtfToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RtfToPngResult> convertDocumentRtfToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentRtfToPng");
        }
        
        String path = apiClient.expandPath("/convert/rtf/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<RtfToPngResult> returnType = new ParameterizedTypeReference<RtfToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLS (97-03) Spreadsheet to CSV
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to standard CSV format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentXlsToCsv(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentXlsToCsvWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLS (97-03) Spreadsheet to CSV
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to standard CSV format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentXlsToCsvWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsToCsv");
        }
        
        String path = apiClient.expandPath("/convert/xls/to/csv", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLS (97-03) Spreadsheet to PDF
     * Convert Office Excel (97-2003) Workbooks (xls) to standard PDF.  Converts all worksheets in the workbook to PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentXlsToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentXlsToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLS (97-03) Spreadsheet to PDF
     * Convert Office Excel (97-2003) Workbooks (xls) to standard PDF.  Converts all worksheets in the workbook to PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentXlsToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsToPdf");
        }
        
        String path = apiClient.expandPath("/convert/xls/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLS (97-03) Spreadsheet to XLSX
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to modern XLSX format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentXlsToXlsx(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentXlsToXlsxWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLS (97-03) Spreadsheet to XLSX
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to modern XLSX format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentXlsToXlsxWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsToXlsx");
        }
        
        String path = apiClient.expandPath("/convert/xls/to/xlsx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to CSV, Single Worksheet
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format.  Supports both XLSX and XLSB file Excel formats.  If the input file contains multiple worksheets, the first one is used.  If you wish to convert all of the worksheets (not just the first one), be sure to use the xlsx/to/csv/multi API.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentXlsxToCsv(org.springframework.core.io.Resource inputFile, String outputEncoding) throws RestClientException {
        return convertDocumentXlsxToCsvWithHttpInfo(inputFile, outputEncoding).getBody();
    }

    /**
     * Convert Excel XLSX Spreadsheet to CSV, Single Worksheet
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format.  Supports both XLSX and XLSB file Excel formats.  If the input file contains multiple worksheets, the first one is used.  If you wish to convert all of the worksheets (not just the first one), be sure to use the xlsx/to/csv/multi API.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentXlsxToCsvWithHttpInfo(org.springframework.core.io.Resource inputFile, String outputEncoding) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsv");
        }
        
        String path = apiClient.expandPath("/convert/xlsx/to/csv", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (outputEncoding != null)
        headerParams.add("outputEncoding", apiClient.parameterToString(outputEncoding));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to CSV, Multiple Worksheets
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format, with support for multiple worksheets.  Supports both XLSX and XLSB file Excel formats.  Returns multiple CSV files, one for each worksheet (tab) in the spreadsheet.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8. (optional)
     * @return CsvCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CsvCollection convertDocumentXlsxToCsvMulti(org.springframework.core.io.Resource inputFile, String outputEncoding) throws RestClientException {
        return convertDocumentXlsxToCsvMultiWithHttpInfo(inputFile, outputEncoding).getBody();
    }

    /**
     * Convert Excel XLSX Spreadsheet to CSV, Multiple Worksheets
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format, with support for multiple worksheets.  Supports both XLSX and XLSB file Excel formats.  Returns multiple CSV files, one for each worksheet (tab) in the spreadsheet.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8. (optional)
     * @return ResponseEntity&lt;CsvCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CsvCollection> convertDocumentXlsxToCsvMultiWithHttpInfo(org.springframework.core.io.Resource inputFile, String outputEncoding) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsvMulti");
        }
        
        String path = apiClient.expandPath("/convert/xlsx/to/csv/multi", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (outputEncoding != null)
        headerParams.add("outputEncoding", apiClient.parameterToString(outputEncoding));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CsvCollection> returnType = new ParameterizedTypeReference<CsvCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to HTML Document
     * Convert Office Excel Spreadsheet (XLSX) to HTML Document.  Converts all worksheets to HTML.  Supports both XLSX and XLSB Excel file formats.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentXlsxToHtml(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentXlsxToHtmlWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLSX Spreadsheet to HTML Document
     * Convert Office Excel Spreadsheet (XLSX) to HTML Document.  Converts all worksheets to HTML.  Supports both XLSX and XLSB Excel file formats.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentXlsxToHtmlWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToHtml");
        }
        
        String path = apiClient.expandPath("/convert/xlsx/to/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to PDF
     * Convert Office Excel Workbooks (XLSX) to standard PDF.  Converts all worksheets in the workbook to PDF.  Supports both XLSX and XLSB Excel file formats.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentXlsxToPdf(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentXlsxToPdfWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLSX Spreadsheet to PDF
     * Convert Office Excel Workbooks (XLSX) to standard PDF.  Converts all worksheets in the workbook to PDF.  Supports both XLSX and XLSB Excel file formats.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentXlsxToPdfWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPdf");
        }
        
        String path = apiClient.expandPath("/convert/xlsx/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLSX spreadsheet to PNG image array
     * Converts an Excel Spreadsheet (XLSX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return XlsxToPngResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XlsxToPngResult convertDocumentXlsxToPng(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentXlsxToPngWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLSX spreadsheet to PNG image array
     * Converts an Excel Spreadsheet (XLSX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;XlsxToPngResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XlsxToPngResult> convertDocumentXlsxToPngWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPng");
        }
        
        String path = apiClient.expandPath("/convert/xlsx/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XlsxToPngResult> returnType = new ParameterizedTypeReference<XlsxToPngResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to Text (txt)
     * Convert Office Excel Workbooks (XLSX) to standard Text.  Converts all worksheets in the workbook to Text.  Supports both XLSX and XLSB file formats.  When a spreadsheet contains multiple worksheets, will export all of the text from all of the worksheets.  If you wish to export the text from only one worksheet, try using the Split XLSX API to split the spreadsheet into multiple worksheet files, and then run XLSX to Text on the individual worksheet file that you need to extract the text from.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return TextConversionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextConversionResult convertDocumentXlsxToTxt(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentXlsxToTxtWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLSX Spreadsheet to Text (txt)
     * Convert Office Excel Workbooks (XLSX) to standard Text.  Converts all worksheets in the workbook to Text.  Supports both XLSX and XLSB file formats.  When a spreadsheet contains multiple worksheets, will export all of the text from all of the worksheets.  If you wish to export the text from only one worksheet, try using the Split XLSX API to split the spreadsheet into multiple worksheet files, and then run XLSX to Text on the individual worksheet file that you need to extract the text from.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;TextConversionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextConversionResult> convertDocumentXlsxToTxtWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToTxt");
        }
        
        String path = apiClient.expandPath("/convert/xlsx/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextConversionResult> returnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to Legacy Excel XLS (97-03)
     * Convert/downgrade modern Office Excel XLSX Spreadsheet to the legacy Excel XLS (97-2003 Format) format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDocumentXlsxToXls(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDocumentXlsxToXlsWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLSX Spreadsheet to Legacy Excel XLS (97-03)
     * Convert/downgrade modern Office Excel XLSX Spreadsheet to the legacy Excel XLS (97-2003 Format) format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDocumentXlsxToXlsWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToXls");
        }
        
        String path = apiClient.expandPath("/convert/xlsx/to/xls", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
