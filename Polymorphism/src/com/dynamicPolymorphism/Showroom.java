package com.dynamicPolymorphism;
class EleDevice
{
	int qty;
	float itemPrice;
    protected void doSale( int qty , float itemPrice)
    {
	    this.qty = qty;
	    this.itemPrice = itemPrice;
	    System.out.println(" Sales Amount = "+(qty*itemPrice));
    }
    public void eleDeviceWaranty()
    {
    	System.out.println("Waranty in all items are 2 Year ");
    }
    
}
class Tv extends EleDevice
{
	public void tvType()
	{
		System.out.println("Smart Tv,Android Tv");
	}
    public void doSale( int qty , float itemPrice)
	{
    	super.eleDeviceWaranty();
	    this.qty = qty;
	    this.itemPrice = itemPrice;
	    
	    System.out.println(" Amount of "+qty+" Tv : "+(qty*itemPrice));
	}	
}

class WashingMachine extends EleDevice
{
	  public void doSale( int qty , float itemPrice)
	  {
		  this.qty = qty;
		  this.itemPrice = itemPrice;
		  System.out.println(" Amount of "+qty+" Washing Machine : "+(qty*itemPrice));
	  }	
}

class Fridge extends EleDevice
{
	  public void doSale( int qty , float itemPrice)
	  {
		  this.qty = qty;
		  this.itemPrice = itemPrice;
		  System.out.println(" Amount of "+qty+" Fridge : "+(qty*itemPrice));
	  }	
}
public class Showroom{
	
    public static void main(String []args){
    	
    	EleDevice obj = new Tv();
    	obj.doSale(1, 20000);
    	
    	obj = new WashingMachine();
    	obj.doSale(3, 5000);
    	
    	obj = new Fridge();
    	obj.doSale(2, 7000);
    	
    	
    	
    	
    	
    }
}    
    