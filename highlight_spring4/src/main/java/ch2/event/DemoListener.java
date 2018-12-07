package ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("I (bean-DemoListener) have received msg from (bean-DemoPublisher) : " + msg);
    }       // 指定监听的事件类型, 处理事件 

}
