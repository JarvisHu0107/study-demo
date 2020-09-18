package com.example.study.demo;

import com.example.study.demo.java.basis.springstudy.conditionalon.ConditionProduct;
import org.redisson.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

@SpringBootApplication
public class StudyDemoApplication implements CommandLineRunner {

    private final static int UNIT = 1000 * 1000 * 1000;
    @Value("${huxin.name}")
    private String name;

    @Value("${huxin.telNo}")
    private String telNo;

    public static void main(String[] args) {
        SpringApplication.run(StudyDemoApplication.class, args);
        System.out.println();
    }

//    @Autowired
//    private ConditionProduct conditionProduct;

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(name);
//        System.out.println(telNo);
//       // conditionProduct.test();
        //阻塞3s
        LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(3));

    }

}
