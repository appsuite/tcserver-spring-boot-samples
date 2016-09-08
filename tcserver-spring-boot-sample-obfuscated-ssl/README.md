# tcserver-spring-boot-samples-obfuscated-ssl
Example usage of tcserver-spring-boot-starter with obfuscated values in application.properties

Prerequisites
=============

To use this sample you should read the parent repository [README.md](../README.md) which contains information on configuring the needed repositories.

Usage
=====

As with all the samples this sample may be invoked with the following

```
mvn spring-boot:run
```

This example uses tc Server Property Obfuscation to obfuscate the value of the keystore password. 

application.properties
```
org.apache.tomcat.util.digester.PROPERTY_SOURCE=com.springsource.tcserver.security.PropertyDecoder
com.springsource.tcserver.security.PropertyDecoder.passphrase=foobar
server.port = 8443
server.ssl.key-store = classpath:sample.jks
server.ssl.key-store-password = tcEnc://D6wgVPto1NOgFGraNltn8Ltfj1KWWe09SZiHbfyKGb8=
server.ssl.key-password = password
```

Note that server.ssl.key-store-password has been encoded using tc Server's property obfuscation feature.

More information about this feature may be found at [http://docs-tcserver-staging.cfapps.io/docs-tcserver/topics/manual.html#obfusc](http://docs-tcserver-staging.cfapps.io/docs-tcserver/topics/manual.html#obfusc)


License
=======
This example is licensed under the Apache Software License 2.0
