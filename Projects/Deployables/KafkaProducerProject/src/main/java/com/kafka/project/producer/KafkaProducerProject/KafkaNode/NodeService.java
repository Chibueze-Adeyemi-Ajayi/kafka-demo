package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class NodeService {

    @Autowired
    KafkaTemplate <String, Object> kafkaTemplate;

    public Object addReminderToKafkaProcessor (NodeRequest request) throws NodeException {
        try {

            CompletableFuture <SendResult<String, Object>> future = this.kafkaTemplate.send("reminder-topic", request);
            future.whenComplete((result, ex)->{
                if (ex != null) throw new NodeException("Error sending request to kafka", null);
                System.out.println(result.getRecordMetadata().toString());
            });
            return ResponseEntity.ok().build();
            
        } catch (Exception e) {
            throw new NodeException(e.getMessage(), e.getCause(), null);
        }
    }

}