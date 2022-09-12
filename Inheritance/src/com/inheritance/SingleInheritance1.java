package com.inheritance;
class Item
{
	String iName = "Book";
	int iId = 1;
}
class Book extends Item
{
	String bName = "Java Programming";
	int bId = 121;
	public void size()
	{
		System.out.println("A4 Size ");
	}
	public void pages()
	{
		System.out.println("300 Pages");
	}
}
public class SingleInheritance1 {

	public static void main(String[] args) {
		Book b = new Book();
		System.out.println("Item Id : "+b.iId);
		System.out.println("Item Name : "+b.iName);
		System.out.println("Book Id : "+b.bId);
		System.out.println("Book Name : "+b.bName);
		b.size();
		b.pages();
		

	}

}
