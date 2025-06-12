package com.gromov.dbsaver.service;

import com.gromov.dbsaver.dao.ProjectRepo;
import com.gromov.dbsaver.entity.Assignment;
import com.gromov.dbsaver.entity.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepo projectRepo;
    public void save(Project project) {
        projectRepo.save(project);
    }
    private void saveAll(List<Project> projectGroup) {
        projectRepo.saveAll(projectGroup);
    }
}
