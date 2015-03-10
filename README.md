# spring-boot-starter-tcserver-example
Example usage of spring-boot-starter-tcserver

This project is a simple example of how to use spring-boot-starter-tcserver as a drop in replacement for spring-boot-starter-tomcat.  

Currently spring-boot-starter-tcserver version 0.1.RELEASE only provides a drop in replacement for spring-boot-starter-tomcat. Additional functionality will be added in the next release.

Prerequisites
=============
To use this example you will need

* Register for free access to Pivotal Commercial Maven Repository - https://repository.cloudfoundry.com/
* JRE/JDK 7 or newer
* Maven 3.2 or newer (Required by spring-boot-maven-plugin)

Maven Usage
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

This example runs a simple web app with the Embedded tc Runtime version as the content.

You can use curl to verify

```
curl localhost:8080
```

Gradle usage
============

Please see gradle.build for an example of usage for the Pivotal Commercial Maven Repository. You must also create a gradle.properties file which defines pivotal_maven_repo_username and pivotal_maven_repo_password. These should be set based on your Pivotal Commercial Maven Repository username and password.

Example gradle.properties
```
pivotal_maven_repo_username=your_username
pivotal_maven_repo_password=your_password
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
