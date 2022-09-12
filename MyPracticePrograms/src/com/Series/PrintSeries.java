package com.Series;

import java.util.Scanner;

public class PrintSeries {
	public void series(int n)
	{
		int i, pr = 0;
		for(i=1;i<=n;i++)
	    {
		    pr = (pr*2) + 1;
		    System.out.print(pr+" ");
		}
	}
	public void series2(int n)
	{
		int b=2;    //  2 3 5 9 17 33 65 129 
		System.out.print(b+" ");
		for(int i=2;i<=n;i++)
		{
			b =(2*b)-1;
		    System.out.print(b+" ");
		}
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
	    System.out.printf("Enter the range of number: ");
	    int n=sc.nextInt();
	    
	    PrintSeries obj = new PrintSeries();
	    obj.series(n);
	    System.out.println();
	    obj.series2(n);
	    sc.close();
	}

}
