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

This creates a dependency on two properties `tcserverReleaseRepoUser` and `tcserverReleaseRepoPassword` this should be added to the user's gradle.properties or specified on the gradle command line. These should not be stored in git or svn.


Next the Spring Boot tomcat dependency needs to be excluded and tcserver added


`build.gradle`
```
        compile('org.springframework.boot:spring-boot-starter-web') {
                exclude module: 'spring-boot-starter-tomcat'
        }   
        compile("io.pivotal.tcserver.boot:tcserver-spring-boot-starter:${tcserverSpringBootVersion}")

```

The gradle.properties for the project should contain a property defining the tc Server version.


`gradle.properties`
```
tcserverSpringBootVersion=4.0.7.RELEASE
```

`$HOME/.gradle/gradle.properties`
```
tcserverReleaseRepoUser=your@email.address
tcserverReleaseRepoPassword=your.commercial.repo.password
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





