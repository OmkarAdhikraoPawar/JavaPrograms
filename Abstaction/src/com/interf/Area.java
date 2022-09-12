package com.interf;
interface AreaOfRectangle
{
	void area(int length, int breadth);
}
public class Area {

	public static void main(String[] args) {
		AreaOfRectangle a =(length,breadth)->System.out.println("Area is : "+(length*breadth));
		a.area(5, 6);
	}

}
