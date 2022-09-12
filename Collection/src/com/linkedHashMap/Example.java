package com.linkedHashMap;

import java.util.LinkedHashMap;

public class Example {

	public static void main(String[] args) {
		//Q4 WAP to create a LinkedHashMap which contains Integers as key and Strings as value. Print
		//the map contents and observe the order. Use generics.
		LinkedHashMap <Integer,String> l = new LinkedHashMap<>();
		l.put(3, "aaa");
		l.put(2, "a");
		l.put(34, "abc");
		l.put(5, "xyz");
		System.out.println(l);
		
		System.out.println();
		
		//Q5 WAP to create a LinkedHashMap which contains Strings as key and Integers as value. Print
		//the map contents and observe the order. Use generics.
		LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
		lh.put("Pune", 3);
		lh.put("Mumbai", 5);
		lh.put("Kolhapur", 4);
		lh.put("Satara", 1);
		lh.put("Sangli", 2);
		System.out.println(lh);
		
		
	}

}
