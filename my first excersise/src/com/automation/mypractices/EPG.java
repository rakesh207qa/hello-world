package com.automation.mypractices;

import java.util.LinkedList;

public class EPG {

	public static void main(String[] args) {
    
		 LinkedList<String> ll = new LinkedList<String>();
		 
	        // Adding elements to the linked list
	        ll.add("A");
	        ll.add("B");
	        ll.addLast("C");
	        ll.addFirst("D");
	        ll.add(2, "E");
  System.out.println(ll);	 
	        
	 
	        ll.remove("B");
	        ll.remove(3);
	        ll.removeFirst();
	        ll.removeLast();
	 
	       
       

	}

	
		
	}


