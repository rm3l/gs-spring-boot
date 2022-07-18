package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
        //My comment
        System.out.println(String.format("[stdout 12] %s", new java.util.Date()));
        System.err.println(String.format("[stderr 12] %s", new java.util.Date()));
		return "12- Greetings from Spring Boot!!!";
	}

}
