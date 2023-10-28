package com.kafka.project.consumer.KafkaConsumerProject;

// import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaEventListener {
    @KafkaListener(topics = "reminder-topic", groupId = "consumer-pc")
    public void listener1 (Object message) {
        System.out.println("==================Message from listenr 1======================");
        System.out.println(message);
        System.out.println("==============================================================");
    }
     @KafkaListener(topics = "reminder-topic", groupId = "consumer-pc")
    public void listener2 (Object message) {
        System.out.println("==================Message from listenr 2======================");
        System.out.println(message);
        System.out.println("==============================================================");
    }
    @KafkaListener(topics = "reminder-topic", groupId = "consumer-pc")
    public void listener3 (Object message) {
        System.out.println("==================Message from listenr 3======================");
        System.out.println(message);
        System.out.println("==============================================================");
    }
    @KafkaListener(topics = "reminder-topic", groupId = "consumer-pc")
    public void listener4 (Object message) {
        System.out.println("==================Message from listenr 4======================");
        System.out.println(message);
        System.out.println("==============================================================");
    }
}
