package com.automation.mypractices;

import java.util.HashMap;
import java.util.Map;

public class OverMapForEach {

	public static void main(String[] args) {
	Map<String,String> gfg = new HashMap<String,String>();
	       gfg.put("id", "001");
	       gfg.put("name", "swathi");
	       gfg.put("gmail","swathiguttikonda1997@gmail.com");
	       gfg.put("salary","30000");
	         gfg.forEach((K,V) -> System.out.println("key::"+ K +",  value::" + V )); 

	}

}
