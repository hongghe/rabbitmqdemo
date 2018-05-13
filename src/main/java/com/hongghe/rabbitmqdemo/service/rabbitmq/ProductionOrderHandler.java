package com.hongghe.rabbitmqdemo.service.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author hongghe
 */
@Component
@RabbitListener(queues = "orderQueue")
public class ProductionOrderHandler {

    @RabbitHandler
    public void order(String order) {
        System.out.println("The order is " + order);
    }
}
