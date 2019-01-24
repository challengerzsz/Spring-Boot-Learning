package com.bsb.kafka.controller;

import com.bsb.kafka.main.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengshuaizhi@baidu.com
 */
@RestController
public class MainController {

    @Autowired
    private Producer producer;

    @RequestMapping
    public String test() {
        for (int i = 0; i < 10; i++) {
            producer.sendMessage();
        }

        return "ok";
    }
}
