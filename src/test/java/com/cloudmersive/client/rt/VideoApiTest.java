/*
 * videoapi
 * The video APIs help you convert, encode, and transcode videos.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.rt;

import java.math.BigDecimal;
import java.io.File;
import com.cloudmersive.client.rt.model.MediaInformation;
import com.cloudmersive.client.rt.model.NsfwResult;
import java.time.OffsetDateTime;
import com.cloudmersive.client.rt.model.SplitVideoResult;
import com.cloudmersive.client.rt.model.StillFramesResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClientException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoApi
 */
@Disabled
class VideoApiTest {

    private final VideoApi api = new VideoApi();

    
    /**
     * Convert Video to Animated GIF format.
     *
     * Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoConvertToGifTest() {
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Boolean preserveAspectRatio = null;
        Integer frameRate = null;
        OffsetDateTime startTime = null;
        OffsetDateTime timeSpan = null;
        org.springframework.core.io.Resource inputFile = null;

        byte[] response = api.videoConvertToGif(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, startTime, timeSpan, inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Video to MOV format.
     *
     * Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoConvertToMovTest() {
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Boolean preserveAspectRatio = null;
        Integer frameRate = null;
        Integer quality = null;
        org.springframework.core.io.Resource inputFile = null;

        byte[] response = api.videoConvertToMov(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Video to MP4 format.
     *
     * Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoConvertToMp4Test() {
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Boolean preserveAspectRatio = null;
        Integer frameRate = null;
        Integer quality = null;
        org.springframework.core.io.Resource inputFile = null;

        byte[] response = api.videoConvertToMp4(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Video to PNG Still Frames.
     *
     * Automatically detect video file format and convert it to an array of still frame PNG images. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoConvertToStillFramesTest() {
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        BigDecimal framesPerSecond = null;
        org.springframework.core.io.Resource inputFile = null;

        StillFramesResult response = api.videoConvertToStillFrames(fileUrl, maxWidth, maxHeight, framesPerSecond, inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Video to WEBM format.
     *
     * Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoConvertToWebmTest() {
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Boolean preserveAspectRatio = null;
        Integer frameRate = null;
        Integer quality = null;
        org.springframework.core.io.Resource inputFile = null;

        byte[] response = api.videoConvertToWebm(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);

        // TODO: test validations
    }
    
    /**
     * Cut a Video to a Shorter Length
     *
     * Cuts a video to the specified start and end times. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoCutVideoTest() {
        String fileUrl = null;
        OffsetDateTime startTime = null;
        OffsetDateTime timeSpan = null;
        org.springframework.core.io.Resource inputFile = null;

        byte[] response = api.videoCutVideo(fileUrl, startTime, timeSpan, inputFile);

        // TODO: test validations
    }
    
    /**
     * Get detailed information about a video or audio file
     *
     * Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoGetInfoTest() {
        String fileUrl = null;
        org.springframework.core.io.Resource inputFile = null;

        MediaInformation response = api.videoGetInfo(fileUrl, inputFile);

        // TODO: test validations
    }
    
    /**
     * Resizes a Video Preserving the Original Aspect Ratio.
     *
     * Resizes a video, while maintaining the original aspect ratio and encoding. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoResizeVideoTest() {
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer frameRate = null;
        Integer quality = null;
        String extension = null;
        org.springframework.core.io.Resource inputFile = null;

        byte[] response = api.videoResizeVideo(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile);

        // TODO: test validations
    }
    
    /**
     * Resizes a Video without Preserving Aspect Ratio.
     *
     * Resizes a video without maintaining original aspect ratio, allowing fully customizable dimensions. May cause image skewing. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoResizeVideoSimpleTest() {
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer frameRate = null;
        Integer quality = null;
        String extension = null;
        org.springframework.core.io.Resource inputFile = null;

        byte[] response = api.videoResizeVideoSimple(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile);

        // TODO: test validations
    }
    
    /**
     * Scan a Video for NSFW content.
     *
     * Automatically detect video file format and scan it for Not Safe For Work (NSFW)/Porn/Racy content. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per frame scanned.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoScanForNsfwTest() {
        String fileUrl = null;
        BigDecimal framesPerSecond = null;
        org.springframework.core.io.Resource inputFile = null;

        NsfwResult response = api.videoScanForNsfw(fileUrl, framesPerSecond, inputFile);

        // TODO: test validations
    }
    
    /**
     * Split a Video into Two Shorter Videos
     *
     * Cuts a video into two videos based on the specified start time. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void videoSplitVideoTest() {
        OffsetDateTime splitTime = null;
        String fileUrl = null;
        OffsetDateTime timeSpan = null;
        org.springframework.core.io.Resource inputFile = null;

        SplitVideoResult response = api.videoSplitVideo(splitTime, fileUrl, timeSpan, inputFile);

        // TODO: test validations
    }
    
}
