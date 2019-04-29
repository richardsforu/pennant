package com;

import java.lang.reflect.Method;

class Vehicle{
	
	
	/*
	 * Notes
	 * ----------
	 * Visibility of overridden methods in sub classes
	 * 1. If Super class method is public,
	 * 		=> Then  sub classes must over ride only with public
	 * 
	 * 2. If Super class  method is default,
	 * 	=> then overridden sub class method can be , default, public, protected
	 * 
	 * 3. If Super class method is proctected, then
	 * => sub class overridden methods should be, protected, public only
	 * 
	 */
	
	final void f1() {
		System.out.println("--  f1 method of Vehicle classs");
	}
	
}
class TwoWheeler extends Vehicle{
	

	
	
	
	 public  void f2() {
	
		System.out.println("---- TwoWheeler f1 method");
	}
}

public class Test {

	public static void main(String[] args) {
		
		//TwoWheeler tw=new TwoWheeler();
		//tw.f1();
	
		

	}

}
