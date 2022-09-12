package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Iterating {
	public void iteratingByEnteries(HashMap <Integer,String> hp)
	{
		Set<Entry<Integer,String>> es = hp.entrySet();
		Iterator<Entry<Integer,String>> itr = es.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> entry = itr.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}
	
	//Q9 WAP to test a HashMap is empty or not
	public void emptyOrNot(HashMap <Integer,String> hp)
	{
		System.out.println("Hash Map is Empty or Not? "+hp.isEmpty());
	}

	public static void main(String[] args) {
		HashMap <Integer,String> hp = new HashMap<>();
		hp.put(1,"a");
		hp.put(2,"ab");
		hp.put(3,"abc");
		hp.put(4,"abcd");
		System.out.println(hp);	
		
		Iterating obj = new Iterating();
		obj.iteratingByEnteries(hp);
		System.out.println("____________________________________");
		obj.emptyOrNot(hp);

	}

}
