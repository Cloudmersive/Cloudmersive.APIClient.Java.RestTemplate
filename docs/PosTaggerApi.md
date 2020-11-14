# PosTaggerApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**posTaggerTagAdjectives**](PosTaggerApi.md#posTaggerTagAdjectives) | **POST** /nlp-v2/pos/tag/adjectives | Part-of-speech tag a string, filter to adjectives
[**posTaggerTagAdverbs**](PosTaggerApi.md#posTaggerTagAdverbs) | **POST** /nlp-v2/pos/tag/adverbs | Part-of-speech tag a string, filter to adverbs
[**posTaggerTagNouns**](PosTaggerApi.md#posTaggerTagNouns) | **POST** /nlp-v2/pos/tag/nouns | Part-of-speech tag a string, filter to nouns
[**posTaggerTagPronouns**](PosTaggerApi.md#posTaggerTagPronouns) | **POST** /nlp-v2/pos/tag/pronouns | Part-of-speech tag a string, filter to pronouns
[**posTaggerTagSentence**](PosTaggerApi.md#posTaggerTagSentence) | **POST** /nlp-v2/pos/tag/sentence | Part-of-speech tag a string
[**posTaggerTagVerbs**](PosTaggerApi.md#posTaggerTagVerbs) | **POST** /nlp-v2/pos/tag/verbs | Part-of-speech tag a string, filter to verbs



## posTaggerTagAdjectives

> PosResponse posTaggerTagAdjectives(request)

Part-of-speech tag a string, filter to adjectives

Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.PosTaggerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        PosTaggerApi apiInstance = new PosTaggerApi(defaultClient);
        PosRequest request = new PosRequest(); // PosRequest | Input string
        try {
            PosResponse result = apiInstance.posTaggerTagAdjectives(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosTaggerApi#posTaggerTagAdjectives");
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
 **request** | [**PosRequest**](PosRequest.md)| Input string |

### Return type

[**PosResponse**](PosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## posTaggerTagAdverbs

> PosResponse posTaggerTagAdverbs(request)

Part-of-speech tag a string, filter to adverbs

Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.PosTaggerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        PosTaggerApi apiInstance = new PosTaggerApi(defaultClient);
        PosRequest request = new PosRequest(); // PosRequest | Input string
        try {
            PosResponse result = apiInstance.posTaggerTagAdverbs(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosTaggerApi#posTaggerTagAdverbs");
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
 **request** | [**PosRequest**](PosRequest.md)| Input string |

### Return type

[**PosResponse**](PosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## posTaggerTagNouns

> PosResponse posTaggerTagNouns(request)

Part-of-speech tag a string, filter to nouns

Part-of-speech (POS) tag a string, find the nouns, and return result as JSON

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.PosTaggerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        PosTaggerApi apiInstance = new PosTaggerApi(defaultClient);
        PosRequest request = new PosRequest(); // PosRequest | Input string
        try {
            PosResponse result = apiInstance.posTaggerTagNouns(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosTaggerApi#posTaggerTagNouns");
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
 **request** | [**PosRequest**](PosRequest.md)| Input string |

### Return type

[**PosResponse**](PosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## posTaggerTagPronouns

> PosResponse posTaggerTagPronouns(request)

Part-of-speech tag a string, filter to pronouns

Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.PosTaggerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        PosTaggerApi apiInstance = new PosTaggerApi(defaultClient);
        PosRequest request = new PosRequest(); // PosRequest | Input string
        try {
            PosResponse result = apiInstance.posTaggerTagPronouns(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosTaggerApi#posTaggerTagPronouns");
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
 **request** | [**PosRequest**](PosRequest.md)| Input string |

### Return type

[**PosResponse**](PosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## posTaggerTagSentence

> PosResponse posTaggerTagSentence(request)

Part-of-speech tag a string

Part-of-speech (POS) tag a string and return result as JSON

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.PosTaggerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        PosTaggerApi apiInstance = new PosTaggerApi(defaultClient);
        PosRequest request = new PosRequest(); // PosRequest | Input string
        try {
            PosResponse result = apiInstance.posTaggerTagSentence(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosTaggerApi#posTaggerTagSentence");
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
 **request** | [**PosRequest**](PosRequest.md)| Input string |

### Return type

[**PosResponse**](PosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## posTaggerTagVerbs

> PosResponse posTaggerTagVerbs(request)

Part-of-speech tag a string, filter to verbs

Part-of-speech (POS) tag a string, find the verbs, and return result as JSON

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.PosTaggerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        PosTaggerApi apiInstance = new PosTaggerApi(defaultClient);
        PosRequest request = new PosRequest(); // PosRequest | Input string
        try {
            PosResponse result = apiInstance.posTaggerTagVerbs(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosTaggerApi#posTaggerTagVerbs");
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
 **request** | [**PosRequest**](PosRequest.md)| Input string |

### Return type

[**PosResponse**](PosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

