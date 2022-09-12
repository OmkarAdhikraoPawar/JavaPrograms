package com.containmentAssignment3;

public class Address {
	String city, state, country;
	
	Address(){}
	
	Address(String c, String s, String co)
	{
		city = c;
		state = s;
		country = co;
	}
	public String toString()
	{
		return "\nCity : "+city+"\nState : "+state+"\nCountry : "+country;
	}
	

}
