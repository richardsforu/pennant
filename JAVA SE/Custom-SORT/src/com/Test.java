package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary() - emp2.getSalary());
	}
	
	

}

public class Test {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();

		Employee e1 = new Employee(34, "Pra", 15000);
		Employee e2 = new Employee(29, "Jha", 25000);
		Employee e3 = new Employee(45, "Bud", 50000);
		Employee e4 = new Employee(12, "Kra", 12000);
		Employee e5 = new Employee(22, "Aop", 18000);

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		System.out.println("----Original Data ----");
		Employee.diaply(emps);

		System.out.println("---- ON EMPID");

		Collections.sort(emps);

		Employee.diaply(emps);

		System.out.println("--- On EMPNAME ---");

		Collections.sort(emps, new Employee());
		Employee.diaply(emps);

		System.out.println("--- On EMPSALARY ---");

		Collections.sort(emps, new SortBySalary());
		Employee.diaply(emps);

	}

}
