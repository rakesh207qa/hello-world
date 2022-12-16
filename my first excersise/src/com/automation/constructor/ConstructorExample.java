package com.automation.constructor;

public class ConstructorExample {
	
	public ConstructorExample(int a) {
		System.out.println("I'm in ConstructorExample constructor!!");
	}
	
	public ConstructorExample(int a, int b) {
		System.out.println("I'm in ConstructorExample constructor!2!");
	}
	
	/*
	 * public test() { System.out.println("I'm in test method!!!"); }
	 */
	
	
	public void add() {
		System.out.println("I'm in method test2!!!");
	}

	public static void main(String[] args) {
		new ConstructorExample(1, 2);
	}

}
