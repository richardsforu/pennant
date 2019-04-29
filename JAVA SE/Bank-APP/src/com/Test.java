package com;

public class Test {

	public static void main(String[] args) {

		Customer cust=new Bank();
		cust.deposit();
		cust.withDraw();
		
		Manager m=new Bank();
		m.lockerAccess();
		
		CustomerExecutive ce=new Bank();
		ce.closeAccount();
		
		ClwarkOperation ops=new Bank();
		ops.clekOpwrations();
	}

}
