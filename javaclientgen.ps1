$ErrorActionPreference = "Stop"

Remove-Item –path ./docs –recurse -force -ErrorAction Ignore
Remove-Item –path ./gradle –recurse -force -ErrorAction Ignore
Remove-Item –path ./scripts –recurse -force -ErrorAction Ignore
Remove-Item –path ./src –recurse -force -ErrorAction Ignore

& java -jar openapi-generator-cli-7.9.0.jar generate   -i https://api.cloudmersive.com/validate/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate    -i https://api.cloudmersive.com/nlp-v2/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate  -i https://api.cloudmersive.com/ocr/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate   -i https://api.cloudmersive.com/barcode/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate  -i https://api.cloudmersive.com/image/docs/v1/swagger  -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate    -i https://api.cloudmersive.com/convert/docs/v1/swagger -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate    -i https://api.cloudmersive.com/virus/docs/v1/swagger -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate    -i https://api.cloudmersive.com/config/docs/v1/swagger -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate    -i https://api.cloudmersive.com/video/docs/v1/swagger -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate    -i https://api.cloudmersive.com/swagger/api/dataintegration -g java -c packageconfig.json                      -o . --skip-validate-spec 
& java -jar openapi-generator-cli-7.9.0.jar generate    -i https://api.cloudmersive.com/swagger/api/currency -g java -c packageconfig.json                      -o . --skip-validate-spec 

# Fix Android bug


#(Get-Content ./src/main/java/com/cloudmersive/client/invoker/ApiClient.java).replace('httpClient = new OkHttpClient();', "httpClient = new OkHttpClient();  httpClient.setProtocols(Arrays.asList(Protocol.HTTP_1_1));") | Set-Content ./src/main/java/com/cloudmersive/client/invoker/ApiClient.java

(Get-Content ./build.gradle).replace("classpath 'com.android.tools.build:gradle:1.5.+'", "classpath 'com.android.tools.build:gradle:1.5.+'`nclasspath `"org.codehaus.groovy:groovy-all:3.0.17`"  // Set Groovy version here") | Set-Content ./build.gradle
(Get-Content ./build.gradle).replace('src/main\java', "src/main/java") | Set-Content ./build.gradle
(Get-Content ./build.gradle).replace('JavaVersion.VERSION_1_8', "JavaVersion.VERSION_17") | Set-Content ./build.gradle

#if (Test-Path "C:\Program Files\Java\jdk-17") {
#    (Get-Content ./gradle.properties).replace('#target = android', "org.gradle.java.home=C:/Program Files/Java/jdk-17") | Set-Content ./gradle.properties
#} else {
#    Write-Host "Java JDK 17 folder not found. Skipping the update."
#}


#(Get-Content ./build.gradle).replace("apply plugin: 'maven-publish'", "apply plugin: 'maven-publish'`njava {        toolchain {            languageVersion = JavaLanguageVersion.of(17)        }    }") | Set-Content ./build.gradle
Add-Content -Path './build.gradle' -Value @'
tasks.withType(JavaCompile) {
    options.fork = true
    options.forkOptions.jvmArgs << '--add-opens' << 'jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED'
}
'@


#& pushd cloudmersive-java-api-client
& gradle clean
#& mvn install -U
& gradle build
#& popd