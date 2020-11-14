package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.CreateZipArchiveRequest;
import java.io.File;
import com.cloudmersive.client.model.ZipEncryptionAdvancedRequest;
import com.cloudmersive.client.model.ZipExtractResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.ZipArchiveApi")
public class ZipArchiveApi {
    private ApiClient apiClient;

    public ZipArchiveApi() {
        this(new ApiClient());
    }

    @Autowired
    public ZipArchiveApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Compress files to create a new zip archive
     * Create a new zip archive by compressing input files.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (optional)
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
    public byte[] zipArchiveZipCreate(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return zipArchiveZipCreateWithHttpInfo(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Compress files to create a new zip archive
     * Create a new zip archive by compressing input files.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on. (optional)
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
    public ResponseEntity<byte[]> zipArchiveZipCreateWithHttpInfo(org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling zipArchiveZipCreate");
        }
        
        String path = apiClient.expandPath("/convert/archive/zip/create", Collections.<String, Object>emptyMap());

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
     * Compress files and folders to create a new zip archive with advanced options
     * Create a new zip archive by compressing input files, folders and leverage advanced options to control the structure of the resulting zip archive.
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object zipArchiveZipCreateAdvanced(CreateZipArchiveRequest request) throws RestClientException {
        return zipArchiveZipCreateAdvancedWithHttpInfo(request).getBody();
    }

    /**
     * Compress files and folders to create a new zip archive with advanced options
     * Create a new zip archive by compressing input files, folders and leverage advanced options to control the structure of the resulting zip archive.
     * <p><b>200</b> - OK
     * @param request Input request (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> zipArchiveZipCreateAdvancedWithHttpInfo(CreateZipArchiveRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling zipArchiveZipCreateAdvanced");
        }
        
        String path = apiClient.expandPath("/convert/archive/zip/create/advanced", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Compress files to create a new, encrypted and password-protected zip archive
     * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip.
     * <p><b>200</b> - OK
     * @param password Password to place on the Zip file; the longer the password, the more secure (required)
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256. (optional)
     * @param inputFile2 Second input file to perform the operation on. (optional)
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
    public byte[] zipArchiveZipCreateEncrypted(String password, org.springframework.core.io.Resource inputFile1, String encryptionAlgorithm, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return zipArchiveZipCreateEncryptedWithHttpInfo(password, inputFile1, encryptionAlgorithm, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Compress files to create a new, encrypted and password-protected zip archive
     * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip.
     * <p><b>200</b> - OK
     * @param password Password to place on the Zip file; the longer the password, the more secure (required)
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256. (optional)
     * @param inputFile2 Second input file to perform the operation on. (optional)
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
    public ResponseEntity<byte[]> zipArchiveZipCreateEncryptedWithHttpInfo(String password, org.springframework.core.io.Resource inputFile1, String encryptionAlgorithm, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling zipArchiveZipCreateEncrypted");
        }
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateEncrypted");
        }
        
        String path = apiClient.expandPath("/convert/archive/zip/create/encrypted", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (password != null)
        headerParams.add("password", apiClient.parameterToString(password));
        if (encryptionAlgorithm != null)
        headerParams.add("encryptionAlgorithm", apiClient.parameterToString(encryptionAlgorithm));

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
     * Decrypt and remove password protection on a zip file
     * Decrypts and removes password protection from an encrypted zip file with the specified password
     * <p><b>200</b> - OK
     * @param zipPassword Required; Password for the input archive (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object zipArchiveZipDecrypt(String zipPassword, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return zipArchiveZipDecryptWithHttpInfo(zipPassword, inputFile).getBody();
    }

    /**
     * Decrypt and remove password protection on a zip file
     * Decrypts and removes password protection from an encrypted zip file with the specified password
     * <p><b>200</b> - OK
     * @param zipPassword Required; Password for the input archive (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> zipArchiveZipDecryptWithHttpInfo(String zipPassword, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'zipPassword' is set
        if (zipPassword == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'zipPassword' when calling zipArchiveZipDecrypt");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling zipArchiveZipDecrypt");
        }
        
        String path = apiClient.expandPath("/convert/archive/zip/decrypt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (zipPassword != null)
        headerParams.add("zipPassword", apiClient.parameterToString(zipPassword));

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

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Encrypt and password protect a zip file
     * Encrypts and password protects an existing zip file with the specified password and encryption algorithm
     * <p><b>200</b> - OK
     * @param encryptionRequest Encryption request (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object zipArchiveZipEncryptAdvanced(ZipEncryptionAdvancedRequest encryptionRequest) throws RestClientException {
        return zipArchiveZipEncryptAdvancedWithHttpInfo(encryptionRequest).getBody();
    }

    /**
     * Encrypt and password protect a zip file
     * Encrypts and password protects an existing zip file with the specified password and encryption algorithm
     * <p><b>200</b> - OK
     * @param encryptionRequest Encryption request (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> zipArchiveZipEncryptAdvancedWithHttpInfo(ZipEncryptionAdvancedRequest encryptionRequest) throws RestClientException {
        Object postBody = encryptionRequest;
        
        // verify the required parameter 'encryptionRequest' is set
        if (encryptionRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encryptionRequest' when calling zipArchiveZipEncryptAdvanced");
        }
        
        String path = apiClient.expandPath("/convert/archive/zip/encrypt/advanced", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Extract, decompress files and folders from a zip archive
     * Extracts a zip archive by decompressing files, and folders.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ZipExtractResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ZipExtractResponse zipArchiveZipExtract(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return zipArchiveZipExtractWithHttpInfo(inputFile).getBody();
    }

    /**
     * Extract, decompress files and folders from a zip archive
     * Extracts a zip archive by decompressing files, and folders.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;ZipExtractResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ZipExtractResponse> zipArchiveZipExtractWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling zipArchiveZipExtract");
        }
        
        String path = apiClient.expandPath("/convert/archive/zip/extract", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ZipExtractResponse> returnType = new ParameterizedTypeReference<ZipExtractResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
