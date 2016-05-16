# tcserver-spring-boot-example

This repository contains examples of how to use embedded tc Server with spring-boot via tcserver-spring-boot.  Most of the examples are copies of existing spring-boot-samples-tomcat that have been modified to use embedded tc Server instead of tomcat.

The tcserver-spring-boot-sample-obfuscated-ssl shows how to use tc Server obfuscation in application.properties.

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
			<id>tcserver-spring-boot-release</id>
			<username>*your email*</username>
			<password>*your password*</password>
		</server>
	</servers>
</settings>
```

Once configured you can run each example via maven.

```
cd tcserver-spring-boot-sample
mvn spring-boot:run
```

Alternatively you may specify the port to bind to via the server.port property
```
mvn spring-boot:run -Dserver.port=8081
```

This example runs a simple web app with the Embedded tc Runtime version as the content.

You can use curl to verify

```
curl localhost:8080
```

There are other samples available in each folder in this repo

Changing tc Server version
==========================
As with spring-boot-starter-tomcat you may configure which version of tc Server is used with this starter. In your pom you simply need to to specify the properties for tcserver.version and the tcserver.runtime.version. By default this starter uses tc Runtime 8.0.33.A.RELEASE. The following snipet shows how to use an older release.

```
	<properties>
		<tcserver.version>3.1.3.SR1</tcserver.version>
		<tcserver.runtime.version>7.0.67.B.RELEASE</tcserver.runtime.version>
	</properties>
```


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
