package com.example.suscriptor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Listener {
    public static final String DIRECT_QUEUE = "direct.queue";
    public static final String TOPIC_QUEUE_1 = "topic.queue1";
    public static final String TOPIC_QUEUE_2 = "topic.queue2";
    public static final String FANOUT_QUEUE_1 = "fanout.queue1";
    public static final String FANOUT_QUEUE_2 = "fanout.queue2";
    public static final String FANOUT_QUEUE_3 = "fanout.queue3";
    private final Logger logger = Logger.getLogger("RabbitMqEventHandler");
    @RabbitListener(queues = DIRECT_QUEUE)
    public void listener(String message){
        logger.info(message.toString());

    }
    @RabbitListener(queues = TOPIC_QUEUE_1)
    public void listenerTopic1(String message){
        logger.info(message.toString());

    }
    @RabbitListener(queues = TOPIC_QUEUE_2)
    public void listenerTopic2(String message){
        logger.info(message.toString());

    }

    @RabbitListener(queues = FANOUT_QUEUE_1)
    public void listenerFanout1(String message){
        logger.info(message.toString());

    }
    @RabbitListener(queues = FANOUT_QUEUE_2)
    public void listenerFanout2(String message){
        logger.info(message.toString());

    }
    @RabbitListener(queues = FANOUT_QUEUE_3)
    public void listenerFanout3(String message){
        logger.info(message.toString());

    }
}
