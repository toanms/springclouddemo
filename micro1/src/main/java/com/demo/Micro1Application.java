package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Micro1Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro1Application.class, args);
	}

}
@RestController 

class Micro1Controller { 

  

    @Value("${application.message:You made a request to Micro1}") 

    private String message; 

     

    @GetMapping("/micro1") 

    public String micro1() { 

        return message; 

    } 

} 