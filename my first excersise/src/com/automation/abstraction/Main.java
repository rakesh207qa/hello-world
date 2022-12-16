package com.automation.abstraction;

abstract class Animal{
	
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Sleeping");
	}
}

class Cat extends Animal{
	public void animalSound() {
		System.out.println("Meow Meow...!");
	}
}

class dog extends Animal{

	public void animalSound() {
		System.out.println("bow boww......");
	}
	
}

public class Main {

	public static void main(String[] args) {
		Animal animal = new Cat();
		Animal animal1 = new dog();
		animal.animalSound();
		animal.sleep();
		animal1.animalSound();
	}

}
