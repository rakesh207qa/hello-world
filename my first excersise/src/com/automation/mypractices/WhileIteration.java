package com.automation.mypractices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WhileIteration {

	public static void main(String[] args) {
	      Collection<String> collection =  new ArrayList<String>();
	            collection.add("zero");
	            collection.add("one");
	            collection.add("two");
	            collection.add("three");
	            
	            Iterator<String> iterator = collection.iterator();
	            //while loop//
	            while(iterator.hasNext()) {
	            	System.out.println("value= " +iterator.next());
	            }
	            

	}

}
