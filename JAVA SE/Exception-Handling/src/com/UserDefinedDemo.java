package com;

public class UserDefinedDemo {

	public static void main(String[] args) {

		try {
			
			int x=-10;
			if(x<=0) {
				throw new MyException("My Own Message");
			}

			System.out.println("--- Hello");

		} catch (MyException e) {
			
			//System.out.println(e);
			e.printStackTrace();
			
		}

	}

}
