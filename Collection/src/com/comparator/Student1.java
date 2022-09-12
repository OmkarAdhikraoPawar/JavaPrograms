package com.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student1 {
	public void sort(ArrayList <Student> ll)
	{
		System.out.println("__________________________________");
		System.out.println("Sorting by Name: ");
		Collections.sort(ll,new ShotByName1());
		System.out.println(ll);
		System.out.println("__________________________________");
		System.out.println("Sorting by Age: ");
		Collections.sort(ll,new ShotByAge1());
		System.out.println(ll);
		System.out.println("__________________________________");
		System.out.println("Sorting by Id: ");
		Collections.sort(ll,new ShotByRollNo1());
		System.out.println(ll);
	}
	public void occurance(ArrayList <Student> ll)
	{
		System.out.println("Occurance : ");
		for(int i=0; i<ll.size(); i++)
		{
			if(ll.get(i) == null)
				continue;
			int cnt = 1;
			for(int j=i+1; j<ll.size(); j++)
			{
				if(ll.get(i).equals(ll.get(j)))
				{
					cnt++;
					ll.set(j, null);
				}
			}
			System.out.println(ll.get(i)+"\nOccurs at "+cnt+" Times ");
		}	
	}
	

	public static void main(String[] args) {
		ArrayList <Student> ll = new ArrayList<>();
		ll.add(new Student(1,"Suraj",22));
		ll.add(new Student(3,"Amar",19));
		ll.add(new Student(2,"Sohan",22));
		ll.add(new Student(5,"Rushi",21));
		ll.add(new Student(1,"Suraj",22));
		System.out.println(ll);
		System.out.println("________________________________________");
		
		Student1 s = new Student1();
		s.sort(ll);
		s.occurance(ll);

	}

}
