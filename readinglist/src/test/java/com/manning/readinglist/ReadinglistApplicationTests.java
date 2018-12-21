package com.manning.readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
// 通过 Spring Boot 加载上下文
@SpringBootTest(classes = ReadinglistApplication.class)
@WebAppConfiguration
public class ReadinglistApplicationTests {

	// 测试加载的上下文
	@Test
	public void contextLoads() {
	}

}

