package com.taasha.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient extends GreetingController {

}
