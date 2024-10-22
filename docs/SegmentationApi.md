# SegmentationApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**segmentationGetSentences**](SegmentationApi.md#segmentationGetSentences) | **POST** /nlp-v2/segmentation/sentences | Extract sentences from string |
| [**segmentationGetWords**](SegmentationApi.md#segmentationGetWords) | **POST** /nlp-v2/segmentation/words | Get words in input string |



## segmentationGetSentences

> SentenceSegmentationResponse segmentationGetSentences(input)

Extract sentences from string

Segment an input string into separate sentences, output result as a string.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.SegmentationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SegmentationApi apiInstance = new SegmentationApi(defaultClient);
        SentenceSegmentationRequest input = new SentenceSegmentationRequest(); // SentenceSegmentationRequest | Input string
        try {
            SentenceSegmentationResponse result = apiInstance.segmentationGetSentences(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentationApi#segmentationGetSentences");
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
| **input** | [**SentenceSegmentationRequest**](SentenceSegmentationRequest.md)| Input string | |

### Return type

[**SentenceSegmentationResponse**](SentenceSegmentationResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## segmentationGetWords

> GetWordsResponse segmentationGetWords(input)

Get words in input string

Get the component words in an input string

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.SegmentationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SegmentationApi apiInstance = new SegmentationApi(defaultClient);
        GetWordsRequest input = new GetWordsRequest(); // GetWordsRequest | String to process
        try {
            GetWordsResponse result = apiInstance.segmentationGetWords(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentationApi#segmentationGetWords");
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
| **input** | [**GetWordsRequest**](GetWordsRequest.md)| String to process | |

### Return type

[**GetWordsResponse**](GetWordsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

