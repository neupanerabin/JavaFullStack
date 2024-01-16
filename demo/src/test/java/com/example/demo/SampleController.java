package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/greeting")
    public String getGreeting(){
        return("Hello Greetings");

    }
}
