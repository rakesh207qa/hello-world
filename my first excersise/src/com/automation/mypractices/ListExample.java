package com.automation.mypractices;

import java.util.ArrayList;
import java.util.Collections;


public class ListExample {

	public static void main(String[] args) {
          ArrayList<String> list1 = new ArrayList<String>();
          ArrayList<Integer> list2 = new ArrayList<Integer>();
          
          list1.add("mango");
          list1.add("custard apple" );
          list1.add("apple");
          list1.add("orange");
          list1.add("grapes");
          Collections.sort(list1);
          for(String fruits:list1) {
        	  System.out.println(fruits);
        	  
        	  
        	  
        	  System.out.println("sorting numbers....");
        	  
        	
        	  
          }
          
          list2.add(12);
          
          

	}

}
