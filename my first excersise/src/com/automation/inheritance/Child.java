package com.automation.inheritance;

public class Child extends Parent{
	int b =200;
	public static void main(String[] args) {
		Child child = new Child();
		
		System.out.println(child.a);
		System.out.println(child.b);
		child.parentTest();
		child.childTest();
	}
	
	public void childTest() {
		System.out.println("I'm in childTest method");
	}

}
