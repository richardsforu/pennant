package com;


public class StringDemo {
	
	/*
	 * Types of Objects
	 * 	1. Immutable: Content of an object can not be changed.
	 * 		Ex: String and all wraper classes
	 * 	2. Mutable : Content of an object can be changed
	 * 		Ex: StringBuffer
	 
	 */
	public static void main(String[] args) {
		
		String s1="Abc";
		System.out.println("S1: "+s1);
		//System.out.println("Hashcode of S1: "+s1.hashCode());
		System.out.println("S1 Hashcode: "+System.identityHashCode(s1));
		
		System.out.println("------------------------");
	
		String s2=new String("Abc");
		
		System.out.println("S2: "+s2);
		//System.out.println("Hashcode of S2: "+s2.hashCode());
		
		System.out.println("S2 Hashcode: "+System.identityHashCode(s2));

		
		if(s1.equals(s2)) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}

		

	}

}
