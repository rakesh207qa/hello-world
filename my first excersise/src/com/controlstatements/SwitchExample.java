package com.controlstatements;

public class SwitchExample {

	public static void main(String[] args) {
		
		
		SwitchExample switchExample;
		switchExample = new SwitchExample();
		switchExample.switchCase(4);
	}
	
	public void switchCase(int a) {
		
		switch(a) {
		case 1:{
			System.out.println("In case1!");
			break;
			}
			
		case 2:{
			System.out.println("In case 2!");
			break;
		}
			
		default:{
			System.out.println("In default!");
		}
		
		}
		
	}

}
