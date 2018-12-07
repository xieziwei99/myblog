package ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		DemoMethedService demoMethedService = context.getBean(DemoMethedService.class);
		demoAnnotationService.add();
		demoMethedService.add();
		context.close();
	}

}
