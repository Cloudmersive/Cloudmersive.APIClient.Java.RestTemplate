package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.Base64DecodeRequest;
import com.cloudmersive.client.rt.model.Base64DecodeResponse;
import com.cloudmersive.client.rt.model.Base64DetectRequest;
import com.cloudmersive.client.rt.model.Base64DetectResponse;
import com.cloudmersive.client.rt.model.Base64EncodeRequest;
import com.cloudmersive.client.rt.model.Base64EncodeResponse;
import com.cloudmersive.client.rt.model.ChangeLineEndingResponse;
import com.cloudmersive.client.rt.model.DetectLineEndingsResponse;
import java.io.File;
import com.cloudmersive.client.rt.model.FindStringRegexRequest;
import com.cloudmersive.client.rt.model.FindStringRegexResponse;
import com.cloudmersive.client.rt.model.FindStringSimpleRequest;
import com.cloudmersive.client.rt.model.FindStringSimpleResponse;
import com.cloudmersive.client.rt.model.RemoveHtmlFromTextRequest;
import com.cloudmersive.client.rt.model.RemoveHtmlFromTextResponse;
import com.cloudmersive.client.rt.model.RemoveWhitespaceFromTextRequest;
import com.cloudmersive.client.rt.model.RemoveWhitespaceFromTextResponse;
import com.cloudmersive.client.rt.model.ReplaceStringRegexRequest;
import com.cloudmersive.client.rt.model.ReplaceStringRegexResponse;
import com.cloudmersive.client.rt.model.ReplaceStringSimpleRequest;
import com.cloudmersive.client.rt.model.ReplaceStringSimpleResponse;
import com.cloudmersive.client.rt.model.TextEncodingDetectResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.EditTextApi")
public class EditTextApi {
    private ApiClient apiClient;

    public EditTextApi() {
        this(new ApiClient());
    }

    @Autowired
    public EditTextApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Base 64 decode, convert base 64 string to binary content
     * Decodes / converts base 64 UTF-8 text string to binary content
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return Base64DecodeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Base64DecodeResponse editTextBase64Decode(Base64DecodeRequest request) throws RestClientException {
        return editTextBase64DecodeWithHttpInfo(request).getBody();
    }

