package com.treeMap;
//Q8WAP to sort keys in TreeMap by using comparator
import java.util.Comparator;
import java.util.TreeMap;

public class SortUsingComprator {
	

	public static void main(String[] args) {
		TreeMap <String,String> t = new TreeMap<>();
		
		t.put("Sohan", "Pawar");
		t.put("Akash", "Padale");
		t.put("Siddesh", "Bodhe");
		t.put("Krushnaraj", "Pawar");
		t.put("Rushi", "Khable");
		
		System.out.println(t);

	}

}
class Sorting implements Comparator<String>
{
	public int compare(String o1, String o2)
	{		
		return o1.compareTo(o2);
	}
	
}
