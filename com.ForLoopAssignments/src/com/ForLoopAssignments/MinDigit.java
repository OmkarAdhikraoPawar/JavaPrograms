package com.ForLoopAssignments;

import java.util.Scanner;

public class MinDigit {
	public int minNum(int num)
	{
		int min;
		
		for(min=num%10; num>0; num=num/10)
		{
			if(num % 10 < min)
			{
				min=num%10;
			}
		}
		return min;
		
		
	}

	public static void main(String[] args) {
		MinDigit obj = new MinDigit();
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = sc.nextInt();
		int min = obj.minNum(num);
		
		
		
		System.out.println("Minimum Number is = "+num+" is : "+min);
		sc.close();
	

	}

}
