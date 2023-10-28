package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/node")
public class NodeController {

    @Autowired
    NodeService nodeService;

    @PostMapping("")
    public ResponseEntity <Object> addReminderToKafkaProcessor (@RequestBody NodeRequest request) {
        Object object = nodeService.addReminderToKafkaProcessor(request);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

}