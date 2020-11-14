

# SetXlsxCellByIdentifierRequest

Input to a Set Cell by identifier in XLSX Worksheets request
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional]
**inputFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**worksheetToUpdate** | [**XlsxWorksheet**](XlsxWorksheet.md) |  |  [optional]
**cellIdentifier** | **String** | The Excel cell identifier (e.g. A1, B2, C33, etc.) of the cell to update |  [optional]
**cellValue** | [**XlsxSpreadsheetCell**](XlsxSpreadsheetCell.md) |  |  [optional]



