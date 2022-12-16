package com.automation.mypractices;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
       LinkedList<String> link = new LinkedList<String>();
      // link.add("A");
       //link.add("B");
       //link.addLast("c");
       //link.addFirst("d");
       //link.add(2, "E");     //adding elements//
       //System.out.println(link);
       //link.remove("B");
       //link.removeFirst();
       //link.removeLast();//remove elements//
       //System.out.println(link);
      // link.add("geeks");
       //link.add("geeks");
       //link.add(1, "for");
       //System.out.println(link);//add elements
      // link.add("geeks");
       //link.add("Geeks");
       //link.add("geeks");
       //System.out.println("Initial linkedlist="+link);
       //link.set(1,"for");
       //System.out.println("updated linkedlist=" +link);  // changing elements//
       
       link.add("geeks");
       link.add("geeks");
       link.add(1, "for");
       System.out.println("initial linked list="+link);
       //function call//
       link.remove(1);
       System.out.println("After the index removal="+link);
       link.remove("geeks");
       System.out.println("After the object removal="+link);
	}

}
