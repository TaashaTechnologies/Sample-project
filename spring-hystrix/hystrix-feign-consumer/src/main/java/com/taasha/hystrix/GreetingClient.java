package com.taasha.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

public interface GreetingClient extends GreetingController{
	
	@Component
	public static class GreetingClientFallback implements GreetingClient {
		@Override
		public String greeting(@PathVariable("username") String username) {
			return "Hello User!";
		}
	}
}