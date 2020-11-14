package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:19.979-08:00[America/Los_Angeles]")
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
     * Replace string in Word DOCX document
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
     * Replace string in Word DOCX document
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
     * Replace string in PowerPoint PPTX presentation
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
     * Replace string in PowerPoint PPTX presentation
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
