package com.kafka.project.consumer.KafkaConsumerProject;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaEventListener {
    @KafkaListener(topics = "reminder-topic", groupId = "consumer-pc")
    public void listener1 (String message) {
        System.out.println("==================Message from listenr 1======================");
        System.out.println(message);
        System.out.println("==============================================================");
    }
     @KafkaListener(topics = "reminder-topic", groupId = "consumer-pc")
    public void listener2 (String message) {
        System.out.println("==================Message from listenr 2======================");
        System.out.println(message);
        System.out.println("==============================================================");
    }
    @KafkaListener(topics = "reminder-topic", groupId = "consumer-pc")
    public void listener3 (String message) {
        System.out.println("==================Message from listenr 3======================");
        System.out.println(message);
        System.out.println("==============================================================");
    }
     @KafkaListener(topics = "reminder-topic", groupId = "consumer-pc")
    public void listener4 (String message) {
        System.out.println("==================Message from listenr 4======================");
        System.out.println(message);
        System.out.println("==============================================================");
    }
}
