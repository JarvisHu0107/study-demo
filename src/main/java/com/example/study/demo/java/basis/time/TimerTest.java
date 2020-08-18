package com.example.study.demo.java.basis.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author huxin
 * @Description
 * @create 2020-08-13 2:32 下午
 */
public class TimerTest {

    public static void main(String[] args) {
        //ScheduledExecutorService
        Timer timer = new Timer();
        NewTimerTask timerTask = new NewTimerTask();
        //程序运行后立刻执行任务，每隔2s执行一次
        //共性：这一次执行4秒以后结束，发现当前时间 > nextExcuteTime 立即执行这次。
        //schedule
        //nextExcuteTime = 根据上一次执行时间 + 2s。
        timer.scheduleAtFixedRate(timerTask, 0, 2000);
        //scheduleAtFixedRate
        //nextExcuteTime = 根据第一次执行时间 + 2s*（n-1）

    }


    static class NewTimerTask extends TimerTask {
        private static final int[] arry = {1000,4000};

        @Override
        public void run() {
            //执行4秒的任务
            System.out.println(DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
            try {
                int i  = new java.util.Random().nextBoolean() ? 1 : 0;
                System.out.println("执行时间："+ arry[i]);
                Thread.sleep(arry[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
