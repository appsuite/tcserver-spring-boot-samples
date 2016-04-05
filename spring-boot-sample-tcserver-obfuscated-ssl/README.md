This example is only valid with unreleased tc Server 3.2.0 and spring-boot-starter-tcserver 3.2.0

# spring-boot-sample-tcserver-obfuscated-ssl
Example usage of spring-boot-starter-tcserver with obfuscated values in application.properties

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

Alternatively you may specify the port to bind to via the server.port property
```
mvn spring-boot:run -Dserver.port=8081
```

You can use curl to verify

```
curl -k https://localhost:8443
```

Or open https://localhost:8443 in your web browser.

You may receive a security warning because the example uses a self signed certificate.

Troubleshooting
===============

* "Tomcat connector in failed state" - This generally means that there is a port conflict. By default this example tries to bind to port 8080.

References
==========

* Spring Boot - http://projects.spring.io/spring-boot/  Docs: http://docs.spring.io/spring-boot/docs/1.2.2.RELEASE/reference/htmlsingle/
* tc Server -  http://tcserver.docs.pivotal.io/index.html

License
=======
This example is licensed under the Apache Software License 2.0
