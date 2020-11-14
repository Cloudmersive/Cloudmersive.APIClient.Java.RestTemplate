# FilterApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterBlackAndWhite**](FilterApi.md#filterBlackAndWhite) | **POST** /image/filter/black-and-white | Convert image to black-and-white grayscale
[**filterDespeckle**](FilterApi.md#filterDespeckle) | **POST** /image/filter/despeckle | Despeckle to remove point noise from the image
[**filterEdgeDetect**](FilterApi.md#filterEdgeDetect) | **POST** /image/filter/edge-detect/{radius} | Detect and highlight edges in an image
[**filterEmboss**](FilterApi.md#filterEmboss) | **POST** /image/filter/emboss/{radius}/{sigma} | Emboss an image
[**filterGaussianBlur**](FilterApi.md#filterGaussianBlur) | **POST** /image/filter/blur/guassian/{radius}/{sigma} | Perform a guassian blur on the input image
[**filterMotionBlur**](FilterApi.md#filterMotionBlur) | **POST** /image/filter/blur/motion/{radius}/{sigma}/{angle} | Perform a motion blur on the input image
[**filterPosterize**](FilterApi.md#filterPosterize) | **POST** /image/filter/posterize | Posterize the image by reducing distinct colors
[**filterSwirl**](FilterApi.md#filterSwirl) | **POST** /image/filter/swirl | Swirl distort the image



## filterBlackAndWhite

> byte[] filterBlackAndWhite(imageFile)

Convert image to black-and-white grayscale

Remove color from the image by converting to a grayscale, black-and-white image

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.FilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        FilterApi apiInstance = new FilterApi(defaultClient);
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.filterBlackAndWhite(imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilterApi#filterBlackAndWhite");
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
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

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


## filterDespeckle

> byte[] filterDespeckle(imageFile)

Despeckle to remove point noise from the image

Remove point noise / despeckle the input image

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.FilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        FilterApi apiInstance = new FilterApi(defaultClient);
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.filterDespeckle(imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilterApi#filterDespeckle");
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
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

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


## filterEdgeDetect

> byte[] filterEdgeDetect(radius, imageFile)

Detect and highlight edges in an image

Perform an edge detection operation on the input image

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.FilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        FilterApi apiInstance = new FilterApi(defaultClient);
        Integer radius = 56; // Integer | Radius in pixels of the edge detection operation; a larger radius will produce a greater effect
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.filterEdgeDetect(radius, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilterApi#filterEdgeDetect");
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
 **radius** | **Integer**| Radius in pixels of the edge detection operation; a larger radius will produce a greater effect |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

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


## filterEmboss

> byte[] filterEmboss(radius, sigma, imageFile)

Emboss an image

Perform an emboss operation on the input image

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.FilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        FilterApi apiInstance = new FilterApi(defaultClient);
        Integer radius = 56; // Integer | Radius in pixels of the emboss operation; a larger radius will produce a greater effect
        Integer sigma = 56; // Integer | Sigma, or variance, of the emboss operation
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.filterEmboss(radius, sigma, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilterApi#filterEmboss");
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
 **radius** | **Integer**| Radius in pixels of the emboss operation; a larger radius will produce a greater effect |
 **sigma** | **Integer**| Sigma, or variance, of the emboss operation |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

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


## filterGaussianBlur

> byte[] filterGaussianBlur(radius, sigma, imageFile)

Perform a guassian blur on the input image

Perform a gaussian blur on the input image

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.FilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        FilterApi apiInstance = new FilterApi(defaultClient);
        Integer radius = 56; // Integer | Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
        Integer sigma = 56; // Integer | Sigma, or variance, of the gaussian blur operation
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.filterGaussianBlur(radius, sigma, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilterApi#filterGaussianBlur");
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
 **radius** | **Integer**| Radius in pixels of the blur operation; a larger radius will produce a greater blur effect |
 **sigma** | **Integer**| Sigma, or variance, of the gaussian blur operation |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

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


## filterMotionBlur

> byte[] filterMotionBlur(radius, sigma, angle, imageFile)

Perform a motion blur on the input image

Perform a motion blur on the input image at a specific angle

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.FilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        FilterApi apiInstance = new FilterApi(defaultClient);
        Integer radius = 56; // Integer | Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
        Integer sigma = 56; // Integer | Sigma, or variance, of the motion blur operation
        Integer angle = 56; // Integer | Angle of the motion blur in degrees
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.filterMotionBlur(radius, sigma, angle, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilterApi#filterMotionBlur");
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
 **radius** | **Integer**| Radius in pixels of the blur operation; a larger radius will produce a greater blur effect |
 **sigma** | **Integer**| Sigma, or variance, of the motion blur operation |
 **angle** | **Integer**| Angle of the motion blur in degrees |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

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


## filterPosterize

> byte[] filterPosterize(levels, imageFile)

Posterize the image by reducing distinct colors

Reduce the unique number of colors in the image to the specified level

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.FilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        FilterApi apiInstance = new FilterApi(defaultClient);
        Integer levels = 56; // Integer | Number of unique colors to retain in the output image
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.filterPosterize(levels, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilterApi#filterPosterize");
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
 **levels** | **Integer**| Number of unique colors to retain in the output image |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

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


## filterSwirl

> byte[] filterSwirl(degrees, imageFile)

Swirl distort the image

Swirl distort the image by the specified number of degrees

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.FilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        FilterApi apiInstance = new FilterApi(defaultClient);
        Integer degrees = 56; // Integer | Degrees of swirl
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.filterSwirl(degrees, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilterApi#filterSwirl");
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
 **degrees** | **Integer**| Degrees of swirl |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

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

