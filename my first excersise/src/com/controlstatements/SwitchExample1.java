package com.controlstatements;

public class SwitchExample1 {
	public static void main(String[] args) {
		
	SwitchExample1 switchExample1 = new SwitchExample1();
	
	switchExample1.switchcase(1);
	
	}
	public void switchcase(int a) {
		 switch(a) {
		case 1:{
			System.out.println("im in case 1");
			break;
		}
		case 2:{
			System.out.println("im in case 2");
			break;
		}
		default:{
			System.out.println("im in default");
			
		}
	}
}
}