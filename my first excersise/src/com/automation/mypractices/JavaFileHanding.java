package com.automation.mypractices;

import java.io.File;
import java.io.IOException;

public class JavaFileHanding {

	public static void main(String[] args) {
		try {
	  File myObj = new File("filename.txt");
	  if(myObj.createNewFile()) {
		  System.out.println("File created::"+myObj.getName());
	  }
	  else {
		  System.out.println("file name is already exists");
	  }
	  }
	  catch(IOException e) {
		  System.out.println("an error occured");
		  e.getStackTrace();
	  
		}

	}

}
