# Getting Started



## Spring Native

This project has been configured to let you generate a lightweight container running a native executable. Docker should
be installed and configured on your machine prior to creating the image,
see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.9.2/reference/htmlsingle/#getting-started-buildpacks)
.

To create the image, run the following goal:

```
In the root folder (.../spring-native-lab/):
$ ./gradlew :spring-native-microservice:bootBuildImage

OR

In this subproject folder (.../spring-native-lab/spring-native-microservice/):
$ cd spring-native-microservice
$ gradle bootBuildImage 

```

Then, you can run the app like any other container:
```
$ cd spring-native-microservice
```
```
$ docker-compose up

OR

$ docker run --rm spring-native-microservice:1.0-SNAPSHOT
```

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.0/gradle-plugin/reference/html/#build-image)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.10.0-SNAPSHOT/reference/htmlsingle/#spring-aot-gradle)