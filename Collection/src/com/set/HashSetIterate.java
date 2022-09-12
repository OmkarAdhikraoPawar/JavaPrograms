package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterate {
	public void usingIterator(HashSet<Integer> s)
	{
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(24);
		s.add(11);
		s.add(26);
		s.add(27);
		
		HashSetIterate obj = new HashSetIterate();
		obj.usingIterator(s);
		

	}

}
