package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.api.DemoServiceAPI;
import com.example.demo.service.impl.EmployeeRepo;

@RestController
public class DemoController {

	private DemoServiceAPI api;
	@Autowired
	private EmployeeRepo repo;

	public DemoController(DemoServiceAPI api) {
		this.api = api;
	}

	@RequestMapping("/get")
	public String getDetails() {
		String message = api.get();
		return message;
	}

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

}
