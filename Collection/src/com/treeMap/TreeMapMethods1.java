package com.treeMap;

import java.util.TreeMap;

public class TreeMapMethods1 {
	
	//Q12 WAP to get a key-value mapping associated with the greatest key less than or equal to the given key.
	public void floorEntry(TreeMap<Integer,String> tree_map1)
	{
		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
	    System.out.println("Value is: " + tree_map1.floorEntry(10));
		System.out.println("Checking the entry for 30: ");
		System.out.println("Value is: " + tree_map1.floorEntry(30));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Value is: " + tree_map1.floorEntry(70));
	}
	//Q13 WAP to get the greatest key less than or equal to the given key
	public void floorKay(TreeMap<Integer,String> tree_map1)
	{
		
		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key is: " + tree_map1.floorKey(10));
		System.out.println("Checking the entry for 30: ");
		System.out.println("Key is: " + tree_map1.floorKey(30));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key is: " + tree_map1.floorKey(70));
	}

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tree_map1 = new TreeMap<>();
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");

		TreeMapMethods1 obj = new TreeMapMethods1();
		obj.floorKay(tree_map1);
		System.out.println();
		obj.floorEntry(tree_map1);

	}

}
