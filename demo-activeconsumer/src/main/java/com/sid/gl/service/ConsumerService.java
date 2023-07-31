package com.sid.gl.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @JmsListener(destination = "sendmq")
    public void listener(String message){
        System.out.println("the message is : "+message);
    }
}
