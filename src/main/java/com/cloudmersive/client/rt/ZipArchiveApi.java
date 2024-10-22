package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.CreateZipArchiveRequest;
import java.io.File;
import com.cloudmersive.client.rt.model.ZipEncryptionAdvancedRequest;
import com.cloudmersive.client.rt.model.ZipExtractResponse;

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
public class ZipArchiveApi extends BaseApi {

    public ZipArchiveApi() {
        super(new ApiClient());
    }

    public ZipArchiveApi(ApiClient apiClient) {
        super(apiClient);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling zipArchiveZipCreate");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            localVarFormParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            localVarFormParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            localVarFormParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            localVarFormParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            localVarFormParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            localVarFormParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            localVarFormParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            localVarFormParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            localVarFormParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            localVarFormParams.add("inputFile10", inputFile10);

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
        return apiClient.invokeAPI("/convert/archive/zip/create", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling zipArchiveZipCreateAdvanced");
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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/archive/zip/create/advanced", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling zipArchiveZipCreateEncrypted");
        }
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateEncrypted");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (password != null)
        localVarHeaderParams.add("password", apiClient.parameterToString(password));
        if (encryptionAlgorithm != null)
        localVarHeaderParams.add("encryptionAlgorithm", apiClient.parameterToString(encryptionAlgorithm));

        if (inputFile1 != null)
            localVarFormParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            localVarFormParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            localVarFormParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            localVarFormParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            localVarFormParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            localVarFormParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            localVarFormParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            localVarFormParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            localVarFormParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            localVarFormParams.add("inputFile10", inputFile10);

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
        return apiClient.invokeAPI("/convert/archive/zip/create/encrypted", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create an encrypted zip file to quarantine a dangerous file
     * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip, for the purposes of quarantining the underlyikng file.
     * <p><b>200</b> - OK
     * @param password Password to place on the Zip file; the longer the password, the more secure (required)
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object zipArchiveZipCreateQuarantine(String password, org.springframework.core.io.Resource inputFile1, String encryptionAlgorithm) throws RestClientException {
        return zipArchiveZipCreateQuarantineWithHttpInfo(password, inputFile1, encryptionAlgorithm).getBody();
    }

    /**
     * Create an encrypted zip file to quarantine a dangerous file
     * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip, for the purposes of quarantining the underlyikng file.
     * <p><b>200</b> - OK
     * @param password Password to place on the Zip file; the longer the password, the more secure (required)
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> zipArchiveZipCreateQuarantineWithHttpInfo(String password, org.springframework.core.io.Resource inputFile1, String encryptionAlgorithm) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling zipArchiveZipCreateQuarantine");
        }
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateQuarantine");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (password != null)
        localVarHeaderParams.add("password", apiClient.parameterToString(password));
        if (encryptionAlgorithm != null)
        localVarHeaderParams.add("encryptionAlgorithm", apiClient.parameterToString(encryptionAlgorithm));

        if (inputFile1 != null)
            localVarFormParams.add("inputFile1", inputFile1);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/archive/zip/create/quarantine", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'zipPassword' is set
        if (zipPassword == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'zipPassword' when calling zipArchiveZipDecrypt");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling zipArchiveZipDecrypt");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (zipPassword != null)
        localVarHeaderParams.add("zipPassword", apiClient.parameterToString(zipPassword));

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/archive/zip/decrypt", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = encryptionRequest;
        
        // verify the required parameter 'encryptionRequest' is set
        if (encryptionRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encryptionRequest' when calling zipArchiveZipEncryptAdvanced");
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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/archive/zip/encrypt/advanced", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling zipArchiveZipExtract");
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

        ParameterizedTypeReference<ZipExtractResponse> localReturnType = new ParameterizedTypeReference<ZipExtractResponse>() {};
        return apiClient.invokeAPI("/convert/archive/zip/extract", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
