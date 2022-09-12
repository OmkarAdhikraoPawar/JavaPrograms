package com.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
//Q6WAP to create a LinkedHashMap. Add 3 objects in it.
//a. WAP to search a value in the Map.
//b. WAP to get all keys in the Map.
//c. WAP to remove an element from the Map

public class SearchValueGetAllKeysRemoveElement {
	
	public void searchValue(LinkedHashMap<Integer, String> l)
	{
		System.out.println("LinkedHashMap is : "+l);
		if(l.containsValue("Earth"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
	public void getAllKeys(LinkedHashMap<Integer, String> l)
	{
		System.out.println("LinkedHashMap is : "+l);
		for(Map.Entry<Integer, String>  in : l.entrySet())
		{
			System.out.println(in.getKey());
		}
	}
	public void removeElement(LinkedHashMap<Integer, String> l)
	{
		System.out.println("Original LinkedHashMap is : "+l);
		l.remove(4);
		System.out.println("Updated LinkedHashMap : "+l);
	}

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();
	    l.put(1, "Mars");
	    l.put(2, "Earth");
	    l.put(3, "Jupiter");
	    l.put(4, "Saturn");
	    l.put(5, "Venus");
	    
	    SearchValueGetAllKeysRemoveElement obj = new SearchValueGetAllKeysRemoveElement();
	    obj.searchValue(l);
	    System.out.println();
	    obj.getAllKeys(l);
	    System.out.println();
	    obj.removeElement(l);

	}

}
