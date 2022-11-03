package com.Springrest.Springrest.service;

import java.util.List;

import com.Springrest.Springrest.entities.Employee;

public interface EmployeeService {

		
		public List<Employee> getEmployee();
		
		public Employee getEmployeeId(long employeeId);
		
		public Employee addEmployee(Employee employee);

}
