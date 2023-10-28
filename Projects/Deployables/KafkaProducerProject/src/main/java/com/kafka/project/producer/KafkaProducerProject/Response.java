package com.kafka.project.producer.KafkaProducerProject;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.lang.String;

@Component
public class Response {
    private String message;
    private Throwable cause;
    private HttpStatus status;
    public Response() {}
    public Response(String message, Throwable cause, HttpStatus status) {
        this.message = message;
        this.cause = cause;
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Throwable getCause() {
        return cause;
    }
    public void setCause(Throwable cause) {
        this.cause = cause;
    }
    public HttpStatus getStatus() {
        return status;
    }
    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
