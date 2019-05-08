package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar=new ArrayList<Object>();
		HashSet<Object> data=new HashSet<Object>(ar);
		
		Set<Object> hs = new TreeSet<>();
		hs.add("Moh");
		hs.add("Sbc");
		hs.add("James");
		hs.add("Bkj");
		hs.add("Djkg");
		hs.add("Kraveen");
		hs.add("Abc");
		hs.add("Blkj");
		//hs.add(1000);

		System.out.println(hs);

		// hs.remove("Test");
		System.out.println(hs);

		Iterator<Object> it = hs.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("Test")) {
				hs.add("Some");
			}
			System.out.println(obj);
		}

		System.out.println(hs);
	}

}
