package com.automation.thisandsuper;
        
        class person{
        	int id;
            String name;
            person(int id, String name){
            	this.id = id;
            	this.name = name;
            	
            }
            person(String id,String name){
        		
        	}
        }
        class Emp extends person{
        	float salary;
        	
        	Emp(int id,String  name,float salary){
        		super(id,name);
        		this.salary= salary;
        	}
        	void display() {
        		System.out.println(id+ "\t" +name+ "\t" +salary);
        	}
        }
public class SuperExample {

	public static void main(String[] args) {
		Emp emp = new Emp(53, "swathi", 40000);
		emp.display();
		
		
	

	}

}
