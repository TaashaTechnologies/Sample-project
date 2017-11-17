package com.taasha.zuul;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/{name}")
	public String echoStudentName(@PathVariable(name = "name") String name) {
		return "Hello  " + name;
	}
}
