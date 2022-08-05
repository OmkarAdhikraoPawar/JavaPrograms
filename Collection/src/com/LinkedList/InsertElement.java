package com.LinkedList;
//Q5 WAP to insert the specified element at the specified position in the linked list
import java.util.LinkedList;

public class InsertElement {
	//Q6 WAP to insert elements into the linked list at the first and last position.
	public void addElements(LinkedList <Integer> l)
	{
		l.addFirst(1);
		l.addLast(88);
		System.out.println("Using AddFirst And AddLast Method : "+l);
	}
	//Q10 WAP to get the first and last occurrence of the specified elements in a linked list.
	public void firstLastOccurance(LinkedList<Integer>l)
	{
		
		Object first = l.getFirst();
		System.out.println("First Element is: "+first);		 
		Object last = l.getLast();
		System.out.println("Last Element is: "+last);
	}

	public static void main(String[] args) {
		LinkedList <Integer> l = new LinkedList();
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(44);
		l.add(55);
		
		System.out.println("Original Linked List :"+l);
		
		l.add(2, 66);//insert element in 2 index
		System.out.println("Linked List : "+l);
		System.out.println("___________________________________________");
		//Q9 WAP to insert some elements at the specified position into a linked list
		LinkedList <Integer> ll = new LinkedList();
		ll.add(37);
		ll.add(56);
		l.addAll(1, ll);
	    System.out.println("LinkedList:" + l);
	    
	    System.out.println("___________________________________________");
		
		InsertElement obj = new InsertElement();
		obj.addElements(l);
		System.out.println("___________________________________________");
		obj.firstLastOccurance(l);

	}

}
