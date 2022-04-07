package com.example.Employee.Profile.System;

import java.util.List;

import com.example.Employee.Profile.System.Employee;
import com.example.Employee.Profile.System.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional

public class EmployeeService {
    @Autowired
   private EmployeeRepository repo;
    public List<Employee> listAll() {
        return repo.findAll();
    }

    public void save(Employee employeeDetails) {
        repo.save(employeeDetails);
    }

    public Employee get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
