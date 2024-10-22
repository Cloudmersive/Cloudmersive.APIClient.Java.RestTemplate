

# HttpFormDataParameter

Defines a parameter of type FormData (multipart/form-data)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameterName** | **String** | Name of the parameter |  [optional] |
|**parameterTextValue** | **String** | Text value of the parameter; if set, do not set ParameterFileContents or UseOutputFromPreviousTask |  [optional] |
|**parameterFileContents** | **byte[]** | Binary contents of the parameter; if set, do not set ParameterTextValue or UseOutputFromPreviousTask |  [optional] |
|**useOutputFromPreviousTask** | [**TaskOutputReference**](TaskOutputReference.md) |  |  [optional] |



