# tcserver-spring-boot-samples-obfuscated-ssl-classpath
Example usage of tcserver-spring-boot-starter with obfuscated values in application.properties


Prerequisites
=============

To use this sample you should read the parent repository [README.md](../README) which contains information on configuring the needed repositories.

Usage
=====

As with all the samples this sample may be invoked with the following

```
mvn spring-boot:run
```

This example uses a file located on the classpath to store the file which contains the passphrase to decode the obfuscated values.  

application.properties
```
com.springsource.tcserver.security.PropertyDecoder.passphrase=classpath:/passphrase.txt
```

This points to /passphrase.txt which is located at src/main/resources/passphrase.txt in the repository. This file contains just the passphrase (newline optional). 


License
=======
This example is licensed under the Apache Software License 2.0
