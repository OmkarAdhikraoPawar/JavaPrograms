package com.map;

//Q4. WAP to create a map using Wrapper class as key and value same as keys’ data type WAP to 
//count the number of key-value (size) mappings in a map.

import java.util.HashMap;

public class SizeOfMap 
{
	HashMap <Integer , String> m;
	
	SizeOfMap()
	{	
		m = new HashMap <Integer , String>();
	}
	
	public void sizeOfMap()
	{
		m.put(1, "Red");
		m.put(2, "Green");
		m.put(3, "Black");
		m.put(4, "White");
		m.put(5, "Blue");
		m.put(6, "Orange");
		
		System.out.println(" Map is = "+m);
		System.out.println("\nSize of Map is = "+m.size());
	}
	public static void main(String[] args)
	{
		SizeOfMap obj = new SizeOfMap();
		obj.sizeOfMap();
	}
}