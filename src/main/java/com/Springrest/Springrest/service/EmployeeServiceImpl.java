package com.Springrest.Springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Springrest.Springrest.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> list;
	
	public EmployeeServiceImpl() {
		list = new ArrayList<>();
	
		list.add(new Employee(1, "Java", "Java"));
		list.add(new Employee(2, "Employee", "JavaJava"));
		list.add(new Employee(3, "Java Employee", "Java Employee"));
		list.add(new Employee(4, "Employee Java", "Employee Java"));
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Employee getEmployeeId(long employeeId) {
		
		Employee emp = null;
		for (Employee employee : list) {
			if (employee.getId()==employeeId) {
				emp = employee;
				break;
				
			}
		}
		return emp;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}


	

}
