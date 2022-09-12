package com.inheritance;

class Numbers 
{	
    int x;
	int y;
	Numbers()
	{
		x=100;
		y=50;
		System.out.println(" This is Parent class Constructor ");
	}
	
	Numbers(int x, int y)
	{
		this.x=x;
		this.y=y;
		
	}
}

class DivisionNumbers extends Numbers
{	
	DivisionNumbers()
	{
		super(30,20);
		System.out.println(" This is Parent class paramerters Constructor ");
	}
	
	public void showDivision()
	{
		System.out.println(" Division = "+(x/y));
	}
}

class AdditionNumbers extends Numbers
{
	AdditionNumbers()
	{
		System.out.println(" This is AdditionNumbers class Constructor ");
	}
	public void showAddition()
	{
		System.out.println(" Addition = "+(x+y));
	}
}
public class Operations3 {

	public static void main(String[] args) 
	{
		DivisionNumbers s = new DivisionNumbers();
		AdditionNumbers m = new AdditionNumbers();
		
		s.showDivision();
		m.showAddition();

	}

}
