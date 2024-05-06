package com.rabbitmq.consumer;

import com.rabbitmq.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonCounsumer {
    public static Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonCounsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMessage(User user){
        LOGGER.info(String.format("Received message -> %s",user.toString()));
    }
}
