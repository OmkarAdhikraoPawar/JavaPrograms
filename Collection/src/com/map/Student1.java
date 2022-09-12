package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Student1 {
	HashMap<Integer,Float> mp = new HashMap<>();
	public void prapare()
	{
		mp.put(30, 56.06f);
		mp.put(34, 60.07f);
		mp.put(35, 32.08f);
		mp.put(39, 45.08f);
		
		Set<Integer> set = mp.keySet();
		System.out.println(mp);
		
		System.out.println("Set of Keys "+set);
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
		{
			Integer key = itr.next();
			System.out.println(key+" = "+mp.get(key));
		}
		
		
	}
	
	public static void main(String[] args) {
		Student1 o = new Student1();
		o.prapare();
		
	}

}
