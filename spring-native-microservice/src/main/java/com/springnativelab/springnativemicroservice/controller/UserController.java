package com.springnativelab.springnativemicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getName")
    public Mono<String> getName() {
        return Mono.just("Ragnar Lothbrok (Vikings)");
    }
}
