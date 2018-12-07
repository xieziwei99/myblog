package ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings({ "unused", "resource" })
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }

}
