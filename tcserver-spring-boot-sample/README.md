# Example of using tc Server with Spring Boot wtih Gradle

This example code is intended to provide an example of gradle changes required for using embedded tc Server's tc Runtime with Spring Boot. 


# Important Changes for Gradle


`build.gradle`
```
    maven {
        credentials {
            username "$tcserverReleaseRepoUser"
            password "$tcserverReleaseRepoPassword"
        }   
        url "https://commercial-repo.pivotal.io/data3/tcserver-release-repo/tcserver"
    }   
```

The above changes require two gradle properties to be defined. These should be added to the user's `gradle.properties` or may be added to the command line, however, that is not recommended for security reasons. 

`$HOME/.gradle/gradle.properties`
```
tcserverReleaseRepoUser=your@email.address
tcserverReleaseRepoPassword=your.commercial.repo.password
```

In addition to the previous change to `build.gradle` the Spring Boot tomcat dependency needs to be excluded and tc Server added


`build.gradle`
```
        compile('org.springframework.boot:spring-boot-starter-web') {
                exclude module: 'spring-boot-starter-tomcat'
        }   
        compile("io.pivotal.tcserver.boot:tcserver-spring-boot-starter:${tcserverSpringBootVersion}")

```

The `gradle.properties` for the project should contain a property defining the tc Server version.


`gradle.properties`
```
tcserverSpringBootVersion=4.0.7.RELEASE
```

# Building with Gradle

This sample has no controller therefore it does not run stay running when executed with `gradle bootRun`. 

To build with gradle execute the following:

```
./gradlew assemble
```

If $HOME/.gradle/gradle.properties doesn't contain the needed properties they can be specified on the command line such as the following:

```
./gradlew assemble -P tcserverReleaseRepoUser=your@email.address -P tcserverReleaseRepoPassword=your.commercial.repo.password
```

It is not recommended to specify passwords on the command line. 





