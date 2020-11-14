# LanguageDetectionApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageDetectionGetLanguage**](LanguageDetectionApi.md#languageDetectionGetLanguage) | **POST** /nlp-v2/language/detect | Detect language of text



## languageDetectionGetLanguage

> LanguageDetectionResponse languageDetectionGetLanguage(input)

Detect language of text

Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.LanguageDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        LanguageDetectionApi apiInstance = new LanguageDetectionApi(defaultClient);
        LanguageDetectionRequest input = new LanguageDetectionRequest(); // LanguageDetectionRequest | 
        try {
            LanguageDetectionResponse result = apiInstance.languageDetectionGetLanguage(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguageDetectionApi#languageDetectionGetLanguage");
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
 **input** | [**LanguageDetectionRequest**](LanguageDetectionRequest.md)|  |

### Return type

[**LanguageDetectionResponse**](LanguageDetectionResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

