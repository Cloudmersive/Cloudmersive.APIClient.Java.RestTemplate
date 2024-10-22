# EditHtmlApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**editHtmlHtmlAppendHeaderTag**](EditHtmlApi.md#editHtmlHtmlAppendHeaderTag) | **POST** /convert/edit/html/head/append/tag | Append an HTML tag to the HEAD section of an HTML Document |
| [**editHtmlHtmlAppendHeading**](EditHtmlApi.md#editHtmlHtmlAppendHeading) | **POST** /convert/edit/html/append/heading | Append a Heading to an HTML Document |
| [**editHtmlHtmlAppendImageFromUrl**](EditHtmlApi.md#editHtmlHtmlAppendImageFromUrl) | **POST** /convert/edit/html/append/image/from-url | Append an Image to an HTML Document from a URL |
| [**editHtmlHtmlAppendImageInline**](EditHtmlApi.md#editHtmlHtmlAppendImageInline) | **POST** /convert/edit/html/append/image/inline | Append a Base64 Inline Image to an HTML Document |
| [**editHtmlHtmlAppendParagraph**](EditHtmlApi.md#editHtmlHtmlAppendParagraph) | **POST** /convert/edit/html/append/paragraph | Append a Paragraph to an HTML Document |
| [**editHtmlHtmlCreateBlankDocument**](EditHtmlApi.md#editHtmlHtmlCreateBlankDocument) | **POST** /convert/edit/html/create/blank | Create a Blank HTML Document |
| [**editHtmlHtmlGetLanguage**](EditHtmlApi.md#editHtmlHtmlGetLanguage) | **POST** /convert/edit/html/head/get/language | Gets the language for the HTML document |
| [**editHtmlHtmlGetLinks**](EditHtmlApi.md#editHtmlHtmlGetLinks) | **POST** /convert/edit/html/extract/links | Extract resolved link URLs from HTML File |
| [**editHtmlHtmlGetRelCanonical**](EditHtmlApi.md#editHtmlHtmlGetRelCanonical) | **POST** /convert/edit/html/head/get/rel-canonical-url | Gets the rel canonical URL for the HTML document |
| [**editHtmlHtmlGetSitemap**](EditHtmlApi.md#editHtmlHtmlGetSitemap) | **POST** /convert/edit/html/head/get/sitemap-url | Gets the sitemap URL for the HTML document |
| [**editHtmlHtmlSetLanguage**](EditHtmlApi.md#editHtmlHtmlSetLanguage) | **POST** /convert/edit/html/head/set/language | Sets the language for the HTML document |
| [**editHtmlHtmlSetRelCanonical**](EditHtmlApi.md#editHtmlHtmlSetRelCanonical) | **POST** /convert/edit/html/head/set/rel-canonical-url | Sets the rel canonical URL for the HTML document |
| [**editHtmlHtmlSetSitemapUrl**](EditHtmlApi.md#editHtmlHtmlSetSitemapUrl) | **POST** /convert/edit/html/head/set/sitemap-url | Sets the sitemap URL for the HTML document |



## editHtmlHtmlAppendHeaderTag

> byte[] editHtmlHtmlAppendHeaderTag(htmlTag, inputFileUrl, inputFile)

Append an HTML tag to the HEAD section of an HTML Document

Appends an HTML tag to the HEAD section of an HTML document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String htmlTag = "htmlTag_example"; // String | The HTML tag to append.
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editHtmlHtmlAppendHeaderTag(htmlTag, inputFileUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlAppendHeaderTag");
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
| **htmlTag** | **String**| The HTML tag to append. | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlAppendHeading

> byte[] editHtmlHtmlAppendHeading(headingText, inputFileUrl, headingSize, cssStyle, inputFile)

Append a Heading to an HTML Document

Appends a heading to the end of an HTML document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String headingText = "headingText_example"; // String | The text content to be used in the header.
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        Integer headingSize = 56; // Integer | Optional: The heading size number. Default is 1. Accepts values between 1 and 6.
        String cssStyle = "cssStyle_example"; // String | Optional: The CSS style for the heading.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editHtmlHtmlAppendHeading(headingText, inputFileUrl, headingSize, cssStyle, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlAppendHeading");
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
| **headingText** | **String**| The text content to be used in the header. | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **headingSize** | **Integer**| Optional: The heading size number. Default is 1. Accepts values between 1 and 6. | [optional] |
| **cssStyle** | **String**| Optional: The CSS style for the heading. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlAppendImageFromUrl

> byte[] editHtmlHtmlAppendImageFromUrl(imageUrl, inputFileUrl, cssStyle, inputFile)

Append an Image to an HTML Document from a URL

Appends an image to the end of an HTML document using a URL.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String imageUrl = "imageUrl_example"; // String | The URL for the image.
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        String cssStyle = "cssStyle_example"; // String | Optional: CSS style for the image.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editHtmlHtmlAppendImageFromUrl(imageUrl, inputFileUrl, cssStyle, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlAppendImageFromUrl");
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
| **imageUrl** | **String**| The URL for the image. | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **cssStyle** | **String**| Optional: CSS style for the image. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlAppendImageInline

> byte[] editHtmlHtmlAppendImageInline(inputFileUrl, imageUrl, cssStyle, imageExtension, inputFile, imageFile)

Append a Base64 Inline Image to an HTML Document

Appends a base64 inline image to the end of an HTML document from an input file or URL.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        String imageUrl = "imageUrl_example"; // String | Optional: Image URL to be appended as base64 inline image.
        String cssStyle = "cssStyle_example"; // String | Optional: CSS style for the image.
        String imageExtension = "imageExtension_example"; // String | Optional: The extension (JPG, PNG, GIF, etc.) of the image file. Recommended if uploading an imageFile directly, instead of using imageUrl. If no extension can be determined, will default to JPG.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        File imageFile = new File("/path/to/file"); // File | Optional: Image file to be appended as base64 inline image.
        try {
            byte[] result = apiInstance.editHtmlHtmlAppendImageInline(inputFileUrl, imageUrl, cssStyle, imageExtension, inputFile, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlAppendImageInline");
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
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **imageUrl** | **String**| Optional: Image URL to be appended as base64 inline image. | [optional] |
| **cssStyle** | **String**| Optional: CSS style for the image. | [optional] |
| **imageExtension** | **String**| Optional: The extension (JPG, PNG, GIF, etc.) of the image file. Recommended if uploading an imageFile directly, instead of using imageUrl. If no extension can be determined, will default to JPG. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |
| **imageFile** | **File**| Optional: Image file to be appended as base64 inline image. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlAppendParagraph

> byte[] editHtmlHtmlAppendParagraph(paragraphText, inputFileUrl, cssStyle, inputFile)

Append a Paragraph to an HTML Document

Appends a paragraph to the end of an HTML document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String paragraphText = "paragraphText_example"; // String | The text content to be used in the paragraph.
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        String cssStyle = "cssStyle_example"; // String | Optional: The CSS style for the paragraph.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editHtmlHtmlAppendParagraph(paragraphText, inputFileUrl, cssStyle, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlAppendParagraph");
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
| **paragraphText** | **String**| The text content to be used in the paragraph. | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **cssStyle** | **String**| Optional: The CSS style for the paragraph. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlCreateBlankDocument

> byte[] editHtmlHtmlCreateBlankDocument(title, cssUrl, cssInline, javascriptUrl, javascriptInline)

Create a Blank HTML Document

Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String title = "title_example"; // String | Optional: The title of the HTML document
        String cssUrl = "cssUrl_example"; // String | Optional: A CSS style URL to be added to the document.
        String cssInline = "cssInline_example"; // String | Optional: An inline CSS style to be added to the document.
        String javascriptUrl = "javascriptUrl_example"; // String | Optional: Javascript URL to be added to the document.
        String javascriptInline = "javascriptInline_example"; // String | Optional: Inline Javascript to be added to the document.
        try {
            byte[] result = apiInstance.editHtmlHtmlCreateBlankDocument(title, cssUrl, cssInline, javascriptUrl, javascriptInline);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlCreateBlankDocument");
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
| **title** | **String**| Optional: The title of the HTML document | [optional] |
| **cssUrl** | **String**| Optional: A CSS style URL to be added to the document. | [optional] |
| **cssInline** | **String**| Optional: An inline CSS style to be added to the document. | [optional] |
| **javascriptUrl** | **String**| Optional: Javascript URL to be added to the document. | [optional] |
| **javascriptInline** | **String**| Optional: Inline Javascript to be added to the document. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlGetLanguage

> HtmlGetLanguageResult editHtmlHtmlGetLanguage(inputFileUrl, inputFile)

Gets the language for the HTML document

Retrieves the language code (e.g. \&quot;en\&quot; or \&quot;de\&quot;) of an HTML document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            HtmlGetLanguageResult result = apiInstance.editHtmlHtmlGetLanguage(inputFileUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlGetLanguage");
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
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

[**HtmlGetLanguageResult**](HtmlGetLanguageResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlGetLinks

> HtmlGetLinksResponse editHtmlHtmlGetLinks(inputFileUrl, baseUrl, inputFile)

Extract resolved link URLs from HTML File

Extracts the resolved link URLs, fully-qualified if possible, from an input HTML file.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        String baseUrl = "baseUrl_example"; // String | Optional: Base URL of the page, such as https://mydomain.com
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            HtmlGetLinksResponse result = apiInstance.editHtmlHtmlGetLinks(inputFileUrl, baseUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlGetLinks");
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
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **baseUrl** | **String**| Optional: Base URL of the page, such as https://mydomain.com | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

[**HtmlGetLinksResponse**](HtmlGetLinksResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlGetRelCanonical

> HtmlGetRelCanonicalUrlResult editHtmlHtmlGetRelCanonical(inputFileUrl, inputFile)

Gets the rel canonical URL for the HTML document

Gets the rel canonical URL of an HTML document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            HtmlGetRelCanonicalUrlResult result = apiInstance.editHtmlHtmlGetRelCanonical(inputFileUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlGetRelCanonical");
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
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

[**HtmlGetRelCanonicalUrlResult**](HtmlGetRelCanonicalUrlResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlGetSitemap

> HtmlGetSitemapUrlResult editHtmlHtmlGetSitemap(inputFileUrl, inputFile)

Gets the sitemap URL for the HTML document

Gets the sitemap link URL of an HTML document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            HtmlGetSitemapUrlResult result = apiInstance.editHtmlHtmlGetSitemap(inputFileUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlGetSitemap");
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
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

[**HtmlGetSitemapUrlResult**](HtmlGetSitemapUrlResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlSetLanguage

> byte[] editHtmlHtmlSetLanguage(languageCode, inputFileUrl, inputFile)

Sets the language for the HTML document

Sets the language code of an HTML document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String languageCode = "languageCode_example"; // String | The HTML langauge code to set.
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editHtmlHtmlSetLanguage(languageCode, inputFileUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlSetLanguage");
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
| **languageCode** | **String**| The HTML langauge code to set. | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlSetRelCanonical

> byte[] editHtmlHtmlSetRelCanonical(canonicalUrl, inputFileUrl, inputFile)

Sets the rel canonical URL for the HTML document

Sets the rel canonical URL of an HTML document.  This is useful for telling search engines and other indexers which pages are duplicates of eachother; any pages with the rel&#x3D;canonical tag will be treated as duplicates of the canonical URL.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String canonicalUrl = "canonicalUrl_example"; // String | The HTML canonical URL to set.
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editHtmlHtmlSetRelCanonical(canonicalUrl, inputFileUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlSetRelCanonical");
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
| **canonicalUrl** | **String**| The HTML canonical URL to set. | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editHtmlHtmlSetSitemapUrl

> byte[] editHtmlHtmlSetSitemapUrl(sitemapUrl, inputFileUrl, inputFile)

Sets the sitemap URL for the HTML document

Sets the sitemap URL of an HTML document.

### Example

```java
// Import classes:
import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.ApiException;
import com.cloudmersive.client.rt.invoker.Configuration;
import com.cloudmersive.client.rt.invoker.auth.*;
import com.cloudmersive.client.rt.invoker.models.*;
import com.cloudmersive.client.rt.EditHtmlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditHtmlApi apiInstance = new EditHtmlApi(defaultClient);
        String sitemapUrl = "sitemapUrl_example"; // String | The HTML sitemap URL to set.
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.editHtmlHtmlSetSitemapUrl(sitemapUrl, inputFileUrl, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditHtmlApi#editHtmlHtmlSetSitemapUrl");
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
| **sitemapUrl** | **String**| The HTML sitemap URL to set. | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

