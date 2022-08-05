package com.LinkedList;
//WAP to append the specified element to the end of a linked list
import java.util.LinkedList;

public class AppendElements {
	public void usingOffer(LinkedList<String> ll)
	{
		ll.offerFirst("Black");//Q7 WAP to insert the specified element at the front of a linked list.
		ll.offerLast("Pink");//Q8 WAP to insert the specified element at the end of a linked list
		System.out.println("Linked List :"+ll);
		
	}

	public static void main(String[] args) {		
		
	    LinkedList<String> ll = new LinkedList<String>();   
	    ll.add("Red");
	    ll.add("Green");
	    ll.add("White");    
	    ll.add("Yellow");
	
	   System.out.println("The linked list: " + ll);
	   
	   AppendElements obj = new AppendElements();
	   obj.usingOffer(ll);

	}

}
