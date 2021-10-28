package com.example.demo.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
