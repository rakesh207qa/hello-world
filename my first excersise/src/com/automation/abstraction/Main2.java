package com.automation.abstraction;

public class Main2 implements IntefaceExample {

	public static void main(String[] args) {
	
		//IntefaceExample intefaceExample = new IntefaceExample(); we can not create an object for an inteface
		IntefaceExample intefaceExample = new Main2();
		
		intefaceExample.testMethod();
		intefaceExample.testMethod2();
	}
	

	public void testMethod() {
		System.out.println("testMethod");
	}

	public void testMethod2() {
		System.out.println("testMethod2");
	}

}
