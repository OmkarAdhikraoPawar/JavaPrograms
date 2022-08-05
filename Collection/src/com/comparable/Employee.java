package com.comparable;

public class Employee implements Comparable<Employee> {
	String name, designation;
	int id, age;
	
	Employee(){}
	Employee(int i, String n, String d, int a)
	{
		id = i;
		name = n;
		designation = d;
		age = a;
	}
	public String toString()
	{
		return "\nEmployee Id : "+id+"\nEmployee Name :"+name+"\nDesignation : "+designation+"\nEmployee Age : "+age;
	}
	/*public int compareTo(Employee o)
	{
		if(this.id<o.id)			
		    return 1;
		else if(this.id>o.id)
			return -1;
		else
			return 0;
	}*/
	/*public int compareTo(Employee o)
	{
		if(this.id<o.id)			
		    return -1;
		else if(this.id>o.id)
			return 1;
		else
			return 0;
	}*/
	public int compareTo(Employee o)
	{
		if(this.id<o.id)			
		    return 1;
		else if(this.id>o.id)
			return -1;
		else
			return this.name.compareTo(o.name);
	}

	
}
