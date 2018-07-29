package com.bsb.websocket;

import com.bsb.config.MyWebSocketHandler;
import com.bsb.controller.WebSocketController;
import org.junit.Test;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.sockjs.client.RestTemplateXhrTransport;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.Transport;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zeng
 * @Date: 2018/7/30 0:36
 */

public class WebSocketTest {

    @Test
    public void testConnect() {
        List<Transport> transports = new ArrayList<>(2);
        transports.add(new WebSocketTransport(new StandardWebSocketClient()));
        transports.add(new RestTemplateXhrTransport());

        SockJsClient sockJsClient = new SockJsClient(transports);
        sockJsClient.doHandshake(new MyWebSocketHandler(), "ws://xiyou.edu.chinajoinin.com/api/main/loginData");
        sockJsClient.start();
    }
}
