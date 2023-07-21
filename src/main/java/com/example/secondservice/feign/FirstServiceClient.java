package com.example.secondservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "http://localhost:8081/first-service", name = "first-service")
public interface FirstServiceClient {
	@GetMapping(value = "/check")
	public void check();
}
