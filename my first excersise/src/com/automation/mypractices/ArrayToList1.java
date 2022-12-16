package com.automation.mypractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ArrayToList1 {

	public static void main(String[] args) {
	   Integer[] array1 = {1,2,3,4,5,6};
	   
	   int[] b = new int[5];
	   b[0] = 0;
	   b[1]= 22;
	   List<Integer> list = new ArrayList<Integer>();
	   
	   
	   for(int i= 0; i<array1.length;i++) {
		   list.add(array1[i]);
		   
	   }
	  // System.out.println(list);
	   
	   List<Integer> list1 = Arrays.asList(array1);
	   System.out.println(list1);
	   List<Integer> list2 = new ArrayList<>();
	   System.out.println(list2);
	   //int[] array;
	//List<Integer> list3 = Arrays.stream(array).collect((Supplier<R>) Collectors.toList());
	 //  System.out.println(list3);
	   

	}

}
