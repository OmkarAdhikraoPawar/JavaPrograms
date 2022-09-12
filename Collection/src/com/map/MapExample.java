package com.map;
//Q2. WAP to add elements to a HashMap without using generics (i.e. do not
//use <>) and print content of it. Use Integer as Key and String as Value. In
//second HashMap add elements of String type as Key and Integer as
//Value.
//Q3 WAP to add elements to a HashMap using generics with Integer as Key
//and String as value. And 4 key-value entries.

import java.util.HashMap;

public class MapExample {
	public void addElement()
	{
		//HashMap h = new HashMap();//HashMap without using generics
		HashMap <Integer,String> h = new HashMap<>();//HashMap using generics
		System.out.println(h);
		h.put(1, "I");
		h.put(2, "Like");
		h.put(3, "JAVA");
		h.put(4, "PROGRAMMING");
		System.out.println("After adding Elements : "+h);
	}
	public void addElement1()
	{
		//HashMap  h = new HashMap();//HashMap without using generics
		HashMap <String,Integer> h = new HashMap<>();//HashMap using generics
		System.out.println(h);
		h.put("I", 1);
		h.put("Like", 2);
		h.put("JAVA", 3);
		h.put("PROGRAMMING", 4);
		System.out.println("After adding Elements : "+h);
	}
	

	public static void main(String[] args) {
		MapExample obj = new MapExample();
		obj.addElement();
		obj.addElement1();
	}

}
