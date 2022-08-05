package com.LinkedList;
//Q3WAP to iterate through all elements in a linked list.
//Q4WAP to iterate through all elements in a linked list starting at the specified position.
import java.util.Iterator;
import java.util.LinkedList;

public class UsingIterator {
	public void elements(LinkedList<String> ll)
	{
		 Iterator p = ll.listIterator(1);//  set Iterator at specified index
		 while (p.hasNext()) 
		 {			 
		      System.out.println(p.next());
		 } 
		 
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();   
	    ll.add("Red");
	    ll.add("Green");
	    ll.add("Black");
	    ll.add("White");
	    ll.add("Pink");
	    ll.add("Yellow");	
	   System.out.println("The linked list: " + ll);
	   
	   UsingIterator obj = new UsingIterator();
	   obj.elements(ll);

	}

}
