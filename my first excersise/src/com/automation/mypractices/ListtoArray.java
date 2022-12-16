package com.automation.mypractices;

import java.util.ArrayList;
import java.util.Collections;

public class ListtoArray {

	public static void main(String[] args) {
             ArrayList<String> list = new ArrayList<String>();
              list.add("swathi");
              list.add("rakesh");
              list.add("navved");
              list.add("finny");
              System.out.println("contents in list::" +list);
              String[] myArray = new String[list.size()];
              list.toArray(myArray);
              Collections.sort(list);
              for(String name : list) {
            	  System.out.println(name);
              }
              
              for( int i= 0; i<myArray.length;i++) {
            	  System.out.println("Element at the index" +i+ "is::" +myArray[i] );
              }

	}

}
