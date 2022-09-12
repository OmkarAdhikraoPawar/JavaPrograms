package com.containmentAssignment;

public class Question {
	private int id;
	private String name;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id1)
	{
		id = id1;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	public String toString()
    {
		  return "\nQuestion Id: "+id+"\nQusetion Name: "+name ;
    }

}
