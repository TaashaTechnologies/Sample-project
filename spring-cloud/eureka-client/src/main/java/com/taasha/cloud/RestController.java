package com.taasha.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import com.netflix.discovery.EurekaClient;

@org.springframework.web.bind.annotation.RestController
public class RestController implements GreetingController{

	@Autowired
    @Lazy
    private EurekaClient eurekaClient;

	@Override
	public String greeting() {
		return "Welcome to taasha.tech";
	}
	
}
  