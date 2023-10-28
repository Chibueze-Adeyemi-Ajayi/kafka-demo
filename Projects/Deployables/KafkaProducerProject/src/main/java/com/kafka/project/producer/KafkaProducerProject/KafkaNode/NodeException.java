package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

public class NodeException extends RuntimeException {
    public NodeException (String message, Throwable cause) {
        super(message, cause);
    }
    public NodeException (String message) {
        super(message);
    }
}
