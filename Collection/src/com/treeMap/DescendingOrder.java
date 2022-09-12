package com.treeMap;

import java.util.Collections;

import java.util.TreeMap;

public class DescendingOrder {
	TreeMap <Integer,String> tr ;
	DescendingOrder()
	{
		tr = new TreeMap<Integer,String>(Collections.reverseOrder());
	}
	public void createMap()
	{
		tr.put(1,"C");
		tr.put(2,"C++");
		tr.put(3,"Java");
		tr.put(4,"Python");
		tr.put(5,"SQL");
		System.out.println(tr);
	}
	

	public static void main(String[] args) {
		DescendingOrder obj = new DescendingOrder();
		obj.createMap();
		

	}

}
