package com.comparator;

import java.util.Comparator;


public class Customer  {
	
		int id,age;
		String name;
		Customer(){}
		Customer(int i, String n, int g)
		{
			id = i;
			name = n;
			age = g;
		}
		public String toString()
		{
			return "Customer id : "+id+"\nName : "+name+"\nAge :"+age;
			
		}
		
		
}
class SortByName implements Comparator<Customer>
{

	public int compare(Customer o1, Customer o2) 
	{		
		return o1.name.compareTo(o2.name);
	}
	
}
class SortByAge implements Comparator<Customer>
{

	public int compare(Customer o1, Customer o2) 
	{		
		return o1.age-o2.age;
	}
	
}
class SortById implements Comparator<Customer>
{

	public int compare(Customer o1, Customer o2) 
	{		
		return o1.id-o2.id;
	}
	
}

