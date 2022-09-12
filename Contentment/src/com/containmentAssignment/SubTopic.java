package com.containmentAssignment;

public class SubTopic {
	private int id;
	private String name;
	private Question qobj;
	
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
	public Question getQuestion()
	{
		return qobj;
	}
	public void setQuestion(Question q)
	{
		qobj = q;
	}
	public String toString()
    {
		  return "\nSubTopic Id: "+id+"\nSubTopic Name: "+name+" "+qobj ;
    }

}
