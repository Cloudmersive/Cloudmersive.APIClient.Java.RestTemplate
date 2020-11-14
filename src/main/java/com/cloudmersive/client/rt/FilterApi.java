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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:16.765-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.FilterApi")
public class FilterApi {
    private ApiClient apiClient;

    public FilterApi() {
        this(new ApiClient());
    }

    @Autowired
    public FilterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert image to black-and-white grayscale
     * Remove color from the image by converting to a grayscale, black-and-white image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] filterBlackAndWhite(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return filterBlackAndWhiteWithHttpInfo(imageFile).getBody();
    }

    /**
     * Convert image to black-and-white grayscale
     * Remove color from the image by converting to a grayscale, black-and-white image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> filterBlackAndWhiteWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling filterBlackAndWhite");
        }
        
        String path = apiClient.expandPath("/image/filter/black-and-white", Collections.<String, Object>emptyMap());

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
     * Despeckle to remove point noise from the image
     * Remove point noise / despeckle the input image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] filterDespeckle(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return filterDespeckleWithHttpInfo(imageFile).getBody();
    }

    /**
     * Despeckle to remove point noise from the image
     * Remove point noise / despeckle the input image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> filterDespeckleWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling filterDespeckle");
        }
        
        String path = apiClient.expandPath("/image/filter/despeckle", Collections.<String, Object>emptyMap());

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
     * Detect and highlight edges in an image
     * Perform an edge detection operation on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the edge detection operation; a larger radius will produce a greater effect (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] filterEdgeDetect(Integer radius, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return filterEdgeDetectWithHttpInfo(radius, imageFile).getBody();
    }

    /**
     * Detect and highlight edges in an image
     * Perform an edge detection operation on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the edge detection operation; a larger radius will produce a greater effect (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> filterEdgeDetectWithHttpInfo(Integer radius, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radius' when calling filterEdgeDetect");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling filterEdgeDetect");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        String path = apiClient.expandPath("/image/filter/edge-detect/{radius}", uriVariables);

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
     * Emboss an image
     * Perform an emboss operation on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the emboss operation; a larger radius will produce a greater effect (required)
     * @param sigma Sigma, or variance, of the emboss operation (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] filterEmboss(Integer radius, Integer sigma, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return filterEmbossWithHttpInfo(radius, sigma, imageFile).getBody();
    }

    /**
     * Emboss an image
     * Perform an emboss operation on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the emboss operation; a larger radius will produce a greater effect (required)
     * @param sigma Sigma, or variance, of the emboss operation (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> filterEmbossWithHttpInfo(Integer radius, Integer sigma, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radius' when calling filterEmboss");
        }
        
        // verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sigma' when calling filterEmboss");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling filterEmboss");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        String path = apiClient.expandPath("/image/filter/emboss/{radius}/{sigma}", uriVariables);

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
     * Perform a guassian blur on the input image
     * Perform a gaussian blur on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect (required)
     * @param sigma Sigma, or variance, of the gaussian blur operation (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] filterGaussianBlur(Integer radius, Integer sigma, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return filterGaussianBlurWithHttpInfo(radius, sigma, imageFile).getBody();
    }

    /**
     * Perform a guassian blur on the input image
     * Perform a gaussian blur on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect (required)
     * @param sigma Sigma, or variance, of the gaussian blur operation (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> filterGaussianBlurWithHttpInfo(Integer radius, Integer sigma, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radius' when calling filterGaussianBlur");
        }
        
        // verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sigma' when calling filterGaussianBlur");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling filterGaussianBlur");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        String path = apiClient.expandPath("/image/filter/blur/guassian/{radius}/{sigma}", uriVariables);

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
     * Perform a motion blur on the input image
     * Perform a motion blur on the input image at a specific angle
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect (required)
     * @param sigma Sigma, or variance, of the motion blur operation (required)
     * @param angle Angle of the motion blur in degrees (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] filterMotionBlur(Integer radius, Integer sigma, Integer angle, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return filterMotionBlurWithHttpInfo(radius, sigma, angle, imageFile).getBody();
    }

    /**
     * Perform a motion blur on the input image
     * Perform a motion blur on the input image at a specific angle
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect (required)
     * @param sigma Sigma, or variance, of the motion blur operation (required)
     * @param angle Angle of the motion blur in degrees (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> filterMotionBlurWithHttpInfo(Integer radius, Integer sigma, Integer angle, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radius' when calling filterMotionBlur");
        }
        
        // verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sigma' when calling filterMotionBlur");
        }
        
        // verify the required parameter 'angle' is set
        if (angle == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'angle' when calling filterMotionBlur");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling filterMotionBlur");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        uriVariables.put("angle", angle);
        String path = apiClient.expandPath("/image/filter/blur/motion/{radius}/{sigma}/{angle}", uriVariables);

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
     * Posterize the image by reducing distinct colors
     * Reduce the unique number of colors in the image to the specified level
     * <p><b>200</b> - OK
     * @param levels Number of unique colors to retain in the output image (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] filterPosterize(Integer levels, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return filterPosterizeWithHttpInfo(levels, imageFile).getBody();
    }

    /**
     * Posterize the image by reducing distinct colors
     * Reduce the unique number of colors in the image to the specified level
     * <p><b>200</b> - OK
     * @param levels Number of unique colors to retain in the output image (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> filterPosterizeWithHttpInfo(Integer levels, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'levels' is set
        if (levels == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'levels' when calling filterPosterize");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling filterPosterize");
        }
        
        String path = apiClient.expandPath("/image/filter/posterize", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "levels", levels));

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
     * Swirl distort the image
     * Swirl distort the image by the specified number of degrees
     * <p><b>200</b> - OK
     * @param degrees Degrees of swirl (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] filterSwirl(Integer degrees, org.springframework.core.io.Resource imageFile) throws RestClientException {
        return filterSwirlWithHttpInfo(degrees, imageFile).getBody();
    }

    /**
     * Swirl distort the image
     * Swirl distort the image by the specified number of degrees
     * <p><b>200</b> - OK
     * @param degrees Degrees of swirl (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> filterSwirlWithHttpInfo(Integer degrees, org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'degrees' is set
        if (degrees == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'degrees' when calling filterSwirl");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling filterSwirl");
        }
        
        String path = apiClient.expandPath("/image/filter/swirl", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "degrees", degrees));

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
