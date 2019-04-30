package com;

class Emp{
	int id=10;
	String name="Ozvitha";
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String template="<div> <h1> Hello </h1> </div>";
		return "Hey "+name+" Your Id is "+id;
	}
}

public class ToStringDemo {
	
	public static void main(String[] args) {
		
		
		
		Emp emp=new Emp();
		System.out.println(emp.hashCode());
		System.out.println("Converted: "+Integer.toHexString(2018699554));
		System.out.println(emp);
	} 
	

}
