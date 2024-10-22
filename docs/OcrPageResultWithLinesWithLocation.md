

# OcrPageResultWithLinesWithLocation

OCR results of a page, including lines of text and their location

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageNumber** | **Integer** | Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file |  [optional] |
|**successful** | **Boolean** | True if successful, false otherwise |  [optional] |
|**lines** | [**List&lt;OcrLineElement&gt;**](OcrLineElement.md) | Word elements in the image |  [optional] |



