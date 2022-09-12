package com.assignmentInhri;
//Assignment 5 Que 4
class Aclass
{	
    public void amethod()
	{    	
	    System.out.println("This is parent class");
    }
}
class Bclass extends Aclass
{
	public void bmethod()
	{
	    System.out.println("This is child class");
    }	
}
public class Main{
	  public static void main(String[] args){
	    Aclass m = new Aclass();
	    Bclass n = new Bclass();
	    m.amethod();
	    n.bmethod();
	    n.amethod();
	  }
	}	