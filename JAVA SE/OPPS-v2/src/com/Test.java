package com;

public class Test {
	

	public static void main(String[] args) {

		Employee e;
		
		int x=988;
		Integer x1=888;
		//String s=Integer.valueOf(x);
	
		// 1=> create POJO class Object
		Employee emp=new Employee();
		Employee emp1=new Employee();

		
		
		//2=> call setters
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		//emp.salary=10000;
		emp.setSalary(3487384);
		
		emp1.setEmpId(11);
		emp1.setEmpName("bla");
		emp1.setSalary(10000);
	

		
		//emp.disp1(emp);
		//emp.disp1(emp1);


		//3=> call getters to get conteny from a object
		
	
		
		//emp.display();
		//emp1.display();
		
		//----------------------
		
		//System.out.println("Hashcode of emp: "+emp.hashCode());
		//Employee.disp(emp); // Actuval
		//Employee.disp(emp1);
		
		Product p1=UseClass.getProductObject();
		Product p2=UseClass.getProductObject();

		p1.f1();
		p2.f1();
		
		
		
		
		
		
		
		
		
		
		
	}

}
