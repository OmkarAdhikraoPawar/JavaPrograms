package com.Series;

import java.util.Scanner;

public class PrintSeries2 {
	public void series2(int n)
	{
		int b=2;    
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
	    obj.series2(n);
	    sc.close();
		

	}

}
