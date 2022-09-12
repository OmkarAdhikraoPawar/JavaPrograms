package com.set;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee 
{
	int id,sal;
	String name,dept;
	Employee(){}
	Employee(int id,String name,int sal,String dept)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	public String toString()
	{
		return "\nId : "+id+"\nName : "+name+"\nSalary : "+sal+"\nDepartMent : "+dept;
	}
	
	/*public int compareTo(Employee o)
	{
		
		return 0;
	}*/
}
class SortById implements Comparator<Employee>
{
	public int compare(Employee o1, Employee o2)
	{	
		return o1.dept.compareTo(o2.dept);
	}
	
}
public class EmployeeInfo {
	TreeSet<Employee> al;
	EmployeeInfo()
	{
		al = new TreeSet<>(Collections.reverseOrder(new SortById()));
	}
	public void createList()
	{
		al.add(new Employee(1,"Suraj",20000,"Services"));
		al.add(new Employee(2,"Amol",10000,"Support"));
		al.add(new Employee(3,"Ram",50000,"Development"));
		al.add(new Employee(4,"Akash",25000,"Testing"));
		al.add(new Employee(5,"Rushi",25000,"Sales"));
		System.out.println(al);
	}
	public void showDept()
	{
		System.out.println("Departments : ");
		Iterator<Employee> itr = al.iterator();
		while(itr.hasNext())
		{
			Employee e = itr.next();
			System.out.println(e.dept);
		}
	}

	public static void main(String[] args) {
		EmployeeInfo obj = new EmployeeInfo();
		obj.createList();
		System.out.println();
		//obj.showDept();
		

	}

}
