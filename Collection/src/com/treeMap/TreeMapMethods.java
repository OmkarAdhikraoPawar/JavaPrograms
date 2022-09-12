package com.treeMap;

import java.util.TreeMap;

public class TreeMapMethods {
	//Q9 WAP to create a TreeMap with Integer as key and get a key-value mapping associated with
	//the greatest key and the least key in a map
	public void greatestAndLeastKey(TreeMap <String,Integer> tr)
	{
		System.out.println("Orginal TreeMap content: " + tr);
		System.out.println("Greatest key: " + tr.firstEntry());
		System.out.println("Least key: " + tr.lastEntry());
	}
	//Q10 WAP to get the first (lowest) key and the last (highest) key currently in a TreeMap.
	public void lowestAndHighest(TreeMap <String,Integer> tr)
	{
		System.out.println("Orginal TreeMap content: " + tr);
		System.out.println("Greatest key: " + tr.firstKey());
		System.out.println("Least key: " + tr.lastKey());
	}
	//Q11 WAP to get a reverse order view of the keys contained in a given map TreeMap
	public void reverseTreeMap(TreeMap <String,Integer> tr)
	{
		System.out.println("Reverse TreeMap : "+tr.descendingKeySet());
	}

	public static void main(String[] args) {
		TreeMap <String,Integer> tr = new TreeMap<>();
		tr.put("C", 3);
		tr.put("C++", 2);
		tr.put("Java", 1);
		tr.put("Python", 5);
		tr.put("SQL", 4);
		
		TreeMapMethods obj = new TreeMapMethods();
		obj.greatestAndLeastKey(tr);
		System.out.println();
		obj.lowestAndHighest(tr);
		System.out.println();
		obj.reverseTreeMap(tr);

	}

}
