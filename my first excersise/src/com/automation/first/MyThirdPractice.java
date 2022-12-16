package com.automation.first;

public class MyThirdPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThirdPractice myThirdPractice = new MyThirdPractice();
		
		myThirdPractice.test1();
		myThirdPractice.test2();
		myThirdPractice.test3();
		myThirdPractice.test4();
		}
	
	public void test1(){
		System.out.println("i'm in test1, this is public method");
	}
	private void test2(){
		System.out.println("i'm in test2, this is private method");
	}
	void test3(){
		System.out.println("i'm in test3, this is default method");
	}
	protected void test4(){
		System.out.println("i'm in test4, thid is protected method");
	}
	

}
