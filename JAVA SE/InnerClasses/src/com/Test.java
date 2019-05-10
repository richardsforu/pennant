package com;

import com.Bank.InnerOperations;

class Bank {

	int bankName;
	String loc;

	public void bMethod() {
		System.out.println("--- B Method");
	}

	static class Ops {

		public void opsMethod() {
			System.out.println("---- opsmethod");
		}

	}

	 class InnerOperations {

		public void f1() {
			System.out.println("---  Inner class f1 method");
		}

	}

}

public class Test {

	public static void main(String[] args) {

		Bank b = new Bank();

		b.bMethod();

		// static Inner class Object

		Bank.Ops bo = new Bank.Ops();
		bo.opsMethod();
		
		// private inner class obejct
		
	     Bank.InnerOperations io=b.new InnerOperations();
	     io.f1();
	     
		
		
		
		
		
		
		
		
		
		
		

	}

}
