# AudioApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audioConvertToAac**](AudioApi.md#audioConvertToAac) | **POST** /video/convert/to/aac | Convert Audio File to AAC format.
[**audioConvertToM4a**](AudioApi.md#audioConvertToM4a) | **POST** /video/convert/to/m4a | Convert Audio File to M4A format.
[**audioConvertToMp3**](AudioApi.md#audioConvertToMp3) | **POST** /video/convert/to/mp3 | Convert Audio File to MP3 format.
[**audioConvertToWav**](AudioApi.md#audioConvertToWav) | **POST** /video/convert/to/wav | Convert Audio File to WAV format.



## audioConvertToAac

> byte[] audioConvertToAac(fileUrl, bitRate, inputFile)

Convert Audio File to AAC format.

Automatically detect audio file format and convert it to AAC format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.AudioApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        AudioApi apiInstance = new AudioApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
        Integer bitRate = 56; // Integer | Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.audioConvertToAac(fileUrl, bitRate, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudioApi#audioConvertToAac");
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
 **fileUrl** | **String**| Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB. | [optional]
 **bitRate** | **Integer**| Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically. | [optional]
 **inputFile** | **File**| Input file to perform the operation on. | [optional]

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


## audioConvertToM4a

> byte[] audioConvertToM4a(fileUrl, bitRate, inputFile)

Convert Audio File to M4A format.

Automatically detect audio file format and convert it to M4A format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.AudioApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        AudioApi apiInstance = new AudioApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
        Integer bitRate = 56; // Integer | Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.audioConvertToM4a(fileUrl, bitRate, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudioApi#audioConvertToM4a");
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
 **fileUrl** | **String**| Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB. | [optional]
 **bitRate** | **Integer**| Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically. | [optional]
 **inputFile** | **File**| Input file to perform the operation on. | [optional]

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


## audioConvertToMp3

> byte[] audioConvertToMp3(fileUrl, bitRate, inputFile)

Convert Audio File to MP3 format.

Automatically detect audio file format and convert it to MP3 format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.AudioApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        AudioApi apiInstance = new AudioApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
        Integer bitRate = 56; // Integer | Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.audioConvertToMp3(fileUrl, bitRate, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudioApi#audioConvertToMp3");
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
 **fileUrl** | **String**| Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB. | [optional]
 **bitRate** | **Integer**| Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically. | [optional]
 **inputFile** | **File**| Input file to perform the operation on. | [optional]

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


## audioConvertToWav

> byte[] audioConvertToWav(fileUrl, sampleRate, inputFile)

Convert Audio File to WAV format.

Automatically detect audio file format and convert it to WAV format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.invoker.models.*;
import com.cloudmersive.client.AudioApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        AudioApi apiInstance = new AudioApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
        BigDecimal sampleRate = new BigDecimal(); // BigDecimal | Optional; Specify the desired sample rate of the converted audio file in kHz. Value may be between 8 and 96. Standard for audio CDs is 44.1, while DVD audio standard is 48. By default, the optimal sample rate will be chosen automatically.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.audioConvertToWav(fileUrl, sampleRate, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudioApi#audioConvertToWav");
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
 **fileUrl** | **String**| Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB. | [optional]
 **sampleRate** | **BigDecimal**| Optional; Specify the desired sample rate of the converted audio file in kHz. Value may be between 8 and 96. Standard for audio CDs is 44.1, while DVD audio standard is 48. By default, the optimal sample rate will be chosen automatically. | [optional]
 **inputFile** | **File**| Input file to perform the operation on. | [optional]

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

