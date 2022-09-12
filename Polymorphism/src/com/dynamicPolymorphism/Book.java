package com.dynamicPolymorphism;
class Kid
{
	protected void readBook()
	{
		System.out.println("Kid Read a Book");
	}
	protected void readBook(String n,String m)
	{	
		System.out.println("Two Books are "+n+"and "+m);
	}
	public static void book()
	{
		System.out.println("Books");
	}
}
class BigKid extends Kid
{
	protected void readBook()
	{
		super.readBook();
	}
	public static void book()
	{
		System.out.println("Books");
	}
}

public class Book {

	public static void main(String[] args) {
		//BigKid obj = new Kid();
		//obj.readBook();
		//obj.readBook("ABC", "XYZ");
		
		

	}

}
