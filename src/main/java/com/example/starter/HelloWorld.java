package com.example.starter;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
}
