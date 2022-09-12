package com.treeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

class Employee implements Comparable<Employee>
{
	int eId;
	String name;
	Employee(){}
	Employee(int id,String n)
	{
		eId = id;
		name = n;
	}
	public String toString()
	{
		return "\nEmployee Id : "+eId+"\nEmployee Name : "+name;
	}
	
	//Q35. Create a class Employee which implements comparable in ascending order. WAP to create a
	//TreeMap to store the Employee and stores objects in a TreeMap in descending order
	public int compareTo(Employee o) 
	{	
		return this.eId-o.eId;
	}
}
class SortByEmpId implements Comparator <Employee>
{

	public int compare(Employee o1, Employee o2)
	{
		return o2.eId-o1.eId;
	}
	}

public class EmployeeInfo {
	TreeMap<Employee,Integer> tr;
	EmployeeInfo()
	{
		//tr = new TreeMap<Employee,Integer>(Collections.reverseOrder());
		tr = new TreeMap<Employee,Integer>(Collections.reverseOrder(new SortByEmpId()));
	}
	public void createEmployee()
	{
		tr.put(new Employee(1001,"Mr.Rushi Khabale "), 101);
		tr.put(new Employee(1003,"Mr.Kiran Varekar "), 103);
		tr.put(new Employee(1005,"Mr.Omkar Deshmukh "), 104);
		tr.put(new Employee(1002,"Mr.Akash Padale "), 102);
		tr.put(new Employee(1004,"Mr.Ram Pawar "), 105);
		System.out.println(tr);
		
	}

	public static void main(String[] args) {
		EmployeeInfo obj = new EmployeeInfo();
		obj.createEmployee();

	}

}
