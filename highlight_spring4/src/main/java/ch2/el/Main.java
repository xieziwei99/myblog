package ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourseService = context.getBean(ElConfig.class);
        resourseService.outputResourse();
        context.close();
    }

}
