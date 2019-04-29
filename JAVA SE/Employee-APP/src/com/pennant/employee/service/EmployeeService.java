package com.pennant.employee.service;

import java.util.List;

import com.pennant.employee.model.Employee;

public interface EmployeeService {

	void persistEmployee(Employee emp);

	Employee getEmployee(String id);

	List<Employee> getEmployees();

}