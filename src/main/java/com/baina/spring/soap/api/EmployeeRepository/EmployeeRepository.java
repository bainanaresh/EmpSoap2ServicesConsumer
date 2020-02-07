package com.baina.spring.soap.api.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baina.spring.soap.api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
