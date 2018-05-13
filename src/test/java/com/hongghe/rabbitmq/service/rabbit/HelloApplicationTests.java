package com.hongghe.rabbitmq.service.rabbit;

import com.hongghe.rabbitmqdemo.RabbitmqApplication;
import com.hongghe.rabbitmqdemo.service.rabbitmq.CustomerOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitmqApplication.class)
public class HelloApplicationTests {


    @Autowired
    private CustomerOrder customerOrderService;


    @Test
    public void sendTest() throws Exception {
        customerOrderService.homepageWelcome("welcome order");
    }
}