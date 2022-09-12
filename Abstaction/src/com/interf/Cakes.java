package com.interf;
interface Cake
{
	void bake();
}
class Strawberry implements Cake
{
	public void bake() 
	{
		System.out.println("Bake a Strawberry Cake");		
	}	
}
class BlackForest implements Cake
{
	public void bake() 
	{
		System.out.println("Bake a BlackForest Cake");		
	}	
}
public class Cakes {

	public static void main(String[] args) {
		Cake c = new Strawberry();
		c.bake();
		System.out.println("____________________________");
		c = new BlackForest();
		c.bake();

	}

}
