package com.kafka.project.producer.KafkaProducerProject.RestNode;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NodeControllerAdvice {
    Logger logger = LoggerFactory.getLogger(NodeControllerAdvice.class);
    @ExceptionHandler(value = KafkaProducerException.class)
    public Object NodeControllerException (String message, Throwable cause) {
        logger.error(message, cause);
        HashMap <String, String> data = new HashMap<>();
        data.put("message", message);
        data.put("cause", cause.getMessage());
        return data;
    }
}
