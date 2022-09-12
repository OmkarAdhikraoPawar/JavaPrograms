package com.superKeyword;

class Item
{
	String iName = "Book";
	int iId = 1;
	Item()
	{
		System.out.println("Item is : Book");
	}
	public void name()
	{
		System.out.println("Ramayna ");
	}
}
class Book extends Item
{
	String bName = "Java Programming";
	int bId = 121;
	Book()
	{
		super();//3.super() can be used to invoke immediate parent class constructor. 
	}
	public void size()
	{
		System.out.println(super.iName);//1.super can be used to refer immediate parent class instance variable. 
		super.name();//2.super can be used to invoke immediate parent class method.
		System.out.println("A4 Size ");
	}
	public void pages()
	{
		System.out.println("300 Pages");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		Book b = new Book();
		b.size();
		b.pages();
		

	}

}
