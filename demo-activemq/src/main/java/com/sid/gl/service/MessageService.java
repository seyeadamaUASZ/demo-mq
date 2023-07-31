package com.sid.gl.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private final JmsTemplate jmsTemplate;

    public MessageService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String message){
      jmsTemplate.convertAndSend("sendmq",message);
    }
}
