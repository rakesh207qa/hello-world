package com.automatiuon.jumpstmt;

public class JumpStmtsExample {

	public static void main(String[] args) {
		
		for(int a =0; a<100; a++) {
			if(a>50) {
				break;
			}
			//System.out.println(a);
		}
		
		//System.out.println("Hello");
		
		for(int k=0; k<10;k++) {
			if(k==5 || k==6 || k==7) {
				continue;
			}
			System.out.println(k);
		}
		
	}

}
