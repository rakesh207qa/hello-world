package com.automation.abstraction;

public class Child2  extends AbstractionExample{
	
	public void test3() {
		System.out.println("I'm in test 3 method");
	}
	public static void main(String[] args) {
		AbstractionExample abstractionExample = new Child2();
		abstractionExample.test2();
		abstractionExample.test3();
	}

	void test() {
		
	}
}
