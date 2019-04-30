package com;

class Employee {
	int id;
	String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e2 = (Employee) obj;
		return ((this.id == e2.id));
	}
	
	@Override
	public int hashCode() {
	
		return id;
	}

}

public class EqualsDemo {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(10);

		System.out.println("E1: " + e1.id);
		System.out.println("E2: " + e2.id);
		
		System.out.println("E1 hashcode: "+e1.hashCode());
		System.out.println("E2 hashcode: "+e2.hashCode());
		
		System.out.println("E1 hashcode-v1: "+System.identityHashCode(e1));
		System.out.println("E2 hashcode-v1: "+System.identityHashCode(e2));



		if (e1.equals(e2)) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}

	}

}
