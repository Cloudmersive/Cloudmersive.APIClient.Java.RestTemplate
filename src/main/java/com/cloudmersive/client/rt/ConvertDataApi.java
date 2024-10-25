package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import java.io.File;
import com.cloudmersive.client.rt.model.XmlAddAttributeWithXPathResult;
import com.cloudmersive.client.rt.model.XmlAddChildWithXPathResult;
import com.cloudmersive.client.rt.model.XmlFilterWithXPathResult;
import com.cloudmersive.client.rt.model.XmlQueryWithXQueryMultiResult;
import com.cloudmersive.client.rt.model.XmlQueryWithXQueryResult;
import com.cloudmersive.client.rt.model.XmlRemoveAllChildrenWithXPathResult;
import com.cloudmersive.client.rt.model.XmlRemoveWithXPathResult;
import com.cloudmersive.client.rt.model.XmlReplaceWithXPathResult;
import com.cloudmersive.client.rt.model.XmlSetValueWithXPathResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConvertDataApi extends BaseApi {

    public ConvertDataApi() {
        super(new ApiClient());
    }

    public ConvertDataApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Convert CSV to JSON conversion
     * Convert a CSV file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object convertDataCsvToJson(org.springframework.core.io.Resource inputFile, Boolean columnNamesFromFirstRow) throws RestClientException {
        return convertDataCsvToJsonWithHttpInfo(inputFile, columnNamesFromFirstRow).getBody();
    }

    /**
     * Convert CSV to JSON conversion
     * Convert a CSV file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> convertDataCsvToJsonWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean columnNamesFromFirstRow) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataCsvToJson");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (columnNamesFromFirstRow != null)
        localVarHeaderParams.add("columnNamesFromFirstRow", apiClient.parameterToString(columnNamesFromFirstRow));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/csv/to/json", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Convert CSV to XML conversion
     * Convert a CSV file to a XML file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure. (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDataCsvToXml(org.springframework.core.io.Resource inputFile, Boolean columnNamesFromFirstRow) throws RestClientException {
        return convertDataCsvToXmlWithHttpInfo(inputFile, columnNamesFromFirstRow).getBody();
    }

    /**
     * Convert CSV to XML conversion
     * Convert a CSV file to a XML file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure. (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDataCsvToXmlWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean columnNamesFromFirstRow) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataCsvToXml");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (columnNamesFromFirstRow != null)
        localVarHeaderParams.add("columnNamesFromFirstRow", apiClient.parameterToString(columnNamesFromFirstRow));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/csv/to/xml", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Convert JSON String to XML conversion
     * Convert a JSON object into XML
     * <p><b>200</b> - OK
     * @param jsonString Input JSON String to convert to XML (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object convertDataJsonStringToXml(String jsonString) throws RestClientException {
        return convertDataJsonStringToXmlWithHttpInfo(jsonString).getBody();
    }

    /**
     * Convert JSON String to XML conversion
     * Convert a JSON object into XML
     * <p><b>200</b> - OK
     * @param jsonString Input JSON String to convert to XML (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> convertDataJsonStringToXmlWithHttpInfo(String jsonString) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jsonString' is set
        if (jsonString == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jsonString' when calling convertDataJsonStringToXml");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "JsonString", jsonString));
        

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/json-string/to/xml", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Convert JSON Object to XML conversion
     * Convert a JSON object into XML
     * <p><b>200</b> - OK
     * @param jsonObject Input JSON Object to convert to XML (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDataJsonToXml(Object jsonObject) throws RestClientException {
        return convertDataJsonToXmlWithHttpInfo(jsonObject).getBody();
    }

    /**
     * Convert JSON Object to XML conversion
     * Convert a JSON object into XML
     * <p><b>200</b> - OK
     * @param jsonObject Input JSON Object to convert to XML (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDataJsonToXmlWithHttpInfo(Object jsonObject) throws RestClientException {
        Object localVarPostBody = jsonObject;
        
        // verify the required parameter 'jsonObject' is set
        if (jsonObject == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jsonObject' when calling convertDataJsonToXml");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/json/to/xml", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Convert Excel (97-2003) XLS to JSON conversion
     * Convert an Excel (97-2003) XLS file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object convertDataXlsToJson(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXlsToJsonWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel (97-2003) XLS to JSON conversion
     * Convert an Excel (97-2003) XLS file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> convertDataXlsToJsonWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXlsToJson");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/xls/to/json", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Convert Excel XLSX to JSON conversion
     * Convert an Excel XLSX file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDataXlsxToJson(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXlsxToJsonWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLSX to JSON conversion
     * Convert an Excel XLSX file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDataXlsxToJsonWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXlsxToJson");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/xlsx/to/json", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Convert Excel XLSX to XML conversion
     * Convert an Excel XLSX file to a XML file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDataXlsxToXml(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXlsxToXmlWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Excel XLSX to XML conversion
     * Convert an Excel XLSX file to a XML file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDataXlsxToXmlWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXlsxToXml");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/xlsx/to/xml", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Adds an attribute to all XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by adding an attribute to all of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param xmlAttributeName Name of the XML attribute to add (required)
     * @param xmlAttributeValue Value of the XML attribute to add (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return XmlAddAttributeWithXPathResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlAddAttributeWithXPathResult convertDataXmlEditAddAttributeWithXPath(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlEditAddAttributeWithXPathWithHttpInfo(xpathExpression, xmlAttributeName, xmlAttributeValue, inputFile).getBody();
    }

    /**
     * Adds an attribute to all XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by adding an attribute to all of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param xmlAttributeName Name of the XML attribute to add (required)
     * @param xmlAttributeValue Value of the XML attribute to add (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return ResponseEntity&lt;XmlAddAttributeWithXPathResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlAddAttributeWithXPathResult> convertDataXmlEditAddAttributeWithXPathWithHttpInfo(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xpathExpression' when calling convertDataXmlEditAddAttributeWithXPath");
        }
        
        // verify the required parameter 'xmlAttributeName' is set
        if (xmlAttributeName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xmlAttributeName' when calling convertDataXmlEditAddAttributeWithXPath");
        }
        
        // verify the required parameter 'xmlAttributeValue' is set
        if (xmlAttributeValue == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xmlAttributeValue' when calling convertDataXmlEditAddAttributeWithXPath");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlEditAddAttributeWithXPath");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        localVarHeaderParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (xmlAttributeName != null)
        localVarHeaderParams.add("XmlAttributeName", apiClient.parameterToString(xmlAttributeName));
        if (xmlAttributeValue != null)
        localVarHeaderParams.add("XmlAttributeValue", apiClient.parameterToString(xmlAttributeValue));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlAddAttributeWithXPathResult> localReturnType = new ParameterizedTypeReference<XmlAddAttributeWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/add-attribute", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Adds an XML node as a child to XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by adding an XML node as a child to all of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param xmlNodeToAdd XML Node to add as a child (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return XmlAddChildWithXPathResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlAddChildWithXPathResult convertDataXmlEditAddChildWithXPath(String xpathExpression, String xmlNodeToAdd, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlEditAddChildWithXPathWithHttpInfo(xpathExpression, xmlNodeToAdd, inputFile).getBody();
    }

    /**
     * Adds an XML node as a child to XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by adding an XML node as a child to all of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param xmlNodeToAdd XML Node to add as a child (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return ResponseEntity&lt;XmlAddChildWithXPathResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlAddChildWithXPathResult> convertDataXmlEditAddChildWithXPathWithHttpInfo(String xpathExpression, String xmlNodeToAdd, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xpathExpression' when calling convertDataXmlEditAddChildWithXPath");
        }
        
        // verify the required parameter 'xmlNodeToAdd' is set
        if (xmlNodeToAdd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xmlNodeToAdd' when calling convertDataXmlEditAddChildWithXPath");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlEditAddChildWithXPath");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        localVarHeaderParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (xmlNodeToAdd != null)
        localVarHeaderParams.add("XmlNodeToAdd", apiClient.parameterToString(xmlNodeToAdd));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlAddChildWithXPathResult> localReturnType = new ParameterizedTypeReference<XmlAddChildWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/add-child", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes
     * Return the reuslts of editing an XML document by removing all child nodes of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return XmlRemoveAllChildrenWithXPathResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlRemoveAllChildrenWithXPathResult convertDataXmlEditRemoveAllChildNodesWithXPath(String xpathExpression, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlEditRemoveAllChildNodesWithXPathWithHttpInfo(xpathExpression, inputFile).getBody();
    }

    /**
     * Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes
     * Return the reuslts of editing an XML document by removing all child nodes of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return ResponseEntity&lt;XmlRemoveAllChildrenWithXPathResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlRemoveAllChildrenWithXPathResult> convertDataXmlEditRemoveAllChildNodesWithXPathWithHttpInfo(String xpathExpression, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xpathExpression' when calling convertDataXmlEditRemoveAllChildNodesWithXPath");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlEditRemoveAllChildNodesWithXPath");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        localVarHeaderParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlRemoveAllChildrenWithXPathResult> localReturnType = new ParameterizedTypeReference<XmlRemoveAllChildrenWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/remove-all-children", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Replaces XML nodes matching XPath expression with new node
     * Return the reuslts of editing an XML document by replacing all of the nodes that match an input XPath expression with a new XML node expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param xmlNodeReplacement XML Node replacement content (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return XmlReplaceWithXPathResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlReplaceWithXPathResult convertDataXmlEditReplaceWithXPath(String xpathExpression, String xmlNodeReplacement, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlEditReplaceWithXPathWithHttpInfo(xpathExpression, xmlNodeReplacement, inputFile).getBody();
    }

    /**
     * Replaces XML nodes matching XPath expression with new node
     * Return the reuslts of editing an XML document by replacing all of the nodes that match an input XPath expression with a new XML node expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param xmlNodeReplacement XML Node replacement content (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return ResponseEntity&lt;XmlReplaceWithXPathResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlReplaceWithXPathResult> convertDataXmlEditReplaceWithXPathWithHttpInfo(String xpathExpression, String xmlNodeReplacement, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xpathExpression' when calling convertDataXmlEditReplaceWithXPath");
        }
        
        // verify the required parameter 'xmlNodeReplacement' is set
        if (xmlNodeReplacement == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xmlNodeReplacement' when calling convertDataXmlEditReplaceWithXPath");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlEditReplaceWithXPath");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        localVarHeaderParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (xmlNodeReplacement != null)
        localVarHeaderParams.add("XmlNodeReplacement", apiClient.parameterToString(xmlNodeReplacement));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlReplaceWithXPathResult> localReturnType = new ParameterizedTypeReference<XmlReplaceWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/replace", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Sets the value contents of XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by setting the contents of all of the nodes that match an input XPath expression.  Supports elements and attributes.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param xmlValue XML Value to set into the matching XML nodes (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return XmlSetValueWithXPathResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlSetValueWithXPathResult convertDataXmlEditSetValueWithXPath(String xpathExpression, String xmlValue, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlEditSetValueWithXPathWithHttpInfo(xpathExpression, xmlValue, inputFile).getBody();
    }

    /**
     * Sets the value contents of XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by setting the contents of all of the nodes that match an input XPath expression.  Supports elements and attributes.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param xmlValue XML Value to set into the matching XML nodes (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return ResponseEntity&lt;XmlSetValueWithXPathResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlSetValueWithXPathResult> convertDataXmlEditSetValueWithXPathWithHttpInfo(String xpathExpression, String xmlValue, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xpathExpression' when calling convertDataXmlEditSetValueWithXPath");
        }
        
        // verify the required parameter 'xmlValue' is set
        if (xmlValue == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xmlValue' when calling convertDataXmlEditSetValueWithXPath");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlEditSetValueWithXPath");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        localVarHeaderParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (xmlValue != null)
        localVarHeaderParams.add("XmlValue", apiClient.parameterToString(xmlValue));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlSetValueWithXPathResult> localReturnType = new ParameterizedTypeReference<XmlSetValueWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/set-value", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Filter, select XML nodes using XPath expression, get results
     * Return the reuslts of filtering, selecting an XML document with an XPath expression
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return XmlFilterWithXPathResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlFilterWithXPathResult convertDataXmlFilterWithXPath(String xpathExpression, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlFilterWithXPathWithHttpInfo(xpathExpression, inputFile).getBody();
    }

    /**
     * Filter, select XML nodes using XPath expression, get results
     * Return the reuslts of filtering, selecting an XML document with an XPath expression
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;XmlFilterWithXPathResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlFilterWithXPathResult> convertDataXmlFilterWithXPathWithHttpInfo(String xpathExpression, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xpathExpression' when calling convertDataXmlFilterWithXPath");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlFilterWithXPath");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        localVarHeaderParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlFilterWithXPathResult> localReturnType = new ParameterizedTypeReference<XmlFilterWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/select/xpath", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Query an XML file using XQuery query, get results
     * Return the reuslts of querying a single XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for a single XML document as input.  Provided XML document is automatically loaded as the default context; to access elements in the document, simply refer to them without a document reference, such as bookstore/book
     * <p><b>200</b> - OK
     * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return XmlQueryWithXQueryResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlQueryWithXQueryResult convertDataXmlQueryWithXQuery(String xquery, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlQueryWithXQueryWithHttpInfo(xquery, inputFile).getBody();
    }

    /**
     * Query an XML file using XQuery query, get results
     * Return the reuslts of querying a single XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for a single XML document as input.  Provided XML document is automatically loaded as the default context; to access elements in the document, simply refer to them without a document reference, such as bookstore/book
     * <p><b>200</b> - OK
     * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported (required)
     * @param inputFile Input XML file to perform the operation on. (required)
     * @return ResponseEntity&lt;XmlQueryWithXQueryResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlQueryWithXQueryResult> convertDataXmlQueryWithXQueryWithHttpInfo(String xquery, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xquery' is set
        if (xquery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xquery' when calling convertDataXmlQueryWithXQuery");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlQueryWithXQuery");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xquery != null)
        localVarHeaderParams.add("XQuery", apiClient.parameterToString(xquery));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlQueryWithXQueryResult> localReturnType = new ParameterizedTypeReference<XmlQueryWithXQueryResult>() {};
        return apiClient.invokeAPI("/convert/xml/query/xquery", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Query multiple XML files using XQuery query, get results
     * Return the reuslts of querying an XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for multiple XML documents as input.  You can refer to the contents of a given document by name, for example doc(\&quot;books.xml\&quot;) or doc(\&quot;restaurants.xml\&quot;) if you included two input files named books.xml and restaurants.xml.  If input files contain no file name, they will default to file names input1.xml, input2.xml and so on.
     * <p><b>200</b> - OK
     * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported (required)
     * @param inputFile1 First input XML file to perform the operation on. (required)
     * @param inputFile2 Second input XML file to perform the operation on. (optional)
     * @param inputFile3 Third input XML file to perform the operation on. (optional)
     * @param inputFile4 Fourth input XML file to perform the operation on. (optional)
     * @param inputFile5 Fifth input XML file to perform the operation on. (optional)
     * @param inputFile6 Sixth input XML file to perform the operation on. (optional)
     * @param inputFile7 Seventh input XML file to perform the operation on. (optional)
     * @param inputFile8 Eighth input XML file to perform the operation on. (optional)
     * @param inputFile9 Ninth input XML file to perform the operation on. (optional)
     * @param inputFile10 Tenth input XML file to perform the operation on. (optional)
     * @return XmlQueryWithXQueryMultiResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlQueryWithXQueryMultiResult convertDataXmlQueryWithXQueryMulti(String xquery, org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        return convertDataXmlQueryWithXQueryMultiWithHttpInfo(xquery, inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).getBody();
    }

    /**
     * Query multiple XML files using XQuery query, get results
     * Return the reuslts of querying an XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for multiple XML documents as input.  You can refer to the contents of a given document by name, for example doc(\&quot;books.xml\&quot;) or doc(\&quot;restaurants.xml\&quot;) if you included two input files named books.xml and restaurants.xml.  If input files contain no file name, they will default to file names input1.xml, input2.xml and so on.
     * <p><b>200</b> - OK
     * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported (required)
     * @param inputFile1 First input XML file to perform the operation on. (required)
     * @param inputFile2 Second input XML file to perform the operation on. (optional)
     * @param inputFile3 Third input XML file to perform the operation on. (optional)
     * @param inputFile4 Fourth input XML file to perform the operation on. (optional)
     * @param inputFile5 Fifth input XML file to perform the operation on. (optional)
     * @param inputFile6 Sixth input XML file to perform the operation on. (optional)
     * @param inputFile7 Seventh input XML file to perform the operation on. (optional)
     * @param inputFile8 Eighth input XML file to perform the operation on. (optional)
     * @param inputFile9 Ninth input XML file to perform the operation on. (optional)
     * @param inputFile10 Tenth input XML file to perform the operation on. (optional)
     * @return ResponseEntity&lt;XmlQueryWithXQueryMultiResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlQueryWithXQueryMultiResult> convertDataXmlQueryWithXQueryMultiWithHttpInfo(String xquery, org.springframework.core.io.Resource inputFile1, org.springframework.core.io.Resource inputFile2, org.springframework.core.io.Resource inputFile3, org.springframework.core.io.Resource inputFile4, org.springframework.core.io.Resource inputFile5, org.springframework.core.io.Resource inputFile6, org.springframework.core.io.Resource inputFile7, org.springframework.core.io.Resource inputFile8, org.springframework.core.io.Resource inputFile9, org.springframework.core.io.Resource inputFile10) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xquery' is set
        if (xquery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xquery' when calling convertDataXmlQueryWithXQueryMulti");
        }
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile1' when calling convertDataXmlQueryWithXQueryMulti");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xquery != null)
        localVarHeaderParams.add("XQuery", apiClient.parameterToString(xquery));

        if (inputFile1 != null)
            localVarFormParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            localVarFormParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            localVarFormParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            localVarFormParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            localVarFormParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            localVarFormParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            localVarFormParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            localVarFormParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            localVarFormParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            localVarFormParams.add("inputFile10", inputFile10);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlQueryWithXQueryMultiResult> localReturnType = new ParameterizedTypeReference<XmlQueryWithXQueryMultiResult>() {};
        return apiClient.invokeAPI("/convert/xml/query/xquery/multi", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove, delete XML nodes and items matching XPath expression
     * Return the reuslts of editing an XML document by removing all of the nodes that match an input XPath expression
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return XmlRemoveWithXPathResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XmlRemoveWithXPathResult convertDataXmlRemoveWithXPath(String xpathExpression, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlRemoveWithXPathWithHttpInfo(xpathExpression, inputFile).getBody();
    }

    /**
     * Remove, delete XML nodes and items matching XPath expression
     * Return the reuslts of editing an XML document by removing all of the nodes that match an input XPath expression
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;XmlRemoveWithXPathResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlRemoveWithXPathResult> convertDataXmlRemoveWithXPathWithHttpInfo(String xpathExpression, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xpathExpression' when calling convertDataXmlRemoveWithXPath");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlRemoveWithXPath");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        localVarHeaderParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlRemoveWithXPathResult> localReturnType = new ParameterizedTypeReference<XmlRemoveWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/remove", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Convert XML to JSON conversion
     * Convert an XML string or file into JSON
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object convertDataXmlToJson(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertDataXmlToJsonWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert XML to JSON conversion
     * Convert an XML string or file into JSON
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> convertDataXmlToJsonWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlToJson");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/xml/to/json", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Transform XML document file with XSLT into a new XML document
     * Convert an XML string or file into JSON
     * <p><b>200</b> - OK
     * @param inputFile Input XML file to perform the operation on. (required)
     * @param transformFile Input XSLT file to use to transform the input XML file. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertDataXmlTransformWithXsltToXml(org.springframework.core.io.Resource inputFile, org.springframework.core.io.Resource transformFile) throws RestClientException {
        return convertDataXmlTransformWithXsltToXmlWithHttpInfo(inputFile, transformFile).getBody();
    }

    /**
     * Transform XML document file with XSLT into a new XML document
     * Convert an XML string or file into JSON
     * <p><b>200</b> - OK
     * @param inputFile Input XML file to perform the operation on. (required)
     * @param transformFile Input XSLT file to use to transform the input XML file. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertDataXmlTransformWithXsltToXmlWithHttpInfo(org.springframework.core.io.Resource inputFile, org.springframework.core.io.Resource transformFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDataXmlTransformWithXsltToXml");
        }
        
        // verify the required parameter 'transformFile' is set
        if (transformFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transformFile' when calling convertDataXmlTransformWithXsltToXml");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);
        if (transformFile != null)
            localVarFormParams.add("transformFile", transformFile);

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/xml/transform/xslt/to/xml", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
