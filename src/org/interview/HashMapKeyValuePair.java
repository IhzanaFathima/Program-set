package org.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapKeyValuePair {

	public static void main(String[] args) {
		
		Map<Integer,String> mp = new HashMap<>();
		
		mp.put(10,"java");
		mp.put(20,"sql");
		mp.put(30,"oops");
		mp.put(40,"Sql");
		mp.put(50,"oracle");
		mp.put(60,"DB");
		mp.put(10,"selenium");
		mp.put(50,"psql");
		mp.put(40,"Hadoop");
		
		System.out.println("Key Value Pairs Of Hash Map : ");
		
		for (Entry<Integer, String> entry : mp.entrySet()) {
			
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+":"+val);
		}
	}
}
