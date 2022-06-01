package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import java.math.BigDecimal;
import java.io.File;
import com.cloudmersive.client.rt.model.MediaInformation;
import com.cloudmersive.client.rt.model.NsfwResult;
import org.threeten.bp.OffsetDateTime;
import com.cloudmersive.client.rt.model.SplitVideoResult;
import com.cloudmersive.client.rt.model.StillFramesResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:54.718-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.VideoApi")
public class VideoApi {
    private ApiClient apiClient;

    public VideoApi() {
        this(new ApiClient());
    }

    @Autowired
    public VideoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert Video to Animated GIF format.
     * Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels. (optional)
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to 24 frames per second. (optional)
     * @param startTime Optional; Specify the desired starting time of the GIF video in TimeSpan format. (optional)
     * @param timeSpan Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 seconds. Default is 10 seconds. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] videoConvertToGif(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoConvertToGifWithHttpInfo(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, startTime, timeSpan, inputFile).getBody();
    }

    /**
     * Convert Video to Animated GIF format.
     * Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels. (optional)
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to 24 frames per second. (optional)
     * @param startTime Optional; Specify the desired starting time of the GIF video in TimeSpan format. (optional)
     * @param timeSpan Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 seconds. Default is 10 seconds. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> videoConvertToGifWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/convert/to/gif", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (preserveAspectRatio != null)
        headerParams.add("preserveAspectRatio", apiClient.parameterToString(preserveAspectRatio));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (startTime != null)
        headerParams.add("startTime", apiClient.parameterToString(startTime));
        if (timeSpan != null)
        headerParams.add("timeSpan", apiClient.parameterToString(timeSpan));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Video to MOV format.
     * Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] videoConvertToMov(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoConvertToMovWithHttpInfo(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).getBody();
    }

    /**
     * Convert Video to MOV format.
     * Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> videoConvertToMovWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/convert/to/mov", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (preserveAspectRatio != null)
        headerParams.add("preserveAspectRatio", apiClient.parameterToString(preserveAspectRatio));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Video to MP4 format.
     * Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] videoConvertToMp4(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoConvertToMp4WithHttpInfo(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).getBody();
    }

    /**
     * Convert Video to MP4 format.
     * Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> videoConvertToMp4WithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/convert/to/mp4", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (preserveAspectRatio != null)
        headerParams.add("preserveAspectRatio", apiClient.parameterToString(preserveAspectRatio));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Video to PNG Still Frames.
     * Automatically detect video file format and convert it to an array of still frame PNG images. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param framesPerSecond Optional; How many video frames per second to be returned as PNG images. Minimum value is 0.1, maximum is 60. Default is 1 frame per second. Maximum of 2000 total frames. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return StillFramesResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StillFramesResult videoConvertToStillFrames(String fileUrl, Integer maxWidth, Integer maxHeight, BigDecimal framesPerSecond, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoConvertToStillFramesWithHttpInfo(fileUrl, maxWidth, maxHeight, framesPerSecond, inputFile).getBody();
    }

    /**
     * Convert Video to PNG Still Frames.
     * Automatically detect video file format and convert it to an array of still frame PNG images. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param framesPerSecond Optional; How many video frames per second to be returned as PNG images. Minimum value is 0.1, maximum is 60. Default is 1 frame per second. Maximum of 2000 total frames. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;StillFramesResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StillFramesResult> videoConvertToStillFramesWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, BigDecimal framesPerSecond, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/convert/to/still-frames", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (framesPerSecond != null)
        headerParams.add("framesPerSecond", apiClient.parameterToString(framesPerSecond));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<StillFramesResult> returnType = new ParameterizedTypeReference<StillFramesResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Video to WEBM format.
     * Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] videoConvertToWebm(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoConvertToWebmWithHttpInfo(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).getBody();
    }

    /**
     * Convert Video to WEBM format.
     * Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> videoConvertToWebmWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/convert/to/webm", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (preserveAspectRatio != null)
        headerParams.add("preserveAspectRatio", apiClient.parameterToString(preserveAspectRatio));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Cut a Video to a Shorter Length
     * Cuts a video to the specified start and end times. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param startTime Optional; Specify the desired starting time of the cut video in TimeSpan format. (optional)
     * @param timeSpan Optional; Specify the desired length of the cut video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] videoCutVideo(String fileUrl, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoCutVideoWithHttpInfo(fileUrl, startTime, timeSpan, inputFile).getBody();
    }

    /**
     * Cut a Video to a Shorter Length
     * Cuts a video to the specified start and end times. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param startTime Optional; Specify the desired starting time of the cut video in TimeSpan format. (optional)
     * @param timeSpan Optional; Specify the desired length of the cut video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> videoCutVideoWithHttpInfo(String fileUrl, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/cut", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (startTime != null)
        headerParams.add("startTime", apiClient.parameterToString(startTime));
        if (timeSpan != null)
        headerParams.add("timeSpan", apiClient.parameterToString(timeSpan));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get detailed information about a video or audio file
     * Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return MediaInformation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MediaInformation videoGetInfo(String fileUrl, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoGetInfoWithHttpInfo(fileUrl, inputFile).getBody();
    }

    /**
     * Get detailed information about a video or audio file
     * Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;MediaInformation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MediaInformation> videoGetInfoWithHttpInfo(String fileUrl, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/convert/get-info", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<MediaInformation> returnType = new ParameterizedTypeReference<MediaInformation>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Resizes a Video Preserving the Original Aspect Ratio.
     * Resizes a video, while maintaining the original aspect ratio and encoding. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] videoResizeVideo(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoResizeVideoWithHttpInfo(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile).getBody();
    }

    /**
     * Resizes a Video Preserving the Original Aspect Ratio.
     * Resizes a video, while maintaining the original aspect ratio and encoding. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> videoResizeVideoWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/resize/preserveAspectRatio", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));
        if (extension != null)
        headerParams.add("extension", apiClient.parameterToString(extension));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Resizes a Video without Preserving Aspect Ratio.
     * Resizes a video without maintaining original aspect ratio, allowing fully customizable dimensions. May cause image skewing. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] videoResizeVideoSimple(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoResizeVideoSimpleWithHttpInfo(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile).getBody();
    }

    /**
     * Resizes a Video without Preserving Aspect Ratio.
     * Resizes a video without maintaining original aspect ratio, allowing fully customizable dimensions. May cause image skewing. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. (optional)
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. (optional)
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate. (optional)
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. (optional)
     * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> videoResizeVideoSimpleWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/resize/target", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));
        if (extension != null)
        headerParams.add("extension", apiClient.parameterToString(extension));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Scan a Video for NSFW content.
     * Automatically detect video file format and scan it for Not Safe For Work (NSFW)/Porn/Racy content. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per frame scanned.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being scanned. Use this option for files larger than 2GB. (optional)
     * @param framesPerSecond Optional; How many video frames per second to be scanned. Minimum value is 0.05 (1 frame per 20 seconds), maximum is 1. Default is 0.33 frame per second (1 frame scanned every 3 seconds). Maximum of 1000 total frames can be scanned, potentially adjusting the framerate for longer videos. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return NsfwResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NsfwResult videoScanForNsfw(String fileUrl, BigDecimal framesPerSecond, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoScanForNsfwWithHttpInfo(fileUrl, framesPerSecond, inputFile).getBody();
    }

    /**
     * Scan a Video for NSFW content.
     * Automatically detect video file format and scan it for Not Safe For Work (NSFW)/Porn/Racy content. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per frame scanned.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being scanned. Use this option for files larger than 2GB. (optional)
     * @param framesPerSecond Optional; How many video frames per second to be scanned. Minimum value is 0.05 (1 frame per 20 seconds), maximum is 1. Default is 0.33 frame per second (1 frame scanned every 3 seconds). Maximum of 1000 total frames can be scanned, potentially adjusting the framerate for longer videos. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;NsfwResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NsfwResult> videoScanForNsfwWithHttpInfo(String fileUrl, BigDecimal framesPerSecond, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/video/scan/nsfw", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (framesPerSecond != null)
        headerParams.add("framesPerSecond", apiClient.parameterToString(framesPerSecond));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<NsfwResult> returnType = new ParameterizedTypeReference<NsfwResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Split a Video into Two Shorter Videos
     * Cuts a video into two videos based on the specified start time. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param splitTime Specify the desired time at which to split the video in TimeSpan format. (required)
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param timeSpan Optional; Specify the desired length of the second video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return SplitVideoResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SplitVideoResult videoSplitVideo(OffsetDateTime splitTime, String fileUrl, OffsetDateTime timeSpan, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return videoSplitVideoWithHttpInfo(splitTime, fileUrl, timeSpan, inputFile).getBody();
    }

    /**
     * Split a Video into Two Shorter Videos
     * Cuts a video into two videos based on the specified start time. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param splitTime Specify the desired time at which to split the video in TimeSpan format. (required)
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. (optional)
     * @param timeSpan Optional; Specify the desired length of the second video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours. (optional)
     * @param inputFile Input file to perform the operation on. (optional)
     * @return ResponseEntity&lt;SplitVideoResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SplitVideoResult> videoSplitVideoWithHttpInfo(OffsetDateTime splitTime, String fileUrl, OffsetDateTime timeSpan, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'splitTime' is set
        if (splitTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'splitTime' when calling videoSplitVideo");
        }
        
        String path = apiClient.expandPath("/video/split", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (splitTime != null)
        headerParams.add("splitTime", apiClient.parameterToString(splitTime));
        if (timeSpan != null)
        headerParams.add("timeSpan", apiClient.parameterToString(timeSpan));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitVideoResult> returnType = new ParameterizedTypeReference<SplitVideoResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
