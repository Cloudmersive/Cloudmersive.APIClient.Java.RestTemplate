package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ViewerToolsApi extends BaseApi {

    public ViewerToolsApi() {
        super(new ApiClient());
    }

    public ViewerToolsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Create a web-based viewer
     * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param width Optional; width of the output viewer in pixels (optional)
     * @param height Optional; height of the output viewer in pixels (optional)
     * @return ViewerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ViewerResponse viewerToolsCreateSimple(org.springframework.core.io.Resource inputFile, Integer width, Integer height) throws RestClientException {
        return viewerToolsCreateSimpleWithHttpInfo(inputFile, width, height).getBody();
    }

    /**
     * Create a web-based viewer
     * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param width Optional; width of the output viewer in pixels (optional)
     * @param height Optional; height of the output viewer in pixels (optional)
     * @return ResponseEntity&lt;ViewerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ViewerResponse> viewerToolsCreateSimpleWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer width, Integer height) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling viewerToolsCreateSimple");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (width != null)
        localVarHeaderParams.add("width", apiClient.parameterToString(width));
        if (height != null)
        localVarHeaderParams.add("height", apiClient.parameterToString(height));

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

        ParameterizedTypeReference<ViewerResponse> localReturnType = new ParameterizedTypeReference<ViewerResponse>() {};
        return apiClient.invokeAPI("/convert/viewer/create/web/simple", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "application/json", "text/json", "application/xml", "text/xml"
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
