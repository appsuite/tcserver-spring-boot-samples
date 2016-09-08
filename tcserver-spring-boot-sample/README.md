# tcserver-spring-boot-sample

This is a sample application using the tcserver-spring-boot.  This is based on  the Spring Boot Tomcat Sample application located at [https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-tomcat/src/main/java/sample/tomcat](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-tomcat/src/main/java/sample/tomcat). The pom.xml has been modified to use embedded tc Runtime via tc Server Spring Boot. 

Prerequisites
=============

To use this sample you should read the parent repository [README.md](../README) which contains information on configuring the needed repositories.

Usage
=====

This simple application may be ran via standard Spring Boot commands. 

```
mvn spring-boot:run
```

This application simply demonstrates using embedded tc Runtime with Spring Boot. 


Notable pom.xml changes
=====

```
...
                <dependency>
                        <groupId>io.pivotal.tcserver.boot</groupId>
                        <artifactId>tcserver-spring-boot-starter</artifactId>
                        <version>${tcserver-spring-boot.version}</version>
                </dependency>
        </dependencies>
        <repositories>
                <repository>
                        <id>tcserver-spring-boot-release</id>
                        <name>Pivotal tc Server Spring Boot Starter Release</name>
                        <url>http://commercial-repo.pivotal.io/data3/tcserver-release-repo/</url>
                </repository>
                <repository>
                        <id>tcserver-release-repo</id>
                        <name>Pivotal tc Server Release Repo (3.1.3+)</name>
                        <url>http://commercial-repo.pivotal.io/data3/tcserver-release-repo/tcserver</url>
                </repository>
        </repositories>

...
```

License
=======
The sample code in this repository is licensed under the Apache Software License 2.0
