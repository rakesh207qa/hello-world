package com.controlstatements;

public class IfElseExample {

	public static void main(String[] args) {
	int number = 17;
	
	if(number%2==0) {
		System.out.println("even number");
		
	}
	else {
		System.out.println("odd number");
	}
	int number1 = 20;
	if(number1%2==0) {
		System.out.println("even number");
	}
	else {
		System.out.println("odd number");
	}
	int year = 2016;
	if((year%4==0)&&(year%100!=0)||(year%400==0)) {
		System.out.println("leap year");
		}
	else {
		System.out.println("normal year");
	}
	int year1 = 2021;
	if((year1%4==0)&&(year1%100!=0)||(year1%400==0)) {
		System.out.println("leap year");
		}
	else {
		System.out.println("normal year");
	}
	}

}
