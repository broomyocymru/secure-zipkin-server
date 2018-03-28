# secure-zipkin-server


# Creating a https cert

## Generate a self signed cert
keytool -genkeypair -alias tomcat -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650

## Check contents of key store 
keytool -list -v -storetype pkcs12 -keystore keystore.p12

