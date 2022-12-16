package com.automation.exceptions;

public class ThrowsExample {

	public static void main(String[] args) throws Exception{
		ThrowsExample throwsExample = new ThrowsExample();
		throwsExample.test1();
		throwsExample.test2();
	}
	
	public void test1() throws Exception {
		System.out.println("I'm in test()1");
		int i =10;
		try {
		int k = i/0;
		}catch(Exception e) {
			throw new Exception(" My exception thrown ");
		}
	}

	public void test2() throws Exception {
		System.out.println("I'm in test()2");
	}
}
