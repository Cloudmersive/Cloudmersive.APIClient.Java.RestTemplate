$ErrorActionPreference = "Stop"

Remove-Item –path ./docs –recurse -force -ErrorAction Ignore
Remove-Item –path ./gradle –recurse -force -ErrorAction Ignore
Remove-Item –path ./scripts –recurse -force -ErrorAction Ignore
Remove-Item –path ./src –recurse -force -ErrorAction Ignore

& java -jar openapi-generator-cli-5.0.0-beta2.jar generate   -i https://api.cloudmersive.com/validate/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate    -i https://api.cloudmersive.com/nlp-v2/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate  -i https://api.cloudmersive.com/ocr/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate   -i https://api.cloudmersive.com/barcode/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate  -i https://api.cloudmersive.com/image/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate    -i https://api.cloudmersive.com/convert/docs/v1/swagger -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate    -i https://api.cloudmersive.com/virus/docs/v1/swagger -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate    -i https://api.cloudmersive.com/config/docs/v1/swagger -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate    -i https://api.cloudmersive.com/video/docs/v1/swagger -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate    -i https://api.cloudmersive.com/swagger/api/dataintegration -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-5.0.0-beta2.jar generate    -i https://api.cloudmersive.com/swagger/api/currency -g java -c packageconfig.json                      -o . --skip-validate-spec 

# Fix Android bug


(Get-Content ./src/main/java/com/cloudmersive/client/invoker/ApiClient.java).replace('httpClient = new OkHttpClient();', "httpClient = new OkHttpClient();  httpClient.setProtocols(Arrays.asList(Protocol.HTTP_1_1));") | Set-Content ./src/main/java/com/cloudmersive/client/invoker/ApiClient.java

(Get-Content ./build.gradle).replace('src/main\java', "src/main/java") | Set-Content ./build.gradle

#& pushd cloudmersive-java-api-client
& gradle clean
#& mvn install -U
& gradle build
#& popd