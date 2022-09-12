package com.interf;

//Assignment 6 :- 1) What is the output of following code
class Base {
	 public final void show() {
	 System.out.println("Base::show() called");
	 }
	}
	class Derived extends Base {
//		 public void show()   Error ;- Cannot override the final method from Base
//		 {
//		 System.out.println("Derived::show() called");
//		 }
	}
	
public class Main {

	public static void main(String[] args) 
	{
		Base b = new Derived();
		 b.show();
		 

	}

}