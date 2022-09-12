package com.interf;
interface Add
{
	void add(int a, int b);
}
public class Addition {

	public static void main(String[] args) {
		Add ad = (a,b)->System.out.println("Addition is : "+(a+b));
		ad.add(4500, 4594);
		
	}

}
