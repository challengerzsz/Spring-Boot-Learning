package com.bsb.kafka.main;

import com.bsb.kafka.model.Message;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * @author zengshuaizhi@baidu.com
 */
@Component
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private Gson gson;

    /**
     * 发送测试消息
     */
    public void sendMessage(){
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMsg(UUID.randomUUID().toString());
        m.setSendTime(new Date());
        kafkaTemplate.send("baidu-kafka-test", gson.toJson(m));
    }
}
