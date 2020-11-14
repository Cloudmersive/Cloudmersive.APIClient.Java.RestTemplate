# SettingsApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**settingsCreateSetting**](SettingsApi.md#settingsCreateSetting) | **POST** /config/settings/create | Create a setting in the specified bucket
[**settingsListSettings**](SettingsApi.md#settingsListSettings) | **POST** /config/settings/list | Enumerate the settings in a bucket
[**settingsUpdateSetting**](SettingsApi.md#settingsUpdateSetting) | **POST** /config/settings/update | Update a setting



## settingsCreateSetting

> CreateSettingResponse settingsCreateSetting(request)

Create a setting in the specified bucket

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        CreateSettingRequest request = new CreateSettingRequest(); // CreateSettingRequest | Request to perform the operation on
        try {
            CreateSettingResponse result = apiInstance.settingsCreateSetting(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#settingsCreateSetting");
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
 **request** | [**CreateSettingRequest**](CreateSettingRequest.md)| Request to perform the operation on |

### Return type

[**CreateSettingResponse**](CreateSettingResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## settingsListSettings

> ListSettingsResponse settingsListSettings(request)

Enumerate the settings in a bucket

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        ListSettingsRequest request = new ListSettingsRequest(); // ListSettingsRequest | Request to perform the operation on
        try {
            ListSettingsResponse result = apiInstance.settingsListSettings(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#settingsListSettings");
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
 **request** | [**ListSettingsRequest**](ListSettingsRequest.md)| Request to perform the operation on |

### Return type

[**ListSettingsResponse**](ListSettingsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## settingsUpdateSetting

> UpdateSettingResponse settingsUpdateSetting(request)

Update a setting

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        UpdateSettingRequest request = new UpdateSettingRequest(); // UpdateSettingRequest | Request to perform the operation on
        try {
            UpdateSettingResponse result = apiInstance.settingsUpdateSetting(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#settingsUpdateSetting");
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
 **request** | [**UpdateSettingRequest**](UpdateSettingRequest.md)| Request to perform the operation on |

### Return type

[**UpdateSettingResponse**](UpdateSettingResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

