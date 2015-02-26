# spring-boot-starter-tcserver-example
Spring Boot starter package for tc Server Example

This project illustrates a very simple example of spring-boot-starter-tcserver usage. 

Building
========
To build you will require access to the Pivotal Commercial Maven Repository - https://repository.cloudfoundry.com/ - to build. You will need to configure your $HOME/.m2/settings.xml as explained on that site.

You will need the following configured in your ~/.m2/settings.xml

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

License
=======
This example is licensed under the Apache Software License 2.0
