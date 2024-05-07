package com.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQCounsumer {
    public static Logger LOGGER = LoggerFactory.getLogger(RabbitMQCounsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void counsume(String message){
        LOGGER.info(String.format("Received message -> %s",message));
    }
}
