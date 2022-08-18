package com.jenkins.build;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {

	Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test Executed");
		assertEquals(true,true);
	}

}
