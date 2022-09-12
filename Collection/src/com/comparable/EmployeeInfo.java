package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeInfo {
	public void ascendingOrder(ArrayList<Employee> e)
	{
		System.out.println("Ascending Order : ");
		Collections.sort(e);		
		System.out.println(e);
	}
	public void descendingOrder(ArrayList<Employee> e)
	{
		System.out.println("Descending Order : ");
		Collections.sort(e);		
		System.out.println(e);
	}
	

	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<>();
		e.add(new Employee(101,"Suraj","President",35));
		e.add(new Employee(99,"Akash","Chairperson",40));
		e.add(new Employee(485,"Amar","CEO",33));
		e.add(new Employee(100,"Rushi","executive director",45));
		System.out.println(e);
		System.out.println("______________________________________________________");
		
		EmployeeInfo obj = new EmployeeInfo();
		//obj.ascendingOrder(e);
		obj.descendingOrder(e);
		

	}

}
