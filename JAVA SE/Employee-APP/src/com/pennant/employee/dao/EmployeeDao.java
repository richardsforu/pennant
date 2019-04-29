package com.pennant.employee.dao;

import java.util.List;

import com.pennant.employee.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);

	Employee findById(String id);

	List<Employee> listAll();

}