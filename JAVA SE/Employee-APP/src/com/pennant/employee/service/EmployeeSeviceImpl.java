package com.pennant.employee.service;

import java.util.List;

import com.pennant.employee.dao.EmployeeDao;
import com.pennant.employee.dao.EmployeeDaoImpl;
import com.pennant.employee.model.Employee;

public class EmployeeSeviceImpl implements EmployeeService {
	
	private EmployeeDao empDao=new EmployeeDaoImpl();

	@Override
	public void persistEmployee(Employee emp) {
		empDao.saveEmployee(emp);
	}

	@Override
	public Employee getEmployee(String id) {
		return empDao.findById(id);
	}

	@Override
	public List<Employee> getEmployees() {
		return empDao.listAll();
	}

}
