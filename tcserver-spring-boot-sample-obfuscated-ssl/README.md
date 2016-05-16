This example is only valid with tcserver-spring-boot-starter-tcserver 3.1.4.SR1 or newer

# tcserver-spring-boot-samples-obfuscated-ssl
Example usage of tcserver-spring-boot-starter with obfuscated values in application.properties

Prerequisites
=============
To use this example you will need

* Register for free access to Pivotal Commercial Maven Repository - http://commercial-repo.pivotal.io/
* JRE/JDK 7 or newer
* Maven 3.2 or newer (Required by spring-boot-maven-plugin)

Maven Usage
==================

You will need the following configured in your ~/.m2/settings.xml. Username and password should be the same as used on the Pivotal Commercial Maven Repository

```xml
<settings>
	<servers>
		<server>
			<id>tcruntime-release-repo</id>
			<username>*your email*</username>
			<password>*your password*</password>
		</server>
		<server>
			<id>spring-boot-starter-tcserver-release</id>
			<username>*your email*</username>
			<password>*your password*</password>
		</server>
	</servers>
</settings>
```

Once configured you can run the example via maven.

```
mvn spring-boot:run
```

You can use curl to verify

```
curl -k https://localhost:8443
```

Or open https://localhost:8443 in your web browser.

You may receive a security warning because the example uses a self signed certificate.

This sample demonstrates how to use encoded values in src/main/resources/application.properties. The file following properties need to be set in order to use the tc Server PropertyDecoder in a spring boot application

```
org.apache.tomcat.util.digester.PROPERTY_SOURCE=com.springsource.tcserver.security.PropertyDecoder
com.springsource.tcserver.security.PropertyDecoder.passphrase=<passphrase>
``` 
Replace \<passphrase\> with your passphrase

You may then use any encoded value as a property. The sample shows the server.ssl.key-store-password value being encoded


Troubleshooting
===============

* "Tomcat connector in failed state" - This generally means that there is a port conflict. By default this example tries to bind to port 8443.

References
==========

* Spring Boot - http://projects.spring.io/spring-boot/  Docs: http://docs.spring.io/spring-boot/docs/1.2.2.RELEASE/reference/htmlsingle/
* tc Server -  http://tcserver.docs.pivotal.io/index.html

License
=======
This example is licensed under the Apache Software License 2.0
