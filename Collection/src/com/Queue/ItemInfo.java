package com.Queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

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
class SortByCost implements Comparator<Item>
{

	public int compare(Item o1, Item o2)
	{
		return o1.cost-o2.cost;
	}
	
}
public class ItemInfo {
	PriorityQueue<Item> pq;
	ItemInfo()
	{
		pq = new PriorityQueue<>(Collections.reverseOrder(new SortByCost()));
	}
	public void createPriorityQueue()
	{
		pq.add(new Item(1,"Mobile",20000));
		pq.add(new Item(3,"Computer",15000));
		pq.add(new Item(2,"Laptop",33000));
		pq.add(new Item(4,"HeadPhones",3000));
		System.out.println(pq);
	} 

	public static void main(String[] args) {
		ItemInfo obj = new ItemInfo();
		obj.createPriorityQueue();

	}

}
