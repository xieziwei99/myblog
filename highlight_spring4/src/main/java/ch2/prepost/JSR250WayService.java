package ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    public JSR250WayService() {
        System.out.println("初始化构造函数-JSR250WayService");
    }
    
    // 在构造函数执行完后执行
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }
    
    // 在Bean销毁前执行
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }
}
