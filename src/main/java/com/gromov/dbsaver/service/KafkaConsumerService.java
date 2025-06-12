package com.gromov.dbsaver.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    @KafkaListener(topics = "${spring.kafka.topic-name.employee}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeEmployee(String message) {
        System.out.println("Получено сообщение: " + message);
    }
    @KafkaListener(topics = "${spring.kafka.topic-name.assignment}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeAssignment(String message) {
        System.out.println("Получено сообщение: " + message);
    }
    @KafkaListener(topics = "${spring.kafka.topic-name.project}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeProject(String message) {
        System.out.println("Получено сообщение: " + message);
    }


}
