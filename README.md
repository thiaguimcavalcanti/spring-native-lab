# Getting Started

## Motivation

- This repository was created to perform a test comparing the startup time between a standard spring boot microservice project, and a microservice project using Spring Native ([https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/][Spring Native]).

## Stack

- Gradle 7.0.2
- jdk 21.1.0.r11-grl (OpenJDK Runtime Environment GraalVM CE 21.1.0 (build 11.0.11+8-jvmci-21.1-b05))
- spring-boot-starter-webflux
- spring-native

## Project organization

Two sub-projects were created to separate the logic:
1. **_spring-native-microservice_** sub-project:   
   Microservice project contains the Spring-Native setup to run this application on a GraalVM Native Image through Docker container
2. **_standard-microservice_** sub-project:   
   Simple microservice project using spring-boot-starter-webflux

Both projects contain only one controller class with the same content just to test purpose:

````
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getName")
    public Mono<String> getName() {
        return Mono.just("Ragnar Lothbrok (Vikings)");
    }
}
````

## How-to Run

There is a README.md file inside each sub-projects describing how to run them.

[Spring Native]: https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/

## Test

It was pretty straightforward. To perform the startup time test, I ran both subprojects as described in the README.md file, and the results were amazing. Take a look below :)

## Results

### standard-microservice

- Build time: ~7 seconds
- Start time: **~3 seconds** (too much time)    
  <img width="800" src="https://github.com/thiaguimcavalcanti/spring-native-lab/blob/main/screenshots/standard-microservice - startup time.gif"/>

### spring-native-microservice

- The ````$ gradle bootBuildImage```` command takes **~10 minutes** to build a new Docker image   
  <img width="800" src="https://github.com/thiaguimcavalcanti/spring-native-lab/blob/main/screenshots/spring-native-microservice - buildDockerImage time.png"/>
  

- And the startup time is unbelievable **0.171 seconds** \o/   
  <img width="800" src="https://github.com/thiaguimcavalcanti/spring-native-lab/blob/main/screenshots/spring-native-microservice - startup time.gif"/>
  
### Final comment
- The startup time of the microservice project using Spring Native running on Native Image was **~17x faster** than a standard microservice project running on HotSpot JVM.