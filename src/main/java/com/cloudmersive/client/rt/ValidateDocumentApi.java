package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.AutodetectDocumentValidationResult;
import com.cloudmersive.client.rt.model.DocumentValidationResult;
import java.io.File;
import com.cloudmersive.client.rt.model.HtmlSsrfThreatCheckResult;
import com.cloudmersive.client.rt.model.XxeThreatDetectionResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.ValidateDocumentApi")
public class ValidateDocumentApi {
    private ApiClient apiClient;

    public ValidateDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ValidateDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Autodetect content type and validate
     * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return AutodetectDocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AutodetectDocumentValidationResult validateDocumentAutodetectValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentAutodetectValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Autodetect content type and validate
     * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;AutodetectDocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AutodetectDocumentValidationResult> validateDocumentAutodetectValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentAutodetectValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/autodetect", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<AutodetectDocumentValidationResult> returnType = new ParameterizedTypeReference<AutodetectDocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a CSV file document (CSV)
     * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentCsvValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentCsvValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a CSV file document (CSV)
     * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentCsvValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentCsvValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/csv", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a Word 97-2003 Legacy document (DOC)
     * Validate a Word 97-2003 Legacy document (DOC)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentDocValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentDocValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Word 97-2003 Legacy document (DOC)
     * Validate a Word 97-2003 Legacy document (DOC)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentDocValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentDocValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/doc", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a Word document (DOCX)
     * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentDocxValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentDocxValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Word document (DOCX)
     * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentDocxValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentDocxValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/docx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate if an EML file is executable
     * Validate if an input file is an EML email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentEmlValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentEmlValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate if an EML file is executable
     * Validate if an input file is an EML email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentEmlValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentEmlValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/eml", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate if a file is executable
     * Validate if an input file is a binary executable file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentExecutableValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentExecutableValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate if a file is executable
     * Validate if an input file is a binary executable file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentExecutableValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentExecutableValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/executable", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a GZip Archive file (gzip or gz)
     * Validate a GZip archive file (GZIP or GZ)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentGZipValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentGZipValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a GZip Archive file (gzip or gz)
     * Validate a GZip archive file (GZIP or GZ)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentGZipValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentGZipValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/gzip", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate an HTML file and checks for SSRF threats
     * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return HtmlSsrfThreatCheckResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HtmlSsrfThreatCheckResult validateDocumentHtmlSsrfValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentHtmlSsrfValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an HTML file and checks for SSRF threats
     * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;HtmlSsrfThreatCheckResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HtmlSsrfThreatCheckResult> validateDocumentHtmlSsrfValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentHtmlSsrfValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/html/ssrf-threat-check", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<HtmlSsrfThreatCheckResult> returnType = new ParameterizedTypeReference<HtmlSsrfThreatCheckResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate an HTML file
     * Validate an HTML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentHtmlValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentHtmlValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an HTML file
     * Validate an HTML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentHtmlValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentHtmlValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate an Image File
     * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentImageValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentImageValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an Image File
     * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentImageValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentImageValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/image", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a JPG File
     * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentJpgValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentJpgValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a JPG File
     * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentJpgValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentJpgValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/jpg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a JSON file
     * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentJsonValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentJsonValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a JSON file
     * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentJsonValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentJsonValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/json", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate if an MSG file is executable
     * Validate if an input file is an MSG email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentMsgValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentMsgValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate if an MSG file is executable
     * Validate if an input file is an MSG email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentMsgValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentMsgValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/msg", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a PDF document file
     * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentPdfValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPdfValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a PDF document file
     * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentPdfValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPdfValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a PNG File
     * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentPngValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPngValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a PNG File
     * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentPngValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPngValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentPptValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPptValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentPptValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPptValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/ppt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a PowerPoint presentation (PPTX)
     * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentPptxValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentPptxValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a PowerPoint presentation (PPTX)
     * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentPptxValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentPptxValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/pptx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a RAR Archive file (RAR)
     * Validate a RAR archive file (RAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentRarValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentRarValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a RAR Archive file (RAR)
     * Validate a RAR archive file (RAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentRarValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentRarValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/rar", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a Rich Text Format document (RTF)
     * Validate a Rich Text Format document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentRtfValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentRtfValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Rich Text Format document (RTF)
     * Validate a Rich Text Format document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentRtfValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentRtfValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/rtf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a TAR Tarball Archive file (TAR)
     * Validate a TAR tarball archive file (TAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentTarValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentTarValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a TAR Tarball Archive file (TAR)
     * Validate a TAR tarball archive file (TAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentTarValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentTarValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/tar", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate an TXT file
     * Validate an TXT document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentTxtValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentTxtValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an TXT file
     * Validate an TXT document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentTxtValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentTxtValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentXlsValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXlsValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentXlsValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXlsValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/xls", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a Excel document (XLSX)
     * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentXlsxValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXlsxValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Excel document (XLSX)
     * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentXlsxValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXlsxValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/xlsx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate an XML file
     * Validate an XML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentXmlValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXmlValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an XML file
     * Validate an XML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentXmlValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXmlValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/xml", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate an XML file for XML External Entity (XXE) threats
     * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return XxeThreatDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XxeThreatDetectionResult validateDocumentXmlXxeThreatValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentXmlXxeThreatValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate an XML file for XML External Entity (XXE) threats
     * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;XxeThreatDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XxeThreatDetectionResult> validateDocumentXmlXxeThreatValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentXmlXxeThreatValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/xml/xxe-threats", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<XxeThreatDetectionResult> returnType = new ParameterizedTypeReference<XxeThreatDetectionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a Zip Archive file (zip)
     * Validate a Zip archive file (ZIP)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return DocumentValidationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentValidationResult validateDocumentZipValidation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return validateDocumentZipValidationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Validate a Zip Archive file (zip)
     * Validate a Zip archive file (ZIP)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;DocumentValidationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentValidationResult> validateDocumentZipValidationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling validateDocumentZipValidation");
        }
        
        String path = apiClient.expandPath("/convert/validate/zip", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<DocumentValidationResult> returnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
