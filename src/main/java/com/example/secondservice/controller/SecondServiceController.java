package com.example.secondservice.controller;

import com.example.secondservice.feign.FirstServiceClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : 최종철
 */
//second-service SecondServiceController
@RestController
@RequestMapping("/second-service")
@Slf4j
@RequiredArgsConstructor
public class SecondServiceController {

	private final FirstServiceClient firstServiceClient;

	@Value("${server.port}")
	private String port;

	@GetMapping("/check")
	public String check() {
//		log.info("[MEMBER] ASSU name/{nick} logging...nick is {}.");
//		firstServiceClient.check();
		return String.format("Second Service on PORT %s", port);
	}
}
