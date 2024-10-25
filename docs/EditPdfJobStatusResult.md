

# EditPdfJobStatusResult

Result of performing a batch job operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**successful** | **Boolean** | Tru eif the operation to check the status of the job was successful, false otherwise |  [optional] |
|**asyncJobStatus** | **String** | Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED |  [optional] |
|**asyncJobID** | **String** | When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes |  [optional] |
|**outputFileResult** | **byte[]** | Output file result (if applicable) |  [optional] |
|**errorMessage** | **String** | Error message (if any) |  [optional] |



