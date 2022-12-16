package com.automation.mypractices;

public class StringBuffers {

	public static void main(String[] args) {
      // StringBuffer sb = new StringBuffer("hello");
       //sb.append("java");
      // System.out.println(sb);
       
      // StringBuffer sb = new StringBuffer("hello");
       //sb.insert(3,"java");
       //System.out.println(sb);
		 // StringBuffer sb = new StringBuffer("hello");
	       //sb.replace(1,2,"java");
	       //System.out.println(sb);
		//  StringBuffer sb = new StringBuffer("hello");
	     //  sb.delete(1,3);
	       //System.out.println(sb);
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// actual capacity 16
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());//(old capacity*2)+2
       

	}

}
