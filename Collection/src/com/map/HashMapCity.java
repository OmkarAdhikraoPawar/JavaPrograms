package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapCity {
	public void occurance(HashMap <String,Integer> hm, ArrayList<String> al)
	{
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			String o = itr.next();
			if(hm.containsKey(o))
			{
				int val = hm.get(o);
				hm.put(o, val+1);
			}
			else
			{
				hm.put(o, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nashik");
		al.add("Mumbai");
		HashMap <String,Integer> hm = new HashMap <String,Integer>();
		
		
		HashMapCity obj = new HashMapCity();
		obj.occurance(hm, al);
		

	}

}
