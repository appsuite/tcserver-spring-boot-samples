# spring-boot-starter-tcserver-example
Spring Boot starter package for tc Server Example

This project is a simple example of how to use spring-boot-starter-tcserver as a drop in replacement for spring-boot-starter-tomcat.  

Currently spring-boot-starter-tcserver version 0.1.M6 only provides a drop in replacement for spring-boot-starter-tomcat. Additional functionality will be added in the next release.

Spring Boot 

Prerequisites
=============
To use this example you will need

* Register for free access to Pivotal Commercial Maven Repository - https://repository.cloudfoundry.com/
* JRE/JDK 7 or newer
* Maven 3.2 or newer (Required by spring-boot-maven-plugin)

Usage
==================

You will need the following configured in your ~/.m2/settings.xml. Username and password should be the same as used on the Pivotal Commercial Maven Repository

```xml
<settings>
	<servers>
		<server>
			<id>tcruntime-release</id>
			<username>*your email*</username>
			<password>*your password*</password>
		</server>
		<server>
			<id>spring-boot-starter-tcserver-milestone</id>
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

This example runs a simple web app with the Embedded tc Runtime version as the content.

You can use curl to verify

```
curl localhost:8080
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
