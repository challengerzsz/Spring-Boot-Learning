package com.bsb.kafka.main;

import com.bsb.kafka.model.Message;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @author zengshuaizhi@baidu.com
 */
@Component
@Slf4j
public class Consumer {

    @Autowired
    private Gson gson;


    @KafkaListener(topics = {"baidu-kafka-test"})
    public void handler(ConsumerRecord<?,?> record) {

        Optional<?> kafkaMassage = Optional.ofNullable(record.value());
        if (kafkaMassage.isPresent()) {
            Object message = kafkaMassage.get();
            Message realMessage = gson.fromJson(message.toString(), Message.class);
            log.info("收到消息message={}",realMessage);
        }
    }
}
