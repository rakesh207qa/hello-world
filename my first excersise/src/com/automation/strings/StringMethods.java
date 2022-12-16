package com.automation.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello world!!";
		//System.out.println(s.charAt(6));
		
		StringBuffer sBuffer = new StringBuffer("Tuesday!");
		//System.out.println(sBuffer.append(" Newxt day is Wednesday"));
		//System.out.println(sBuffer);
		
		StringBuilder sb = new StringBuilder("Im String Builder");
		System.out.println(sb);
		System.out.println(sb.append(" Appending some text"));
		System.out.println(sb);
	}
	
	// Abstraction
	// Inheritance
	// Polymorphism
	// Encapsulation

}
