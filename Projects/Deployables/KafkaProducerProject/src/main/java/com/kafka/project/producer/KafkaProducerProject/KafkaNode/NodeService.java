package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.kafka.project.producer.KafkaProducerProject.Response;


@Service
public class NodeService {

    @Autowired
    KafkaTemplate kafkaTemplate;

    public ResponseEntity <Response> addReminderToKafkaProcessor (NodeRequest request) {
       return null;
    }

}