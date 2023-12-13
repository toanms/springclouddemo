package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micro2Controller {

    @Value("${application.message:You made a request to Micro2}")
    private String message;
    
    @GetMapping("/micro2")
    public String micro1() {
        return message;
    }
}
