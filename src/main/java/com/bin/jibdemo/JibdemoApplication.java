package com.bin.jibdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JibdemoApplication {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "hello " + name;
	}
	public static void main(String[] args) {
		SpringApplication.run(JibdemoApplication.class, args);
	}

}
