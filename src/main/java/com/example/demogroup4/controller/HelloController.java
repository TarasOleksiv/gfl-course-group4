package com.example.demogroup4.controller;

import com.example.demogroup4.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "api/test")
public class HelloController {

    //http://localhost:8080/api/test/hello
    @GetMapping(value="/hello", produces = "Application/json")
    public User getUser() {
        return new User("John", LocalDateTime.now());
    }
}
