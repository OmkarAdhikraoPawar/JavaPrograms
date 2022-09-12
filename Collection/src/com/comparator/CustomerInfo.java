package com.comparator;


import java.util.ArrayList;
import java.util.Collections;

public class CustomerInfo {
	ArrayList<Customer>l;
	public  CustomerInfo()
	{
		l = new ArrayList<Customer>();
	}
	public void createCustomerList()
	{
		Customer c1 = new Customer(4,"Aman",22);
		l.add(new Customer(1,"Suraj",25));
		l.add(new Customer(2,"Ram",23));
		l.add(new Customer(3,"Sham",24));
		//System.out.println(l);
		System.out.println("__________________________________");
		System.out.println("Sorting by Name: ");
		Collections.sort(l,new SortByName());
		System.out.println(l);
		System.out.println("__________________________________");
		System.out.println("Sorting by Age: ");
		Collections.sort(l,new SortByAge());
		System.out.println(l);
		System.out.println("__________________________________");
		System.out.println("Sorting by Id: ");
		Collections.sort(l,new SortById());
		System.out.println(l);
		
		System.out.println("__________________________________");
		System.out.println("Sorting by Id In Opposite way : ");
		Collections.sort(l, Collections.reverseOrder(new SortById()));
		System.out.println(l);
		
	}	
	public void opposite()
	{
	}

	public static void main(String[] args) {
		CustomerInfo obj = new CustomerInfo();
		obj.createCustomerList();
		//obj.opposite();
		
		

	}

}
