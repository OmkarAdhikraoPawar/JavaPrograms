package com.comparator;

import java.util.Collections;
import java.util.LinkedList;

public class FloatLinkedList {
    LinkedList<Float> l;
	
	public FloatLinkedList()
	{
		l = new LinkedList <> ();
		System.out.println("Initiallay LinkedList = "+l);
	}
	
	public void prepareList()
	{
		l.add(12.2f);
		l.add(26.6f);
		l.add(44.6f);
		l.add(22.4f);
		l.add(32.4f);
		l.add(38.5f);
		System.out.println("\nElements in LinkedList is : ");
		System.out.println(l);
		
		System.out.println("\nSorting in Assending Order : ");
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println("\nSorting in descending Order : ");
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		FloatLinkedList obj = new FloatLinkedList();
		obj.prepareList();

	}

}
