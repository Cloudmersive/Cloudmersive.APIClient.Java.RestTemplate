# ViewerToolsApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viewerToolsCreateSimple**](ViewerToolsApi.md#viewerToolsCreateSimple) | **POST** /convert/viewer/create/web/simple | Create a web-based viewer |



## viewerToolsCreateSimple

> ViewerResponse viewerToolsCreateSimple(inputFile, width, height)

Create a web-based viewer

Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ViewerToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ViewerToolsApi apiInstance = new ViewerToolsApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Integer width = 56; // Integer | Optional; width of the output viewer in pixels
        Integer height = 56; // Integer | Optional; height of the output viewer in pixels
        try {
            ViewerResponse result = apiInstance.viewerToolsCreateSimple(inputFile, width, height);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewerToolsApi#viewerToolsCreateSimple");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **width** | **Integer**| Optional; width of the output viewer in pixels | [optional] |
| **height** | **Integer**| Optional; height of the output viewer in pixels | [optional] |

### Return type

[**ViewerResponse**](ViewerResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

