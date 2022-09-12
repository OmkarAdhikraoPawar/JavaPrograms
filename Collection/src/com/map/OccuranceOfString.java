package com.map;

import java.util.HashMap;
public class OccuranceOfString
{
	public void display(String str)
	{
		
		HashMap<Character,Integer>s=new HashMap<>();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(s.containsKey(str.charAt(i)))
			
			{
				int cnt=s.get(str.charAt(i));
				s.put(str.charAt(i), ++cnt);
			}
			else
				s.put(str.charAt(i), 1);
		}	
	
	System.out.println(s);
	}
	public void occurance(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			Integer val = map.getOrDefault(str.charAt(i), 0);
			map.put(str.charAt(i), val+1);
		}
	
		System.out.println(map);
	}

	public static void main(String[] args)
	{
		String str="GooGle";
		OccuranceOfString obj=new OccuranceOfString();
		obj.display(str);
		obj.occurance(str);
	}

}