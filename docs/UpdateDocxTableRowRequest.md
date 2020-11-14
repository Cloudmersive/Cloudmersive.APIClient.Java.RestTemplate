

# UpdateDocxTableRowRequest

Input to a Update Table Row request
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional]
**inputFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**rowToUpdate** | [**DocxTableRow**](DocxTableRow.md) |  |  [optional]
**tableRowIndex** | **Integer** | 0-based index of the Table Row to update |  [optional]
**existingTablePath** | **String** | Required; the path to the existing table to modify |  [optional]



