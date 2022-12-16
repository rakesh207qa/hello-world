package com.automation.loops;

public class ForEachLoop {

	public static void main(String[] args) {
		int a[] = {1,3,2,4,6,7,5,8,9};
		
		for(int i =0; i<a.length;i++) {
			//System.out.println(a[i]);
		}
		
		
		for(int i: a) {
			//System.out.println(t);
		}
		
		
		String[] sterArray = {"Str1", "Str2", "Str3", "Str4"};
		
		for(String s: sterArray) {
			System.out.println(s);
		}
	}

}
