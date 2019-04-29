package com;

import java.io.PrintStream;

class Test{
	
	 static int test;
	 
	 public static ClassDemo display() 
	 {
		 
		 return new ClassDemo();
	 }
	
}




public class ClassDemo{
	
	// Properties
	/*
	 * 1. Instance property
	 * 2. static property
	 * 3. final property
	 * 4. transient property
	 * 5. volatile property
	 * 
	 * 
	 * Methods
	 * --------
	 * 1. instance methods
	 * 2. static method
	 * 3. final methjods
	 * 4. abstract methods
	 * 5. native methods
	 * 
	 * constructor
	 * --------------
	 * 1. default
	 * 2. parametarized
	 * 
	 * static blocks
	 * instance blocks
	 * 
	 * inner classes
	 * 
	 * 
	 * class types
	 * -------------
	 * 1. concreate class
	 * 2. abstract
	 * 3. final
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	int age;
	static int phone=979834;
	static String test;
	

	
	void println(){
		System.out.println("---- Hello  ");
	}
	

	public static void main(String[] args) {
		PrintStream ps=System.out;
		ps.println("Testing");
		
		//Test t=new Test();
		//t.display();
		
		Test.display().println();
		
		
		
		
		
		

	}

}
