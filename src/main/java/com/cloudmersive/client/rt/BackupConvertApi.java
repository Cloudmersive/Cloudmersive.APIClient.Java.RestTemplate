package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:30.993-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.BackupConvertApi")
public class BackupConvertApi {
    private ApiClient apiClient;

    public BackupConvertApi() {
        this(new ApiClient());
    }

    @Autowired
    public BackupConvertApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
        Object postBody = null;
        
        String path = apiClient.expandPath("/dataintegration/backup/convert/mssql/bak/get/tables", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<MssqlBakEnumerateTablesResult> returnType = new ParameterizedTypeReference<MssqlBakEnumerateTablesResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
    public File dataintegrationBackupConvertMssqlBakToCsvPost(String tableName, org.springframework.core.io.Resource inputFile) throws RestClientException {
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
    public ResponseEntity<File> dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(String tableName, org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/dataintegration/backup/convert/mssql/bak/to/csv", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (tableName != null)
        headerParams.add("tableName", apiClient.parameterToString(tableName));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "text/csv"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
