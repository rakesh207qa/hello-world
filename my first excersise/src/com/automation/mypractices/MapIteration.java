package com.automation.mypractices;
//Java program to demonstrate iteration over 
//Map.entrySet() entries using for-each loop

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
	        Map<String,String> gfg = new HashMap<String,String>();
	          gfg.put("GFG","geeksforgeeks.org" );
	          gfg.put("Practice", "Practice geeks for geeks.org");
	          gfg.put("Code", "code geeks for geeks.org");
	          gfg.put("Quiz", "Quiz geeks for geeks.com");
	          for(Map.Entry<String, String> entry:gfg.entrySet()) {
	        	  System.out.println("key= "+entry.getKey()+",    value= "+entry.getValue());
	          }

	}

}
