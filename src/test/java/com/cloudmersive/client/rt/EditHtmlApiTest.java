/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.rt;

import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EditHtmlApi
 */
@Ignore
public class EditHtmlApiTest {

    private final EditHtmlApi api = new EditHtmlApi();

    
    /**
     * Append a Heading to an HTML Document
     *
     * Appends a heading to the end of an HTML document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editHtmlHtmlAppendHeadingTest() {
        String headingText = null;
        String inputFileUrl = null;
        Integer headingSize = null;
        String cssStyle = null;
        org.springframework.core.io.Resource inputFile = null;
        byte[] response = api.editHtmlHtmlAppendHeading(headingText, inputFileUrl, headingSize, cssStyle, inputFile);

        // TODO: test validations
    }
    
    /**
     * Append an Image to an HTML Document from a URL
     *
     * Appends an image to the end of an HTML document using a URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editHtmlHtmlAppendImageFromUrlTest() {
        String imageUrl = null;
        String inputFileUrl = null;
        String cssStyle = null;
        org.springframework.core.io.Resource inputFile = null;
        byte[] response = api.editHtmlHtmlAppendImageFromUrl(imageUrl, inputFileUrl, cssStyle, inputFile);

        // TODO: test validations
    }
    
    /**
     * Append a Base64 Inline Image to an HTML Document
     *
     * Appends a base64 inline image to the end of an HTML document from an input file or URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editHtmlHtmlAppendImageInlineTest() {
        String inputFileUrl = null;
        String imageUrl = null;
        String cssStyle = null;
        String imageExtension = null;
        org.springframework.core.io.Resource inputFile = null;
        org.springframework.core.io.Resource imageFile = null;
        byte[] response = api.editHtmlHtmlAppendImageInline(inputFileUrl, imageUrl, cssStyle, imageExtension, inputFile, imageFile);

        // TODO: test validations
    }
    
    /**
     * Append a Paragraph to an HTML Document
     *
     * Appends a paragraph to the end of an HTML document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editHtmlHtmlAppendParagraphTest() {
        String paragraphText = null;
        String inputFileUrl = null;
        String cssStyle = null;
        org.springframework.core.io.Resource inputFile = null;
        byte[] response = api.editHtmlHtmlAppendParagraph(paragraphText, inputFileUrl, cssStyle, inputFile);

        // TODO: test validations
    }
    
    /**
     * Create a Blank HTML Document
     *
     * Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editHtmlHtmlCreateBlankDocumentTest() {
        String title = null;
        String cssUrl = null;
        String cssInline = null;
        String javascriptUrl = null;
        String javascriptInline = null;
        byte[] response = api.editHtmlHtmlCreateBlankDocument(title, cssUrl, cssInline, javascriptUrl, javascriptInline);

        // TODO: test validations
    }
    
}
