package com.automation.mypractices;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 21;
		int i = 1;
		int count = 0;
		while (i <= num) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			System.out.println("the number is prime");
		} else {
			System.out.println("the number is not prime");
		}

	}

}
