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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:12.411-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.ReceiptsApi")
public class ReceiptsApi {
    private ApiClient apiClient;

    public ReceiptsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ReceiptsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert a photo of a receipt into a CSV file containing structured information from the receipt
     * Leverage Deep Learning to automatically turn a photo of a receipt into a CSV file containing the structured information from the receipt.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public Object receiptsPhotoToCSV(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return receiptsPhotoToCSVWithHttpInfo(imageFile).getBody();
    }

    /**
     * Convert a photo of a receipt into a CSV file containing structured information from the receipt
     * Leverage Deep Learning to automatically turn a photo of a receipt into a CSV file containing the structured information from the receipt.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Object> receiptsPhotoToCSVWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling receiptsPhotoToCSV");
        }
        
        String path = apiClient.expandPath("/ocr/receipts/photo/to/csv", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
