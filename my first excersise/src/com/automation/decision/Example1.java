package com.automation.decision;

public class Example1 {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		
		if(a == 2) {
			System.out.println("a is having value 1");
		}
		
		if(a == 3) {
			//System.out.println("a is having value 1");
		}else {
			//System.out.println("a is not having value 3");
		}
		
		if(b == 3) {
			//System.out.println("b is having value 3");
		}else {
			//System.out.println("a is not having value 3");
		}
		
		if(b == 1) {
			System.out.println("b is having value 1");
		}else if(b == 2 ){
			System.out.println("b is having value 2");
		}else {
			//System.out.println("b is not having value 1 or 2");
		}
		
		int value = 2;
		
		switch(value) {
		
		case 1: {
			System.out.println("Case1: "+value);
		}
		break;
		
		case 2: {
			System.out.println("Case2: "+value);
		}
		break;
		
		default:{
			System.out.println("I'm in default block");
		}
		
		}
	}

}
