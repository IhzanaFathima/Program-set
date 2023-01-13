package org.interview;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapKeyValues {

	public static void main(String[] args) {
		
		Map<Integer,Integer> mp = new TreeMap<>();
		
		mp.put(10, 10);
		mp.put(20, 20);
		mp.put(30, 30);
		mp.put(40, 40);
		mp.put(50, 50);
		mp.put(60, 60);
		mp.put(10, 10);
		mp.put(50, 50);
		mp.put(40, 40);
		
		System.out.println("Key Values Of Tree Map : ");
		
		for (Entry<Integer, Integer> entry : mp.entrySet()) {
			
			Integer key = entry.getKey();
			System.out.println(key);

		}
	}
}
