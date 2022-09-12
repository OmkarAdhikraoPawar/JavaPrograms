package com.finalKeywordAssignment;
final class Test{
	final String s = "Programming";
	public final void display()
	{
		final int no = 1;
		System.out.println(no);
		//no = 2;
		System.out.println("Java "+s);
	}
}
final public class FinalKey 
{
    public static void main(String[] args) {
		Test d = new Test();
		d.display();
	}	 
}
