package com.example.Employee.Profile.System;

import com.example.Employee.Profile.System.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}