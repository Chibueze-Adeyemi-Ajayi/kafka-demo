package com.kafka.project.producer.KafkaProducerProject.KafkaNode;

import org.springframework.stereotype.Component;

@Component
public class NodeRequest {
    private String message;
    private String time;
    private String title;
    public NodeRequest() {}
    public NodeRequest(String message, String time, String title) {
        this.message = message;
        this.time = time;
        this.title = title;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
