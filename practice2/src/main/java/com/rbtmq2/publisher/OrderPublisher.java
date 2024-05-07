package com.rbtmq2.publisher;

import com.rbtmq2.config.MessageingConfig;
import com.rbtmq2.dto.Order;
import com.rbtmq2.dto.OrderStatus;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderPublisher {

    private final RabbitTemplate template;

    @PostMapping("/{resturantName}")
    public String bookOrder (@RequestBody Order order,@PathVariable String resturantName){
        order.setOrderId(UUID.randomUUID().toString());
        //resturantService
        //paymentService
        OrderStatus orderStatus = new OrderStatus(order,"PROCESS","order placed successfully in"+ resturantName);
        template.convertAndSend(MessageingConfig.EXCHANGE,MessageingConfig.ROUTING_KEY,orderStatus);
        return "success !!";
    }
}
