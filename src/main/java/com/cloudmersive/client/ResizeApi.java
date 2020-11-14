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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:26.061-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.ResizeApi")
public class ResizeApi {
    private ApiClient apiClient;

    public ResizeApi() {
        this(new ApiClient());
    }

    @Autowired
    public ResizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Resize an image while preserving aspect ratio
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio.  Resize is EXIF-aware.
     * <p><b>200</b> - OK
     * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width (required)
     * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] resizePost(Integer maxWidth, Integer maxHeight, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return resizePostWithHttpInfo(maxWidth, maxHeight, imageFile).getBody();
    }

    /**
     * Resize an image while preserving aspect ratio
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio.  Resize is EXIF-aware.
     * <p><b>200</b> - OK
     * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width (required)
     * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> resizePostWithHttpInfo(Integer maxWidth, Integer maxHeight, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'maxWidth' is set
        if (maxWidth == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maxWidth' when calling resizePost");
        }
        
        // verify the required parameter 'maxHeight' is set
        if (maxHeight == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maxHeight' when calling resizePost");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling resizePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("maxWidth", maxWidth);
        uriVariables.put("maxHeight", maxHeight);
        String path = apiClient.expandPath("/image/resize/preserveAspectRatio/{maxWidth}/{maxHeight}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
     * Resize an image
     * Resize an image to a specific width and specific height.  Resize is EXIF-aware.
     * <p><b>200</b> - OK
     * @param width Width of the output image - final image will be exactly this width (required)
     * @param height Height of the output image - final image will be exactly this height (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] resizeResizeSimple(Integer width, Integer height, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return resizeResizeSimpleWithHttpInfo(width, height, imageFile).getBody();
    }

    /**
     * Resize an image
     * Resize an image to a specific width and specific height.  Resize is EXIF-aware.
     * <p><b>200</b> - OK
     * @param width Width of the output image - final image will be exactly this width (required)
     * @param height Height of the output image - final image will be exactly this height (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> resizeResizeSimpleWithHttpInfo(Integer width, Integer height, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'width' is set
        if (width == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'width' when calling resizeResizeSimple");
        }
        
        // verify the required parameter 'height' is set
        if (height == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'height' when calling resizeResizeSimple");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling resizeResizeSimple");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("width", width);
        uriVariables.put("height", height);
        String path = apiClient.expandPath("/image/resize/target/{width}/{height}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
