# EditPdfApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editPdfAddAnnotations**](EditPdfApi.md#editPdfAddAnnotations) | **POST** /convert/edit/pdf/annotations/add-item | Add one or more PDF annotations, comments in the PDF document
[**editPdfConvertToPdfA**](EditPdfApi.md#editPdfConvertToPdfA) | **POST** /convert/edit/pdf/optimize/pdf-a | Convert a PDF file to PDF/A
[**editPdfDecrypt**](EditPdfApi.md#editPdfDecrypt) | **POST** /convert/edit/pdf/decrypt | Decrypt and password-protect a PDF
[**editPdfDeletePages**](EditPdfApi.md#editPdfDeletePages) | **POST** /convert/edit/pdf/pages/delete | Remove, delete pages from a PDF document
[**editPdfEncrypt**](EditPdfApi.md#editPdfEncrypt) | **POST** /convert/edit/pdf/encrypt | Encrypt and password-protect a PDF
[**editPdfGetAnnotations**](EditPdfApi.md#editPdfGetAnnotations) | **POST** /convert/edit/pdf/annotations/list | Get PDF annotations, including comments in the document
[**editPdfGetFormFields**](EditPdfApi.md#editPdfGetFormFields) | **POST** /convert/edit/pdf/form/get-fields | Gets PDF Form fields and values
[**editPdfGetMetadata**](EditPdfApi.md#editPdfGetMetadata) | **POST** /convert/edit/pdf/get-metadata | Get PDF document metadata
[**editPdfGetPdfTextByPages**](EditPdfApi.md#editPdfGetPdfTextByPages) | **POST** /convert/edit/pdf/pages/get-text | Get text in a PDF document by page
[**editPdfInsertPages**](EditPdfApi.md#editPdfInsertPages) | **POST** /convert/edit/pdf/pages/insert | Insert, copy pages from one PDF document into another
[**editPdfLinearize**](EditPdfApi.md#editPdfLinearize) | **POST** /convert/edit/pdf/optimize/linearize | Linearize and optimize a PDF for streaming download
[**editPdfRasterize**](EditPdfApi.md#editPdfRasterize) | **POST** /convert/edit/pdf/rasterize | Rasterize a PDF to an image-based PDF
[**editPdfReduceFileSize**](EditPdfApi.md#editPdfReduceFileSize) | **POST** /convert/edit/pdf/optimize/reduce-file-size | Reduce the file size and optimize a PDF
[**editPdfRemoveAllAnnotations**](EditPdfApi.md#editPdfRemoveAllAnnotations) | **POST** /convert/edit/pdf/annotations/remove-all | Remove all PDF annotations, including comments in the document
[**editPdfRemoveAnnotationItem**](EditPdfApi.md#editPdfRemoveAnnotationItem) | **POST** /convert/edit/pdf/annotations/remove-item | Remove a specific PDF annotation, comment in the document
[**editPdfResize**](EditPdfApi.md#editPdfResize) | **POST** /convert/edit/pdf/resize | Change PDF Document&#39;s Paper Size
[**editPdfRotateAllPages**](EditPdfApi.md#editPdfRotateAllPages) | **POST** /convert/edit/pdf/pages/rotate/all | Rotate all pages in a PDF document
[**editPdfRotatePageRange**](EditPdfApi.md#editPdfRotatePageRange) | **POST** /convert/edit/pdf/pages/rotate/page-range | Rotate a range, subset of pages in a PDF document
[**editPdfSetFormFields**](EditPdfApi.md#editPdfSetFormFields) | **POST** /convert/edit/pdf/form/set-fields | Sets ands fills PDF Form field values
[**editPdfSetMetadata**](EditPdfApi.md#editPdfSetMetadata) | **POST** /convert/edit/pdf/set-metadata | Sets PDF document metadata
[**editPdfSetPermissions**](EditPdfApi.md#editPdfSetPermissions) | **POST** /convert/edit/pdf/encrypt/set-permissions | Encrypt, password-protect and set restricted permissions on a PDF
[**editPdfWatermarkText**](EditPdfApi.md#editPdfWatermarkText) | **POST** /convert/edit/pdf/watermark/text | Add a text watermark to a PDF



## editPdfAddAnnotations

> byte[] editPdfAddAnnotations(request)

Add one or more PDF annotations, comments in the PDF document

Adds one or more annotations, comments to a PDF document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        AddPdfAnnotationRequest request = new AddPdfAnnotationRequest(); // AddPdfAnnotationRequest | 
        try {
            byte[] result = apiInstance.editPdfAddAnnotations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfAddAnnotations");
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
 **request** | [**AddPdfAnnotationRequest**](AddPdfAnnotationRequest.md)|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editPdfConvertToPdfA

> byte[] editPdfConvertToPdfA(inputFile, conformanceLevel)

Convert a PDF file to PDF/A

Converts the input PDF file to a PDF/A-1b or PDF/A-2b standardized PDF.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        String conformanceLevel = "conformanceLevel_example"; // String | Optional: Select the conformance level for PDF/A - specify '1b' for PDF/A-1b or specify '2b' for PDF/A-2b; default is PDF/A-1b
        try {
            byte[] result = apiInstance.editPdfConvertToPdfA(inputFile, conformanceLevel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfConvertToPdfA");
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
 **conformanceLevel** | **String**| Optional: Select the conformance level for PDF/A - specify &#39;1b&#39; for PDF/A-1b or specify &#39;2b&#39; for PDF/A-2b; default is PDF/A-1b | [optional]

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


## editPdfDecrypt

> byte[] editPdfDecrypt(password, inputFile)

Decrypt and password-protect a PDF

Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        String password = "password_example"; // String | Valid password for the PDF file
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfDecrypt(password, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfDecrypt");
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
 **password** | **String**| Valid password for the PDF file |
 **inputFile** | **File**| Input file to perform the operation on. |

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


## editPdfDeletePages

> byte[] editPdfDeletePages(pageStart, pageEnd, inputFile)

Remove, delete pages from a PDF document

Remove one or more pages from a PDF document

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        Integer pageStart = 56; // Integer | Page number (1 based) to start deleting pages from (inclusive).
        Integer pageEnd = 56; // Integer | Page number (1 based) to stop deleting pages from (inclusive).
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfDeletePages(pageStart, pageEnd, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfDeletePages");
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
 **pageStart** | **Integer**| Page number (1 based) to start deleting pages from (inclusive). |
 **pageEnd** | **Integer**| Page number (1 based) to stop deleting pages from (inclusive). |
 **inputFile** | **File**| Input file to perform the operation on. |

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


## editPdfEncrypt

> byte[] editPdfEncrypt(inputFile, userPassword, ownerPassword, encryptionKeyLength)

Encrypt and password-protect a PDF

Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        String userPassword = "userPassword_example"; // String | Password of a user (reader) of the PDF file
        String ownerPassword = "ownerPassword_example"; // String | Password of a owner (creator/editor) of the PDF file
        String encryptionKeyLength = "encryptionKeyLength_example"; // String | Possible values are \"128\" (128-bit RC4 encryption) and \"256\" (256-bit AES encryption).  Default is 256.
        try {
            byte[] result = apiInstance.editPdfEncrypt(inputFile, userPassword, ownerPassword, encryptionKeyLength);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfEncrypt");
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
 **userPassword** | **String**| Password of a user (reader) of the PDF file | [optional]
 **ownerPassword** | **String**| Password of a owner (creator/editor) of the PDF file | [optional]
 **encryptionKeyLength** | **String**| Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256. | [optional]

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


## editPdfGetAnnotations

> GetPdfAnnotationsResult editPdfGetAnnotations(inputFile)

Get PDF annotations, including comments in the document

Enumerates the annotations, including comments and notes, in a PDF document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            GetPdfAnnotationsResult result = apiInstance.editPdfGetAnnotations(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfGetAnnotations");
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

[**GetPdfAnnotationsResult**](GetPdfAnnotationsResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editPdfGetFormFields

> PdfFormFields editPdfGetFormFields(inputFile)

Gets PDF Form fields and values

Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            PdfFormFields result = apiInstance.editPdfGetFormFields(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfGetFormFields");
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

[**PdfFormFields**](PdfFormFields.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editPdfGetMetadata

> PdfMetadata editPdfGetMetadata(inputFile)

Get PDF document metadata

Returns the metadata from the PDF document, including Title, Author, etc.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            PdfMetadata result = apiInstance.editPdfGetMetadata(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfGetMetadata");
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

[**PdfMetadata**](PdfMetadata.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editPdfGetPdfTextByPages

> PdfTextByPageResult editPdfGetPdfTextByPages(inputFile, textFormattingMode)

Get text in a PDF document by page

Gets the text in a PDF by page

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        String textFormattingMode = "textFormattingMode_example"; // String | Optional; specify how whitespace should be handled when converting the document to text.  Possible values are 'preserveWhitespace' which will attempt to preserve whitespace in the document and relative positioning of text within the document, and 'minimizeWhitespace' which will not insert additional spaces into the document in most cases.  Default is 'preserveWhitespace'.
        try {
            PdfTextByPageResult result = apiInstance.editPdfGetPdfTextByPages(inputFile, textFormattingMode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfGetPdfTextByPages");
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
 **textFormattingMode** | **String**| Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;. | [optional]

### Return type

[**PdfTextByPageResult**](PdfTextByPageResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editPdfInsertPages

> byte[] editPdfInsertPages(pageStartSource, pageEndSource, pageInsertBeforeDesitnation, sourceFile, destinationFile)

Insert, copy pages from one PDF document into another

Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        Integer pageStartSource = 56; // Integer | Page number (1 based) to start copying pages from (inclusive) in the Source file.
        Integer pageEndSource = 56; // Integer | Page number (1 based) to stop copying pages pages from (inclusive) in the Source file.
        Integer pageInsertBeforeDesitnation = 56; // Integer | Page number (1 based) to insert the pages before in the Destination file.
        File sourceFile = new File("/path/to/file"); // File | Source PDF file to copy pages from.
        File destinationFile = new File("/path/to/file"); // File | Destination PDF file to copy pages into.
        try {
            byte[] result = apiInstance.editPdfInsertPages(pageStartSource, pageEndSource, pageInsertBeforeDesitnation, sourceFile, destinationFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfInsertPages");
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
 **pageStartSource** | **Integer**| Page number (1 based) to start copying pages from (inclusive) in the Source file. |
 **pageEndSource** | **Integer**| Page number (1 based) to stop copying pages pages from (inclusive) in the Source file. |
 **pageInsertBeforeDesitnation** | **Integer**| Page number (1 based) to insert the pages before in the Destination file. |
 **sourceFile** | **File**| Source PDF file to copy pages from. |
 **destinationFile** | **File**| Destination PDF file to copy pages into. |

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


## editPdfLinearize

> byte[] editPdfLinearize(inputFile)

Linearize and optimize a PDF for streaming download

Linearizes the content of a PDF to optimize it for streaming download, particularly over web streaming.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfLinearize(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfLinearize");
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


## editPdfRasterize

> byte[] editPdfRasterize(inputFile)

Rasterize a PDF to an image-based PDF

Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfRasterize(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfRasterize");
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


## editPdfReduceFileSize

> byte[] editPdfReduceFileSize(inputFile)

Reduce the file size and optimize a PDF

Reduces the file size and optimizes the content of a PDF to minimize its file size.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfReduceFileSize(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfReduceFileSize");
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


## editPdfRemoveAllAnnotations

> byte[] editPdfRemoveAllAnnotations(inputFile)

Remove all PDF annotations, including comments in the document

Removes all of the annotations, including comments and notes, in a PDF document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfRemoveAllAnnotations(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfRemoveAllAnnotations");
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


## editPdfRemoveAnnotationItem

> byte[] editPdfRemoveAnnotationItem(annotationIndex, inputFile)

Remove a specific PDF annotation, comment in the document

Removes a specific annotation in a PDF document, using the AnnotationIndex.  To enumerate AnnotationIndex for all of the annotations in the PDF document, use the /edit/pdf/annotations/list API.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        Integer annotationIndex = 56; // Integer | The 0-based index of the annotation in the document
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfRemoveAnnotationItem(annotationIndex, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfRemoveAnnotationItem");
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
 **annotationIndex** | **Integer**| The 0-based index of the annotation in the document |
 **inputFile** | **File**| Input file to perform the operation on. |

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


## editPdfResize

> byte[] editPdfResize(paperSize, inputFile)

Change PDF Document&#39;s Paper Size

Resizes a PDF document&#39;s paper size.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        String paperSize = "paperSize_example"; // String | The desired paper size for the resized PDF document. Size ranges from A7 (smallest) to A0 (largest).
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfResize(paperSize, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfResize");
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
 **paperSize** | **String**| The desired paper size for the resized PDF document. Size ranges from A7 (smallest) to A0 (largest). |
 **inputFile** | **File**| Input file to perform the operation on. |

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


## editPdfRotateAllPages

> byte[] editPdfRotateAllPages(rotationAngle, inputFile)

Rotate all pages in a PDF document

Rotate all of the pages in a PDF document by a multiple of 90 degrees

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        Integer rotationAngle = 56; // Integer | The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfRotateAllPages(rotationAngle, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfRotateAllPages");
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
 **rotationAngle** | **Integer**| The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc. |
 **inputFile** | **File**| Input file to perform the operation on. |

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


## editPdfRotatePageRange

> byte[] editPdfRotatePageRange(rotationAngle, pageStart, pageEnd, inputFile)

Rotate a range, subset of pages in a PDF document

Rotate a range of specific pages in a PDF document by a multiple of 90 degrees

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        Integer rotationAngle = 56; // Integer | The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
        Integer pageStart = 56; // Integer | Page number (1 based) to start rotating pages from (inclusive).
        Integer pageEnd = 56; // Integer | Page number (1 based) to stop rotating pages from (inclusive).
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editPdfRotatePageRange(rotationAngle, pageStart, pageEnd, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfRotatePageRange");
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
 **rotationAngle** | **Integer**| The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc. |
 **pageStart** | **Integer**| Page number (1 based) to start rotating pages from (inclusive). |
 **pageEnd** | **Integer**| Page number (1 based) to stop rotating pages from (inclusive). |
 **inputFile** | **File**| Input file to perform the operation on. |

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


## editPdfSetFormFields

> byte[] editPdfSetFormFields(fieldValues)

Sets ands fills PDF Form field values

Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        SetPdfFormFieldsRequest fieldValues = new SetPdfFormFieldsRequest(); // SetPdfFormFieldsRequest | 
        try {
            byte[] result = apiInstance.editPdfSetFormFields(fieldValues);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfSetFormFields");
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
 **fieldValues** | [**SetPdfFormFieldsRequest**](SetPdfFormFieldsRequest.md)|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editPdfSetMetadata

> byte[] editPdfSetMetadata(request)

Sets PDF document metadata

Sets (writes) metadata into the input PDF document, including Title, Author, etc.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        SetPdfMetadataRequest request = new SetPdfMetadataRequest(); // SetPdfMetadataRequest | 
        try {
            byte[] result = apiInstance.editPdfSetMetadata(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfSetMetadata");
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
 **request** | [**SetPdfMetadataRequest**](SetPdfMetadataRequest.md)|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editPdfSetPermissions

> byte[] editPdfSetPermissions(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting)

Encrypt, password-protect and set restricted permissions on a PDF

Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        String ownerPassword = "ownerPassword_example"; // String | Password of a owner (creator/editor) of the PDF file (required)
        String userPassword = "userPassword_example"; // String | Password of a user (reader) of the PDF file (optional)
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        String encryptionKeyLength = "encryptionKeyLength_example"; // String | Possible values are \"128\" (128-bit RC4 encryption) and \"256\" (256-bit AES encryption).  Default is 256.
        Boolean allowPrinting = true; // Boolean | Set to false to disable printing through DRM.  Default is true.
        Boolean allowDocumentAssembly = true; // Boolean | Set to false to disable document assembly through DRM.  Default is true.
        Boolean allowContentExtraction = true; // Boolean | Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true.
        Boolean allowFormFilling = true; // Boolean | Set to false to disable filling out form fields in the PDF through DRM.  Default is true.
        Boolean allowEditing = true; // Boolean | Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true.
        Boolean allowAnnotations = true; // Boolean | Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true.
        Boolean allowDegradedPrinting = true; // Boolean | Set to false to disable degraded printing of the PDF through DRM.  Default is true.
        try {
            byte[] result = apiInstance.editPdfSetPermissions(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfSetPermissions");
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
 **ownerPassword** | **String**| Password of a owner (creator/editor) of the PDF file (required) |
 **userPassword** | **String**| Password of a user (reader) of the PDF file (optional) |
 **inputFile** | **File**| Input file to perform the operation on. |
 **encryptionKeyLength** | **String**| Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256. | [optional]
 **allowPrinting** | **Boolean**| Set to false to disable printing through DRM.  Default is true. | [optional]
 **allowDocumentAssembly** | **Boolean**| Set to false to disable document assembly through DRM.  Default is true. | [optional]
 **allowContentExtraction** | **Boolean**| Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true. | [optional]
 **allowFormFilling** | **Boolean**| Set to false to disable filling out form fields in the PDF through DRM.  Default is true. | [optional]
 **allowEditing** | **Boolean**| Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true. | [optional]
 **allowAnnotations** | **Boolean**| Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true. | [optional]
 **allowDegradedPrinting** | **Boolean**| Set to false to disable degraded printing of the PDF through DRM.  Default is true. | [optional]

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


## editPdfWatermarkText

> byte[] editPdfWatermarkText(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency)

Add a text watermark to a PDF

Adds a text watermark to a PDF

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditPdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditPdfApi apiInstance = new EditPdfApi(defaultClient);
        String watermarkText = "watermarkText_example"; // String | Watermark text to add to the PDF (required)
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        String fontName = "fontName_example"; // String | Font Family Name for the watermark text; default is Times New Roman
        BigDecimal fontSize = new BigDecimal(); // BigDecimal | Font Size in points of the text; default is 150
        String fontColor = "fontColor_example"; // String | Font color in hexadecimal or HTML color name; default is Red
        BigDecimal fontTransparency = new BigDecimal(); // BigDecimal | Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5
        try {
            byte[] result = apiInstance.editPdfWatermarkText(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditPdfApi#editPdfWatermarkText");
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
 **watermarkText** | **String**| Watermark text to add to the PDF (required) |
 **inputFile** | **File**| Input file to perform the operation on. |
 **fontName** | **String**| Font Family Name for the watermark text; default is Times New Roman | [optional]
 **fontSize** | **BigDecimal**| Font Size in points of the text; default is 150 | [optional]
 **fontColor** | **String**| Font color in hexadecimal or HTML color name; default is Red | [optional]
 **fontTransparency** | **BigDecimal**| Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5 | [optional]

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

