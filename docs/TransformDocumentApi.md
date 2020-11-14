# TransformDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transformDocumentDocxReplace**](TransformDocumentApi.md#transformDocumentDocxReplace) | **POST** /convert/transform/docx/replace-all | Replace string in Word DOCX document
[**transformDocumentPptxReplace**](TransformDocumentApi.md#transformDocumentPptxReplace) | **POST** /convert/transform/pptx/replace-all | Replace string in PowerPoint PPTX presentation



## transformDocumentDocxReplace

> byte[] transformDocumentDocxReplace(matchString, replaceString, inputFileUrl, matchCase, inputFile)

Replace string in Word DOCX document

Replace all instances of a string in an Office Word Document (docx)

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
        String replaceString = "replaceString_example"; // String | String to replace the matched values with
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
        Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.transformDocumentDocxReplace(matchString, replaceString, inputFileUrl, matchCase, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxReplace");
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
 **matchString** | **String**| String to search for and match against, to be replaced |
 **replaceString** | **String**| String to replace the matched values with |
 **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional]
 **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional]
 **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional]

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


## transformDocumentPptxReplace

> byte[] transformDocumentPptxReplace(matchString, replaceString, inputFileUrl, matchCase, inputFile)

Replace string in PowerPoint PPTX presentation

Replace all instances of a string in an Office PowerPoint Document (pptx)

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
        String replaceString = "replaceString_example"; // String | String to replace the matched values with
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
        Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.transformDocumentPptxReplace(matchString, replaceString, inputFileUrl, matchCase, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentPptxReplace");
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
 **matchString** | **String**| String to search for and match against, to be replaced |
 **replaceString** | **String**| String to replace the matched values with |
 **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional]
 **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional]
 **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional]

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

