package com.example.study.demo.rocketmq.dto;

import lombok.Data;

import java.util.Date;

/**
 * 通道响应
 */
@Data
public class SmsResponseDto {
    /**
     * 消息id
     */
    private Integer msgId;
    /**
     * 序列号
     */
    private String sequence;
    /**
     * 通道的消息id，sgip无
     */
    private String spMsgId;
    /**
     * 运营商
     */
    private String sp;
    /**
     * 运营商返回状态
     */
    private String spStatus;
    /**
     * 短信平台的结果
     */
    private String smsStatus;
    /**
     * 接收时间
     */
    private Date receiveTime;
    /**
     * 第几条
     */
    private Integer pkNumber;
    /**
     * 共几条
     */
    private Integer pkTotal;
}
