package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import java.io.File;
import com.cloudmersive.client.rt.model.FindSymbolResult;
import com.cloudmersive.client.rt.model.FineTextDetectionResult;
import com.cloudmersive.client.rt.model.ImageDescriptionResponse;
import com.cloudmersive.client.rt.model.ImageSimilarityHashDistanceRequest;
import com.cloudmersive.client.rt.model.ImageSimilarityHashDistanceResponse;
import com.cloudmersive.client.rt.model.ImageSimilarityHashResponse;
import com.cloudmersive.client.rt.model.ObjectDetectionResult;
import com.cloudmersive.client.rt.model.TextDetectionResult;
import com.cloudmersive.client.rt.model.VehicleLicensePlateDetectionResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RecognizeApi extends BaseApi {

    public RecognizeApi() {
        super(new ApiClient());
    }

    public RecognizeApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Describe an image in natural language
     * Generate an English language text description of the image as a sentence.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ImageDescriptionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImageDescriptionResponse recognizeDescribe(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return recognizeDescribeWithHttpInfo(imageFile).getBody();
    }

    /**
     * Describe an image in natural language
     * Generate an English language text description of the image as a sentence.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;ImageDescriptionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImageDescriptionResponse> recognizeDescribeWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling recognizeDescribe");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            localVarFormParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ImageDescriptionResponse> localReturnType = new ParameterizedTypeReference<ImageDescriptionResponse>() {};
        return apiClient.invokeAPI("/image/recognize/describe", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Detect and unskew a photo of a document
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations). (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] recognizeDetectAndUnskewDocument(org.springframework.core.io.Resource imageFile, String postProcessingEffect) throws RestClientException {
        return recognizeDetectAndUnskewDocumentWithHttpInfo(imageFile, postProcessingEffect).getBody();
    }

    /**
     * Detect and unskew a photo of a document
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations). (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> recognizeDetectAndUnskewDocumentWithHttpInfo(org.springframework.core.io.Resource imageFile, String postProcessingEffect) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling recognizeDetectAndUnskewDocument");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (postProcessingEffect != null)
        localVarHeaderParams.add("PostProcessingEffect", apiClient.parameterToString(postProcessingEffect));

        if (imageFile != null)
            localVarFormParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/image/recognize/detect-document/unskew", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Detect objects including types and locations in an image
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ObjectDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObjectDetectionResult recognizeDetectObjects(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return recognizeDetectObjectsWithHttpInfo(imageFile).getBody();
    }

    /**
     * Detect objects including types and locations in an image
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;ObjectDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObjectDetectionResult> recognizeDetectObjectsWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling recognizeDetectObjects");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            localVarFormParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ObjectDetectionResult> localReturnType = new ParameterizedTypeReference<ObjectDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-objects", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Detect people including locations in an image
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ObjectDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObjectDetectionResult recognizeDetectPeople(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return recognizeDetectPeopleWithHttpInfo(imageFile).getBody();
    }

    /**
     * Detect people including locations in an image
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;ObjectDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObjectDetectionResult> recognizeDetectPeopleWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling recognizeDetectPeople");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            localVarFormParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ObjectDetectionResult> localReturnType = new ParameterizedTypeReference<ObjectDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-people", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Detect fine text in a photo of a document
     * Identify the position, and size of small/fine text within a photograph of a document.  Identify the location of small text in a photo - such as words and other forms of high density text.  Can be used on a scan of a document or a photograph (e.g. smartphone camera) of a document, page or receipt.  For OCR purposes - please see our Deep Learning OCR APIs.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return FineTextDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FineTextDetectionResult recognizeDetectTextFine(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return recognizeDetectTextFineWithHttpInfo(imageFile).getBody();
    }

    /**
     * Detect fine text in a photo of a document
     * Identify the position, and size of small/fine text within a photograph of a document.  Identify the location of small text in a photo - such as words and other forms of high density text.  Can be used on a scan of a document or a photograph (e.g. smartphone camera) of a document, page or receipt.  For OCR purposes - please see our Deep Learning OCR APIs.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;FineTextDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FineTextDetectionResult> recognizeDetectTextFineWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling recognizeDetectTextFine");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            localVarFormParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<FineTextDetectionResult> localReturnType = new ParameterizedTypeReference<FineTextDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-text/fine", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Detect large text in a photo
     * Identify the position, and size of large text within a photograph.  Identify the location of large text in a photo - such as signs, titles, etc. and other forms of large, low-density text.  Not suitable for high-density text (e.g. scans of documents, receipts, etc.) for OCR purposes - for OCR, please see our Deep Learning OCR APIs.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return TextDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextDetectionResult recognizeDetectTextLarge(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return recognizeDetectTextLargeWithHttpInfo(imageFile).getBody();
    }

    /**
     * Detect large text in a photo
     * Identify the position, and size of large text within a photograph.  Identify the location of large text in a photo - such as signs, titles, etc. and other forms of large, low-density text.  Not suitable for high-density text (e.g. scans of documents, receipts, etc.) for OCR purposes - for OCR, please see our Deep Learning OCR APIs.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;TextDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextDetectionResult> recognizeDetectTextLargeWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling recognizeDetectTextLarge");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            localVarFormParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextDetectionResult> localReturnType = new ParameterizedTypeReference<TextDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-text/large", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Detect vehicle license plates in an image
     * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.  Supported image formats are JPG, PNG and BMP.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return VehicleLicensePlateDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VehicleLicensePlateDetectionResult recognizeDetectVehicleLicensePlates(org.springframework.core.io.Resource imageFile) throws RestClientException {
        return recognizeDetectVehicleLicensePlatesWithHttpInfo(imageFile).getBody();
    }

    /**
     * Detect vehicle license plates in an image
     * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.  Supported image formats are JPG, PNG and BMP.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ResponseEntity&lt;VehicleLicensePlateDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VehicleLicensePlateDetectionResult> recognizeDetectVehicleLicensePlatesWithHttpInfo(org.springframework.core.io.Resource imageFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling recognizeDetectVehicleLicensePlates");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            localVarFormParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<VehicleLicensePlateDetectionResult> localReturnType = new ParameterizedTypeReference<VehicleLicensePlateDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-vehicle-license-plates", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find the location of a symbol in an image
     * Determine if an image contains a symbol, and if so, the location of that symbol in the image.
     * <p><b>200</b> - OK
     * @param inputImage Image file to search through for the target image. (required)
     * @param targetImage Image to find in the input image. (required)
     * @return FindSymbolResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FindSymbolResult recognizeFindSymbol(org.springframework.core.io.Resource inputImage, org.springframework.core.io.Resource targetImage) throws RestClientException {
        return recognizeFindSymbolWithHttpInfo(inputImage, targetImage).getBody();
    }

    /**
     * Find the location of a symbol in an image
     * Determine if an image contains a symbol, and if so, the location of that symbol in the image.
     * <p><b>200</b> - OK
     * @param inputImage Image file to search through for the target image. (required)
     * @param targetImage Image to find in the input image. (required)
     * @return ResponseEntity&lt;FindSymbolResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FindSymbolResult> recognizeFindSymbolWithHttpInfo(org.springframework.core.io.Resource inputImage, org.springframework.core.io.Resource targetImage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputImage' is set
        if (inputImage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputImage' when calling recognizeFindSymbol");
        }
        
        // verify the required parameter 'targetImage' is set
        if (targetImage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetImage' when calling recognizeFindSymbol");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputImage != null)
            localVarFormParams.add("inputImage", inputImage);
        if (targetImage != null)
            localVarFormParams.add("targetImage", targetImage);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<FindSymbolResult> localReturnType = new ParameterizedTypeReference<FindSymbolResult>() {};
        return apiClient.invokeAPI("/image/recognize/find/symbol", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Compare two images for similarity
     * Generates an image similarity score using Deep Learning between 0.0 and 1.0, values closer to 1.0 indicate greater similarity
     * <p><b>200</b> - OK
     * @param baseImage Image file to compare against.  Common file formats such as PNG, JPEG are supported. (required)
     * @param comparisonImage Image to compare to the base image. (required)
     * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] recognizeSimilarityCompare(org.springframework.core.io.Resource baseImage, org.springframework.core.io.Resource comparisonImage, String recognitionMode) throws RestClientException {
        return recognizeSimilarityCompareWithHttpInfo(baseImage, comparisonImage, recognitionMode).getBody();
    }

    /**
     * Compare two images for similarity
     * Generates an image similarity score using Deep Learning between 0.0 and 1.0, values closer to 1.0 indicate greater similarity
     * <p><b>200</b> - OK
     * @param baseImage Image file to compare against.  Common file formats such as PNG, JPEG are supported. (required)
     * @param comparisonImage Image to compare to the base image. (required)
     * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> recognizeSimilarityCompareWithHttpInfo(org.springframework.core.io.Resource baseImage, org.springframework.core.io.Resource comparisonImage, String recognitionMode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'baseImage' is set
        if (baseImage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'baseImage' when calling recognizeSimilarityCompare");
        }
        
        // verify the required parameter 'comparisonImage' is set
        if (comparisonImage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'comparisonImage' when calling recognizeSimilarityCompare");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (recognitionMode != null)
        localVarHeaderParams.add("recognitionMode", apiClient.parameterToString(recognitionMode));

        if (baseImage != null)
            localVarFormParams.add("baseImage", baseImage);
        if (comparisonImage != null)
            localVarFormParams.add("comparisonImage", comparisonImage);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/image/recognize/similarity/compare", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate a perceptual image hash
     * Generates a hash value for the image; hash values that are closer together in terms of Hamming Distance are more similar.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal. (optional)
     * @return ImageSimilarityHashResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImageSimilarityHashResponse recognizeSimilarityHash(org.springframework.core.io.Resource imageFile, String recognitionMode) throws RestClientException {
        return recognizeSimilarityHashWithHttpInfo(imageFile, recognitionMode).getBody();
    }

    /**
     * Generate a perceptual image hash
     * Generates a hash value for the image; hash values that are closer together in terms of Hamming Distance are more similar.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal. (optional)
     * @return ResponseEntity&lt;ImageSimilarityHashResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImageSimilarityHashResponse> recognizeSimilarityHashWithHttpInfo(org.springframework.core.io.Resource imageFile, String recognitionMode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling recognizeSimilarityHash");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (recognitionMode != null)
        localVarHeaderParams.add("recognitionMode", apiClient.parameterToString(recognitionMode));

        if (imageFile != null)
            localVarFormParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ImageSimilarityHashResponse> localReturnType = new ParameterizedTypeReference<ImageSimilarityHashResponse>() {};
        return apiClient.invokeAPI("/image/recognize/similarity/hash", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Calculates the similarity between two perceptual image hashes
     * Calculates the similarity between two perceptual image hashes by computing the Hamming Distance between them.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ImageSimilarityHashDistanceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImageSimilarityHashDistanceResponse recognizeSimilarityHashDistance(ImageSimilarityHashDistanceRequest request) throws RestClientException {
        return recognizeSimilarityHashDistanceWithHttpInfo(request).getBody();
    }

    /**
     * Calculates the similarity between two perceptual image hashes
     * Calculates the similarity between two perceptual image hashes by computing the Hamming Distance between them.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ResponseEntity&lt;ImageSimilarityHashDistanceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImageSimilarityHashDistanceResponse> recognizeSimilarityHashDistanceWithHttpInfo(ImageSimilarityHashDistanceRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling recognizeSimilarityHashDistance");
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

        ParameterizedTypeReference<ImageSimilarityHashDistanceResponse> localReturnType = new ParameterizedTypeReference<ImageSimilarityHashDistanceResponse>() {};
        return apiClient.invokeAPI("/image/recognize/similarity/hash/distance", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
