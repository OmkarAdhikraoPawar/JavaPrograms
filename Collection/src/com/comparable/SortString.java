package com.comparable;
//Q1 WAP to sort the elements of List that contains String objects.Print ArrayList.Sort using
//Collections.sort(list) method. Print ArrayList.
import java.util.ArrayList;
import java.util.Collections;

public class SortString {
	public void sortList(ArrayList<String> list)
	{
		System.out.println("Before Sorting: "+ list);   		  
		Collections.sort(list);   
		System.out.println("After Sorting: "+ list);   
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();     
		list.add("Volkswagen");   
		list.add("Toyota");   
		list.add("Porsche");   
		list.add("Ferrari");   
		list.add("Mercedes-Benz");   
		list.add("Audi");   
		list.add("Rolls-Royce");  
		list.add("BMW");  
		
		SortString obj = new SortString();
		obj.sortList(list);

	}

}
