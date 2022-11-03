package com.Springrest.Springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springrest.Springrest.entities.Employee;
import com.Springrest.Springrest.service.EmployeeService;

@RestController
public class Mycontroller {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String home() {
		return "welcome to home";
	}
	
//	get the courses

	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		return this.employeeService.getEmployee();
	}
	
	@GetMapping("/employeeId/{employeeId}")
	public Employee getEmployeeId(@PathVariable String employeeId) {
		return this.employeeService.getEmployeeId(Long.parseLong(employeeId));
	}
	
	@PostMapping("/EmployeePost")
	public Employee addEmploye(@RequestBody Employee employee) {
		return this .employeeService.addEmployee(employee);
	}
	
}
