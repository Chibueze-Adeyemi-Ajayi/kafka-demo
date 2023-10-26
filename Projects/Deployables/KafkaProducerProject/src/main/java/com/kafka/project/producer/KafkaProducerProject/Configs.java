package com.kafka.project.producer.KafkaProducerProject;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class Configs {
    @Bean
    public NewTopic createTopic () {
        return new NewTopic("reminder-topic", 5, (short) 1);
    }
}
