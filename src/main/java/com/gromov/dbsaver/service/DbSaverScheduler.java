package com.gromov.dbsaver.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DbSaverScheduler {
    @Value("${spring.kafka.topic-name.employee}")
    private String employeeTopicName;
    @Value("${spring.kafka.topic-name.assignment}")
    private String assignmentTopicName;
    @Value("${spring.kafka.topic-name.project}")
    private String projectTopicName;
}
