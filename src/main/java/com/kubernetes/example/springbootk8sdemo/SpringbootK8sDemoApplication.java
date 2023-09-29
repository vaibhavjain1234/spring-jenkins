package com.kubernetes.example.springbootk8sdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootK8sDemoApplication.class);

	public void init() {
		logger.info("Application Started...");
	}

	@GetMapping("/message")
	public String displayMsg() {
		return "Congratulation you have successfully deployed your application to k8s";
	}

	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
