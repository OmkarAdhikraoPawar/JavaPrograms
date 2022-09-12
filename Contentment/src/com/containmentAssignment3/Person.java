package com.containmentAssignment3;

public class Person {
	String name, gender;
	int age;
	Address aObj;
	
	Person(String n, String g, int a, Address ao)
	{
		name = n;
		gender = g;
		age = a;
		aObj = ao;
	}
	public String toString()
	{
		return "\nName : "+name+"\nGender : "+gender+"\nAge : "+age+"\nAddress : "+aObj;
	}
	

	public static void main(String[] args) {
		Address ad = new Address("Satara","Maharashtra","India");
		Person p = new Person("Suraj","Male",25,ad);
		System.out.println(p);
		
		

	}

}
