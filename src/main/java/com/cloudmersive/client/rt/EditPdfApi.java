package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.AddPdfAnnotationRequest;
import java.math.BigDecimal;
import com.cloudmersive.client.rt.model.EditPdfBatchJobCreateResult;
import com.cloudmersive.client.rt.model.EditPdfJobStatusResult;
import java.io.File;
import com.cloudmersive.client.rt.model.GetPdfAnnotationsResult;
import com.cloudmersive.client.rt.model.PdfFormFields;
import com.cloudmersive.client.rt.model.PdfMetadata;
import com.cloudmersive.client.rt.model.PdfTextByPageResult;
import com.cloudmersive.client.rt.model.SetPdfFormFieldsRequest;
import com.cloudmersive.client.rt.model.SetPdfMetadataRequest;

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
public class EditPdfApi extends BaseApi {

    public EditPdfApi() {
        super(new ApiClient());
    }

    public EditPdfApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Add one or more PDF annotations, comments in the PDF document
     * Adds one or more annotations, comments to a PDF document.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfAddAnnotations(AddPdfAnnotationRequest request) throws RestClientException {
        return editPdfAddAnnotationsWithHttpInfo(request).getBody();
    }

    /**
     * Add one or more PDF annotations, comments in the PDF document
     * Adds one or more annotations, comments to a PDF document.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfAddAnnotationsWithHttpInfo(AddPdfAnnotationRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editPdfAddAnnotations");
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
        return apiClient.invokeAPI("/convert/edit/pdf/annotations/add-item", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Convert a PDF file to PDF/A
     * Converts the input PDF file to a PDF/A-1b or PDF/A-2b standardized PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param conformanceLevel Optional: Select the conformance level for PDF/A - specify &#39;1b&#39; for PDF/A-1b or specify &#39;2b&#39; for PDF/A-2b; default is PDF/A-1b (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfConvertToPdfA(org.springframework.core.io.Resource inputFile, String conformanceLevel) throws RestClientException {
        return editPdfConvertToPdfAWithHttpInfo(inputFile, conformanceLevel).getBody();
    }

    /**
     * Convert a PDF file to PDF/A
     * Converts the input PDF file to a PDF/A-1b or PDF/A-2b standardized PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param conformanceLevel Optional: Select the conformance level for PDF/A - specify &#39;1b&#39; for PDF/A-1b or specify &#39;2b&#39; for PDF/A-2b; default is PDF/A-1b (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfConvertToPdfAWithHttpInfo(org.springframework.core.io.Resource inputFile, String conformanceLevel) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfConvertToPdfA");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (conformanceLevel != null)
        localVarHeaderParams.add("conformanceLevel", apiClient.parameterToString(conformanceLevel));

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
        return apiClient.invokeAPI("/convert/edit/pdf/optimize/pdf-a", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Decrypt and password-protect a PDF
     * Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.
     * <p><b>200</b> - OK
     * @param password Valid password for the PDF file (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfDecrypt(String password, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfDecryptWithHttpInfo(password, inputFile).getBody();
    }

    /**
     * Decrypt and password-protect a PDF
     * Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.
     * <p><b>200</b> - OK
     * @param password Valid password for the PDF file (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfDecryptWithHttpInfo(String password, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling editPdfDecrypt");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfDecrypt");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (password != null)
        localVarHeaderParams.add("password", apiClient.parameterToString(password));

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
        return apiClient.invokeAPI("/convert/edit/pdf/decrypt", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove, delete pages from a PDF document
     * Remove one or more pages from a PDF document
     * <p><b>200</b> - OK
     * @param pageStart Page number (1 based) to start deleting pages from (inclusive). (required)
     * @param pageEnd Page number (1 based) to stop deleting pages from (inclusive). (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfDeletePages(Integer pageStart, Integer pageEnd, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfDeletePagesWithHttpInfo(pageStart, pageEnd, inputFile).getBody();
    }

    /**
     * Remove, delete pages from a PDF document
     * Remove one or more pages from a PDF document
     * <p><b>200</b> - OK
     * @param pageStart Page number (1 based) to start deleting pages from (inclusive). (required)
     * @param pageEnd Page number (1 based) to stop deleting pages from (inclusive). (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfDeletePagesWithHttpInfo(Integer pageStart, Integer pageEnd, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageStart' when calling editPdfDeletePages");
        }
        
        // verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageEnd' when calling editPdfDeletePages");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfDeletePages");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (pageStart != null)
        localVarHeaderParams.add("pageStart", apiClient.parameterToString(pageStart));
        if (pageEnd != null)
        localVarHeaderParams.add("pageEnd", apiClient.parameterToString(pageEnd));

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
        return apiClient.invokeAPI("/convert/edit/pdf/pages/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove, delete pages from a PDF document as Batch Job
     * Remove one or more pages from a PDF document.  Runs as a batch job async and returns a batch job ID that you can check the status of to get the result.  Requires Cloudmersive Private Cloud or Managed Instance.
     * <p><b>200</b> - OK
     * @param pageStart Page number (1 based) to start deleting pages from (inclusive). (required)
     * @param pageEnd Page number (1 based) to stop deleting pages from (inclusive). (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return EditPdfBatchJobCreateResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EditPdfBatchJobCreateResult editPdfDeletePagesBatchJob(Integer pageStart, Integer pageEnd, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfDeletePagesBatchJobWithHttpInfo(pageStart, pageEnd, inputFile).getBody();
    }

    /**
     * Remove, delete pages from a PDF document as Batch Job
     * Remove one or more pages from a PDF document.  Runs as a batch job async and returns a batch job ID that you can check the status of to get the result.  Requires Cloudmersive Private Cloud or Managed Instance.
     * <p><b>200</b> - OK
     * @param pageStart Page number (1 based) to start deleting pages from (inclusive). (required)
     * @param pageEnd Page number (1 based) to stop deleting pages from (inclusive). (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;EditPdfBatchJobCreateResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EditPdfBatchJobCreateResult> editPdfDeletePagesBatchJobWithHttpInfo(Integer pageStart, Integer pageEnd, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageStart' when calling editPdfDeletePagesBatchJob");
        }
        
        // verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageEnd' when calling editPdfDeletePagesBatchJob");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfDeletePagesBatchJob");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (pageStart != null)
        localVarHeaderParams.add("pageStart", apiClient.parameterToString(pageStart));
        if (pageEnd != null)
        localVarHeaderParams.add("pageEnd", apiClient.parameterToString(pageEnd));

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

        ParameterizedTypeReference<EditPdfBatchJobCreateResult> localReturnType = new ParameterizedTypeReference<EditPdfBatchJobCreateResult>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/pages/delete/batch-job", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Encrypt and password-protect a PDF
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional)
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (optional)
     * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfEncrypt(org.springframework.core.io.Resource inputFile, String userPassword, String ownerPassword, String encryptionKeyLength) throws RestClientException {
        return editPdfEncryptWithHttpInfo(inputFile, userPassword, ownerPassword, encryptionKeyLength).getBody();
    }

    /**
     * Encrypt and password-protect a PDF
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional)
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (optional)
     * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfEncryptWithHttpInfo(org.springframework.core.io.Resource inputFile, String userPassword, String ownerPassword, String encryptionKeyLength) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfEncrypt");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (userPassword != null)
        localVarHeaderParams.add("userPassword", apiClient.parameterToString(userPassword));
        if (ownerPassword != null)
        localVarHeaderParams.add("ownerPassword", apiClient.parameterToString(ownerPassword));
        if (encryptionKeyLength != null)
        localVarHeaderParams.add("encryptionKeyLength", apiClient.parameterToString(encryptionKeyLength));

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
        return apiClient.invokeAPI("/convert/edit/pdf/encrypt", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get PDF annotations, including comments in the document
     * Enumerates the annotations, including comments and notes, in a PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return GetPdfAnnotationsResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPdfAnnotationsResult editPdfGetAnnotations(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfGetAnnotationsWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get PDF annotations, including comments in the document
     * Enumerates the annotations, including comments and notes, in a PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;GetPdfAnnotationsResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPdfAnnotationsResult> editPdfGetAnnotationsWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfGetAnnotations");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<GetPdfAnnotationsResult> localReturnType = new ParameterizedTypeReference<GetPdfAnnotationsResult>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/annotations/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the status and result of a PDF Batch Job
     * Returns the result of the Async Job - possible states can be STARTED or COMPLETED.  This API is only available for Cloudmersive Managed Instance and Private Cloud deployments.
     * <p><b>200</b> - OK
     * @param asyncJobID  (required)
     * @return EditPdfJobStatusResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EditPdfJobStatusResult editPdfGetAsyncJobStatus(String asyncJobID) throws RestClientException {
        return editPdfGetAsyncJobStatusWithHttpInfo(asyncJobID).getBody();
    }

    /**
     * Get the status and result of a PDF Batch Job
     * Returns the result of the Async Job - possible states can be STARTED or COMPLETED.  This API is only available for Cloudmersive Managed Instance and Private Cloud deployments.
     * <p><b>200</b> - OK
     * @param asyncJobID  (required)
     * @return ResponseEntity&lt;EditPdfJobStatusResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EditPdfJobStatusResult> editPdfGetAsyncJobStatusWithHttpInfo(String asyncJobID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'asyncJobID' is set
        if (asyncJobID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'asyncJobID' when calling editPdfGetAsyncJobStatus");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "AsyncJobID", asyncJobID));
        

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<EditPdfJobStatusResult> localReturnType = new ParameterizedTypeReference<EditPdfJobStatusResult>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/batch-job/status", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Gets PDF Form fields and values
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return PdfFormFields
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PdfFormFields editPdfGetFormFields(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfGetFormFieldsWithHttpInfo(inputFile).getBody();
    }

    /**
     * Gets PDF Form fields and values
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;PdfFormFields&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PdfFormFields> editPdfGetFormFieldsWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfGetFormFields");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<PdfFormFields> localReturnType = new ParameterizedTypeReference<PdfFormFields>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/form/get-fields", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get PDF document metadata
     * Returns the metadata from the PDF document, including Title, Author, etc.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return PdfMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PdfMetadata editPdfGetMetadata(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfGetMetadataWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get PDF document metadata
     * Returns the metadata from the PDF document, including Title, Author, etc.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;PdfMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PdfMetadata> editPdfGetMetadataWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfGetMetadata");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<PdfMetadata> localReturnType = new ParameterizedTypeReference<PdfMetadata>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/get-metadata", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get text in a PDF document by page
     * Gets the text in a PDF by page
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;. (optional)
     * @return PdfTextByPageResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PdfTextByPageResult editPdfGetPdfTextByPages(org.springframework.core.io.Resource inputFile, String textFormattingMode) throws RestClientException {
        return editPdfGetPdfTextByPagesWithHttpInfo(inputFile, textFormattingMode).getBody();
    }

    /**
     * Get text in a PDF document by page
     * Gets the text in a PDF by page
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;. (optional)
     * @return ResponseEntity&lt;PdfTextByPageResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PdfTextByPageResult> editPdfGetPdfTextByPagesWithHttpInfo(org.springframework.core.io.Resource inputFile, String textFormattingMode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfGetPdfTextByPages");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (textFormattingMode != null)
        localVarHeaderParams.add("textFormattingMode", apiClient.parameterToString(textFormattingMode));

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

        ParameterizedTypeReference<PdfTextByPageResult> localReturnType = new ParameterizedTypeReference<PdfTextByPageResult>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/pages/get-text", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Insert, copy pages from one PDF document into another
     * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).
     * <p><b>200</b> - OK
     * @param pageStartSource Page number (1 based) to start copying pages from (inclusive) in the Source file. (required)
     * @param pageEndSource Page number (1 based) to stop copying pages pages from (inclusive) in the Source file. (required)
     * @param pageInsertBeforeDesitnation Page number (1 based) to insert the pages before in the Destination file. (required)
     * @param sourceFile Source PDF file to copy pages from. (required)
     * @param destinationFile Destination PDF file to copy pages into. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfInsertPages(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, org.springframework.core.io.Resource sourceFile, org.springframework.core.io.Resource destinationFile) throws RestClientException {
        return editPdfInsertPagesWithHttpInfo(pageStartSource, pageEndSource, pageInsertBeforeDesitnation, sourceFile, destinationFile).getBody();
    }

    /**
     * Insert, copy pages from one PDF document into another
     * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).
     * <p><b>200</b> - OK
     * @param pageStartSource Page number (1 based) to start copying pages from (inclusive) in the Source file. (required)
     * @param pageEndSource Page number (1 based) to stop copying pages pages from (inclusive) in the Source file. (required)
     * @param pageInsertBeforeDesitnation Page number (1 based) to insert the pages before in the Destination file. (required)
     * @param sourceFile Source PDF file to copy pages from. (required)
     * @param destinationFile Destination PDF file to copy pages into. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfInsertPagesWithHttpInfo(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, org.springframework.core.io.Resource sourceFile, org.springframework.core.io.Resource destinationFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pageStartSource' is set
        if (pageStartSource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageStartSource' when calling editPdfInsertPages");
        }
        
        // verify the required parameter 'pageEndSource' is set
        if (pageEndSource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageEndSource' when calling editPdfInsertPages");
        }
        
        // verify the required parameter 'pageInsertBeforeDesitnation' is set
        if (pageInsertBeforeDesitnation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageInsertBeforeDesitnation' when calling editPdfInsertPages");
        }
        
        // verify the required parameter 'sourceFile' is set
        if (sourceFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sourceFile' when calling editPdfInsertPages");
        }
        
        // verify the required parameter 'destinationFile' is set
        if (destinationFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinationFile' when calling editPdfInsertPages");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (pageStartSource != null)
        localVarHeaderParams.add("pageStartSource", apiClient.parameterToString(pageStartSource));
        if (pageEndSource != null)
        localVarHeaderParams.add("pageEndSource", apiClient.parameterToString(pageEndSource));
        if (pageInsertBeforeDesitnation != null)
        localVarHeaderParams.add("pageInsertBeforeDesitnation", apiClient.parameterToString(pageInsertBeforeDesitnation));

        if (sourceFile != null)
            localVarFormParams.add("sourceFile", sourceFile);
        if (destinationFile != null)
            localVarFormParams.add("destinationFile", destinationFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/pages/insert", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Insert, copy pages from one PDF document into another as a batch job
     * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).  Runs as a batch job async and returns a batch job ID that you can check the status of to get the result.  Requires Cloudmersive Private Cloud or Managed Instance.
     * <p><b>200</b> - OK
     * @param pageStartSource Page number (1 based) to start copying pages from (inclusive) in the Source file. (required)
     * @param pageEndSource Page number (1 based) to stop copying pages pages from (inclusive) in the Source file. (required)
     * @param pageInsertBeforeDesitnation Page number (1 based) to insert the pages before in the Destination file. (required)
     * @param sourceFile Source PDF file to copy pages from. (required)
     * @param destinationFile Destination PDF file to copy pages into. (required)
     * @return EditPdfBatchJobCreateResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EditPdfBatchJobCreateResult editPdfInsertPagesBatchJob(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, org.springframework.core.io.Resource sourceFile, org.springframework.core.io.Resource destinationFile) throws RestClientException {
        return editPdfInsertPagesBatchJobWithHttpInfo(pageStartSource, pageEndSource, pageInsertBeforeDesitnation, sourceFile, destinationFile).getBody();
    }

    /**
     * Insert, copy pages from one PDF document into another as a batch job
     * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).  Runs as a batch job async and returns a batch job ID that you can check the status of to get the result.  Requires Cloudmersive Private Cloud or Managed Instance.
     * <p><b>200</b> - OK
     * @param pageStartSource Page number (1 based) to start copying pages from (inclusive) in the Source file. (required)
     * @param pageEndSource Page number (1 based) to stop copying pages pages from (inclusive) in the Source file. (required)
     * @param pageInsertBeforeDesitnation Page number (1 based) to insert the pages before in the Destination file. (required)
     * @param sourceFile Source PDF file to copy pages from. (required)
     * @param destinationFile Destination PDF file to copy pages into. (required)
     * @return ResponseEntity&lt;EditPdfBatchJobCreateResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EditPdfBatchJobCreateResult> editPdfInsertPagesBatchJobWithHttpInfo(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, org.springframework.core.io.Resource sourceFile, org.springframework.core.io.Resource destinationFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pageStartSource' is set
        if (pageStartSource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageStartSource' when calling editPdfInsertPagesBatchJob");
        }
        
        // verify the required parameter 'pageEndSource' is set
        if (pageEndSource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageEndSource' when calling editPdfInsertPagesBatchJob");
        }
        
        // verify the required parameter 'pageInsertBeforeDesitnation' is set
        if (pageInsertBeforeDesitnation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageInsertBeforeDesitnation' when calling editPdfInsertPagesBatchJob");
        }
        
        // verify the required parameter 'sourceFile' is set
        if (sourceFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sourceFile' when calling editPdfInsertPagesBatchJob");
        }
        
        // verify the required parameter 'destinationFile' is set
        if (destinationFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinationFile' when calling editPdfInsertPagesBatchJob");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (pageStartSource != null)
        localVarHeaderParams.add("pageStartSource", apiClient.parameterToString(pageStartSource));
        if (pageEndSource != null)
        localVarHeaderParams.add("pageEndSource", apiClient.parameterToString(pageEndSource));
        if (pageInsertBeforeDesitnation != null)
        localVarHeaderParams.add("pageInsertBeforeDesitnation", apiClient.parameterToString(pageInsertBeforeDesitnation));

        if (sourceFile != null)
            localVarFormParams.add("sourceFile", sourceFile);
        if (destinationFile != null)
            localVarFormParams.add("destinationFile", destinationFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<EditPdfBatchJobCreateResult> localReturnType = new ParameterizedTypeReference<EditPdfBatchJobCreateResult>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/pages/insert/batch-job", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Linearize and optimize a PDF for streaming download
     * Linearizes the content of a PDF to optimize it for streaming download, particularly over web streaming.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfLinearize(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfLinearizeWithHttpInfo(inputFile).getBody();
    }

    /**
     * Linearize and optimize a PDF for streaming download
     * Linearizes the content of a PDF to optimize it for streaming download, particularly over web streaming.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfLinearizeWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfLinearize");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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
        return apiClient.invokeAPI("/convert/edit/pdf/optimize/linearize", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rasterize a PDF to an image-based PDF
     * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param dpi Optional; configures the pixel density in Dots per Inch (DPI) (default is 300).  This parameter can only be used with Cloudmersive Managed Instance and Private Cloud. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfRasterize(org.springframework.core.io.Resource inputFile, Integer dpi) throws RestClientException {
        return editPdfRasterizeWithHttpInfo(inputFile, dpi).getBody();
    }

    /**
     * Rasterize a PDF to an image-based PDF
     * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param dpi Optional; configures the pixel density in Dots per Inch (DPI) (default is 300).  This parameter can only be used with Cloudmersive Managed Instance and Private Cloud. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfRasterizeWithHttpInfo(org.springframework.core.io.Resource inputFile, Integer dpi) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfRasterize");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (dpi != null)
        localVarHeaderParams.add("dpi", apiClient.parameterToString(dpi));

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
        return apiClient.invokeAPI("/convert/edit/pdf/rasterize", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rasterize a PDF to an image-based PDF as Batch Job
     * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return EditPdfBatchJobCreateResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EditPdfBatchJobCreateResult editPdfRasterizeBatchJob(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfRasterizeBatchJobWithHttpInfo(inputFile).getBody();
    }

    /**
     * Rasterize a PDF to an image-based PDF as Batch Job
     * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;EditPdfBatchJobCreateResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EditPdfBatchJobCreateResult> editPdfRasterizeBatchJobWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfRasterizeBatchJob");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<EditPdfBatchJobCreateResult> localReturnType = new ParameterizedTypeReference<EditPdfBatchJobCreateResult>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/rasterize/batch-job", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reduce the file size and optimize a PDF
     * Reduces the file size and optimizes the content of a PDF to minimize its file size.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Quality level for the images in the PDF, ranging from 0.0 (low quality) to 1.0 (high quality); default is 0.3 (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfReduceFileSize(org.springframework.core.io.Resource inputFile, BigDecimal quality) throws RestClientException {
        return editPdfReduceFileSizeWithHttpInfo(inputFile, quality).getBody();
    }

    /**
     * Reduce the file size and optimize a PDF
     * Reduces the file size and optimizes the content of a PDF to minimize its file size.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param quality Quality level for the images in the PDF, ranging from 0.0 (low quality) to 1.0 (high quality); default is 0.3 (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfReduceFileSizeWithHttpInfo(org.springframework.core.io.Resource inputFile, BigDecimal quality) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfReduceFileSize");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        localVarHeaderParams.add("quality", apiClient.parameterToString(quality));

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
        return apiClient.invokeAPI("/convert/edit/pdf/optimize/reduce-file-size", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove all PDF annotations, including comments in the document
     * Removes all of the annotations, including comments and notes, in a PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfRemoveAllAnnotations(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfRemoveAllAnnotationsWithHttpInfo(inputFile).getBody();
    }

    /**
     * Remove all PDF annotations, including comments in the document
     * Removes all of the annotations, including comments and notes, in a PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfRemoveAllAnnotationsWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfRemoveAllAnnotations");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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
        return apiClient.invokeAPI("/convert/edit/pdf/annotations/remove-all", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove a specific PDF annotation, comment in the document
     * Removes a specific annotation in a PDF document, using the AnnotationIndex.  To enumerate AnnotationIndex for all of the annotations in the PDF document, use the /edit/pdf/annotations/list API.
     * <p><b>200</b> - OK
     * @param annotationIndex The 0-based index of the annotation in the document (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfRemoveAnnotationItem(Integer annotationIndex, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfRemoveAnnotationItemWithHttpInfo(annotationIndex, inputFile).getBody();
    }

    /**
     * Remove a specific PDF annotation, comment in the document
     * Removes a specific annotation in a PDF document, using the AnnotationIndex.  To enumerate AnnotationIndex for all of the annotations in the PDF document, use the /edit/pdf/annotations/list API.
     * <p><b>200</b> - OK
     * @param annotationIndex The 0-based index of the annotation in the document (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfRemoveAnnotationItemWithHttpInfo(Integer annotationIndex, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'annotationIndex' is set
        if (annotationIndex == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'annotationIndex' when calling editPdfRemoveAnnotationItem");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfRemoveAnnotationItem");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (annotationIndex != null)
        localVarHeaderParams.add("annotationIndex", apiClient.parameterToString(annotationIndex));

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
        return apiClient.invokeAPI("/convert/edit/pdf/annotations/remove-item", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Change PDF Document&#39;s Paper Size
     * Resizes a PDF document&#39;s paper size.
     * <p><b>200</b> - OK
     * @param paperSize The desired paper size for the resized PDF document. Size ranges from A7 (smallest) to A0 (largest). (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfResize(String paperSize, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfResizeWithHttpInfo(paperSize, inputFile).getBody();
    }

    /**
     * Change PDF Document&#39;s Paper Size
     * Resizes a PDF document&#39;s paper size.
     * <p><b>200</b> - OK
     * @param paperSize The desired paper size for the resized PDF document. Size ranges from A7 (smallest) to A0 (largest). (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfResizeWithHttpInfo(String paperSize, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'paperSize' is set
        if (paperSize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'paperSize' when calling editPdfResize");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfResize");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (paperSize != null)
        localVarHeaderParams.add("paperSize", apiClient.parameterToString(paperSize));

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
        return apiClient.invokeAPI("/convert/edit/pdf/resize", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rotate all pages in a PDF document
     * Rotate all of the pages in a PDF document by a multiple of 90 degrees
     * <p><b>200</b> - OK
     * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc. (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfRotateAllPages(Integer rotationAngle, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfRotateAllPagesWithHttpInfo(rotationAngle, inputFile).getBody();
    }

    /**
     * Rotate all pages in a PDF document
     * Rotate all of the pages in a PDF document by a multiple of 90 degrees
     * <p><b>200</b> - OK
     * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc. (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfRotateAllPagesWithHttpInfo(Integer rotationAngle, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'rotationAngle' is set
        if (rotationAngle == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rotationAngle' when calling editPdfRotateAllPages");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfRotateAllPages");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (rotationAngle != null)
        localVarHeaderParams.add("rotationAngle", apiClient.parameterToString(rotationAngle));

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
        return apiClient.invokeAPI("/convert/edit/pdf/pages/rotate/all", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rotate a range, subset of pages in a PDF document
     * Rotate a range of specific pages in a PDF document by a multiple of 90 degrees
     * <p><b>200</b> - OK
     * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc. (required)
     * @param pageStart Page number (1 based) to start rotating pages from (inclusive). (required)
     * @param pageEnd Page number (1 based) to stop rotating pages from (inclusive). (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfRotatePageRange(Integer rotationAngle, Integer pageStart, Integer pageEnd, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editPdfRotatePageRangeWithHttpInfo(rotationAngle, pageStart, pageEnd, inputFile).getBody();
    }

    /**
     * Rotate a range, subset of pages in a PDF document
     * Rotate a range of specific pages in a PDF document by a multiple of 90 degrees
     * <p><b>200</b> - OK
     * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc. (required)
     * @param pageStart Page number (1 based) to start rotating pages from (inclusive). (required)
     * @param pageEnd Page number (1 based) to stop rotating pages from (inclusive). (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfRotatePageRangeWithHttpInfo(Integer rotationAngle, Integer pageStart, Integer pageEnd, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'rotationAngle' is set
        if (rotationAngle == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rotationAngle' when calling editPdfRotatePageRange");
        }
        
        // verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageStart' when calling editPdfRotatePageRange");
        }
        
        // verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageEnd' when calling editPdfRotatePageRange");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfRotatePageRange");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (rotationAngle != null)
        localVarHeaderParams.add("rotationAngle", apiClient.parameterToString(rotationAngle));
        if (pageStart != null)
        localVarHeaderParams.add("pageStart", apiClient.parameterToString(pageStart));
        if (pageEnd != null)
        localVarHeaderParams.add("pageEnd", apiClient.parameterToString(pageEnd));

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
        return apiClient.invokeAPI("/convert/edit/pdf/pages/rotate/page-range", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Sets ands fills PDF Form field values
     * Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.
     * <p><b>200</b> - OK
     * @param fieldValues  (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfSetFormFields(SetPdfFormFieldsRequest fieldValues) throws RestClientException {
        return editPdfSetFormFieldsWithHttpInfo(fieldValues).getBody();
    }

    /**
     * Sets ands fills PDF Form field values
     * Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.
     * <p><b>200</b> - OK
     * @param fieldValues  (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfSetFormFieldsWithHttpInfo(SetPdfFormFieldsRequest fieldValues) throws RestClientException {
        Object localVarPostBody = fieldValues;
        
        // verify the required parameter 'fieldValues' is set
        if (fieldValues == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldValues' when calling editPdfSetFormFields");
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
        return apiClient.invokeAPI("/convert/edit/pdf/form/set-fields", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Sets PDF document metadata
     * Sets (writes) metadata into the input PDF document, including Title, Author, etc.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfSetMetadata(SetPdfMetadataRequest request) throws RestClientException {
        return editPdfSetMetadataWithHttpInfo(request).getBody();
    }

    /**
     * Sets PDF document metadata
     * Sets (writes) metadata into the input PDF document, including Title, Author, etc.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfSetMetadataWithHttpInfo(SetPdfMetadataRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling editPdfSetMetadata");
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
        return apiClient.invokeAPI("/convert/edit/pdf/set-metadata", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Encrypt, password-protect and set restricted permissions on a PDF
     * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
     * <p><b>200</b> - OK
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required) (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256. (optional)
     * @param allowPrinting Set to false to disable printing through DRM.  Default is true. (optional)
     * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true. (optional)
     * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true. (optional)
     * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true. (optional)
     * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true. (optional)
     * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true. (optional)
     * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfSetPermissions(String ownerPassword, String userPassword, org.springframework.core.io.Resource inputFile, String encryptionKeyLength, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws RestClientException {
        return editPdfSetPermissionsWithHttpInfo(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting).getBody();
    }

    /**
     * Encrypt, password-protect and set restricted permissions on a PDF
     * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
     * <p><b>200</b> - OK
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required) (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256. (optional)
     * @param allowPrinting Set to false to disable printing through DRM.  Default is true. (optional)
     * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true. (optional)
     * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true. (optional)
     * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true. (optional)
     * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true. (optional)
     * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true. (optional)
     * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfSetPermissionsWithHttpInfo(String ownerPassword, String userPassword, org.springframework.core.io.Resource inputFile, String encryptionKeyLength, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ownerPassword' is set
        if (ownerPassword == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerPassword' when calling editPdfSetPermissions");
        }
        
        // verify the required parameter 'userPassword' is set
        if (userPassword == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userPassword' when calling editPdfSetPermissions");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfSetPermissions");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ownerPassword != null)
        localVarHeaderParams.add("ownerPassword", apiClient.parameterToString(ownerPassword));
        if (userPassword != null)
        localVarHeaderParams.add("userPassword", apiClient.parameterToString(userPassword));
        if (encryptionKeyLength != null)
        localVarHeaderParams.add("encryptionKeyLength", apiClient.parameterToString(encryptionKeyLength));
        if (allowPrinting != null)
        localVarHeaderParams.add("allowPrinting", apiClient.parameterToString(allowPrinting));
        if (allowDocumentAssembly != null)
        localVarHeaderParams.add("allowDocumentAssembly", apiClient.parameterToString(allowDocumentAssembly));
        if (allowContentExtraction != null)
        localVarHeaderParams.add("allowContentExtraction", apiClient.parameterToString(allowContentExtraction));
        if (allowFormFilling != null)
        localVarHeaderParams.add("allowFormFilling", apiClient.parameterToString(allowFormFilling));
        if (allowEditing != null)
        localVarHeaderParams.add("allowEditing", apiClient.parameterToString(allowEditing));
        if (allowAnnotations != null)
        localVarHeaderParams.add("allowAnnotations", apiClient.parameterToString(allowAnnotations));
        if (allowDegradedPrinting != null)
        localVarHeaderParams.add("allowDegradedPrinting", apiClient.parameterToString(allowDegradedPrinting));

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
        return apiClient.invokeAPI("/convert/edit/pdf/encrypt/set-permissions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add a text watermark to a PDF
     * Adds a text watermark to a PDF
     * <p><b>200</b> - OK
     * @param watermarkText Watermark text to add to the PDF (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param fontName Font Family Name for the watermark text; default is Times New Roman (optional)
     * @param fontSize Font Size in points of the text; default is 150 (optional)
     * @param fontColor Font color in hexadecimal or HTML color name; default is Red (optional)
     * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5 (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editPdfWatermarkText(String watermarkText, org.springframework.core.io.Resource inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws RestClientException {
        return editPdfWatermarkTextWithHttpInfo(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency).getBody();
    }

    /**
     * Add a text watermark to a PDF
     * Adds a text watermark to a PDF
     * <p><b>200</b> - OK
     * @param watermarkText Watermark text to add to the PDF (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param fontName Font Family Name for the watermark text; default is Times New Roman (optional)
     * @param fontSize Font Size in points of the text; default is 150 (optional)
     * @param fontColor Font color in hexadecimal or HTML color name; default is Red (optional)
     * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5 (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editPdfWatermarkTextWithHttpInfo(String watermarkText, org.springframework.core.io.Resource inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'watermarkText' is set
        if (watermarkText == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'watermarkText' when calling editPdfWatermarkText");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editPdfWatermarkText");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (watermarkText != null)
        localVarHeaderParams.add("watermarkText", apiClient.parameterToString(watermarkText));
        if (fontName != null)
        localVarHeaderParams.add("fontName", apiClient.parameterToString(fontName));
        if (fontSize != null)
        localVarHeaderParams.add("fontSize", apiClient.parameterToString(fontSize));
        if (fontColor != null)
        localVarHeaderParams.add("fontColor", apiClient.parameterToString(fontColor));
        if (fontTransparency != null)
        localVarHeaderParams.add("fontTransparency", apiClient.parameterToString(fontTransparency));

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
        return apiClient.invokeAPI("/convert/edit/pdf/watermark/text", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
