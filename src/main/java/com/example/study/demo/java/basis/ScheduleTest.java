package com.example.study.demo.java.basis;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author huxin
 * @Description
 * @create 2020-10-27 2:57 下午
 */
public class ScheduleTest {


    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        //scheduledExecutorService.scheduleAtFixedRate
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
            System.out.println("xxx,正在执行当前时间" + new Date());
            try {
                Thread.sleep(30000);//休眠30s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 1, 5, TimeUnit.SECONDS);

    }
}
