package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kafka.project.producer.KafkaProducerProject.Response;

@ControllerAdvice
public class NodeExceptionHandler {
    @ExceptionHandler(value = {NodeException.class})
    public ResponseEntity <Response> handleKafkaException (String message, Throwable cause) {
        Response response = new Response(message, cause, HttpStatus.UNAUTHORIZED);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }
}