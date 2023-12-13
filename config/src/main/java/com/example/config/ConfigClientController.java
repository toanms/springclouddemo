package com.example.config;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ConfigClientController {
    
    @Value("${limit.min}")
    private String min;
    
    @Value("${limit.max}")
    private String max;

    @GetMapping("/limit")
    public String limitServiceInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("The limits are " + min + " and " + max);
        return sb.toString();
    }
    
}
