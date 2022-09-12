package com.set;

import java.util.ArrayList;
import java.util.HashSet;

class Student
{
	int id,phy,chem;
	String name;
	Student(){}
	Student(int i,String n,int p,int c)
	{
		id = i;
		name = n;
		phy = p;
		chem = c;
	}
	public String toString()
	{
		return "\nStuden Id : "+id+"\nStudent Name : "+name+"\nMarks in Physics : "+phy+"\nMarks in Chemistry : "+chem;
	}
   public boolean equals(Student o)
   {
	   if(this == o)
	   {
		   return true;
		   
	   }
	   if(o == null)
	   {
		   return true;
	   }
	return false;
	   
   }
}
public class StudentInfo {
	ArrayList<Student> al1;
	ArrayList<Student> al2;
	StudentInfo()
	{
		al1 = new ArrayList<>();
		al2 = new ArrayList<>();
	}
	public void createArrayList()
	{
		al1.add(new Student(1,"Ram",70,0));
		al1.add(new Student(2,"Amol",85,0));
		al1.add(new Student(3,"Suraj",77,0));
		
		al2.add(new Student(1,"Ram",0,80));
		al2.add(new Student(2,"Amol",0,66));
		al2.add(new Student(3,"Suraj",0,76));
	}
	public void createHashSet()
	{
		HashSet <Student> h = new HashSet<>(al1);		
		h.addAll(al2);
		for(Student s: h)
		{
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		StudentInfo obj = new StudentInfo();
		obj.createArrayList();
		obj.createHashSet();

	}

}
