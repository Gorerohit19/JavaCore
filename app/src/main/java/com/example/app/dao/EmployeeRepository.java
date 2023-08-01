package com.example.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.pojos.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    
}
