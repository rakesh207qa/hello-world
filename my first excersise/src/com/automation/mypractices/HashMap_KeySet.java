package com.automation.mypractices;

import java.util.HashMap;

public class HashMap_KeySet {

	public static void main(String[] args) {
       HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
              hashmap.put(1,"swathi");
              hashmap.put(2, "rakesh");
              hashmap.put(3, "naveed");
              hashmap.put(4, "finny");
              hashmap.put(5, "tejaswi");
              System.out.println("Initial mappings are=="+hashmap);
              // using keyset() to get set key values//
              System.out.println("the set is:="+hashmap.keySet());
              
              
              HashMap< String,Integer> hashmap1 = new HashMap< String,Integer>();
              hashmap1.put("swathi", 1);
              hashmap1.put("rakesh", 2);
              hashmap1.put("naveed", 3);
              hashmap1.put("finny", 4);
              hashmap1.put("tejaswi", 5);
              System.out.println("Initial mappings are=="+hashmap1);
              // using keyset() to get set key values//
              System.out.println("the set is:="+hashmap1.keySet());


	}

}
