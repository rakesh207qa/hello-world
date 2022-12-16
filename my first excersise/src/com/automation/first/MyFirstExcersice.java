package com.automation.first;

public class MyFirstExcersice {
  int a = 10;
	public static void main(String[] args) {
		//System.out.println("person is staying in a college");
		MyFirstExcersice myFirstExcersice = new MyFirstExcersice();
		myFirstExcersice.test1();
		myFirstExcersice.test2();
		myFirstExcersice.test3();
		myFirstExcersice.test4();
		myFirstExcersice.test5();

	}

	public void test1() {
		System.out.println("I'm in test1");
	}

	public void test2() {
		System.out.println("I'm in test2");
	}
	
	private void test3() {
		System.out.println("I'm in test3 and it is a private method");
	}
	
	void test4() {
		System.out.println("I'm in test4 and it is a default method");
	}
	
	protected void test5() {
		System.out.println("I'm in test5 and it is a protected method");
	}

}
