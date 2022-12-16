package com.automation.second;

import com.automation.first.MyFirstExcersice;

public class OtherState {

	public static void main(String[] args) {
		MyFirstExcersice myFirstExcersice = new MyFirstExcersice();
		myFirstExcersice.test1();
		myFirstExcersice.test2(); // It is accessible because it is a public method
		//myFirstExcersice.test3(); // It is not allowed because of private
		//myFirstExcersice.test4(); // It is not allowed out of package because it is default method
		//myFirstExcersice.test5(); // It is also not allowed because it is declared as protected and this class is 
									//not a sub class of of method delared class
	}

}
