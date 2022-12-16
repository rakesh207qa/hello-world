package com.automation.inheritance;

public class Parent {
	int a = 100;

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentTest();
	}
	
	public void parentTest() {
		System.out.println("I'm in parentTest method");
	}

}
