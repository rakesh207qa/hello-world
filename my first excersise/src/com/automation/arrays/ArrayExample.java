package com.automation.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 12;
		a[1] = 26;
		a[2] = 14;
		a[3] = 29;
		a[4] = 21;
		//a[5] = 99;
		
		//System.out.println(a[4]);
		
		int b[] = {1,2,4,6,8,9,10,12,32};
		
		
		//System.out.println(b[9]);
		
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}
