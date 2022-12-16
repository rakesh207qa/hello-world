package com.automation.mypractices;

abstract class Phone{
	public abstract void sounds();
	public void call() {
		System.out.println("calling......");
	}
}
class iphone extends Phone{
	public void sounds() {
		System.out.println("vibrating..........");
		
	}
	
}
class samsung extends Phone{
	public void sounds() {
		System.out.println("ringing.....");
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		Phone obj = new iphone();
		Phone sam = new samsung();
		obj.sounds();
		sam.sounds();
		obj.call();
		

	}

}
