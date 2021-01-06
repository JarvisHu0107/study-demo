package com.example.study.demo.rocketmq;


import com.example.study.demo.rocketmq.dto.SmsResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MsgProducerController {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RedissonClient redissonClient;

    @Value("${huxin.name}")
    private String name;

    private static final String PRODUCER_TOPIC = "submit-response";

    @GetMapping("/rocketmq/produceMsg")
    public void produceMsg() throws Exception {
        SmsResponseDto msg = new SmsResponseDto();
        msg.setMsgId(1);
        msg.setPkNumber(1);
        msg.setPkTotal(1);
        msg.setSequence("123");
        msg.setSp("1");
        msg.setSpStatus("o");
        msg.setSmsStatus("k");
        msg.setReceiveTime(new Date());
        System.out.println(objectMapper.writeValueAsString(msg));
        RLock lock = redissonClient.getLock("123");
        System.out.println(name);
        System.out.println(lock.tryLock());
        lock.unlock();

//        //同步发送（阻塞） 发送失败会抛出异常
//        rocketMQTemplate.convertAndSend(PRODUCER_TOPIC, msg);
    }

}
