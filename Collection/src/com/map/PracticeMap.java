package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PracticeMap {
	HashMap<String,Integer> mp = new HashMap<>();
	public void prapare()
	{
		mp.put("aaa", 56);
		mp.put("bbb", 60);
		mp.put("abcde", 32);
		mp.put("aaaaa", 78);
		System.out.println(mp);
				
	}
	public void navigation()
	{
		Set<String> set = mp.keySet();
	
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			if(key.length() == 5)
			{
				mp.put(key, mp.get(key)+5);
			}
			System.out.println(key+" = "+mp.get(key));
		}
		
	}
	

	public static void main(String[] args) {
		PracticeMap obj = new PracticeMap();
		obj.prapare();
		obj.navigation();

	}

}
