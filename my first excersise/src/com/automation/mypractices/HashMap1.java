package com.automation.mypractices;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
	Map<String,String> gfg = new HashMap<String, String>();
	         gfg.put("name", "swathi");
	         gfg.put("id","53");
	         gfg.put("gmail","swathiguttikonda1997");
	         gfg.put("bank details","6544118783");
	         
	         for(String name:gfg.keySet()) {
	        	 System.out.println("key=  "+name);
	         }
	         
	         for(String values: gfg.values()) {
	        	 System.out.println("values= "+values);
	         }

	}

}
