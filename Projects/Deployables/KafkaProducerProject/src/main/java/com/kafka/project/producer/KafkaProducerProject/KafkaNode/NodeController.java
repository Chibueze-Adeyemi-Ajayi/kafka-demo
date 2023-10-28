package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.project.producer.KafkaProducerProject.Response;

@RestController
@RequestMapping("/kafka/node")
public class NodeController {
    @PostMapping("")
    public ResponseEntity <Response> addReminderToKafkaProcessor (@RequestBody NodeRequest request) {
        throw new NodeException("Ohh ma gosh");
    }
}