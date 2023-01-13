package org.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		
		Map<Integer,String> mp = new LinkedHashMap<>();
		
		mp.put(10, "Java");
		mp.put(20, "Sql");
		mp.put(30, "Oops");
		mp.put(40, "Selenium");
		
		for (Map.Entry<Integer, String> entry : mp.entrySet()) {
			
			Integer key = entry.getKey();
			System.out.println(key);
			String val = entry.getValue();
			System.out.println(val);
			
		}
	}
}
