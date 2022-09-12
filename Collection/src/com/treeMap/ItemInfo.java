package com.treeMap;


import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

class Item 
{
	int id,cost;
	String name;
	Item(){}
	Item(int i,String n,int c)
	{
		id = i;
		name = n;
		cost = c;
	}
	public String toString()
	{
		return "\nItem Id : "+id+"\nItem Name : "+name+"\nCost : "+cost;
	}
	
}
/*class SortByItemCost implements Comparator<Item>
{
	public int compare(Item o1, Item o2)
	{
		if(o1.cost<o2.cost)
			return -1;
		else if(o1.cost>o2.cost)
			return 1;
		else
		{
			return o1.name.compareTo(o2.name);
			
		}
	}
	
}*/
class SortById implements Comparator<Item>
{

	public int compare(Item o1, Item o2) {
		
		return o2.id-o1.id;
	}
	
}
class Supplyer
{
	int id;
	String name;
	Supplyer(){}
	Supplyer(int i,String n)
	{
		id = i;
		name = n;
	}
	public String toString()
	{
		return "\nSupplyer Id : "+id+"\nSupplyer Name : "+name;
	}
}
public class ItemInfo {
	public void show()
	{
		//TreeMap<Item,Supplyer> t = new TreeMap<>(new SortByItemCost());
		/*TreeMap<Item,Supplyer> t = new TreeMap<>(new SortById());
		t.put(new Item(1,"Laptop",30000),new Supplyer(101,"Suraj"));
		t.put(new Item(2,"Mobile",15000),new Supplyer(101,"Suraj"));
		t.put(new Item(3,"Smart Tv",30000),new Supplyer(101,"Suraj"));
		t.put(new Item(4,"Computer",20000),new Supplyer(101,"Suraj"));
		
		System.out.println(t);*/
		
		TreeMap<Item,Supplyer> tr = new TreeMap<>(Collections.reverseOrder(new SortById()));
		tr.put(new Item(1,"Laptop",30000),new Supplyer(101,"Suraj"));
		tr.put(new Item(2,"Mobile",15000),new Supplyer(101,"Suraj"));
		tr.put(new Item(3,"Smart Tv",30000),new Supplyer(101,"Suraj"));
		tr.put(new Item(4,"Computer",20000),new Supplyer(101,"Suraj"));
		System.out.println(tr);
	}
	

	public static void main(String[] args) {
		ItemInfo obj = new ItemInfo();
		obj.show();
		
		

	}

}
