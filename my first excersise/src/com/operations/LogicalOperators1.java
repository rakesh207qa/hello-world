package com.operations;

public class LogicalOperators1 {

	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		int c = 9;
		System.out.println((a<b)&&(b<c));
		System.out.println((a<b)&&(b>c));
		System.out.println((a>b)&&(b<c));
		System.out.println((a>b)&&(b>c));

		
		System.out.println((a<b)||(b<c));
		System.out.println((a<b)||(b>c));
		System.out.println((a>b)||(b<c));
		System.out.println((a>b)||(b>c));
	}

}
