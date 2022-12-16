package com.automation.collections;

import java.util.ArrayList;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Swathi");
		arrayList.add("Swathi1");
		arrayList.add("Swathi2");
		
		//System.out.println(arrayList.get(1));
		
		for(int i =0; i<arrayList.size();i++) {
		//	System.out.println(arrayList.get(i));
			
		}
		
		for(String s: arrayList) {
			System.out.println(s);
			
		}
		
		
	}

}
