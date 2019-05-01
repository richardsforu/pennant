package com;

public class SBDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Abc");
		System.out.println("SB: "+sb);
		System.out.println("HashCode of SB: "+System.identityHashCode(sb));
		
		sb.append("Xyz");
		System.out.println("------------------------");
		System.out.println("SB: "+sb);
		System.out.println("HashCode of SB: "+System.identityHashCode(sb));
		
		
		
		StringBuffer sb1=new StringBuffer(sb);
		//StringBuilder
		
		System.out.println("------------------------");
		System.out.println("SB1: "+sb1);
		System.out.println("HashCode of SB1: "+System.identityHashCode(sb1));

		
	}

}
