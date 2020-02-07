package com.baina.spring.soap.api.service;

import org.springframework.stereotype.Service;

import com.baina.spring.soap.api.empreg.Employee;
import com.baina.spring.soap.api.empreg.EmployeeDetails;

@Service
public class EmployeeRegService {
	
	public EmployeeDetails regEmp(Employee emp) {
		EmployeeDetails details=new EmployeeDetails();
	
		details.setEid(emp.getEid());
		details.setName(emp.getName());
		details.setAge(emp.getAge());
		details.setSalary(emp.getSalary());
		details.setResults("employee registered successfully");
		return details;
	
	}

}
