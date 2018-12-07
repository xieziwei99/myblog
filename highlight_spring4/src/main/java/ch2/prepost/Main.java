package ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(PrepostConfig.class);
        
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        
        context.close();
    }

}
