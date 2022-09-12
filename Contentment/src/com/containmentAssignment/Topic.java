package com.containmentAssignment;

public class Topic {
	private int id;
	private String name;
	private SubTopic sobj;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id1)
	{
		id = id1;
	}
	public SubTopic getsubtopic()
	{
		return sobj;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setsubTopic(SubTopic s)
	{
		sobj = s;
	}
	public String toString()
    {
		  return "\nTopic Id: "+id+"\nTopic Name: "+name+" "+sobj ;
    }


}
