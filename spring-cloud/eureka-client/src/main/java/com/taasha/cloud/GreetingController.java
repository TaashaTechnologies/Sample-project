package com.taasha.cloud;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {
	@RequestMapping("/greeting")
	String greeting();

}
