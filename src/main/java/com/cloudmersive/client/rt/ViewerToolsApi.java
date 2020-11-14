package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.rt.model.ViewerResponse;

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
@Component("com.cloudmersive.client.rt.ViewerToolsApi")
public class ViewerToolsApi {
    private ApiClient apiClient;

    public ViewerToolsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ViewerToolsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a web-based viewer
     * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ViewerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ViewerResponse viewerToolsCreateSimple(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return viewerToolsCreateSimpleWithHttpInfo(inputFile).getBody();
    }

    /**
     * Create a web-based viewer
     * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;ViewerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ViewerResponse> viewerToolsCreateSimpleWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling viewerToolsCreateSimple");
        }
        
        String path = apiClient.expandPath("/convert/viewer/create/web/simple", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ViewerResponse> returnType = new ParameterizedTypeReference<ViewerResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
