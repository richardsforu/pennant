package com;

public class Employee {

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
		// logic to update salary
		this.salary=this.salary+10000;
		return salary;
	}

	public void setSalary(double salary) {
		// verify user
		
		this.salary = salary;
		
	}
	
	//  bad code
	
	public void disp1(Employee emp) {
		System.out.println(emp.toString());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println("--------------------");
	}
	
	
	public static void disp(Employee temp){
		System.out.println("Hashcode of temp: "+temp.hashCode());

		//System.out.println(emp.getEmpId());
		//System.out.println(emp.getEmpName());
		//System.out.println(emp.getSalary());
		//System.out.println("--------------------");
	}
	
	
	public void display() {
		System.out.println("ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("---------------------");
	}
	
	
	
	
	
	

}
