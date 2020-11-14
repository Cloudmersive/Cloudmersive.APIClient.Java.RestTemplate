package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import java.io.File;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.EditHtmlApi")
public class EditHtmlApi {
    private ApiClient apiClient;

    public EditHtmlApi() {
        this(new ApiClient());
    }

    @Autowired
    public EditHtmlApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Append a Heading to an HTML Document
     * Appends a heading to the end of an HTML document.
     * <p><b>200</b> - OK
     * @param headingText The text content to be used in the header. (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input. (optional)
     * @param headingSize Optional: The heading size number. Default is 1. Accepts values between 1 and 6. (optional)
     * @param cssStyle Optional: The CSS style for the heading. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editHtmlHtmlAppendHeading(String headingText, String inputFileUrl, Integer headingSize, String cssStyle, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editHtmlHtmlAppendHeadingWithHttpInfo(headingText, inputFileUrl, headingSize, cssStyle, inputFile).getBody();
    }

    /**
     * Append a Heading to an HTML Document
     * Appends a heading to the end of an HTML document.
     * <p><b>200</b> - OK
     * @param headingText The text content to be used in the header. (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input. (optional)
     * @param headingSize Optional: The heading size number. Default is 1. Accepts values between 1 and 6. (optional)
     * @param cssStyle Optional: The CSS style for the heading. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editHtmlHtmlAppendHeadingWithHttpInfo(String headingText, String inputFileUrl, Integer headingSize, String cssStyle, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'headingText' is set
        if (headingText == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'headingText' when calling editHtmlHtmlAppendHeading");
        }
        
        String path = apiClient.expandPath("/convert/edit/html/append/heading", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (headingText != null)
        headerParams.add("headingText", apiClient.parameterToString(headingText));
        if (headingSize != null)
        headerParams.add("headingSize", apiClient.parameterToString(headingSize));
        if (cssStyle != null)
        headerParams.add("cssStyle", apiClient.parameterToString(cssStyle));

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

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Append an Image to an HTML Document from a URL
     * Appends an image to the end of an HTML document using a URL.
     * <p><b>200</b> - OK
     * @param imageUrl The URL for the image. (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input. (optional)
     * @param cssStyle Optional: CSS style for the image. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editHtmlHtmlAppendImageFromUrl(String imageUrl, String inputFileUrl, String cssStyle, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editHtmlHtmlAppendImageFromUrlWithHttpInfo(imageUrl, inputFileUrl, cssStyle, inputFile).getBody();
    }

    /**
     * Append an Image to an HTML Document from a URL
     * Appends an image to the end of an HTML document using a URL.
     * <p><b>200</b> - OK
     * @param imageUrl The URL for the image. (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input. (optional)
     * @param cssStyle Optional: CSS style for the image. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editHtmlHtmlAppendImageFromUrlWithHttpInfo(String imageUrl, String inputFileUrl, String cssStyle, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageUrl' is set
        if (imageUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageUrl' when calling editHtmlHtmlAppendImageFromUrl");
        }
        
        String path = apiClient.expandPath("/convert/edit/html/append/image/from-url", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (imageUrl != null)
        headerParams.add("imageUrl", apiClient.parameterToString(imageUrl));
        if (cssStyle != null)
        headerParams.add("cssStyle", apiClient.parameterToString(cssStyle));

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

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Append a Base64 Inline Image to an HTML Document
     * Appends a base64 inline image to the end of an HTML document from an input file or URL.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input. (optional)
     * @param imageUrl Optional: Image URL to be appended as base64 inline image. (optional)
     * @param cssStyle Optional: CSS style for the image. (optional)
     * @param imageExtension Optional: The extension (JPG, PNG, GIF, etc.) of the image file. Recommended if uploading an imageFile directly, instead of using imageUrl. If no extension can be determined, will default to JPG. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @param imageFile Optional: Image file to be appended as base64 inline image. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editHtmlHtmlAppendImageInline(String inputFileUrl, String imageUrl, String cssStyle, String imageExtension, org.springframework.core.io.Resource inputFile, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return editHtmlHtmlAppendImageInlineWithHttpInfo(inputFileUrl, imageUrl, cssStyle, imageExtension, inputFile, imageFile).getBody();
    }

    /**
     * Append a Base64 Inline Image to an HTML Document
     * Appends a base64 inline image to the end of an HTML document from an input file or URL.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input. (optional)
     * @param imageUrl Optional: Image URL to be appended as base64 inline image. (optional)
     * @param cssStyle Optional: CSS style for the image. (optional)
     * @param imageExtension Optional: The extension (JPG, PNG, GIF, etc.) of the image file. Recommended if uploading an imageFile directly, instead of using imageUrl. If no extension can be determined, will default to JPG. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @param imageFile Optional: Image file to be appended as base64 inline image. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editHtmlHtmlAppendImageInlineWithHttpInfo(String inputFileUrl, String imageUrl, String cssStyle, String imageExtension, org.springframework.core.io.Resource inputFile, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/convert/edit/html/append/image/inline", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (imageUrl != null)
        headerParams.add("imageUrl", apiClient.parameterToString(imageUrl));
        if (cssStyle != null)
        headerParams.add("cssStyle", apiClient.parameterToString(cssStyle));
        if (imageExtension != null)
        headerParams.add("imageExtension", apiClient.parameterToString(imageExtension));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);
        if (imageFile != null)
            formParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
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
     * Append a Paragraph to an HTML Document
     * Appends a paragraph to the end of an HTML document.
     * <p><b>200</b> - OK
     * @param paragraphText The text content to be used in the paragraph. (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input. (optional)
     * @param cssStyle Optional: The CSS style for the paragraph. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editHtmlHtmlAppendParagraph(String paragraphText, String inputFileUrl, String cssStyle, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editHtmlHtmlAppendParagraphWithHttpInfo(paragraphText, inputFileUrl, cssStyle, inputFile).getBody();
    }

    /**
     * Append a Paragraph to an HTML Document
     * Appends a paragraph to the end of an HTML document.
     * <p><b>200</b> - OK
     * @param paragraphText The text content to be used in the paragraph. (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input. (optional)
     * @param cssStyle Optional: The CSS style for the paragraph. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editHtmlHtmlAppendParagraphWithHttpInfo(String paragraphText, String inputFileUrl, String cssStyle, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'paragraphText' is set
        if (paragraphText == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'paragraphText' when calling editHtmlHtmlAppendParagraph");
        }
        
        String path = apiClient.expandPath("/convert/edit/html/append/paragraph", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (paragraphText != null)
        headerParams.add("paragraphText", apiClient.parameterToString(paragraphText));
        if (cssStyle != null)
        headerParams.add("cssStyle", apiClient.parameterToString(cssStyle));

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

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Create a Blank HTML Document
     * Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.
     * <p><b>200</b> - OK
     * @param title Optional: The title of the HTML document (optional)
     * @param cssUrl Optional: A CSS style URL to be added to the document. (optional)
     * @param cssInline Optional: An inline CSS style to be added to the document. (optional)
     * @param javascriptUrl Optional: Javascript URL to be added to the document. (optional)
     * @param javascriptInline Optional: Inline Javascript to be added to the document. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editHtmlHtmlCreateBlankDocument(String title, String cssUrl, String cssInline, String javascriptUrl, String javascriptInline) throws RestClientException {
        return editHtmlHtmlCreateBlankDocumentWithHttpInfo(title, cssUrl, cssInline, javascriptUrl, javascriptInline).getBody();
    }

    /**
     * Create a Blank HTML Document
     * Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.
     * <p><b>200</b> - OK
     * @param title Optional: The title of the HTML document (optional)
     * @param cssUrl Optional: A CSS style URL to be added to the document. (optional)
     * @param cssInline Optional: An inline CSS style to be added to the document. (optional)
     * @param javascriptUrl Optional: Javascript URL to be added to the document. (optional)
     * @param javascriptInline Optional: Inline Javascript to be added to the document. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editHtmlHtmlCreateBlankDocumentWithHttpInfo(String title, String cssUrl, String cssInline, String javascriptUrl, String javascriptInline) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/convert/edit/html/create/blank", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (title != null)
        headerParams.add("title", apiClient.parameterToString(title));
        if (cssUrl != null)
        headerParams.add("cssUrl", apiClient.parameterToString(cssUrl));
        if (cssInline != null)
        headerParams.add("cssInline", apiClient.parameterToString(cssInline));
        if (javascriptUrl != null)
        headerParams.add("javascriptUrl", apiClient.parameterToString(javascriptUrl));
        if (javascriptInline != null)
        headerParams.add("javascriptInline", apiClient.parameterToString(javascriptInline));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
