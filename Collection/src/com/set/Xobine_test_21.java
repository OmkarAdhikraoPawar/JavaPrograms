
package com.set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Xobine_test_21 {
	public void avoidDublication(String str) {
		LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
		
		String []s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			String st = s[i];
			if(map.containsKey(st)) {
				Integer val = map.get(st);
				map.put(st, val+1);
			}
			else {
				map.put(st, 1);
			}
		}
		Set<Map.Entry<String,Integer>> ent = map.entrySet();
		Iterator<Map.Entry<String,Integer>> itr = ent.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Integer> rr = itr.next();
			if(rr.getValue()>1)
			{
				
				System.out.print(rr.getKey()+" ");
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plse eneter a string");
		
		String str = sc.nextLine();
		Xobine_test_21 obj = new Xobine_test_21();
		obj.avoidDublication(str);
		
		
     
	}

}
