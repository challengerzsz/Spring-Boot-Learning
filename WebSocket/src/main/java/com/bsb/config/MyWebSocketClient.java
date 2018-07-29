package com.bsb.config;

import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;

import java.net.URI;

/**
 * @Author: zeng
 * @Date: 2018/7/30 0:11
 */
@Component
public class MyWebSocketClient implements WebSocketClient {


    @Override
    public ListenableFuture<WebSocketSession> doHandshake(WebSocketHandler webSocketHandler, String uriTemplate, Object... uriVariables) {
        return null;
    }

    @Override
    public ListenableFuture<WebSocketSession> doHandshake(WebSocketHandler webSocketHandler, WebSocketHttpHeaders headers, URI uri) {
        return null;
    }
}
