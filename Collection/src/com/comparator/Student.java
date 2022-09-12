package com.comparator;

import java.util.Comparator;

public class Student {
	int rollNo, age;
	String name;
	Student(){};
	Student(int no, String n, int a)
	{
		rollNo = no;
		name = n;
		age = a;
	}
	public String toString()
	{
		return "\nRoll No : "+rollNo+"\nName : "+name+"\nAge :"+age;
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj == null || this.getClass() != obj.getClass())
		{
			return false;
		}
		Student c=(Student)obj;
		return this.name.equals(c.name) && this.rollNo==(c.rollNo) && this.age==(c.age);
	}

}
class ShotByName1 implements Comparator<Student>
{
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
class ShotByAge1 implements Comparator<Student>
{
	public int compare(Student o1, Student o2) {
		return o1.age - o2.age;
	}
	
}
class ShotByRollNo1 implements Comparator<Student>
{
	public int compare(Student o1, Student o2) {
		return o1.rollNo - o2.rollNo;
	}
	
}
