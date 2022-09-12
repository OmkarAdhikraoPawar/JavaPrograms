package com.treeMap;

import java.util.Set;
import java.util.TreeMap;

public class GetAllKeys {
	//Q5 WAP to get all keys from the given a TreeMap.
	public void showAllKeys(TreeMap <String,Integer> tr)
	{
		System.out.println(tr);
		Set <String> s = tr.keySet();
		for(String key : s)
		{
			System.out.println(key);
		}
	}
	//Q6 WAP to delete all elements from a given TreeMap.
	public void deleteAllElements(TreeMap <String,Integer> tr)
	{
		
		System.out.println("Orginal TreeMap content: "+tr);
		tr.clear();
		System.out.println("The New map: "+tr);
	}

	public static void main(String[] args) {
		TreeMap <String,Integer> tr = new TreeMap<>();
		tr.put("C", 1);
		tr.put("C++", 2);
		tr.put("Java", 3);
		tr.put("Python", 4);
		tr.put("SQL", 5);		
		
				
		GetAllKeys obj = new GetAllKeys();
		obj.showAllKeys(tr);
		System.out.println();
		obj.deleteAllElements(tr);
		

	}

}
