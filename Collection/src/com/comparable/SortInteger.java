package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortInteger {
	public void show(ArrayList<Integer> al)
	{
		System.out.println("After Sorting : ");
		Collections.sort(al);
		System.out.println(al);
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(234);
		al.add(347);
		al.add(544);
		al.add(111);
		al.add(557);
		al.add(784);
		System.out.println(al);
		
		SortInteger obj = new SortInteger();
		obj.show(al);
		

	}

}
