package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

import org.springframework.http.HttpStatus;

public class NodeException extends RuntimeException {
    private HttpStatus status;
    public HttpStatus getStatus() {
        return status;
    }
    public NodeException (String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.status = httpStatus;
    }
    public NodeException (String message, HttpStatus httpStatus) {
        super(message);
        this.status = httpStatus;
    }
}
