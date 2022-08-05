package com.LinkedList;
//Q4 WAP to iterate a linked list in reverse order.
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseOrder {
	public void reverseString(LinkedList<String> ll)
	{
		Iterator it = ll.descendingIterator();
	    System.out.println("Elements in Reverse Order:");
	    while (it.hasNext())
	    {
	        System.out.println(it.next());
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
	    
	    ReverseOrder obj = new ReverseOrder();
	    obj.reverseString(ll);

	}

}
