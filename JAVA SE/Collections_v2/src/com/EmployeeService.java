package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeService {
	private List<Employee> emps = null;

	public EmployeeService() {
		emps = new ArrayList<>();
		Employee e1 = new Employee(76, "Pra", 15000);
		Employee e2 = new Employee(12, "Jha", 25000);
		Employee e3 = new Employee(45, "Bud", 50000);
		Employee e4 = new Employee(76, "Pra", 15000);
		Employee e5 = new Employee(22, "Aop", 18000);
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

	}

	public void saveEmployee(Employee emp) {
		
		emps.add(emp);
	}

	public List<Employee> findAll() {
		return emps;
	}

	public Employee findById(int id) {

		for (Employee emp : emps) {
			if (emp.getEmpId() == id) {
				return emp;
			}
		}

		return null;
	}

	public boolean updateEmployee(int id, Employee newEmployee) {
		boolean found = false;
		ListIterator<Employee> li = emps.listIterator();
		while (li.hasNext()) {
			Employee obj = li.next();

			if (obj.getEmpId() == id) {
				li.set(newEmployee);
				found = true;
				break;
			}
		}
		return found;

	}// end of update

	// remove Employee

	public boolean removeEmployee(int id) {

		boolean found = false;

		Iterator<Employee> it = emps.iterator();

		while (it.hasNext()) {
			if (it.next().getEmpId() == id) {
				it.remove();
				found = true;
				break;
			}
		}
		return found;
	}

}
