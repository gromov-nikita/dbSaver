package com.gromov.dbsaver.service;

import com.gromov.dbsaver.dao.AssignmentRepo;
import com.gromov.dbsaver.entity.Assignment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssignmentService {
    private final AssignmentRepo assignmentRepo;
    public void save(Assignment assignment) {
        assignmentRepo.save(assignment);
    }
    private void saveAll(List<Assignment> assignmentGroup) {
        assignmentRepo.saveAll(assignmentGroup);
    }
}
