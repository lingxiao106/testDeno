package com.test.demo.tool.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Configuration
@Component
@EnableScheduling
public class scheduling {

//    @Scheduled(cron = "1/1 1/1 17 * * ?")
    public void scheduleTest(){
        System.err.println("scheduleTest开始定时执行" + new Date()) ;
    }

//    @Scheduled(fixedRate = 1)
//    public void scheduleTest2(){
//        System.err.println("scheduleTest开始定时执行222");
//    }
//
//    @Scheduled(fixedRate = 1)
//    public void scheduleTest3(){
//        System.err.println("scheduleTest开始定时执行");
//    }
//
//    @Scheduled(fixedRate = 1)
//    public void scheduleTest4(){
//        System.err.println("scheduleTest开始定时执行222");
//    }
}
