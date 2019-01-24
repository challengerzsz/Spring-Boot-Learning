package com.bsb.kafka.model;

import lombok.Data;

import java.util.Date;

/**
 * @author zengshuaizhi@baidu.com
 */
@Data
public class Message {

    private Long id;

    private String msg;

    private Date sendTime;
}
