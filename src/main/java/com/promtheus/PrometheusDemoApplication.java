package com.promtheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class PrometheusDemoApplication {

	@GetMapping("hello")
	public String helloEndPoint(){
		return "hello this is first api,  prometheus example ";
	}
	public static void main(String[] args) {
		SpringApplication.run(PrometheusDemoApplication.class, args);
	}

}
