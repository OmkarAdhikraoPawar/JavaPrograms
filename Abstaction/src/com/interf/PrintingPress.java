package com.interf;
interface Printable 
{
   void print();
}
class Magzine extends Book implements Edit
{	
	
	Magzine(int bid, String bName, String aName, int cost)
	{
		super(bid, bName, aName, cost);	
		toString();
	}
	public void read()
	{
		System.out.println("Read Magzine");	
	}
	public void update()
	{
		System.out.println("Magzines Updeted");
	}
	public void write() 
	{
		System.out.println("Write some points of Magzine");
	}	
}
class Book  
{
	int bid,cost;
	String bName,aName,publication;
	Book(int bid,String bName,String aName,int cost)
	{
		this.bid = bid;
		this.bName = bName;
		this.aName = aName;
		this.cost = cost;
	}
	public void publish(String publication)
	{
		System.out.println("Published "+publication);
	}
	public String toString()
	{
		return "Book Id : "+bid+"\nBook Name : "+bName+"\nAuthor Name : "+aName+"\nCost : "+cost;
	}
	
}
class NewsPaper implements Edit,Printable
{
	public void read()
	{
		System.out.println("Read News Paper");	
	}
	public void update()
	{
		System.out.println("News Paper Updeted");
		
	}
	/*public void write() 
	{
		System.out.println("Write some points of News Paper");
	}*/
	public void print()
	{
		System.out.println(" Printing the Newspaper ");
	}
}
public class PrintingPress {

	public static void main(String[] args) {
		/*Edit e = new Magzine();
		e.read();
		e.update();
		e.write();
		System.out.println("__________________________________");
		
		e = new NewsPaper();
		e.read();
		e.update();
		e.write();*/
		System.out.println("__________________________________");
		
		Book b = new Book(1,"Ramayan","Suraj",300);
		System.out.println(b.toString());
		Magzine m = new Magzine(2,"Bibal","Akash",500);
		System.out.println(m.toString());
		m.publish("on 2022");
		m.read();
		m.update();
		m.write();
		
		//Printable p = new Newspaper();     //  For Printable interface 
		//p.print();
		

	}

}
