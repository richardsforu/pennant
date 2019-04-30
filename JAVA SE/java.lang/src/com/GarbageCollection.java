package com;

import java.io.ObjectInputStream.GetField;

class Product {
	
	@Override
	protected void finalize() throws Throwable {
		
		//System.out.println("---- Object is Garbage collected");
		
	}
	
}

public class GarbageCollection {
	
	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory());
	
		
		for(int i=1;i<=2;i++) {
			Product p=new Product();
		}
		
		System.out.println(r.freeMemory());

		System.out.println(r.totalMemory()-r.freeMemory());
		

		//p1=null;
		//p2=null;
		
		//System.gc();
		
		
		System.out.println("---- Done ----");
		
	}

}
