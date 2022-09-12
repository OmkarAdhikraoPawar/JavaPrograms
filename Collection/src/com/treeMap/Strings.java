package com.treeMap;

import java.util.TreeMap;

public class Strings {
	//Q3 WAP to search a key in a TreeMap.
	public void searchKey(TreeMap <String,String> t)
	{
		if(t.containsKey("Rushi"))
		{
            System.out.println("The Tree Map contains key Rushi");
        } else
        {
            System.out.println("The Tree Map does not contain key Rushi");
        }
        if(t.containsKey("Ram"))
        {
            System.out.println("The Tree Map contains key Ram");
        } else 
        {
            System.out.println("The TreeMap does not contain key Ram");
        }
	}
	//Q4 WAP to search a value in a TreeMap
	public void searchValue(TreeMap <String,String> t)
	{
		if(t.containsValue("Bodhe"))
		{
            System.out.println("The Tree Map contains Value Bodhe");
        } else
        {
            System.out.println("The Tree Map does not contain Value Bodhe");
        }
        if(t.containsKey("Shinde"))
        {
            System.out.println("The Tree Map contains Value Shinde");
        } else 
        {
            System.out.println("The TreeMap does not contain Value Shinde");
        }
	}

	public static void main(String[] args) {
		//Q2 WAP to create a TreeMap which contains Strings
		
		TreeMap <String,String> t = new TreeMap<>();
		t.put("Suraj", "Pawar");
		t.put("Sohan", "Pawar");
		t.put("Siddesh", "Bodhe");
		t.put("Rushi", "Khable");
		t.put("Akash", "Padale");
		System.out.println(t);
		
		Strings obj = new Strings();
		obj.searchKey(t);
		System.out.println();
		obj.searchValue(t);

	}

}
