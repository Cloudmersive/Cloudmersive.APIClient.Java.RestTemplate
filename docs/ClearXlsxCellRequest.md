

# ClearXlsxCellRequest

Input to a Clear Cell in XLSX Worksheet request
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional]
**inputFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**worksheetToUpdate** | [**XlsxWorksheet**](XlsxWorksheet.md) |  |  [optional]
**rowIndex** | **Integer** | 0-based index of the row, 0, 1, 2, ... to clear |  [optional]
**cellIndex** | **Integer** | 0-based index of the cell, 0, 1, 2, ... in the row to clear |  [optional]



