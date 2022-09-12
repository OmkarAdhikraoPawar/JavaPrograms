package com.treeMap;

import java.util.TreeMap;

public class OccuranceOfString {
	public void oocurance(String str)
	{
		TreeMap<Character,Integer> map = new TreeMap<>();
		for(int i=0;i<str.length();i++)
		{
			Integer val = map.getOrDefault(str.charAt(i), 0);
			map.put(str.charAt(i), val+1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String str = "I Love Java Programming ";
		
		OccuranceOfString obj = new OccuranceOfString();
		obj.oocurance(str);
	}

}
