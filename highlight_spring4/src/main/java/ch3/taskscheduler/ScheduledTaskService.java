package ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Scheduled(fixedRate = 5000)        // 每隔固定时间执行
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次： " + dateFormat.format(new Date()));
    }
    
    @Scheduled(cron = "0 00 20 ? * *")      // 指定时间执行 每天20:00:00
    public void fixedTimeExecution() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + " 执行");
    }
}
