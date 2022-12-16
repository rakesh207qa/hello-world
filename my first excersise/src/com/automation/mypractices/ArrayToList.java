package com.automation.mypractices;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
	    String arr[] =  {"one", "two"," three","four"," five"};
	      System.out.println("Array = "+ Arrays.toString(arr));
	    List<String>myList = Arrays.asList(arr);
	      System.out.println("List (Array to List) = " + myList);

	}

}
