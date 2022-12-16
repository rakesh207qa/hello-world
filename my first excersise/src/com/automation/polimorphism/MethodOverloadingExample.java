package com.automation.polimorphism;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
		methodOverloadingExample.add(100, 1.0f);
	}
	
	public void add(int a, float b) {
		System.out.println("method add(int a, int b)");
	}
	
	public void add(int a, int b, int c) {
		System.out.println("method add(int a, int b, int c)");
	}
	
	public void add(double a) {
		System.out.println("method add(double a)");
	}
	
	public void add(long a) {
		System.out.println("method add(long a)");
	}

}
