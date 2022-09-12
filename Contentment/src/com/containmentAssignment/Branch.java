package com.containmentAssignment;

public class Branch {
	private int id;
	private String name;
	private Subject suobj;
	
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
	public Subject getsubject()
	{
		return suobj;
	}
	public void setsubject(Subject su)
	{
		suobj = su;
	}
	public String toString()
    {
		  return "\nBranch Id: "+id+"\nBranch Name: "+name+" "+suobj ;
    }


}
