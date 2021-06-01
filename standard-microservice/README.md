# Getting Started

## Dependencies

- jdk 21.1.0.r11-grl
- spring-boot-starter-webflux

## How-to Run

````
In the root folder (.../spring-native-lab/):
$ ./gradlew :standard-microservice:bootRun

OR

In this subproject folder (.../spring-native-lab/standard-microservice/):
$ cd standard-microservice
$ gradle bootRun 
````

### **After starting the app, you can hit the following api request:**
````
$ curl localhost:8080/getName --silent
Ragnar Lothbrok (Vikings)
````

## Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.0/gradle-plugin/reference/html/#build-image)

## Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

