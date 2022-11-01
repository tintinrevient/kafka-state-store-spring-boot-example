package com.example.consumer;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;
import org.apache.kafka.clients.consumer.ConsumerRecord;

@Component
class Consumer {

    @KafkaListener(topics = {"streams-wordcount-output"}, groupId = "spring-boot-kafka", containerFactory = "")
    public void consume(ConsumerRecord<String, Long> record) {
        System.out.println("received = " + record.value() + " with key " + record.key());
    }

}
