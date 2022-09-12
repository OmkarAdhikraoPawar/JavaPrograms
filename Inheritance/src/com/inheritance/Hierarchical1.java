package com.inheritance;
class Student
{
	int fee;
	public Student()
	{
		fee = 5000;
	}
	public Student(int x)
	{
		fee = x;
	}
	public void show()
	{
		System.out.println(fee);
	}
	
	
	public void option()
	{
		System.out.println("Select Course : ");
	}
}
class Art extends Student
{
	int sId = 1;
	String sName = "Ram";
	int c;
	public Art()
	{
		super(2000);
		c = 4000;
	}
	public void disp()
	{
		System.out.println(c);
		System.out.println(fee);
	}
}
class Commerce extends Student
{
	int sId = 101;
	String sName = "Suraj";
}
class Science extends Student
{
	int sId = 1001;
	String sName = "Rushikesh";
}

public class Hierarchical1 {

	public static void main(String[] args) {
		Art a = new Art();
		a.option();
		a.show();
		a.disp();
		System.out.println("Student Id : "+a.sId);
		System.out.println("Student Name : "+a.sName);
		System.out.println("===============================");
		
		Commerce c = new Commerce();
		c.option();
		System.out.println("Student Id : "+c.sId);
		System.out.println("Student Name : "+c.sName);
		System.out.println("===============================");
		
		Science s = new Science();
		s.option();
		System.out.println("Student Id : "+s.sId);
		System.out.println("Student Name : "+s.sName);
		

	}

}
