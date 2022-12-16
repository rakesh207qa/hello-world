package com.automation.mypractices;

public class TestEncapsulation {

	public static void main(String[] args) {
		  Account acc=new Account();  
		    //setting values through setter methods  
		    acc.setAcc_no(7276826792867l);
		    acc.setName("leela");
		    acc.setEmail("sonoojaiswal@javatpoint.com");  
		    acc.setAmount(500000f);  
		    //getting values through getter methods  
		    System.out.println(acc.getAcc_no());
		    System.out.println(acc.getName());
		    System.out.println(acc.getEmail());
		    System.out.println(acc.getAmount());
		}  

}

