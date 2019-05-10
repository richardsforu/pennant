package com;

import java.util.Map;
import java.util.WeakHashMap;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Map<Object, Object> hm=new WeakHashMap<>();
		
		String s1="Praveen";
		String s2="Praveen";
		
		hm.put(s1, s1);
		hm.put(s2, s2);

		
		//str=null;
		
		//System.gc();
		
		System.out.println(hm);
		
		
		
		
	}

}
