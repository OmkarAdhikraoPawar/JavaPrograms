package com.LinkedList;

import java.util.LinkedList;

public class ElementPositions {
	public void positions(LinkedList<String> ll)
	{
		 for(int i=0; i<ll.size(); i++)
		 {
		      System.out.println("Element at index "+i+": "+ll.get(i));
		 } 
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();   
		ll.add("Monday");
		ll.add("Tuesday");
		ll.add("Wenesday");
		ll.add("Thursday");
		ll.add("Friday");
		ll.add("Saturday");
		ll.add("Sunday");
		
	    System.out.println("The linked list: " + ll);
	    
	    ElementPositions obj = new ElementPositions();
	    obj.positions(ll);

	}

}
