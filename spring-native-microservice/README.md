# Getting Started

## Stack

- jdk 21.1.0.r11-grl
- spring-boot-starter-webflux
- spring-native

## Spring Native

This project has been configured to let you generate a lightweight container running a native executable. Docker should
be installed and configured on your machine prior to creating the image,
see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.9.2/reference/htmlsingle/#getting-started-buildpacks)
.

## How-to Run

### **1. To create the image, run the following goal:**
```
In the root folder (.../spring-native-lab/):
$ ./gradlew :spring-native-microservice:bootBuildImage

OR

In this subproject folder (.../spring-native-lab/spring-native-microservice/):
$ cd spring-native-microservice
$ gradle bootBuildImage 

```
Output from executing the Gradle command above shows the resulting Docker image which contains the GraalVM native image:
````Successfully built image 'docker.io/library/spring-native-microservice:1.0-SNAPSHOT'````

### **2. Then, you can run the app like any other container:**
```
$ docker-compose up

OR

$ docker run --rm spring-native-microservice:1.0-SNAPSHOT
```

### **3. After starting the container, the application is almost instantly available for testing:**
````
$ curl localhost:8080/getName --silent
Ragnar Lothbrok (Vikings)
````

## Warnings that I noticed during the spring-native-microservice build

1.
````
...
Task :spring-native-microservice:generateAot
Failed verification check: this type was requested to be added to configuration but is not resolvable: org.springframework.data.jpa.repository.support.EntityManagerBeanDefinitionRegistrarPostProcessor it will be skipped
Failed verification check: this type was requested to be added to configuration but is not resolvable: org.springframework.messaging.handler.annotation.MessageMapping it will be skipped
Failed verification check: this type was requested to be added to configuration but is not resolvable: org.springframework.transaction.annotation.Transactional it will be skipped
Failed verification check: this type was requested to be added to configuration but is not resolvable: javax.transaction.Transactional it will be skipped
Failed verification check: this type was requested to be added to configuration but is not resolvable: org.springframework.transaction.annotation.Propagation it will be skipped
...
````

2.
````
...
Task :spring-native-microservice:compileAotTestJava
warning: unknown enum constant When.MAYBE
  reason: class file for javax.annotation.meta.When not found
...
````

##  Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.0/gradle-plugin/reference/html/#build-image)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

## Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.10.0-SNAPSHOT/reference/htmlsingle/#spring-aot-gradle)