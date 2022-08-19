package com.listener.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {

    @KafkaListener(topics = "${spring.kafka.producer.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(String message) {

        // Messages
        System.out.println(message);

    }

}