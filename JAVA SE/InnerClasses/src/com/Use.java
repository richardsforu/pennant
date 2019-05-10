package com;

public class Use {

	public static void main(String[] args) {

		MyInter mi = new MyInter() {

			@Override
			public void f1() {
				System.out.println("--- F1 method");

			}
			
			@Override
			public void f2() {
				
			}

		};
		
		mi.f1();

	}
}
