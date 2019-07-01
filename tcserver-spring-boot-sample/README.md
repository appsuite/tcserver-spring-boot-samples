#Example of using tc Server with Spring Boot

This is a very basic example of how to add tc Server to a Spring Boot application. 

# Important Changes for Gradle

This sample defines the Pivotal Commercial Maven Repository as a repository in your build.gradle

```
    maven {
        credentials {
            username "$tcserverReleaseRepoUser"
            password "$tcserverReleaseRepoPassword"
        }   
        url "https://commercial-repo.pivotal.io/data3/tcserver-release-repo/tcserver"
    }   
```

This creates a dependency on two properties `tcserverReleaseRepoUser` and `tcserverReleaseRepoPassword` this should be added to the user's gradle.properties or specified on the gradle command line. These should not be stored in git or svn.


Next the Spring Boot tomcat dependency needs to be excluded and tcserver added

```
        compile('org.springframework.boot:spring-boot-starter-web') {
                exclude module: 'spring-boot-starter-tomcat'
        }   
        compile("io.pivotal.tcserver.boot:tcserver-spring-boot-starter:${tcserverSpringBootVersion}")

```


# Building with Gradle

This sample has no controller so it doesn't run stay running when executed with `gradle bootRun`. This is simply an example of gradle changes required.a

To build with gradle execute the following

```
./gradlew assemble
```


