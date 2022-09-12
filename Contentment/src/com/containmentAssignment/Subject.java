package com.containmentAssignment;

public class Subject {
	private int id;
	private String name;
	private Topic tobj;
	
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
	public Topic gettopic()
	{
		return tobj;
	}
	public void setTopic(Topic t)
	{
		tobj = t;
	}
	public String toString()
    {
		  return "\nSubject Id: "+id+"\nSubject Name: "+name+" "+tobj ;
    }

}
