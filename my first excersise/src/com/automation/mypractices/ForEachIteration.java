package com.automation.mypractices;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachIteration {

	public static void main(String[] args) {
	  Collection<String> collection = new ArrayList<String>();
	  collection.add("oranges");
	  collection.add("apple");
	  collection.add("pomograntes");
	  collection.add("papaya");
	  for(String s: collection) {
		  System.out.println("values="  +s);
	  }

	}

}
