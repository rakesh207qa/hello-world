package com.automation.mypractices;


       class Adder{
    	   static int add(int a, int b) {
    		   return a+b;
    	   }
    	   static double add(double a, double b, double c) {
    		   return a+b+c;
    	   }
    	   public class MethodOverloading {
       }
	public static void main(String[] args) {
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(12.2,13.7,12.5));
		
		

	}

}
