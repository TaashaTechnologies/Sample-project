package com.taasha.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.taasha.zuul.filters.ErrorFilter;
import com.taasha.zuul.filters.PostFilter;
import com.taasha.zuul.filters.PreFilter;
import com.taasha.zuul.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulProxyApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
