# tcserver-spring-boot-samples

This repository contains example of how to use embedded tc Server with Spring Boot via tcserver-spring-boot. 

These samples assume you have some familiarity with Spring Boot and tc Server. More information about Spring Boot may be found at [http://projects.spring.io/spring-boot/]().

Prerequisites
=============
To use these samples you will need

* Register for free access to Pivotal Commercial Maven Repository - [http://commercial-repo.pivotal.io/](http://commercial-repo.pivotal.io/)
* JRE/JDK 8 or newer

Samples
=======

The following samples are available

* [tcserver-spring-boot-sample](tcserver-spring-boot-sample)

Pivotal Commercial Maven Setup
============

Pivotal provides a restricted repository with tc Server jars which are used by tc Server Spring Boot. You are required to register for access and to accept the Pivotal EULA in order to use tc Server Spring Boot.

Once you have obtained access and accepted the EULA you will need to configure your maven settings for authentication to this repository.

Example ~/.m2/settings.xml file

```
<settings>
	<servers>
		<server>
			<id>tcserver-release-repo</id>
			<username>YOUR_EMAIL_ADDRESS</username>
			<password>YOUR_PASSWORD</password>
		</server>
	</servers>
</settings>
```

In the above example you will need to replace YOUR\_EMAIL\_ADDRESS and YOUR\_PASSWORD with the email address and password used to register for the Pivotal Commercial Maven Repository.

**Important Security Note**: These samples use the HTTPS protocol to access the repository and transmit your username and password via HTTPS. If the repository URL in your pom.xml starts with http:// instead of https:// then the username and password provided in settings.xml will be transmitted in clear text.

Documentation References
==========

* Spring Boot - [http://docs.spring.io/spring-boot/docs/1.2.2.RELEASE/reference/htmlsingle/](http://docs.spring.io/spring-boot/docs/1.2.2.RELEASE/reference/htmlsingle/)
* tc Server -  [http://tcserver.docs.pivotal.io/index.html](http://tcserver.docs.pivotal.io/index.html)

License
=======
The sample code in this repository is licensed under the Apache Software License 2.0
