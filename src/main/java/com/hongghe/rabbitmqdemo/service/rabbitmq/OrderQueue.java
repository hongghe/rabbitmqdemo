package com.hongghe.rabbitmqdemo.service.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class OrderQueue {

    @Bean
    public Queue helloQueue() {
        return new Queue("orderQueue");
    }
}
