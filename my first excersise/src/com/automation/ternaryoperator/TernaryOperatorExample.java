package com.automation.ternaryoperator;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		int i =20;
		String s ="";
		
		if (i<10) {
			System.out.println("i is greater than 10");
		}else {
			System.out.println("i is less than 10");
		}
		
		s= (i>10)?"i is greater than 10":"i is less than 10";
		System.out.println(s);
	}

}
