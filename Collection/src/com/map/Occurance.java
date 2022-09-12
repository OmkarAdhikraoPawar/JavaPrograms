package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance {
	public void createMap(HashMap<String,String> m)
	{
		HashMap<String , Integer> m1 = new HashMap<>();
		Set<Entry<String,String>> entry = m.entrySet();
		Iterator<Entry<String,String>> itr = entry.iterator();
		while(itr.hasNext())
		{
			Entry<String,String> e = itr.next();
			Integer val = m1.getOrDefault(e.getValue(), 0);
			m1.put(e.getValue(), val+1);
		}
		System.out.println(m1);
	}
	

	public static void main(String[] args) {
		HashMap<String,String> m = new HashMap<>();
		m.put("Mr. abc", "BJP");
		m.put("Mr. xyz", "NCP");
		m.put("Mr. ccc", "BJP");
		m.put("Mr. lll", "Shivsena");
		System.out.println(m);
		
		
		Occurance obj = new Occurance();
		obj.createMap(m);
		
	

	}

}
