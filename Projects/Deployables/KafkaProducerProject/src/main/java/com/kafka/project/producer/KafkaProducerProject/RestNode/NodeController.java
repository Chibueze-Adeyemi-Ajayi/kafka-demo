package com.kafka.project.producer.KafkaProducerProject.RestNode;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message-queue/node")
public class NodeController implements NodeInterface {

    @Override
    @PostMapping("")
    public Object addToQueue(@RequestBody Object data) {
        throw new KafkaProducerException("Ohh no, this is nice, ryt ?");
    }
    
}