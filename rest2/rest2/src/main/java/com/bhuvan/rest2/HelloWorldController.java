package com.bhuvan.rest2;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello-World-Bean");
	}
	
	@GetMapping("/hello-world/{name}")
	public HelloWorldBean helloPathVariable(@PathVariable String name) {
	return new HelloWorldBean(String.format("Hello World, %s "));
}
	
	@GetMapping("/hello-world/{id}")
	public HelloWorldBean helloPathVariableid(@PathVariable int id) {
	return new HelloWorldBean(String.format("Hello World, ID =  ", id));
}
	
}
