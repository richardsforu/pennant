package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
	
		
		ArrayList<Object> ar=new ArrayList<>();
		ar.add("QSDF");
		ar.add(76);
		ar.add(796);
		ar.add(726);
		ar.add(716);
		ar.add(176);
		ar.add(7546);
		ar.add(7986);
		ar.add(726);
		ar.add(7633333);
		ar.add(6464);
		
		System.out.println(ar);
		
		System.out.println(ar.get(4));
		
		//System.out.println(ar.remove(0));
		//System.out.println(ar);
		
		
		
		ar.set(5, 1010);
		
		//ar.add(1, "Praveen");
		
		System.out.println(ar);
		
		System.out.println(ar.size());
		
		
		
		System.out.println("----------------");
		for(Object obj:ar) {
			if(obj.equals(76)) {
				//ar.set(index, element)
			}
			System.out.println(obj);
		}
		
		System.out.println("-----------------");
		
		for(int i=0;i<ar.size();i++) {
			
			if(ar.get(i).equals(76)) {
				ar.set(i, 10000);
				ar.add(i,8888);
			}
			//xar.remove(i);
			//ar.add("soemthing");
			//ar.add(i,988);
			System.out.println(ar.get(i));
		}
		
		System.out.println("------------------");
		
		Iterator<Object> it=ar.iterator();
		
		while(it.hasNext()==true) {
			
			Object obj=it.next();
			if(obj.equals(8888)) {
				//ar.add(9999);
				it.remove();
				continue;
				
			}
			System.out.println(obj);
			
			
		}
		
		System.out.println("--------------------");
		
		ListIterator<Object> li=ar.listIterator();
		
		while(li.hasNext()) {
			Object obj=li.next();
			if(obj.equals(796)) {
				//li.add(998);
				//li.set(1212);
				li.remove();
			}
			System.out.println(obj);
		}
		
	/*	System.out.println("---------------------");
		
		while(li.hasPrevious()) {
			Object obj=li.previous();
			System.out.println(obj);
		}
		
	*/

		System.out.println(ar);
		
		
	}

}
