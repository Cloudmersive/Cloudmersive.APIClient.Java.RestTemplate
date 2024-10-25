package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TransformDocumentApi extends BaseApi {

    public TransformDocumentApi() {
        super(new ApiClient());
    }

    public TransformDocumentApi(ApiClient apiClient) {
        super(apiClient);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'matchString' when calling transformDocumentDocxReplace");
        }
        
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replaceString' when calling transformDocumentDocxReplace");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        localVarHeaderParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        localVarHeaderParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        localVarHeaderParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        localVarHeaderParams.add("matchCase", apiClient.parameterToString(matchCase));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/transform/docx/replace-all", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'matchString' when calling transformDocumentDocxReplaceEditSession");
        }
        
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replaceString' when calling transformDocumentDocxReplaceEditSession");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        localVarHeaderParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        localVarHeaderParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        localVarHeaderParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        localVarHeaderParams.add("matchCase", apiClient.parameterToString(matchCase));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DocumentTransformEditSession> localReturnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return apiClient.invokeAPI("/convert/transform/docx/replace-all/edit-session", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling transformDocumentDocxTableFillIn");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/transform/docx/table/fill/data", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling transformDocumentDocxTableFillInEditSession");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DocumentTransformEditSession> localReturnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return apiClient.invokeAPI("/convert/transform/docx/table/fill/data/edit-session", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling transformDocumentDocxTableFillInMulti");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/transform/docx/table/fill/data/multi", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'matchString' when calling transformDocumentPptxReplace");
        }
        
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replaceString' when calling transformDocumentPptxReplace");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        localVarHeaderParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        localVarHeaderParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        localVarHeaderParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        localVarHeaderParams.add("matchCase", apiClient.parameterToString(matchCase));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/transform/pptx/replace-all", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
