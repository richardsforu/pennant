package com.pennant.employee.dao;

import java.util.List;

import com.pennant.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee(Employee emp) {
		System.out.println("Dao: Saving " + emp.getEmpName() + " to DB");
	}

	@Override
	public Employee findById(String id) {
		return null;
	}

	@Override
	public List<Employee> listAll() {
		return null;

	}

}
