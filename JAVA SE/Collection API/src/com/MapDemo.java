package com;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<Object, Object> hm = new TreeMap<>();

		//hm.put(null, "Test");
		hm.put("chn", "ChennI");
		hm.put("pun", "Pune");
		hm.put("blr", "Bangalore");
		hm.put("del", "Delhi");
		hm.put("chn", null);
		//hm.put(null, null);

		System.out.println(hm);
		
		//hm.remove("hyd");

		System.out.println(hm.size());

		System.out.println(hm.get("del"));

		String tv = "GOA";

		boolean found = false;

		// get all map keys into set

		Set<Object> keys = hm.keySet();

		// apply for each loop

		for (Object key : keys) {
			System.out.println(hm.get(key));
		}

		System.out.println("--------------");

	/*	for (Object key : keys) {
			Object obj = hm.get(key);

			if (obj.equals(tv)) {
				found = true;
				break;
			}

		}

		if (found) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}

*/
		System.out.println("-------");

		// Copy maps key and value into set as a single object

		Set data = hm.entrySet();

		System.out.println(data);

	}

}
