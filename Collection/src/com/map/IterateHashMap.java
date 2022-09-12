package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class IterateHashMap {
	//Q6 WAP to get only the Keys from a HashMap.
	public void iterateHashMap()
	{
		HashMap <String,Integer> hp = new HashMap<String, Integer>();
		hp.put("a", 1);
		hp.put("ab", 2);
		hp.put("abc", 3);
		hp.put("abcd", 4);
		System.out.println(hp);
				
		Set<String> keys = hp.keySet();
        for ( String key : keys )
        {
            System.out.println( key );
        }
		
	}
	//7. WAP to get only the Values from a HashMap.
	public void iterateHashMap2()
	{
		HashMap <Integer,String> hp = new HashMap<>();
		hp.put(1,"a");
		hp.put(2,"ab");
		hp.put(3,"abc");
		hp.put(4,"abcd");
		hp.put(5,"aaf");
		hp.put(6,"arehb");
		hp.put(7,"abaerhc");
		hp.put(8,"abhsthcd");
		hp.put(9,"hua");
		hp.put(10,"aj5b");
		hp.put(11,"abytjtc");
		hp.put(12,"abtucd");
		hp.put(13,"nya");
		hp.put(14,"auyb");
		hp.put(15,"abfc");
		hp.put(16,"abced");
		System.out.println(hp);	
		Set<Integer> val = hp.keySet();
        for ( Integer v : val )
        {
            System.out.println( v );
        }
		
	}
	
	public static void main(String[] args) {
		IterateHashMap obj = new IterateHashMap();
		obj.iterateHashMap();
		obj.iterateHashMap2();
		

	}

}
