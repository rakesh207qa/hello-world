package com.automation.polimorphism;

public class MethodOverridingChild extends MethodOverridingParent {

	public void mul(int a, int b) {

		System.out.println("Child: "+a * b);

	}

	public static void main(String[] args) {
		MethodOverridingChild methodOverridingChild = new MethodOverridingChild();
		methodOverridingChild.mul(11, 9);
	}

}
