package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.CloudStorageAdvancedVirusScanResult;
import com.cloudmersive.client.rt.model.CloudStorageVirusScanResult;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:44.714202400Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ScanCloudStorageApi extends BaseApi {

    public ScanCloudStorageApi() {
        super(new ApiClient());
    }

    public ScanCloudStorageApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Scan an AWS S3 file for viruses
     * Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console (required)
     * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console (required)
     * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39; (required)
     * @param bucketName Name of the S3 bucket (required)
     * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param roleArn Optional: Role ARN for STS Credential-based access.  This is for advanced access using the Security Token Service and is not required.  If the roleArn contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (optional)
     * @return CloudStorageVirusScanResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloudStorageVirusScanResult scanCloudStorageScanAwsS3File(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, String roleArn) throws RestClientException {
        return scanCloudStorageScanAwsS3FileWithHttpInfo(accessKey, secretKey, bucketRegion, bucketName, keyName, roleArn).getBody();
    }

    /**
     * Scan an AWS S3 file for viruses
     * Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console (required)
     * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console (required)
     * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39; (required)
     * @param bucketName Name of the S3 bucket (required)
     * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param roleArn Optional: Role ARN for STS Credential-based access.  This is for advanced access using the Security Token Service and is not required.  If the roleArn contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (optional)
     * @return ResponseEntity&lt;CloudStorageVirusScanResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloudStorageVirusScanResult> scanCloudStorageScanAwsS3FileWithHttpInfo(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, String roleArn) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessKey' when calling scanCloudStorageScanAwsS3File");
        }
        
        // verify the required parameter 'secretKey' is set
        if (secretKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secretKey' when calling scanCloudStorageScanAwsS3File");
        }
        
        // verify the required parameter 'bucketRegion' is set
        if (bucketRegion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketRegion' when calling scanCloudStorageScanAwsS3File");
        }
        
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketName' when calling scanCloudStorageScanAwsS3File");
        }
        
        // verify the required parameter 'keyName' is set
        if (keyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyName' when calling scanCloudStorageScanAwsS3File");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accessKey != null)
        localVarHeaderParams.add("accessKey", apiClient.parameterToString(accessKey));
        if (secretKey != null)
        localVarHeaderParams.add("secretKey", apiClient.parameterToString(secretKey));
        if (bucketRegion != null)
        localVarHeaderParams.add("bucketRegion", apiClient.parameterToString(bucketRegion));
        if (bucketName != null)
        localVarHeaderParams.add("bucketName", apiClient.parameterToString(bucketName));
        if (keyName != null)
        localVarHeaderParams.add("keyName", apiClient.parameterToString(keyName));
        if (roleArn != null)
        localVarHeaderParams.add("roleArn", apiClient.parameterToString(roleArn));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageVirusScanResult> localReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/aws-s3/single", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Advanced Scan an AWS S3 file for viruses
     * Advanced Scan the contents of a single AWS S3 file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console (required)
     * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console (required)
     * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39; (required)
     * @param bucketName Name of the S3 bucket (required)
     * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param roleArn Optional: Role ARN for STS Credential-based access.  This is for advanced access using the Security Token Service and is not required.  If the roleArn contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (optional)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability]. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @return CloudStorageAdvancedVirusScanResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanAwsS3FileAdvanced(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, String roleArn, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws RestClientException {
        return scanCloudStorageScanAwsS3FileAdvancedWithHttpInfo(accessKey, secretKey, bucketRegion, bucketName, keyName, roleArn, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).getBody();
    }

    /**
     * Advanced Scan an AWS S3 file for viruses
     * Advanced Scan the contents of a single AWS S3 file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console (required)
     * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console (required)
     * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39; (required)
     * @param bucketName Name of the S3 bucket (required)
     * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param roleArn Optional: Role ARN for STS Credential-based access.  This is for advanced access using the Security Token Service and is not required.  If the roleArn contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (optional)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability]. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @return ResponseEntity&lt;CloudStorageAdvancedVirusScanResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloudStorageAdvancedVirusScanResult> scanCloudStorageScanAwsS3FileAdvancedWithHttpInfo(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, String roleArn, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessKey' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }
        
        // verify the required parameter 'secretKey' is set
        if (secretKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secretKey' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }
        
        // verify the required parameter 'bucketRegion' is set
        if (bucketRegion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketRegion' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }
        
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketName' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }
        
        // verify the required parameter 'keyName' is set
        if (keyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyName' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accessKey != null)
        localVarHeaderParams.add("accessKey", apiClient.parameterToString(accessKey));
        if (secretKey != null)
        localVarHeaderParams.add("secretKey", apiClient.parameterToString(secretKey));
        if (bucketRegion != null)
        localVarHeaderParams.add("bucketRegion", apiClient.parameterToString(bucketRegion));
        if (bucketName != null)
        localVarHeaderParams.add("bucketName", apiClient.parameterToString(bucketName));
        if (keyName != null)
        localVarHeaderParams.add("keyName", apiClient.parameterToString(keyName));
        if (roleArn != null)
        localVarHeaderParams.add("roleArn", apiClient.parameterToString(roleArn));
        if (allowExecutables != null)
        localVarHeaderParams.add("allowExecutables", apiClient.parameterToString(allowExecutables));
        if (allowInvalidFiles != null)
        localVarHeaderParams.add("allowInvalidFiles", apiClient.parameterToString(allowInvalidFiles));
        if (allowScripts != null)
        localVarHeaderParams.add("allowScripts", apiClient.parameterToString(allowScripts));
        if (allowPasswordProtectedFiles != null)
        localVarHeaderParams.add("allowPasswordProtectedFiles", apiClient.parameterToString(allowPasswordProtectedFiles));
        if (allowMacros != null)
        localVarHeaderParams.add("allowMacros", apiClient.parameterToString(allowMacros));
        if (allowXmlExternalEntities != null)
        localVarHeaderParams.add("allowXmlExternalEntities", apiClient.parameterToString(allowXmlExternalEntities));
        if (allowInsecureDeserialization != null)
        localVarHeaderParams.add("allowInsecureDeserialization", apiClient.parameterToString(allowInsecureDeserialization));
        if (allowHtml != null)
        localVarHeaderParams.add("allowHtml", apiClient.parameterToString(allowHtml));
        if (restrictFileTypes != null)
        localVarHeaderParams.add("restrictFileTypes", apiClient.parameterToString(restrictFileTypes));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/aws-s3/single/advanced", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Scan an Azure Blob for viruses
     * Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal. (required)
     * @param containerName Name of the Blob container within the Azure Blob Storage account (required)
     * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @return CloudStorageVirusScanResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloudStorageVirusScanResult scanCloudStorageScanAzureBlob(String connectionString, String containerName, String blobPath) throws RestClientException {
        return scanCloudStorageScanAzureBlobWithHttpInfo(connectionString, containerName, blobPath).getBody();
    }

    /**
     * Scan an Azure Blob for viruses
     * Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal. (required)
     * @param containerName Name of the Blob container within the Azure Blob Storage account (required)
     * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @return ResponseEntity&lt;CloudStorageVirusScanResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloudStorageVirusScanResult> scanCloudStorageScanAzureBlobWithHttpInfo(String connectionString, String containerName, String blobPath) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'connectionString' is set
        if (connectionString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionString' when calling scanCloudStorageScanAzureBlob");
        }
        
        // verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'containerName' when calling scanCloudStorageScanAzureBlob");
        }
        
        // verify the required parameter 'blobPath' is set
        if (blobPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'blobPath' when calling scanCloudStorageScanAzureBlob");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (connectionString != null)
        localVarHeaderParams.add("connectionString", apiClient.parameterToString(connectionString));
        if (containerName != null)
        localVarHeaderParams.add("containerName", apiClient.parameterToString(containerName));
        if (blobPath != null)
        localVarHeaderParams.add("blobPath", apiClient.parameterToString(blobPath));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageVirusScanResult> localReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/azure-blob/single", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Advanced Scan an Azure Blob for viruses
     * Advanced Scan the contents of a single Azure Blob and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal. (required)
     * @param containerName Name of the Blob container within the Azure Blob Storage account (required)
     * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability]. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @return CloudStorageAdvancedVirusScanResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanAzureBlobAdvanced(String connectionString, String containerName, String blobPath, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws RestClientException {
        return scanCloudStorageScanAzureBlobAdvancedWithHttpInfo(connectionString, containerName, blobPath, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).getBody();
    }

    /**
     * Advanced Scan an Azure Blob for viruses
     * Advanced Scan the contents of a single Azure Blob and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal. (required)
     * @param containerName Name of the Blob container within the Azure Blob Storage account (required)
     * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability]. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @return ResponseEntity&lt;CloudStorageAdvancedVirusScanResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloudStorageAdvancedVirusScanResult> scanCloudStorageScanAzureBlobAdvancedWithHttpInfo(String connectionString, String containerName, String blobPath, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'connectionString' is set
        if (connectionString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionString' when calling scanCloudStorageScanAzureBlobAdvanced");
        }
        
        // verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'containerName' when calling scanCloudStorageScanAzureBlobAdvanced");
        }
        
        // verify the required parameter 'blobPath' is set
        if (blobPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'blobPath' when calling scanCloudStorageScanAzureBlobAdvanced");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (connectionString != null)
        localVarHeaderParams.add("connectionString", apiClient.parameterToString(connectionString));
        if (containerName != null)
        localVarHeaderParams.add("containerName", apiClient.parameterToString(containerName));
        if (blobPath != null)
        localVarHeaderParams.add("blobPath", apiClient.parameterToString(blobPath));
        if (allowExecutables != null)
        localVarHeaderParams.add("allowExecutables", apiClient.parameterToString(allowExecutables));
        if (allowInvalidFiles != null)
        localVarHeaderParams.add("allowInvalidFiles", apiClient.parameterToString(allowInvalidFiles));
        if (allowScripts != null)
        localVarHeaderParams.add("allowScripts", apiClient.parameterToString(allowScripts));
        if (allowPasswordProtectedFiles != null)
        localVarHeaderParams.add("allowPasswordProtectedFiles", apiClient.parameterToString(allowPasswordProtectedFiles));
        if (allowMacros != null)
        localVarHeaderParams.add("allowMacros", apiClient.parameterToString(allowMacros));
        if (allowXmlExternalEntities != null)
        localVarHeaderParams.add("allowXmlExternalEntities", apiClient.parameterToString(allowXmlExternalEntities));
        if (allowInsecureDeserialization != null)
        localVarHeaderParams.add("allowInsecureDeserialization", apiClient.parameterToString(allowInsecureDeserialization));
        if (allowHtml != null)
        localVarHeaderParams.add("allowHtml", apiClient.parameterToString(allowHtml));
        if (restrictFileTypes != null)
        localVarHeaderParams.add("restrictFileTypes", apiClient.parameterToString(restrictFileTypes));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/azure-blob/single/advanced", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Scan an Google Cloud Platform (GCP) Storage file for viruses
     * Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param bucketName Name of the bucket in Google Cloud Storage (required)
     * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file. (required)
     * @return CloudStorageVirusScanResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloudStorageVirusScanResult scanCloudStorageScanGcpStorageFile(String bucketName, String objectName, org.springframework.core.io.Resource jsonCredentialFile) throws RestClientException {
        return scanCloudStorageScanGcpStorageFileWithHttpInfo(bucketName, objectName, jsonCredentialFile).getBody();
    }

    /**
     * Scan an Google Cloud Platform (GCP) Storage file for viruses
     * Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param bucketName Name of the bucket in Google Cloud Storage (required)
     * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file. (required)
     * @return ResponseEntity&lt;CloudStorageVirusScanResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloudStorageVirusScanResult> scanCloudStorageScanGcpStorageFileWithHttpInfo(String bucketName, String objectName, org.springframework.core.io.Resource jsonCredentialFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketName' when calling scanCloudStorageScanGcpStorageFile");
        }
        
        // verify the required parameter 'objectName' is set
        if (objectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'objectName' when calling scanCloudStorageScanGcpStorageFile");
        }
        
        // verify the required parameter 'jsonCredentialFile' is set
        if (jsonCredentialFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jsonCredentialFile' when calling scanCloudStorageScanGcpStorageFile");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (bucketName != null)
        localVarHeaderParams.add("bucketName", apiClient.parameterToString(bucketName));
        if (objectName != null)
        localVarHeaderParams.add("objectName", apiClient.parameterToString(objectName));

        if (jsonCredentialFile != null)
            localVarFormParams.add("jsonCredentialFile", jsonCredentialFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageVirusScanResult> localReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/gcp-storage/single", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses
     * Advanced Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param bucketName Name of the bucket in Google Cloud Storage (required)
     * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file. (required)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability]. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @return CloudStorageAdvancedVirusScanResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanGcpStorageFileAdvanced(String bucketName, String objectName, org.springframework.core.io.Resource jsonCredentialFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws RestClientException {
        return scanCloudStorageScanGcpStorageFileAdvancedWithHttpInfo(bucketName, objectName, jsonCredentialFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).getBody();
    }

    /**
     * Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses
     * Advanced Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param bucketName Name of the bucket in Google Cloud Storage (required)
     * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file. (required)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability]. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @return ResponseEntity&lt;CloudStorageAdvancedVirusScanResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloudStorageAdvancedVirusScanResult> scanCloudStorageScanGcpStorageFileAdvancedWithHttpInfo(String bucketName, String objectName, org.springframework.core.io.Resource jsonCredentialFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketName' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }
        
        // verify the required parameter 'objectName' is set
        if (objectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'objectName' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }
        
        // verify the required parameter 'jsonCredentialFile' is set
        if (jsonCredentialFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jsonCredentialFile' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (bucketName != null)
        localVarHeaderParams.add("bucketName", apiClient.parameterToString(bucketName));
        if (objectName != null)
        localVarHeaderParams.add("objectName", apiClient.parameterToString(objectName));
        if (allowExecutables != null)
        localVarHeaderParams.add("allowExecutables", apiClient.parameterToString(allowExecutables));
        if (allowInvalidFiles != null)
        localVarHeaderParams.add("allowInvalidFiles", apiClient.parameterToString(allowInvalidFiles));
        if (allowScripts != null)
        localVarHeaderParams.add("allowScripts", apiClient.parameterToString(allowScripts));
        if (allowPasswordProtectedFiles != null)
        localVarHeaderParams.add("allowPasswordProtectedFiles", apiClient.parameterToString(allowPasswordProtectedFiles));
        if (allowMacros != null)
        localVarHeaderParams.add("allowMacros", apiClient.parameterToString(allowMacros));
        if (allowXmlExternalEntities != null)
        localVarHeaderParams.add("allowXmlExternalEntities", apiClient.parameterToString(allowXmlExternalEntities));
        if (allowInsecureDeserialization != null)
        localVarHeaderParams.add("allowInsecureDeserialization", apiClient.parameterToString(allowInsecureDeserialization));
        if (allowHtml != null)
        localVarHeaderParams.add("allowHtml", apiClient.parameterToString(allowHtml));
        if (restrictFileTypes != null)
        localVarHeaderParams.add("restrictFileTypes", apiClient.parameterToString(restrictFileTypes));

        if (jsonCredentialFile != null)
            localVarFormParams.add("jsonCredentialFile", jsonCredentialFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/gcp-storage/single/advanced", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Virus Scan a file in a SharePoint Online Site Drive
     * Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     * <p><b>200</b> - OK
     * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal. (required)
     * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal (required)
     * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com (required)
     * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from (required)
     * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param tenantID Optional; Tenant ID of your Azure Active Directory (optional)
     * @param itemID SharePoint itemID, such as a DriveItem Id (optional)
     * @return CloudStorageVirusScanResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloudStorageVirusScanResult scanCloudStorageScanSharePointOnlineFile(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, String tenantID, String itemID) throws RestClientException {
        return scanCloudStorageScanSharePointOnlineFileWithHttpInfo(clientID, clientSecret, sharepointDomainName, siteID, filePath, tenantID, itemID).getBody();
    }

    /**
     * Virus Scan a file in a SharePoint Online Site Drive
     * Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     * <p><b>200</b> - OK
     * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal. (required)
     * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal (required)
     * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com (required)
     * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from (required)
     * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (required)
     * @param tenantID Optional; Tenant ID of your Azure Active Directory (optional)
     * @param itemID SharePoint itemID, such as a DriveItem Id (optional)
     * @return ResponseEntity&lt;CloudStorageVirusScanResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloudStorageVirusScanResult> scanCloudStorageScanSharePointOnlineFileWithHttpInfo(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, String tenantID, String itemID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'clientID' is set
        if (clientID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientID' when calling scanCloudStorageScanSharePointOnlineFile");
        }
        
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientSecret' when calling scanCloudStorageScanSharePointOnlineFile");
        }
        
        // verify the required parameter 'sharepointDomainName' is set
        if (sharepointDomainName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sharepointDomainName' when calling scanCloudStorageScanSharePointOnlineFile");
        }
        
        // verify the required parameter 'siteID' is set
        if (siteID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'siteID' when calling scanCloudStorageScanSharePointOnlineFile");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filePath' when calling scanCloudStorageScanSharePointOnlineFile");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (clientID != null)
        localVarHeaderParams.add("clientID", apiClient.parameterToString(clientID));
        if (clientSecret != null)
        localVarHeaderParams.add("clientSecret", apiClient.parameterToString(clientSecret));
        if (sharepointDomainName != null)
        localVarHeaderParams.add("sharepointDomainName", apiClient.parameterToString(sharepointDomainName));
        if (siteID != null)
        localVarHeaderParams.add("siteID", apiClient.parameterToString(siteID));
        if (tenantID != null)
        localVarHeaderParams.add("tenantID", apiClient.parameterToString(tenantID));
        if (filePath != null)
        localVarHeaderParams.add("filePath", apiClient.parameterToString(filePath));
        if (itemID != null)
        localVarHeaderParams.add("itemID", apiClient.parameterToString(itemID));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageVirusScanResult> localReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/sharepoint-online/site/single", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Advanced Virus Scan a file in a SharePoint Online Site Drive
     * Advanced Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     * <p><b>200</b> - OK
     * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal. (required)
     * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal (required)
     * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com (required)
     * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from (required)
     * @param tenantID Optional; Tenant ID of your Azure Active Directory (optional)
     * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (optional)
     * @param itemID SharePoint itemID, such as a DriveItem Id (optional)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability]. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @return CloudStorageAdvancedVirusScanResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanSharePointOnlineFileAdvanced(String clientID, String clientSecret, String sharepointDomainName, String siteID, String tenantID, String filePath, String itemID, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws RestClientException {
        return scanCloudStorageScanSharePointOnlineFileAdvancedWithHttpInfo(clientID, clientSecret, sharepointDomainName, siteID, tenantID, filePath, itemID, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).getBody();
    }

    /**
     * Advanced Virus Scan a file in a SharePoint Online Site Drive
     * Advanced Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     * <p><b>200</b> - OK
     * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal. (required)
     * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal (required)
     * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com (required)
     * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from (required)
     * @param tenantID Optional; Tenant ID of your Azure Active Directory (optional)
     * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;. (optional)
     * @param itemID SharePoint itemID, such as a DriveItem Id (optional)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability]. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @return ResponseEntity&lt;CloudStorageAdvancedVirusScanResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloudStorageAdvancedVirusScanResult> scanCloudStorageScanSharePointOnlineFileAdvancedWithHttpInfo(String clientID, String clientSecret, String sharepointDomainName, String siteID, String tenantID, String filePath, String itemID, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'clientID' is set
        if (clientID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientID' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }
        
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientSecret' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }
        
        // verify the required parameter 'sharepointDomainName' is set
        if (sharepointDomainName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sharepointDomainName' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }
        
        // verify the required parameter 'siteID' is set
        if (siteID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'siteID' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (clientID != null)
        localVarHeaderParams.add("clientID", apiClient.parameterToString(clientID));
        if (clientSecret != null)
        localVarHeaderParams.add("clientSecret", apiClient.parameterToString(clientSecret));
        if (sharepointDomainName != null)
        localVarHeaderParams.add("sharepointDomainName", apiClient.parameterToString(sharepointDomainName));
        if (siteID != null)
        localVarHeaderParams.add("siteID", apiClient.parameterToString(siteID));
        if (tenantID != null)
        localVarHeaderParams.add("tenantID", apiClient.parameterToString(tenantID));
        if (filePath != null)
        localVarHeaderParams.add("filePath", apiClient.parameterToString(filePath));
        if (itemID != null)
        localVarHeaderParams.add("itemID", apiClient.parameterToString(itemID));
        if (allowExecutables != null)
        localVarHeaderParams.add("allowExecutables", apiClient.parameterToString(allowExecutables));
        if (allowInvalidFiles != null)
        localVarHeaderParams.add("allowInvalidFiles", apiClient.parameterToString(allowInvalidFiles));
        if (allowScripts != null)
        localVarHeaderParams.add("allowScripts", apiClient.parameterToString(allowScripts));
        if (allowPasswordProtectedFiles != null)
        localVarHeaderParams.add("allowPasswordProtectedFiles", apiClient.parameterToString(allowPasswordProtectedFiles));
        if (allowMacros != null)
        localVarHeaderParams.add("allowMacros", apiClient.parameterToString(allowMacros));
        if (allowXmlExternalEntities != null)
        localVarHeaderParams.add("allowXmlExternalEntities", apiClient.parameterToString(allowXmlExternalEntities));
        if (allowInsecureDeserialization != null)
        localVarHeaderParams.add("allowInsecureDeserialization", apiClient.parameterToString(allowInsecureDeserialization));
        if (allowHtml != null)
        localVarHeaderParams.add("allowHtml", apiClient.parameterToString(allowHtml));
        if (restrictFileTypes != null)
        localVarHeaderParams.add("restrictFileTypes", apiClient.parameterToString(restrictFileTypes));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/sharepoint-online/site/advanced", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
