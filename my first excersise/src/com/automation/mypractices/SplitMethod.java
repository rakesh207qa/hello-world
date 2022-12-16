package com.automation.mypractices;

public class SplitMethod {

	public static void main(String[] args) {
     String str = "geeks@for@geeks@for";
     String[] arrofstr = str.split("@",4);
     for(String a:arrofstr)
     System.out.println(a);
     

	}

}
