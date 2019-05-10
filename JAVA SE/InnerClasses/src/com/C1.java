package com;

import java.util.Scanner;

class C2 implements Cloneable{

	public C2() {
		System.out.println("-- C2 class Obejct created...");
	}

	public void f1() {
		System.out.println("C2 class f1 method");
	}
}

public class C1 implements Cloneable {

	public static void main(String[] args) throws Exception {

		// C2 c=new C2();
		// c.f1();

		Scanner sc = new Scanner(System.in);
		System.out.println("-- ENter class name: ");
		String cname = sc.next();
		
		Class cn=Class.forName(cname);
		
		//System.out.println(cn.getName());
		C2 c2=(C2)cn.newInstance(); 
		c2.f1();
		
		C1 c=new C1();
		C1 cObj=c;
		
		 
	
	    C1 cii=(C1)c.clone();
	    
	    System.out.println(c.hashCode());
	    System.out.println(cii.hashCode());
		
		
		
		
		
		
		
		

	}

}
