package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.AutodetectDocumentValidationResult;
import com.cloudmersive.client.rt.model.DocumentValidationResult;
import java.io.File;
import com.cloudmersive.client.rt.model.HtmlSsrfThreatCheckResult;
import com.cloudmersive.client.rt.model.XxeThreatDetectionResult;

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
public class ValidateDocumentApi extends BaseApi {

    public ValidateDocumentApi() {
        super(new ApiClient());
    }

    public ValidateDocumentApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Autodetect content type and validate
     * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return AutodetectDocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AutodetectDocumentValidationResult validateDocumentAutodetectValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentAutodetectValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Autodetect content type and validate
     * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;AutodetectDocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AutodetectDocumentValidationResult> validateDocumentAutodetectValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentAutodetectValidation");
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

        ParameterizedTypeReference<AutodetectDocumentValidationResult> localReturnType = new ParameterizedTypeReference<AutodetectDocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/autodetect", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a CSV file document (CSV)
     * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentCsvValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentCsvValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a CSV file document (CSV)
     * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentCsvValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentCsvValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/csv", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a Word 97-2003 Legacy document (DOC)
     * Validate a Word 97-2003 Legacy document (DOC)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentDocValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentDocValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Word 97-2003 Legacy document (DOC)
     * Validate a Word 97-2003 Legacy document (DOC)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentDocValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentDocValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/doc", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Repair a Word document (DOCX) that contains errors
     * Repair a Word document (DOCX) that contains errors or corruption, if possible.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param repairMode Optional; Set to advanced to apply the most advanced repair mode, basic for basic repair mode.  Default is advanced. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] validateDocumentDocxRepair(org.springframework.core.io.Resource inputFile, String repairMode) throws RestClientException {
        return validateDocumentDocxRepairWithHttpInfo(inputFile, repairMode).getBody();
    }

    /**
     * Repair a Word document (DOCX) that contains errors
     * Repair a Word document (DOCX) that contains errors or corruption, if possible.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param repairMode Optional; Set to advanced to apply the most advanced repair mode, basic for basic repair mode.  Default is advanced. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> validateDocumentDocxRepairWithHttpInfo(org.springframework.core.io.Resource inputFile, String repairMode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentDocxRepair");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (repairMode != null)
        localVarHeaderParams.add("repairMode", apiClient.parameterToString(repairMode));

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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/validate/docx/repair", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a Word document (DOCX)
     * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentDocxValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentDocxValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Word document (DOCX)
     * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentDocxValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentDocxValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/docx", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate if input file is a valid EML file
     * Validate if an input file is an EML email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentEmlValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentEmlValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate if input file is a valid EML file
     * Validate if an input file is an EML email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentEmlValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentEmlValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/eml", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate if a file is executable
     * Validate if an input file is a binary executable file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentExecutableValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentExecutableValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate if a file is executable
     * Validate if an input file is a binary executable file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentExecutableValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentExecutableValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/executable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a GZip Archive file (gzip or gz)
     * Validate a GZip archive file (GZIP or GZ)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentGZipValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentGZipValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a GZip Archive file (gzip or gz)
     * Validate a GZip archive file (GZIP or GZ)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentGZipValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentGZipValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/gzip", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate an HTML file and checks for SSRF threats
     * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return HtmlSsrfThreatCheckResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HtmlSsrfThreatCheckResult validateDocumentHtmlSsrfValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentHtmlSsrfValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an HTML file and checks for SSRF threats
     * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;HtmlSsrfThreatCheckResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HtmlSsrfThreatCheckResult> validateDocumentHtmlSsrfValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentHtmlSsrfValidation");
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

        ParameterizedTypeReference<HtmlSsrfThreatCheckResult> localReturnType = new ParameterizedTypeReference<HtmlSsrfThreatCheckResult>() {};
        return apiClient.invokeAPI("/convert/validate/html/ssrf-threat-check", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate an HTML file
     * Validate an HTML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentHtmlValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentHtmlValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an HTML file
     * Validate an HTML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentHtmlValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentHtmlValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/html", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate an Image File
     * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentImageValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentImageValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an Image File
     * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentImageValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentImageValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/image", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a JPG File
     * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentJpgValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentJpgValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a JPG File
     * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentJpgValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentJpgValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/jpg", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a JSON file
     * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentJsonValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentJsonValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a JSON file
     * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentJsonValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentJsonValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/json", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate if input file is a valid MSG file
     * Validate if an input file is an MSG email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentMsgValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentMsgValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate if input file is a valid MSG file
     * Validate if an input file is an MSG email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentMsgValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentMsgValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/msg", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a PDF document file
     * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentPdfValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPdfValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a PDF document file
     * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentPdfValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPdfValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/pdf", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a PNG File
     * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentPngValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPngValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a PNG File
     * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentPngValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPngValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/png", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentPptValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPptValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentPptValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPptValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/ppt", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Repair a PowerPoint presentation (PPTX) that contains errors
     * Repair a PowerPoint presentation document (PPTX) that contains errors or corruption, if possible.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] validateDocumentPptxRepair(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPptxRepairWithHttpInfo(inputFile).getBody();
    }

    /**
     * Repair a PowerPoint presentation (PPTX) that contains errors
     * Repair a PowerPoint presentation document (PPTX) that contains errors or corruption, if possible.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> validateDocumentPptxRepairWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPptxRepair");
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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/validate/pptx/repair", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a PowerPoint presentation (PPTX)
     * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentPptxValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPptxValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a PowerPoint presentation (PPTX)
     * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentPptxValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPptxValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/pptx", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a RAR Archive file (RAR)
     * Validate a RAR archive file (RAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentRarValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentRarValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a RAR Archive file (RAR)
     * Validate a RAR archive file (RAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentRarValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentRarValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/rar", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a Rich Text Format document (RTF)
     * Validate a Rich Text Format document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentRtfValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentRtfValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Rich Text Format document (RTF)
     * Validate a Rich Text Format document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentRtfValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentRtfValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/rtf", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a TAR Tarball Archive file (TAR)
     * Validate a TAR tarball archive file (TAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentTarValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentTarValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a TAR Tarball Archive file (TAR)
     * Validate a TAR tarball archive file (TAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentTarValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentTarValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/tar", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate an TXT file
     * Validate an TXT document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentTxtValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentTxtValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an TXT file
     * Validate an TXT document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentTxtValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentTxtValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/txt", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentXlsValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXlsValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentXlsValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXlsValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/xls", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Repair an Excel spreadsheet (XLSX) that contains errors
     * Repair an Excel spreadsheet document (XLSX) that contains errors or corruption, if possible.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] validateDocumentXlsxRepair(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXlsxRepairWithHttpInfo(inputFile).getBody();
    }

    /**
     * Repair an Excel spreadsheet (XLSX) that contains errors
     * Repair an Excel spreadsheet document (XLSX) that contains errors or corruption, if possible.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> validateDocumentXlsxRepairWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXlsxRepair");
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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/validate/xlsx/repair", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a Excel document (XLSX)
     * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentXlsxValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXlsxValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Excel document (XLSX)
     * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentXlsxValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXlsxValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/xlsx", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate an XML file
     * Validate an XML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentXmlValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXmlValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an XML file
     * Validate an XML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentXmlValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXmlValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/xml", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate an XML file for XML External Entity (XXE) threats
     * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return XxeThreatDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XxeThreatDetectionResult validateDocumentXmlXxeThreatValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXmlXxeThreatValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an XML file for XML External Entity (XXE) threats
     * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;XxeThreatDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XxeThreatDetectionResult> validateDocumentXmlXxeThreatValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXmlXxeThreatValidation");
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

        ParameterizedTypeReference<XxeThreatDetectionResult> localReturnType = new ParameterizedTypeReference<XxeThreatDetectionResult>() {};
        return apiClient.invokeAPI("/convert/validate/xml/xxe-threats", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a Zip Archive file (zip)
     * Validate a Zip archive file (ZIP)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentZipValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentZipValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Zip Archive file (zip)
     * Validate a Zip archive file (ZIP)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentZipValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentZipValidation");
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

        ParameterizedTypeReference<DocumentValidationResult> localReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/zip", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
