package com.kubernetes.example.springbootk8sdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootK8sDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringbootK8sDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Case Executing...");
		assertEquals(true, true);
	}

}
