# ZipArchiveApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zipArchiveZipCreate**](ZipArchiveApi.md#zipArchiveZipCreate) | **POST** /convert/archive/zip/create | Compress files to create a new zip archive
[**zipArchiveZipCreateAdvanced**](ZipArchiveApi.md#zipArchiveZipCreateAdvanced) | **POST** /convert/archive/zip/create/advanced | Compress files and folders to create a new zip archive with advanced options
[**zipArchiveZipCreateEncrypted**](ZipArchiveApi.md#zipArchiveZipCreateEncrypted) | **POST** /convert/archive/zip/create/encrypted | Compress files to create a new, encrypted and password-protected zip archive
[**zipArchiveZipCreateQuarantine**](ZipArchiveApi.md#zipArchiveZipCreateQuarantine) | **POST** /convert/archive/zip/create/quarantine | Create an encrypted zip file to quarantine a dangerous file
[**zipArchiveZipDecrypt**](ZipArchiveApi.md#zipArchiveZipDecrypt) | **POST** /convert/archive/zip/decrypt | Decrypt and remove password protection on a zip file
[**zipArchiveZipEncryptAdvanced**](ZipArchiveApi.md#zipArchiveZipEncryptAdvanced) | **POST** /convert/archive/zip/encrypt/advanced | Encrypt and password protect a zip file
[**zipArchiveZipExtract**](ZipArchiveApi.md#zipArchiveZipExtract) | **POST** /convert/archive/zip/extract | Extract, decompress files and folders from a zip archive



## zipArchiveZipCreate

> byte[] zipArchiveZipCreate(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10)

Compress files to create a new zip archive

Create a new zip archive by compressing input files.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ZipArchiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ZipArchiveApi apiInstance = new ZipArchiveApi(defaultClient);
        File inputFile1 = new File("/path/to/file"); // File | First input file to perform the operation on.
        File inputFile2 = new File("/path/to/file"); // File | Second input file to perform the operation on.
        File inputFile3 = new File("/path/to/file"); // File | Third input file to perform the operation on.
        File inputFile4 = new File("/path/to/file"); // File | Fourth input file to perform the operation on.
        File inputFile5 = new File("/path/to/file"); // File | Fifth input file to perform the operation on.
        File inputFile6 = new File("/path/to/file"); // File | Sixth input file to perform the operation on.
        File inputFile7 = new File("/path/to/file"); // File | Seventh input file to perform the operation on.
        File inputFile8 = new File("/path/to/file"); // File | Eighth input file to perform the operation on.
        File inputFile9 = new File("/path/to/file"); // File | Ninth input file to perform the operation on.
        File inputFile10 = new File("/path/to/file"); // File | Tenth input file to perform the operation on.
        try {
            byte[] result = apiInstance.zipArchiveZipCreate(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile1** | **File**| First input file to perform the operation on. |
 **inputFile2** | **File**| Second input file to perform the operation on. | [optional]
 **inputFile3** | **File**| Third input file to perform the operation on. | [optional]
 **inputFile4** | **File**| Fourth input file to perform the operation on. | [optional]
 **inputFile5** | **File**| Fifth input file to perform the operation on. | [optional]
 **inputFile6** | **File**| Sixth input file to perform the operation on. | [optional]
 **inputFile7** | **File**| Seventh input file to perform the operation on. | [optional]
 **inputFile8** | **File**| Eighth input file to perform the operation on. | [optional]
 **inputFile9** | **File**| Ninth input file to perform the operation on. | [optional]
 **inputFile10** | **File**| Tenth input file to perform the operation on. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## zipArchiveZipCreateAdvanced

> Object zipArchiveZipCreateAdvanced(request)

Compress files and folders to create a new zip archive with advanced options

Create a new zip archive by compressing input files, folders and leverage advanced options to control the structure of the resulting zip archive.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ZipArchiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ZipArchiveApi apiInstance = new ZipArchiveApi(defaultClient);
        CreateZipArchiveRequest request = new CreateZipArchiveRequest(); // CreateZipArchiveRequest | Input request
        try {
            Object result = apiInstance.zipArchiveZipCreateAdvanced(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipCreateAdvanced");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateZipArchiveRequest**](CreateZipArchiveRequest.md)| Input request |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## zipArchiveZipCreateEncrypted

> byte[] zipArchiveZipCreateEncrypted(password, inputFile1, encryptionAlgorithm, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10)

Compress files to create a new, encrypted and password-protected zip archive

Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ZipArchiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ZipArchiveApi apiInstance = new ZipArchiveApi(defaultClient);
        String password = "password_example"; // String | Password to place on the Zip file; the longer the password, the more secure
        File inputFile1 = new File("/path/to/file"); // File | First input file to perform the operation on.
        String encryptionAlgorithm = "encryptionAlgorithm_example"; // String | Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256.
        File inputFile2 = new File("/path/to/file"); // File | Second input file to perform the operation on.
        File inputFile3 = new File("/path/to/file"); // File | Third input file to perform the operation on.
        File inputFile4 = new File("/path/to/file"); // File | Fourth input file to perform the operation on.
        File inputFile5 = new File("/path/to/file"); // File | Fifth input file to perform the operation on.
        File inputFile6 = new File("/path/to/file"); // File | Sixth input file to perform the operation on.
        File inputFile7 = new File("/path/to/file"); // File | Seventh input file to perform the operation on.
        File inputFile8 = new File("/path/to/file"); // File | Eighth input file to perform the operation on.
        File inputFile9 = new File("/path/to/file"); // File | Ninth input file to perform the operation on.
        File inputFile10 = new File("/path/to/file"); // File | Tenth input file to perform the operation on.
        try {
            byte[] result = apiInstance.zipArchiveZipCreateEncrypted(password, inputFile1, encryptionAlgorithm, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipCreateEncrypted");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **password** | **String**| Password to place on the Zip file; the longer the password, the more secure |
 **inputFile1** | **File**| First input file to perform the operation on. |
 **encryptionAlgorithm** | **String**| Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256. | [optional]
 **inputFile2** | **File**| Second input file to perform the operation on. | [optional]
 **inputFile3** | **File**| Third input file to perform the operation on. | [optional]
 **inputFile4** | **File**| Fourth input file to perform the operation on. | [optional]
 **inputFile5** | **File**| Fifth input file to perform the operation on. | [optional]
 **inputFile6** | **File**| Sixth input file to perform the operation on. | [optional]
 **inputFile7** | **File**| Seventh input file to perform the operation on. | [optional]
 **inputFile8** | **File**| Eighth input file to perform the operation on. | [optional]
 **inputFile9** | **File**| Ninth input file to perform the operation on. | [optional]
 **inputFile10** | **File**| Tenth input file to perform the operation on. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## zipArchiveZipCreateQuarantine

> Object zipArchiveZipCreateQuarantine(password, inputFile1, encryptionAlgorithm)

Create an encrypted zip file to quarantine a dangerous file

Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip, for the purposes of quarantining the underlyikng file.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ZipArchiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ZipArchiveApi apiInstance = new ZipArchiveApi(defaultClient);
        String password = "password_example"; // String | Password to place on the Zip file; the longer the password, the more secure
        File inputFile1 = new File("/path/to/file"); // File | First input file to perform the operation on.
        String encryptionAlgorithm = "encryptionAlgorithm_example"; // String | Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256.
        try {
            Object result = apiInstance.zipArchiveZipCreateQuarantine(password, inputFile1, encryptionAlgorithm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipCreateQuarantine");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **password** | **String**| Password to place on the Zip file; the longer the password, the more secure |
 **inputFile1** | **File**| First input file to perform the operation on. |
 **encryptionAlgorithm** | **String**| Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256. | [optional]

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## zipArchiveZipDecrypt

> Object zipArchiveZipDecrypt(zipPassword, inputFile)

Decrypt and remove password protection on a zip file

Decrypts and removes password protection from an encrypted zip file with the specified password

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ZipArchiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ZipArchiveApi apiInstance = new ZipArchiveApi(defaultClient);
        String zipPassword = "zipPassword_example"; // String | Required; Password for the input archive
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            Object result = apiInstance.zipArchiveZipDecrypt(zipPassword, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipDecrypt");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipPassword** | **String**| Required; Password for the input archive |
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## zipArchiveZipEncryptAdvanced

> Object zipArchiveZipEncryptAdvanced(encryptionRequest)

Encrypt and password protect a zip file

Encrypts and password protects an existing zip file with the specified password and encryption algorithm

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ZipArchiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ZipArchiveApi apiInstance = new ZipArchiveApi(defaultClient);
        ZipEncryptionAdvancedRequest encryptionRequest = new ZipEncryptionAdvancedRequest(); // ZipEncryptionAdvancedRequest | Encryption request
        try {
            Object result = apiInstance.zipArchiveZipEncryptAdvanced(encryptionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipEncryptAdvanced");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptionRequest** | [**ZipEncryptionAdvancedRequest**](ZipEncryptionAdvancedRequest.md)| Encryption request |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## zipArchiveZipExtract

> ZipExtractResponse zipArchiveZipExtract(inputFile)

Extract, decompress files and folders from a zip archive

Extracts a zip archive by decompressing files, and folders.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ZipArchiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ZipArchiveApi apiInstance = new ZipArchiveApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            ZipExtractResponse result = apiInstance.zipArchiveZipExtract(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipExtract");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**ZipExtractResponse**](ZipExtractResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

