package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Item 
{
	int itemId, cost;
	String name;
	Item(){}
	Item (int id, String n, int c)
	{
		itemId = id;
		name = n;
		cost = c;
	}
	public String toString()
	{
		return "\nItem Id : "+itemId+"\nName : "+name+"\nCost : "+cost;
	}
}
class SortById2 implements Comparator<Item>
{

	public int compare(Item o1, Item o2) 
	{		
		return o2.itemId-o1.itemId;
	}
	
}
public class ItemInfo {
	public void displayList(ArrayList<Item> l)
	{
		
		System.out.println("__________________________________");
		System.out.println("Display List in Descending Order :");
		System.out.println("Sorting by Id: ");
		Collections.sort(l,new SortById2());
		System.out.println(l);
	}

	public static void main(String[] args) {
		ArrayList<Item> l = new ArrayList<Item>();
		l.add(new Item(2,"Mobile",10000));
		l.add(new Item(1,"Tablet",15000));
		l.add(new Item(4,"Laptop",30000));
		l.add(new Item(3,"LED TV",20000));
		
		ItemInfo obj = new ItemInfo();
		obj.displayList(l);

	}

}
