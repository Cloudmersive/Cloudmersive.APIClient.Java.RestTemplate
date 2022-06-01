package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.DocumentTransformEditSession;
import com.cloudmersive.client.rt.model.DocxTableTableFillMultiRequest;
import com.cloudmersive.client.rt.model.DocxTableTableFillRequest;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.TransformDocumentApi")
public class TransformDocumentApi {
    private ApiClient apiClient;

    public TransformDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransformDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Replace string in Word DOCX document, return result
     * Replace all instances of a string in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced (required)
     * @param replaceString String to replace the matched values with (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). (optional)
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] transformDocumentDocxReplace(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return transformDocumentDocxReplaceWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile).getBody();
    }

    /**
     * Replace string in Word DOCX document, return result
     * Replace all instances of a string in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced (required)
     * @param replaceString String to replace the matched values with (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). (optional)
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> transformDocumentDocxReplaceWithHttpInfo(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'matchString' when calling transformDocumentDocxReplace");
        }
        
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replaceString' when calling transformDocumentDocxReplace");
        }
        
        String path = apiClient.expandPath("/convert/transform/docx/replace-all", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        headerParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        headerParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        headerParams.add("matchCase", apiClient.parameterToString(matchCase));

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
     * Replace string in Word DOCX document, return edit session
     * Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced (required)
     * @param replaceString String to replace the matched values with (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). (optional)
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return DocumentTransformEditSession
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentTransformEditSession transformDocumentDocxReplaceEditSession(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return transformDocumentDocxReplaceEditSessionWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile).getBody();
    }

    /**
     * Replace string in Word DOCX document, return edit session
     * Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced (required)
     * @param replaceString String to replace the matched values with (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). (optional)
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;DocumentTransformEditSession&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentTransformEditSession> transformDocumentDocxReplaceEditSessionWithHttpInfo(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'matchString' when calling transformDocumentDocxReplaceEditSession");
        }
        
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replaceString' when calling transformDocumentDocxReplaceEditSession");
        }
        
        String path = apiClient.expandPath("/convert/transform/docx/replace-all/edit-session", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        headerParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        headerParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        headerParams.add("matchCase", apiClient.parameterToString(matchCase));

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

        ParameterizedTypeReference<DocumentTransformEditSession> returnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Fill in data in a table in a Word DOCX document, return result
     * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] transformDocumentDocxTableFillIn(DocxTableTableFillRequest request) throws RestClientException {
        return transformDocumentDocxTableFillInWithHttpInfo(request).getBody();
    }

    /**
     * Fill in data in a table in a Word DOCX document, return result
     * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> transformDocumentDocxTableFillInWithHttpInfo(DocxTableTableFillRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling transformDocumentDocxTableFillIn");
        }
        
        String path = apiClient.expandPath("/convert/transform/docx/table/fill/data", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Fill in data in a table in a Word DOCX document, return edit session
     * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return DocumentTransformEditSession
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentTransformEditSession transformDocumentDocxTableFillInEditSession(DocxTableTableFillRequest request) throws RestClientException {
        return transformDocumentDocxTableFillInEditSessionWithHttpInfo(request).getBody();
    }

    /**
     * Fill in data in a table in a Word DOCX document, return edit session
     * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ResponseEntity&lt;DocumentTransformEditSession&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentTransformEditSession> transformDocumentDocxTableFillInEditSessionWithHttpInfo(DocxTableTableFillRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling transformDocumentDocxTableFillInEditSession");
        }
        
        String path = apiClient.expandPath("/convert/transform/docx/table/fill/data/edit-session", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<DocumentTransformEditSession> returnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Fill in data in multiple tables in a Word DOCX document, return result
     * Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] transformDocumentDocxTableFillInMulti(DocxTableTableFillMultiRequest request) throws RestClientException {
        return transformDocumentDocxTableFillInMultiWithHttpInfo(request).getBody();
    }

    /**
     * Fill in data in multiple tables in a Word DOCX document, return result
     * Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> transformDocumentDocxTableFillInMultiWithHttpInfo(DocxTableTableFillMultiRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling transformDocumentDocxTableFillInMulti");
        }
        
        String path = apiClient.expandPath("/convert/transform/docx/table/fill/data/multi", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Replace string in PowerPoint PPTX presentation, return result
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced (required)
     * @param replaceString String to replace the matched values with (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). (optional)
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] transformDocumentPptxReplace(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return transformDocumentPptxReplaceWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile).getBody();
    }

    /**
     * Replace string in PowerPoint PPTX presentation, return result
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced (required)
     * @param replaceString String to replace the matched values with (required)
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). (optional)
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false. (optional)
     * @param inputFile Optional: Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> transformDocumentPptxReplaceWithHttpInfo(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'matchString' when calling transformDocumentPptxReplace");
        }
        
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replaceString' when calling transformDocumentPptxReplace");
        }
        
        String path = apiClient.expandPath("/convert/transform/pptx/replace-all", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        headerParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        headerParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        headerParams.add("matchCase", apiClient.parameterToString(matchCase));

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
