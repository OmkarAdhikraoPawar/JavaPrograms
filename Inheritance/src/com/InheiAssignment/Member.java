package com.InheiAssignment;

public class Member {
	int mId,mAge,noOfMatchesPlayed;
	String mName;
	Member(){}
	Member(int id,int age, int no,String name)
	{
		mId = id;
		mName = name;
		mAge = age;
		noOfMatchesPlayed = no;		
	}
	public String toString()
	{
		return "Member Id : "+mId+"\nMember Name : "+mName+"\nMember Age : "+mAge+"\nNo. of Matches Played : "+noOfMatchesPlayed;
	}
}
