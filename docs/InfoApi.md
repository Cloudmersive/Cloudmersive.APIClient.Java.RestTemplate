# InfoApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**infoGetDominantColor**](InfoApi.md#infoGetDominantColor) | **POST** /image/get-info/dominant-color | Returns the dominant colors of the image |
| [**infoGetMetadata**](InfoApi.md#infoGetMetadata) | **POST** /image/get-info/metadata | Returns the image metadata including EXIF and resolution |



## infoGetDominantColor

> DominantColorResult infoGetDominantColor(imageFile)

Returns the dominant colors of the image

Uses advanced image processing to extract the top 5 dominant colors in the image, returned in the order of dominance with the most-dominant color first.  These are the primary perceptual colors used in the image as perceived by a viewer.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.InfoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        InfoApi apiInstance = new InfoApi(defaultClient);
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            DominantColorResult result = apiInstance.infoGetDominantColor(imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfoApi#infoGetDominantColor");
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
| **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. | |

### Return type

[**DominantColorResult**](DominantColorResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## infoGetMetadata

> ImageMetadata infoGetMetadata(imageFile)

Returns the image metadata including EXIF and resolution

Returns the metadata information on the image, including file type, EXIF (if available), and resolution.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.InfoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        InfoApi apiInstance = new InfoApi(defaultClient);
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            ImageMetadata result = apiInstance.infoGetMetadata(imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfoApi#infoGetMetadata");
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
| **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. | |

### Return type

[**ImageMetadata**](ImageMetadata.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

