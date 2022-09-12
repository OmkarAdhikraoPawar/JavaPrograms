package com.dynamicPolymorphism;
public class Employee 
{
   int empId;
   String name;
   float salary;
   
   Employee()  {}
   Employee( int empId, String name, float salary )
   {
	  this.empId = empId;
	  this.name = name;
	  this.salary = salary;
   }
   double calculateSal( double amt)
   {
	  salary += amt;
	  return salary;
   }
   public String toString()
   {
	   return " Employee Id = "+empId+"\n Employee name = "+name+ "\n Employee Salary =  "+salary;
   }
}

class Hr extends Employee
{
	Hr()  {}
	  Hr( int empId, String name, float salary )
	   {
		  this.empId = empId;
		  this.name = name;
		  this.salary = salary;
	   }
	public double calculateSal( double amt)
	   {
		  salary += amt;
		  return salary;
		   
	   }
	
	  public String toString()
	   {
		   return " Hr Id = "+empId+"\n Hr name = "+name+ "\n Hr Salary =  "+salary;
	   }
}

class Manager extends Hr
{
	Manager()  {}
	Manager( int empId, String name, float salary )
	   {
		  this.empId = empId;
		  this.name = name;
		  this.salary = salary;
	   }
	public double calculateSal( double amt)
	   {
		  salary += amt;
		  return salary;
		   
	   }
	
	  public String toString()
	   {
		   return " Manager Id = "+empId+"\n Manager name = "+name+ "\n Manager Salary =  "+salary;
	   }
}


class Developer extends Employee
{
	Developer()  {}
	Developer( int empId, String name, float salary )
	   {
		  this.empId = empId;
		  this.name = name;
		  this.salary = salary;
	   }
	public double calculateSal( double amt)
	   {
		  salary += amt;
		  return salary;
		   
	   }
	
	  public String toString()
	   {
		   return " Developer Id = "+empId+"\n Developer name = "+name+ "\n Developer Salary =  "+salary;
	   }
}