package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import java.io.File;
import com.cloudmersive.client.rt.model.MssqlBakEnumerateTablesResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:17:03.513337300Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BackupConvertApi extends BaseApi {

    public BackupConvertApi() {
        super(new ApiClient());
    }

    public BackupConvertApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Lists all tables stored in a SQL Server Backup (.BAK) file
     * 
     * <p><b>200</b> - Success
     * @param inputFile Input file to perform the operation on (optional)
     * @return MssqlBakEnumerateTablesResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MssqlBakEnumerateTablesResult dataintegrationBackupConvertMssqlBakGetTablesPost(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(inputFile).getBody();
    }

    /**
     * Lists all tables stored in a SQL Server Backup (.BAK) file
     * 
     * <p><b>200</b> - Success
     * @param inputFile Input file to perform the operation on (optional)
     * @return ResponseEntity&lt;MssqlBakEnumerateTablesResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MssqlBakEnumerateTablesResult> dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<MssqlBakEnumerateTablesResult> localReturnType = new ParameterizedTypeReference<MssqlBakEnumerateTablesResult>() {};
        return apiClient.invokeAPI("/dataintegration/backup/convert/mssql/bak/get/tables", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
     * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
     * <p><b>200</b>
     * @param tableName Name of the table to return (optional)
     * @param inputFile Input file to perform the operation on (optional)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public org.springframework.core.io.Resource dataintegrationBackupConvertMssqlBakToCsvPost(String tableName, org.springframework.core.io.Resource inputFile) throws RestClientException {
        return dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(tableName, inputFile).getBody();
    }

    /**
     * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
     * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
     * <p><b>200</b>
     * @param tableName Name of the table to return (optional)
     * @param inputFile Input file to perform the operation on (optional)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<org.springframework.core.io.Resource> dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(String tableName, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (tableName != null)
        localVarHeaderParams.add("tableName", apiClient.parameterToString(tableName));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "text/csv"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<org.springframework.core.io.Resource> localReturnType = new ParameterizedTypeReference<org.springframework.core.io.Resource>() {};
        return apiClient.invokeAPI("/dataintegration/backup/convert/mssql/bak/to/csv", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "text/csv"
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
