package com;

public class Calculator {

	/*
	 * => number of parameters => type of parameters => order of parameters
	 */

	
	void f1(Integer x) {
		System.out.println("Integer " + x);
	}
	
	void f1(Byte x) {
		System.out.println("Byte " + x);
	}
	
	void f1(Short x) {
		System.out.println("Short " + x);
	}
	void f1(Float x) {
		System.out.println("Float " + x);
	}
	
	void f1(Double x) {
		System.out.println("Double " + x);
	}

	
	void f1(Long x) {
		System.out.println("Long " + x);
	}
	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.f1(485748.87f);
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
