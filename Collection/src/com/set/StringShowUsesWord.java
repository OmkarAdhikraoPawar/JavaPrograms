package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class StringShowUsesWord {
	public void wordUse(String str)
    {
		String s[]=str.split(" ");
	    HashSet<String> set = new HashSet<>();
	    for(int i=0;i<s.length;i++) 
	    {
	    	 set.add(s[i]);
	    }
	    Iterator<String> itr1 = set.iterator();
	    while(itr1.hasNext())
	    {
	    	 System.out.println(itr1.next());
	    }
	}
	public static void main(String[] args) {
		String str = "It is very cloudy. It is raining heavily.";
		
		StringShowUsesWord obj = new StringShowUsesWord();
		obj.wordUse(str);

	}

}
