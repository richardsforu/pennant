package com;

import com.pennant.employee.model.Employee;
import com.pennant.employee.service.EmployeeService;
import com.pennant.employee.service.EmployeeSeviceImpl;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId("EMP001");
		emp.setEmpName("James");
		emp.setSalary(49795);
		EmployeeService empService = new EmployeeSeviceImpl();
		empService.persistEmployee(emp);

		System.out.println("---- Done ----");

	}

}
