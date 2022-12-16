package com.automation.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id", "001");
		map.put("name", "my name");
		map.put("mobile", "9089898989");
		map.put("name", "my name2");
		
		//System.out.println(map.get("name"));
		//System.out.println(map.get("mobile"));
		
		for(String e : map.keySet()) {
			//System.out.println("Key: "+e+" value: "+map.get(e));
		}
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" value: "+entry.getValue());
		}
		
	}

}
