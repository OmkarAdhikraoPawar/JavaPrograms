package Array.com;

import java.util.Scanner;

public class A {
	public void showArray(int arr[][])
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void sumEvenNo(int arr[][])
	{
		int evenSum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++){
			if(arr[i][j] % 2 == 0)
			{
				evenSum = evenSum + arr[i][j]; 
			}
			}
		}		
		System.out.println("\n The Sum of Even Numbers in this Array = " + evenSum);
	}
	public static int smallestEven(int arr[][])
	{
		int minEven = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
	        if (arr[i][j] % 2 == 0)
	        { 
	        	
	            sum += arr[i][j];
	            if (minEven > sum || minEven == 0)
	                minEven = sum;
	        }
		}
	    }
		System.out.println(" Smallest Even Num is : "+minEven);
		return minEven;	    
	}
	public void transposeMatrix(int arr[][])
	{
		int transpose[][]=new int [3][3];  
		for(int i=0;i<arr.length;i++)
		{  
		    for(int j=0;j<arr.length;j++)
		    {    
		        transpose[i][j]=arr[j][i];  
		    }    
		}    		 
		System.out.println("Matrix After Transpose:");  
		for(int i=0;i<arr.length;i++)
		{ 			
		    for(int j=0;j<arr.length;j++)
		    {    
		        System.out.print(transpose[i][j]+" ");    
		    }    
		System.out.println();    
		}    		
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int arr[][];
		System.out.println("How may rows and columns? ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		arr = new int[row][col];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		A o = new A();
		o.showArray(arr);
		System.out.println("____________________________________");
		o.sumEvenNo(arr);
		System.out.println("____________________________________");
		o.smallestEven(arr);
		System.out.println("____________________________________");
		o.transposeMatrix(arr);
	
	
	}
}
