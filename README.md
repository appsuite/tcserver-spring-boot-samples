# spring-boot-starter-tcserver-example
Spring Boot starter package for tc Server Example

This project illustrates a very simple example of spring-boot-starter-tcserver usage. 

Currently spring-boot-starter-tcserver version 0.1.M5 only provides a drop in replacement for spring-boot-starter-tomcat. Additional functionality will be added in the next release.

Prerequisites
=============
To use this example you will need

* Access to Pivotal Commercial Maven Repository - https://repository.cloudfoundry.com/
* JRE/JDK 7 or newer
* Maven 3.2 or newer (Required by spring-boot-maven-plugin)

Building
========

You will need the following configured in your ~/.m2/settings.xml. Username and password should be the same as used on the Pivotal Commercial Mavren Repository

```xml
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
```


Usage
=====

```
mvn spring-boot:run
```

This will create a simple web app that shows the location of the jar which is used to load the Tomcat class. This will verify that the spring-boot-starter-tcserver is being used instead of the default spring-boot-starter-tomcat

You can use curl to verify

```
curl localhost:8080
```

Troubleshooting
===============

"Tomcat connector in failed state" - This generally means that there is a port conflict. By default this example tries to bind to port 8080. You may add -Dserver.port=8081 (replace 8081 with your desired port number) to the maven command line.

License
=======
This example is licensed under the Apache Software License 2.0
