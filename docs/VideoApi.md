# VideoApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**videoConvertToGif**](VideoApi.md#videoConvertToGif) | **POST** /video/convert/to/gif | Convert Video to Animated GIF format. |
| [**videoConvertToMov**](VideoApi.md#videoConvertToMov) | **POST** /video/convert/to/mov | Convert Video to MOV format. |
| [**videoConvertToMp4**](VideoApi.md#videoConvertToMp4) | **POST** /video/convert/to/mp4 | Convert Video to MP4 format. |
| [**videoConvertToStillFrames**](VideoApi.md#videoConvertToStillFrames) | **POST** /video/convert/to/still-frames | Convert Video to PNG Still Frames. |
| [**videoConvertToWebm**](VideoApi.md#videoConvertToWebm) | **POST** /video/convert/to/webm | Convert Video to WEBM format. |
| [**videoCutVideo**](VideoApi.md#videoCutVideo) | **POST** /video/cut | Cut a Video to a Shorter Length |
| [**videoGetInfo**](VideoApi.md#videoGetInfo) | **POST** /video/convert/get-info | Get detailed information about a video or audio file |
| [**videoResizeVideo**](VideoApi.md#videoResizeVideo) | **POST** /video/resize/preserveAspectRatio | Resizes a Video Preserving the Original Aspect Ratio. |
| [**videoResizeVideoSimple**](VideoApi.md#videoResizeVideoSimple) | **POST** /video/resize/target | Resizes a Video without Preserving Aspect Ratio. |
| [**videoScanForNsfw**](VideoApi.md#videoScanForNsfw) | **POST** /video/scan/nsfw | Scan a Video for NSFW content. |
| [**videoSplitVideo**](VideoApi.md#videoSplitVideo) | **POST** /video/split | Split a Video into Two Shorter Videos |



## videoConvertToGif

> byte[] videoConvertToGif(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, startTime, timeSpan, inputFile)

Convert Video to Animated GIF format.

Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels.
        Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels.
        Boolean preserveAspectRatio = true; // Boolean | Optional; If false, the original video's aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
        Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to 24 frames per second.
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Optional; Specify the desired starting time of the GIF video in TimeSpan format.
        OffsetDateTime timeSpan = OffsetDateTime.now(); // OffsetDateTime | Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 seconds. Default is 10 seconds.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.videoConvertToGif(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, startTime, timeSpan, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoConvertToGif");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels. | [optional] |
| **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels. | [optional] |
| **preserveAspectRatio** | **Boolean**| Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. | [optional] |
| **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to 24 frames per second. | [optional] |
| **startTime** | **OffsetDateTime**| Optional; Specify the desired starting time of the GIF video in TimeSpan format. | [optional] |
| **timeSpan** | **OffsetDateTime**| Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 seconds. Default is 10 seconds. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

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


## videoConvertToMov

> byte[] videoConvertToMov(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile)

Convert Video to MOV format.

Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
        Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
        Boolean preserveAspectRatio = true; // Boolean | Optional; If false, the original video's aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
        Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
        Integer quality = 56; // Integer | Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.videoConvertToMov(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoConvertToMov");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional] |
| **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional] |
| **preserveAspectRatio** | **Boolean**| Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. | [optional] |
| **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to original video frame rate. | [optional] |
| **quality** | **Integer**| Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

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


## videoConvertToMp4

> byte[] videoConvertToMp4(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile)

Convert Video to MP4 format.

Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
        Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
        Boolean preserveAspectRatio = true; // Boolean | Optional; If false, the original video's aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
        Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
        Integer quality = 56; // Integer | Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.videoConvertToMp4(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoConvertToMp4");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional] |
| **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional] |
| **preserveAspectRatio** | **Boolean**| Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. | [optional] |
| **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to original video frame rate. | [optional] |
| **quality** | **Integer**| Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

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


## videoConvertToStillFrames

> StillFramesResult videoConvertToStillFrames(fileUrl, maxWidth, maxHeight, framesPerSecond, inputFile)

Convert Video to PNG Still Frames.

Automatically detect video file format and convert it to an array of still frame PNG images. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
        Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
        BigDecimal framesPerSecond = new BigDecimal(78); // BigDecimal | Optional; How many video frames per second to be returned as PNG images. Minimum value is 0.1, maximum is 60. Default is 1 frame per second. Maximum of 2000 total frames.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            StillFramesResult result = apiInstance.videoConvertToStillFrames(fileUrl, maxWidth, maxHeight, framesPerSecond, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoConvertToStillFrames");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional] |
| **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional] |
| **framesPerSecond** | **BigDecimal**| Optional; How many video frames per second to be returned as PNG images. Minimum value is 0.1, maximum is 60. Default is 1 frame per second. Maximum of 2000 total frames. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

### Return type

[**StillFramesResult**](StillFramesResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## videoConvertToWebm

> byte[] videoConvertToWebm(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile)

Convert Video to WEBM format.

Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
        Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
        Boolean preserveAspectRatio = true; // Boolean | Optional; If false, the original video's aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
        Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
        Integer quality = 56; // Integer | Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.videoConvertToWebm(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoConvertToWebm");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional] |
| **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional] |
| **preserveAspectRatio** | **Boolean**| Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. | [optional] |
| **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to original video frame rate. | [optional] |
| **quality** | **Integer**| Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

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


## videoCutVideo

> byte[] videoCutVideo(fileUrl, startTime, timeSpan, inputFile)

Cut a Video to a Shorter Length

Cuts a video to the specified start and end times. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Optional; Specify the desired starting time of the cut video in TimeSpan format.
        OffsetDateTime timeSpan = OffsetDateTime.now(); // OffsetDateTime | Optional; Specify the desired length of the cut video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.videoCutVideo(fileUrl, startTime, timeSpan, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoCutVideo");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **startTime** | **OffsetDateTime**| Optional; Specify the desired starting time of the cut video in TimeSpan format. | [optional] |
| **timeSpan** | **OffsetDateTime**| Optional; Specify the desired length of the cut video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

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


## videoGetInfo

> MediaInformation videoGetInfo(fileUrl, inputFile)

Get detailed information about a video or audio file

Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            MediaInformation result = apiInstance.videoGetInfo(fileUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoGetInfo");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

### Return type

[**MediaInformation**](MediaInformation.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## videoResizeVideo

> byte[] videoResizeVideo(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile)

Resizes a Video Preserving the Original Aspect Ratio.

Resizes a video, while maintaining the original aspect ratio and encoding. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
        Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
        Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
        Integer quality = 56; // Integer | Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
        String extension = "extension_example"; // String | Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.videoResizeVideo(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoResizeVideo");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional] |
| **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional] |
| **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to original video frame rate. | [optional] |
| **quality** | **Integer**| Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. | [optional] |
| **extension** | **String**| Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

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


## videoResizeVideoSimple

> byte[] videoResizeVideoSimple(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile)

Resizes a Video without Preserving Aspect Ratio.

Resizes a video without maintaining original aspect ratio, allowing fully customizable dimensions. May cause image skewing. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
        Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
        Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
        Integer quality = 56; // Integer | Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
        String extension = "extension_example"; // String | Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            byte[] result = apiInstance.videoResizeVideoSimple(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoResizeVideoSimple");
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
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional] |
| **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional] |
| **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to original video frame rate. | [optional] |
| **quality** | **Integer**| Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. | [optional] |
| **extension** | **String**| Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

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


## videoScanForNsfw

> NsfwResult videoScanForNsfw(fileUrl, framesPerSecond, inputFile)

Scan a Video for NSFW content.

Automatically detect video file format and scan it for Not Safe For Work (NSFW)/Porn/Racy content. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per frame scanned.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being scanned. Use this option for files larger than 2GB.
        BigDecimal framesPerSecond = new BigDecimal(78); // BigDecimal | Optional; How many video frames per second to be scanned. Minimum value is 0.05 (1 frame per 20 seconds), maximum is 1. Default is 0.33 frame per second (1 frame scanned every 3 seconds). Maximum of 1000 total frames can be scanned, potentially adjusting the framerate for longer videos.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            NsfwResult result = apiInstance.videoScanForNsfw(fileUrl, framesPerSecond, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoScanForNsfw");
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
| **fileUrl** | **String**| Optional; URL of a video file being scanned. Use this option for files larger than 2GB. | [optional] |
| **framesPerSecond** | **BigDecimal**| Optional; How many video frames per second to be scanned. Minimum value is 0.05 (1 frame per 20 seconds), maximum is 1. Default is 0.33 frame per second (1 frame scanned every 3 seconds). Maximum of 1000 total frames can be scanned, potentially adjusting the framerate for longer videos. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

### Return type

[**NsfwResult**](NsfwResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## videoSplitVideo

> SplitVideoResult videoSplitVideo(splitTime, fileUrl, timeSpan, inputFile)

Split a Video into Two Shorter Videos

Cuts a video into two videos based on the specified start time. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.VideoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        VideoApi apiInstance = new VideoApi(defaultClient);
        OffsetDateTime splitTime = OffsetDateTime.now(); // OffsetDateTime | Specify the desired time at which to split the video in TimeSpan format.
        String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
        OffsetDateTime timeSpan = OffsetDateTime.now(); // OffsetDateTime | Optional; Specify the desired length of the second video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours.
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            SplitVideoResult result = apiInstance.videoSplitVideo(splitTime, fileUrl, timeSpan, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoApi#videoSplitVideo");
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
| **splitTime** | **OffsetDateTime**| Specify the desired time at which to split the video in TimeSpan format. | |
| **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional] |
| **timeSpan** | **OffsetDateTime**| Optional; Specify the desired length of the second video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours. | [optional] |
| **inputFile** | **File**| Input file to perform the operation on. | [optional] |

### Return type

[**SplitVideoResult**](SplitVideoResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

