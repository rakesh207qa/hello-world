package com.automation.mypractices;

import java.util.ArrayList;

public class CollectionExample {

	public static void main(String[] args) {
	      ArrayList<String> list = new ArrayList<String>();
             list.add("mango");
             list.add("apple");
             list.add("banana");
             list.add("oranges");
             list.add("custered apple");
     		for(String s: list) {
    			System.out.println(s);
     		}
	}

}
