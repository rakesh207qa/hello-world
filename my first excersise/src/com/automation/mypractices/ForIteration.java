package com.automation.mypractices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForIteration {

	public static void main(String[] args) {
	Collection<String> collection = new ArrayList<String>();
	collection.add("swathi");
	collection.add("finny");
	collection.add("naveed");
	collection.add("rakesh");
	//for loop//
	for(Iterator<String> iterator = collection.iterator();iterator.hasNext();) {
		System.out.println("value=" +iterator.next());
	}

	}

}
