package com.dynamicPolymorphism;

public class Student {
	int id ;
	String name; 
	Student(){}
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return "Student Id : "+id+"\nStudent Name : "+name;
	}
	class Exam extends Student
	{
		Exam(int id,String name)
		{
			this.id = id;
			this.name = name;
		}
		public String toString()
		{
			return "Student Id : "+id+"\nStudent Name : "+name;
		}
	}
	

	public static void main(String[] args) {
		Student s1 = new Student(101,"Ram");
		//Student s2 = new Student(102,"Sham");
		Student s2 = s1;
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		

	}

}
