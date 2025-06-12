package com.gromov.dbsaver.service;

import com.gromov.dbsaver.dao.EmployeeRepo;
import com.gromov.dbsaver.entity.Assignment;
import com.gromov.dbsaver.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    public void save(Employee employee) {
        employeeRepo.save(employee);
    }
    private void saveAll(List<Employee> employeeGroup) {
        employeeRepo.saveAll(employeeGroup);
    }
}
