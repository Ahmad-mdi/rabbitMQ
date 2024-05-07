package com.rbtmq2.consumer;

import com.rbtmq2.config.MessageingConfig;
import com.rbtmq2.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {
    @RabbitListener(queues = MessageingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus){
        System.out.println("message recived from queue: "+orderStatus);
    }
}
