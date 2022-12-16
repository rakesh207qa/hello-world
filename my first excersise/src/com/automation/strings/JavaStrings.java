package com.automation.strings;

public class JavaStrings {

	public static void main(String[] args) {
		
		String str = "Hello world!";
		String str2 = "Hello world!";
		
		String strs2 = new String("Hello world!");
		String strs3 = new String("Hello world!");
		
		
		/*
		 * System.out.println(str);
		 * 
		 * str = str+ "str2";
		 * 
		 * System.out.println(str);
		 */
		
		
		
		  if(str == str2) { System.out.println("Both are equals =="); }
		  
		  if(str.equals(str2)) { System.out.println("Both are equals method"); }
		 System.out.println("--------------------------------------------------------------------");
		
		if(strs2 ==strs3) {
			System.out.println("Both are equals ==");
		}
		
		if(strs2.equals(strs3)) {
			System.out.println("Both are equals method");
		}
		
		
	}

}
