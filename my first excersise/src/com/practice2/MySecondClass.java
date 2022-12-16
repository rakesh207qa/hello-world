package com.practice2;

import statics.variable.StaticExample;

public class MySecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySecondExcersice mySecondExcersice = new MySecondExcersice();
		mySecondExcersice.test1();
		mySecondExcersice.test2();
		//mySecondExcersice.test3();
		mySecondExcersice.test4();
		
		StaticExample staticExample = new StaticExample();
		
		System.out.println(StaticExample.a);
		System.out.println(staticExample.b);
		StaticExample.testStatic();

	}

}
