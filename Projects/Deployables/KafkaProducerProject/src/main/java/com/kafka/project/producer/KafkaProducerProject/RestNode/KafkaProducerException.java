package com.kafka.project.producer.KafkaProducerProject.RestNode;

public class KafkaProducerException extends RuntimeException {
    public KafkaProducerException(String message) {
        super(message);
    }
    public KafkaProducerException(String message, Throwable cause) {
        super(message, cause);
    }
}
