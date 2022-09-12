package com.finalKeywordAssignment;

public class FinalDemo {
	//final int x;
	public final void method()
	{
		System.out.println("First Final Method");
	}
	public final void method2()
	{
		System.out.println("Second Final Method");
	}
	final class FinalDemoChild extends FinalDemo
	{
		//public final void method()
		{
			System.out.println("First Final Method");
		}
		//public final void method2()
		{
			System.out.println("Second Final Method");
		}
	}
	
	

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		//fd.x = 100;
		fd.method();
		fd.method2();

	}

}
