package com.dynamicPolymorphism;
class Rectangle{ 
	int length,breadth;  
	public Rectangle(int l, int b) 
	{		
	    length = l; 
	    breadth = b;
    }   
	public void print_area()
	{     
		 System.out.println("Area of a Rectangle : "+length*breadth);
	}
	public void print_perimeter()   
	{      
		 System.out.println("Perimeter of a Rectangle : "+2*(length+breadth));
	}
}
class Square extends Rectangle
{  
	public Square(int s)
	{
		super(s, s);
		super.breadth = s;
	}        
}
public class Area {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20); 
		Square s = new Square(5); 
		r.print_area();   
		r.print_perimeter();  
		s.print_area();    
		s.print_perimeter();

	}

}
