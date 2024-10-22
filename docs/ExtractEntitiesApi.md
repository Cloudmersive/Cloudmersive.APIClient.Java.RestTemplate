# ExtractEntitiesApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**extractEntitiesPost**](ExtractEntitiesApi.md#extractEntitiesPost) | **POST** /nlp-v2/extract-entities | Extract entities from string |



## extractEntitiesPost

> ExtractEntitiesResponse extractEntitiesPost(value)

Extract entities from string

Extract the named entitites from an input string.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.ExtractEntitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ExtractEntitiesApi apiInstance = new ExtractEntitiesApi(defaultClient);
        ExtractEntitiesRequest value = new ExtractEntitiesRequest(); // ExtractEntitiesRequest | Input string
        try {
            ExtractEntitiesResponse result = apiInstance.extractEntitiesPost(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtractEntitiesApi#extractEntitiesPost");
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
| **value** | [**ExtractEntitiesRequest**](ExtractEntitiesRequest.md)| Input string | |

### Return type

[**ExtractEntitiesResponse**](ExtractEntitiesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

