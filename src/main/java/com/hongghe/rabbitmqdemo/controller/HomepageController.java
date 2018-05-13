package com.hongghe.rabbitmqdemo.controller;

import com.hongghe.rabbitmqdemo.service.rabbitmq.CustomerOrder;
import com.hongghe.rabbitmqdemo.service.rabbitmq.ProductionOrderHandler;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The homepage of the project
 *
 * @author hongghe
 */
@RestController
@RequestMapping(value = "/")
public class HomepageController {

    @Autowired
    private CustomerOrder customerOrderService;

    @Autowired
    private ProductionOrderHandler productionOrderHandler;

    @RequestMapping(value = "home")
    public void homePage(@NotNull @RequestParam String welcome) {
        customerOrderService.homepageWelcome(welcome);
        productionOrderHandler.order("order");
    }
}
