package com.practice2;

public class MySecondExcersice {

	public static void main(String[] args) {
		MySecondExcersice mySecondExcersice = new MySecondExcersice();
		mySecondExcersice.test1();
		mySecondExcersice.test2();
		mySecondExcersice.test3();
		mySecondExcersice.test4();
		
		
	}
	//private void test1() {
		// TODO Auto-generated method stub
		
	
	public void test1(){
	System.out.println("i'm in test1, this is public method");
	}
	void test2() {
		System.out.println("im in test2, this is default method");
		}
	private void test3() {
		System.out.println("i'm in test3, this is private method");
	}
	protected void test4(){
		System.out.println("i'm in test 4, this is protected method");
	}
	
}
