package com;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Employee implements Comparable<Employee>,Comparator<Employee> {

	private int empId;
	private String empName;
	private double salary;
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return empId - emp.getEmpId();
	}
	
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		// calculations
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// List all EMployees

	public static void diaply(List<Employee> emps) {
		System.out.println("Rno\tName\tSalary");
		System.out.println("-------------------------");
		for (Employee emp : emps) {
			System.out.print(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getSalary());
			System.out.println();
		}

	}

}
