package com.gromov.dbsaver.service.dao;

import com.gromov.dbsaver.dao.ProjectRepo;
import com.gromov.dbsaver.entity.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepo projectRepo;
    public Project save(Project project) {
        return projectRepo.save(project);
    }
    private List<Project> saveAll(List<Project> projectGroup) {
        return projectRepo.saveAll(projectGroup);
    }
}
