# DateTimeApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dateTimeGetNowSimple**](DateTimeApi.md#dateTimeGetNowSimple) | **GET** /validate/date-time/get/now | Get current date and time as of now
[**dateTimeGetPublicHolidays**](DateTimeApi.md#dateTimeGetPublicHolidays) | **POST** /validate/date-time/get/holidays | Get public holidays in the specified country and year
[**dateTimeParseNaturalLanguageDateTime**](DateTimeApi.md#dateTimeParseNaturalLanguageDateTime) | **POST** /validate/date-time/parse/date-time/natural-language | Parses a free-form natural language date and time string into a date and time
[**dateTimeParseStandardDateTime**](DateTimeApi.md#dateTimeParseStandardDateTime) | **POST** /validate/date-time/parse/date-time/structured | Parses a standardized date and time string into a date and time



## dateTimeGetNowSimple

> DateTimeNowResult dateTimeGetNowSimple()

Get current date and time as of now

Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.DateTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        DateTimeApi apiInstance = new DateTimeApi(defaultClient);
        try {
            DateTimeNowResult result = apiInstance.dateTimeGetNowSimple();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DateTimeApi#dateTimeGetNowSimple");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**DateTimeNowResult**](DateTimeNowResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## dateTimeGetPublicHolidays

> PublicHolidaysResponse dateTimeGetPublicHolidays(input)

Get public holidays in the specified country and year

Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.DateTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        DateTimeApi apiInstance = new DateTimeApi(defaultClient);
        GetPublicHolidaysRequest input = new GetPublicHolidaysRequest(); // GetPublicHolidaysRequest | Input request
        try {
            PublicHolidaysResponse result = apiInstance.dateTimeGetPublicHolidays(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DateTimeApi#dateTimeGetPublicHolidays");
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
 **input** | [**GetPublicHolidaysRequest**](GetPublicHolidaysRequest.md)| Input request |

### Return type

[**PublicHolidaysResponse**](PublicHolidaysResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## dateTimeParseNaturalLanguageDateTime

> DateTimeStandardizedParseResponse dateTimeParseNaturalLanguageDateTime(input)

Parses a free-form natural language date and time string into a date and time

Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.DateTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        DateTimeApi apiInstance = new DateTimeApi(defaultClient);
        DateTimeNaturalLanguageParseRequest input = new DateTimeNaturalLanguageParseRequest(); // DateTimeNaturalLanguageParseRequest | Input request
        try {
            DateTimeStandardizedParseResponse result = apiInstance.dateTimeParseNaturalLanguageDateTime(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DateTimeApi#dateTimeParseNaturalLanguageDateTime");
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
 **input** | [**DateTimeNaturalLanguageParseRequest**](DateTimeNaturalLanguageParseRequest.md)| Input request |

### Return type

[**DateTimeStandardizedParseResponse**](DateTimeStandardizedParseResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## dateTimeParseStandardDateTime

> DateTimeStandardizedParseResponse dateTimeParseStandardDateTime(input)

Parses a standardized date and time string into a date and time

Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.DateTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        DateTimeApi apiInstance = new DateTimeApi(defaultClient);
        DateTimeStandardizedParseRequest input = new DateTimeStandardizedParseRequest(); // DateTimeStandardizedParseRequest | Input request
        try {
            DateTimeStandardizedParseResponse result = apiInstance.dateTimeParseStandardDateTime(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DateTimeApi#dateTimeParseStandardDateTime");
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
 **input** | [**DateTimeStandardizedParseRequest**](DateTimeStandardizedParseRequest.md)| Input request |

### Return type

[**DateTimeStandardizedParseResponse**](DateTimeStandardizedParseResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

