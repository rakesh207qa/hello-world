package com.automation.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		int i =10;
		int k = 0;
		
		// try catch block
		// throws keyword
		// throw
		
		try {
			k = i/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Im in finally block!!");
		}
		
		System.out.println(k);
		
		System.out.println("code succefully executed!!");
		
	}

}
