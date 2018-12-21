// 启动引导类，兼配置类
package com.manning.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 开启组件扫描和自动配置
@SpringBootApplication
public class ReadinglistApplication {

	public static void main(String[] args) {
		// 负责启动引导应用程序
		SpringApplication.run(ReadinglistApplication.class, args);
	}

}

