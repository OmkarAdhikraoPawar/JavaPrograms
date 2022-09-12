package com.inheritance;
//import java.util.Scanner;
// Single
class Item1
{
	int itemId ;
	String itemName ;
	
	Item1(int itemId , String itemName)
	{
	  this.itemId = itemId;
	  this.itemName = itemName;
	}
	
	public void showDetails()
	{
		System.out.println(" Item Id = "+itemId);
		System.out.println(" Item Name = "+itemName);
	}
}

class Price extends Item1
{
	int quantity;
	double price;
	
	Price(int quantity , double price )
	{
	  super(1, " Shirt");
	  this.quantity = quantity;
	  this.price = price;
	}
	
	public void showPrice()
	{
		/* Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the Quatity = ");
		quantity = sc.nextInt();
		System.out.println(" Enter the Price of 1 Item = ");
		price = sc.nextInt();   */
		System.out.println(" Price = "+quantity*price);
		//sc.close();
	}
}
public class ItemDetails1 {

	public static void main(String[] args)
	{
		Price p = new Price( 2, 400);
		p.showDetails();
		p.showPrice();

	}

}



