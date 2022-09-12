package com.containmentAssignment;

public class Institute {
	private int id;
	private String name;
	private Branch bobj;
	
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
	public Branch getbranch()
	{
		return bobj;
	}
	public void setbranch(Branch b)
	{
		bobj = b;
	}
	public String toString()
    {
		  return "\nInstitute Id: "+id+"\nInstitute Name: "+name+" "+bobj ;
    }

}
