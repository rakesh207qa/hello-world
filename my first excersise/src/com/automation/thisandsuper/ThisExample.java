package com.automation.thisandsuper;

public class ThisExample {
	int id;
	String name;
	
	public ThisExample() {
		System.out.println("constructor ThisExample()");
		
	}
	
	public ThisExample(int k) {
		this();
		System.out.println(k);
	}	
	
	public void userDetails(int id, String name) {
		
		//System.out.println(id);
		//System.out.println(name);
		this.id = id;
		this.name = name;
	}
	

	public static void main(String[] args) {
		ThisExample thisExample = new ThisExample(3);
		
		thisExample.userDetails(1, "This example");
		
		System.out.println("id: "+thisExample.id);
		System.out.println("name: "+thisExample.name);
	}

}
