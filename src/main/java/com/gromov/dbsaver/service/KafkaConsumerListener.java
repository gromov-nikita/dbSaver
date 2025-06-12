package com.gromov.dbsaver.service;

import com.gromov.dbsaver.entity.Employee;
import com.gromov.dbsaver.service.dao.AssignmentService;
import com.gromov.dbsaver.service.dao.EmployeeService;
import com.gromov.dbsaver.service.dao.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerListener {

    private final EmployeeService employeeService;
    private final AssignmentService assignmentService;
    private final ProjectService projectService;
    private final JsonParser jsonParser;

    @KafkaListener(topics = "${spring.kafka.topic-name.employee}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeEmployee(String message) {
        employeeService.saveAll(jsonParser.parseJson(message));
    }
    @KafkaListener(topics = "${spring.kafka.topic-name.assignment}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeAssignment(String message) {
        assignmentService.saveAll(jsonParser.parseJson(message));
    }
    @KafkaListener(topics = "${spring.kafka.topic-name.project}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeProject(String message) {
        projectService.saveAll(jsonParser.parseJson(message));
    }

}
