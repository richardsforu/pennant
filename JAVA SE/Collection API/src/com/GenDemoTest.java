package com;

public class GenDemoTest<E> {
	
	void fun(E x) {
		Object c=x;
		System.out.println(x+" is "+c.getClass().getName());
	}

	public static void main(String[] args) {
		
		GenDemoTest gt=new GenDemoTest();
		gt.fun(34);
		gt.fun("Praveen");
		gt.fun(7664.54f);

	}

}
