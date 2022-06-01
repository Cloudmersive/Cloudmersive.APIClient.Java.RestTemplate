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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.MergeDocumentApi")
public class MergeDocumentApi {
    private ApiClient apiClient;

    public MergeDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public MergeDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Merge Two Word DOCX Together
     * Combine two Office Word Documents (docx) into one single Office Word document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentDocx(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        return mergeDocumentDocxWithHttpInfo(inputFile1, inputFile2).getBody();
    }

    /**
     * Merge Two Word DOCX Together
     * Combine two Office Word Documents (docx) into one single Office Word document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentDocxWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentDocx");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentDocx");
        }
        
        String path = apiClient.expandPath("/convert/merge/docx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);

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
     * Merge Multple Word DOCX Together
     * Combine multiple Office Word Documents (docx) into one single Office Word document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentDocxMulti(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return mergeDocumentDocxMultiWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Merge Multple Word DOCX Together
     * Combine multiple Office Word Documents (docx) into one single Office Word document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentDocxMultiWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentDocxMulti");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentDocxMulti");
        }
        
        String path = apiClient.expandPath("/convert/merge/docx/multi", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

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
     * Merge Two HTML (HTM) Files Together
     * Combine two HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentHtml(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        return mergeDocumentHtmlWithHttpInfo(inputFile1, inputFile2).getBody();
    }

    /**
     * Merge Two HTML (HTM) Files Together
     * Combine two HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentHtmlWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentHtml");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentHtml");
        }
        
        String path = apiClient.expandPath("/convert/merge/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);

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
     * Merge Multple HTML (HTM) Files Together
     * Combine multiple HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentHtmlMulti(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return mergeDocumentHtmlMultiWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Merge Multple HTML (HTM) Files Together
     * Combine multiple HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentHtmlMultiWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentHtmlMulti");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentHtmlMulti");
        }
        
        String path = apiClient.expandPath("/convert/merge/html/multi", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

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
     * Merge Two PDF Files Together
     * Combine two PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentPdf(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        return mergeDocumentPdfWithHttpInfo(inputFile1, inputFile2).getBody();
    }

    /**
     * Merge Two PDF Files Together
     * Combine two PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentPdfWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentPdf");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentPdf");
        }
        
        String path = apiClient.expandPath("/convert/merge/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);

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
     * Merge Multple PDF Files Together
     * Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentPdfMulti(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return mergeDocumentPdfMultiWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Merge Multple PDF Files Together
     * Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentPdfMultiWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentPdfMulti");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentPdfMulti");
        }
        
        String path = apiClient.expandPath("/convert/merge/pdf/multi", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

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
     * Merge Two PNG Files Together
     * Combine two PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentPng(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        return mergeDocumentPngWithHttpInfo(inputFile1, inputFile2).getBody();
    }

    /**
     * Merge Two PNG Files Together
     * Combine two PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentPngWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentPng");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentPng");
        }
        
        String path = apiClient.expandPath("/convert/merge/png/vertical", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);

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
     * Merge Multple PNG Files Together
     * Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentPngMulti(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return mergeDocumentPngMultiWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Merge Multple PNG Files Together
     * Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentPngMultiWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentPngMulti");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentPngMulti");
        }
        
        String path = apiClient.expandPath("/convert/merge/png/vertical/multi", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

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
     * Merge Two PowerPoint PPTX Together
     * Combine two Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentPptx(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        return mergeDocumentPptxWithHttpInfo(inputFile1, inputFile2).getBody();
    }

    /**
     * Merge Two PowerPoint PPTX Together
     * Combine two Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentPptxWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentPptx");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentPptx");
        }
        
        String path = apiClient.expandPath("/convert/merge/pptx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);

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
     * Merge Multple PowerPoint PPTX Together
     * Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentPptxMulti(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return mergeDocumentPptxMultiWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Merge Multple PowerPoint PPTX Together
     * Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentPptxMultiWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentPptxMulti");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentPptxMulti");
        }
        
        String path = apiClient.expandPath("/convert/merge/pptx/multi", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

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
     * Merge Two Text (TXT) Files Together
     * Combine two Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object mergeDocumentTxt(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        return mergeDocumentTxtWithHttpInfo(inputFile1, inputFile2).getBody();
    }

    /**
     * Merge Two Text (TXT) Files Together
     * Combine two Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> mergeDocumentTxtWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentTxt");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentTxt");
        }
        
        String path = apiClient.expandPath("/convert/merge/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);

        final String[] localVarAccepts = { 
            "application/octet-stream"
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
    /**
     * Merge Multple Text (TXT) Files Together
     * Combine multiple Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentTxtMulti(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return mergeDocumentTxtMultiWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Merge Multple Text (TXT) Files Together
     * Combine multiple Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentTxtMultiWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentTxtMulti");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentTxtMulti");
        }
        
        String path = apiClient.expandPath("/convert/merge/txt/multi", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

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
     * Merge Two Excel XLSX Together
     * Combine two Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentXlsx(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        return mergeDocumentXlsxWithHttpInfo(inputFile1, inputFile2).getBody();
    }

    /**
     * Merge Two Excel XLSX Together
     * Combine two Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentXlsxWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentXlsx");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentXlsx");
        }
        
        String path = apiClient.expandPath("/convert/merge/xlsx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);

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
     * Merge Multple Excel XLSX Together
     * Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] mergeDocumentXlsxMulti(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return mergeDocumentXlsxMultiWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Merge Multple Excel XLSX Together
     * Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (required)
     * @param inputFile3 Third input file to perform the operation on. (optional)
     * @param inputFile4 Fourth input file to perform the operation on. (optional)
     * @param inputFile5 Fifth input file to perform the operation on. (optional)
     * @param inputFile6 Sixth input file to perform the operation on. (optional)
     * @param inputFile7 Seventh input file to perform the operation on. (optional)
     * @param inputFile8 Eighth input file to perform the operation on. (optional)
     * @param inputFile9 Ninth input file to perform the operation on. (optional)
     * @param inputFile10 Tenth input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> mergeDocumentXlsxMultiWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling mergeDocumentXlsxMulti");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile2' when calling mergeDocumentXlsxMulti");
        }
        
        String path = apiClient.expandPath("/convert/merge/xlsx/multi", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

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
