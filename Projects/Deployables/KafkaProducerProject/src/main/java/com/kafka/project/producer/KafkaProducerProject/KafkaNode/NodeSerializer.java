package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

import java.util.Map;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class NodeSerializer implements Serializer <NodeRequest> {

    @Override
    public byte[] serialize(String topic, NodeRequest data) {
        ObjectMapper mapper = new ObjectMapper();
        byte[] bytes = null;
        try {
            bytes = mapper.writeValueAsBytes(data);
        } catch (JsonProcessingException e) {
            throw new SerializationException("Error serializing NodeRequest object", e);
        }
        return bytes;
    }

    @Override
    public void configure(Map configs, boolean isKey) {
        // TODO Auto-generated method stub
        Serializer.super.configure(configs, isKey);
    }
    
}
