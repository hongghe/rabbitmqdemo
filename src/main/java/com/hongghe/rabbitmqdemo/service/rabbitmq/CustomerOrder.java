package com.hongghe.rabbitmqdemo.service.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerOrder {

    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void homepageWelcome(String welcome) {
        this.rabbitTemplate.convertAndSend("orderQueue", welcome);
    }
}