    /**
     * Base 64 decode, convert base 64 string to binary content
     * Decodes / converts base 64 UTF-8 text string to binary content
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;Base64DecodeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Base64DecodeResponse> editTextBase64DecodeWithHttpInfo(Base64DecodeRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextBase64Decode");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/encoding/base64/decode", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Base64DecodeResponse> returnType = new ParameterizedTypeReference<Base64DecodeResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Detect, check if text string is base 64 encoded
     * Checks, detects if input string is base 64 encoded
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return Base64DetectResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Base64DetectResponse editTextBase64Detect(Base64DetectRequest request) throws RestClientException {
        return editTextBase64DetectWithHttpInfo(request).getBody();
    }

    /**
     * Detect, check if text string is base 64 encoded
     * Checks, detects if input string is base 64 encoded
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;Base64DetectResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Base64DetectResponse> editTextBase64DetectWithHttpInfo(Base64DetectRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextBase64Detect");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/encoding/base64/detect", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Base64DetectResponse> returnType = new ParameterizedTypeReference<Base64DetectResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Base 64 encode, convert binary or file data to a text string
     * Encodes / converts binary or file data to a text string
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return Base64EncodeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Base64EncodeResponse editTextBase64Encode(Base64EncodeRequest request) throws RestClientException {
        return editTextBase64EncodeWithHttpInfo(request).getBody();
    }

    /**
     * Base 64 encode, convert binary or file data to a text string
     * Encodes / converts binary or file data to a text string
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;Base64EncodeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Base64EncodeResponse> editTextBase64EncodeWithHttpInfo(Base64EncodeRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextBase64Encode");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/encoding/base64/encode", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Base64EncodeResponse> returnType = new ParameterizedTypeReference<Base64EncodeResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Set, change line endings of a text file
     * Sets the line ending type of a text file; set to Windows, Unix or Mac.
     * <p><b>200</b> - OK
     * @param lineEndingType Required; &#39;Windows&#39; will use carriage return and line feed, &#39;Unix&#39; will use newline, and &#39;Mac&#39; will use carriage return (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ChangeLineEndingResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChangeLineEndingResponse editTextChangeLineEndings(String lineEndingType, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editTextChangeLineEndingsWithHttpInfo(lineEndingType, inputFile).getBody();
    }

    /**
     * Set, change line endings of a text file
     * Sets the line ending type of a text file; set to Windows, Unix or Mac.
     * <p><b>200</b> - OK
     * @param lineEndingType Required; &#39;Windows&#39; will use carriage return and line feed, &#39;Unix&#39; will use newline, and &#39;Mac&#39; will use carriage return (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;ChangeLineEndingResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChangeLineEndingResponse> editTextChangeLineEndingsWithHttpInfo(String lineEndingType, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'lineEndingType' is set
        if (lineEndingType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineEndingType' when calling editTextChangeLineEndings");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editTextChangeLineEndings");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/line-endings/change", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (lineEndingType != null)
        headerParams.add("lineEndingType", apiClient.parameterToString(lineEndingType));

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

        ParameterizedTypeReference<ChangeLineEndingResponse> returnType = new ParameterizedTypeReference<ChangeLineEndingResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Detect line endings of a text file
     * Detect line ending type (Windows, Unix or Mac) of an input file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DetectLineEndingsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetectLineEndingsResponse editTextDetectLineEndings(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editTextDetectLineEndingsWithHttpInfo(inputFile).getBody();
    }

    /**
     * Detect line endings of a text file
     * Detect line ending type (Windows, Unix or Mac) of an input file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DetectLineEndingsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetectLineEndingsResponse> editTextDetectLineEndingsWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editTextDetectLineEndings");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/line-endings/detect", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<DetectLineEndingsResponse> returnType = new ParameterizedTypeReference<DetectLineEndingsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Find a regular expression regex in text input
     * Find all occurrences of the input regular expression in the input content, and returns the matches
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return FindStringRegexResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FindStringRegexResponse editTextFindRegex(FindStringRegexRequest request) throws RestClientException {
        return editTextFindRegexWithHttpInfo(request).getBody();
    }

    /**
     * Find a regular expression regex in text input
     * Find all occurrences of the input regular expression in the input content, and returns the matches
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;FindStringRegexResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FindStringRegexResponse> editTextFindRegexWithHttpInfo(FindStringRegexRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextFindRegex");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/find/regex", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<FindStringRegexResponse> returnType = new ParameterizedTypeReference<FindStringRegexResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Find a string in text input
     * Finds all occurrences of the input string in the input content, and returns the matches
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return FindStringSimpleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FindStringSimpleResponse editTextFindSimple(FindStringSimpleRequest request) throws RestClientException {
        return editTextFindSimpleWithHttpInfo(request).getBody();
    }

    /**
     * Find a string in text input
     * Finds all occurrences of the input string in the input content, and returns the matches
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;FindStringSimpleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FindStringSimpleResponse> editTextFindSimpleWithHttpInfo(FindStringSimpleRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextFindSimple");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/find/string", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<FindStringSimpleResponse> returnType = new ParameterizedTypeReference<FindStringSimpleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Remove whitespace from text string
     * Removes all whitespace from text, leaving behind only non-whitespace characters.  Whitespace includes newlines, spaces and other whitespace characters.
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return RemoveWhitespaceFromTextResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RemoveWhitespaceFromTextResponse editTextRemoveAllWhitespace(RemoveWhitespaceFromTextRequest request) throws RestClientException {
        return editTextRemoveAllWhitespaceWithHttpInfo(request).getBody();
    }

    /**
     * Remove whitespace from text string
     * Removes all whitespace from text, leaving behind only non-whitespace characters.  Whitespace includes newlines, spaces and other whitespace characters.
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;RemoveWhitespaceFromTextResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RemoveWhitespaceFromTextResponse> editTextRemoveAllWhitespaceWithHttpInfo(RemoveWhitespaceFromTextRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextRemoveAllWhitespace");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/remove/whitespace/all", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<RemoveWhitespaceFromTextResponse> returnType = new ParameterizedTypeReference<RemoveWhitespaceFromTextResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Remove HTML from text string
     * Removes HTML from text, leaving behind only text.  Formatted text will become plain text.  Important for protecting against HTML and Cross-Site-Scripting attacks.
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return RemoveHtmlFromTextResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RemoveHtmlFromTextResponse editTextRemoveHtml(RemoveHtmlFromTextRequest request) throws RestClientException {
        return editTextRemoveHtmlWithHttpInfo(request).getBody();
    }

    /**
     * Remove HTML from text string
     * Removes HTML from text, leaving behind only text.  Formatted text will become plain text.  Important for protecting against HTML and Cross-Site-Scripting attacks.
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;RemoveHtmlFromTextResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RemoveHtmlFromTextResponse> editTextRemoveHtmlWithHttpInfo(RemoveHtmlFromTextRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextRemoveHtml");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/remove/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<RemoveHtmlFromTextResponse> returnType = new ParameterizedTypeReference<RemoveHtmlFromTextResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Replace a string in text with a regex regular expression string
     * Replaces all occurrences of the input regular expression regex string in the input content, and returns the result
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ReplaceStringRegexResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReplaceStringRegexResponse editTextReplaceRegex(ReplaceStringRegexRequest request) throws RestClientException {
        return editTextReplaceRegexWithHttpInfo(request).getBody();
    }

    /**
     * Replace a string in text with a regex regular expression string
     * Replaces all occurrences of the input regular expression regex string in the input content, and returns the result
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;ReplaceStringRegexResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReplaceStringRegexResponse> editTextReplaceRegexWithHttpInfo(ReplaceStringRegexRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextReplaceRegex");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/replace/regex", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ReplaceStringRegexResponse> returnType = new ParameterizedTypeReference<ReplaceStringRegexResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Replace a string in text with another string value
     * Replaces all occurrences of the input string in the input content, and returns the result
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ReplaceStringSimpleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReplaceStringSimpleResponse editTextReplaceSimple(ReplaceStringSimpleRequest request) throws RestClientException {
        return editTextReplaceSimpleWithHttpInfo(request).getBody();
    }

    /**
     * Replace a string in text with another string value
     * Replaces all occurrences of the input string in the input content, and returns the result
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;ReplaceStringSimpleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReplaceStringSimpleResponse> editTextReplaceSimpleWithHttpInfo(ReplaceStringSimpleRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextReplaceSimple");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/replace/string", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ReplaceStringSimpleResponse> returnType = new ParameterizedTypeReference<ReplaceStringSimpleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Detect text encoding of file
     * Checks text encoding of file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return TextEncodingDetectResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextEncodingDetectResponse editTextTextEncodingDetect(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editTextTextEncodingDetectWithHttpInfo(inputFile).getBody();
    }

    /**
     * Detect text encoding of file
     * Checks text encoding of file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;TextEncodingDetectResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextEncodingDetectResponse> editTextTextEncodingDetectWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editTextTextEncodingDetect");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/encoding/detect", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<TextEncodingDetectResponse> returnType = new ParameterizedTypeReference<TextEncodingDetectResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Trim leading and trailing whitespace from text string
     * Trim leading and trailing whitespace from text, leaving behind a trimmed string.  Whitespace includes newlines, spaces and other whitespace characters.
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return RemoveWhitespaceFromTextResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RemoveWhitespaceFromTextResponse editTextTrimWhitespace(RemoveWhitespaceFromTextRequest request) throws RestClientException {
        return editTextTrimWhitespaceWithHttpInfo(request).getBody();
    }

    /**
     * Trim leading and trailing whitespace from text string
     * Trim leading and trailing whitespace from text, leaving behind a trimmed string.  Whitespace includes newlines, spaces and other whitespace characters.
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;RemoveWhitespaceFromTextResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RemoveWhitespaceFromTextResponse> editTextTrimWhitespaceWithHttpInfo(RemoveWhitespaceFromTextRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editTextTrimWhitespace");
        }
        
        String path = apiClient.expandPath("/convert/edit/text/remove/whitespace/trim", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<RemoveWhitespaceFromTextResponse> returnType = new ParameterizedTypeReference<RemoveWhitespaceFromTextResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
