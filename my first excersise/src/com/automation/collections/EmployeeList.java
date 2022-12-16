package com.automation.collections;

import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee employee1 = new Employee();
		employee1.setEmpId(1);
		employee1.setEmpname("enp name1");
		employee1.setEmpMobile(1234567890);
		list.add(employee1);
		
		Employee employee3 = new Employee();
		employee3.setEmpId(3);
		employee3.setEmpname("enp name3");
		employee3.setEmpMobile(1234567890);
		list.add(employee3);
		
		Employee employee2 = new Employee();
		employee2.setEmpId(2);
		employee2.setEmpname("enp name2");
		employee2.setEmpMobile(1234567890);
		list.add(employee2);
		
		for(Employee emp: list) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpname());
			System.out.println(emp.getEmpMobile());
			
			System.out.println("##############################################");
		}
	}

}
