package com.ForLoopAssignments;
import java.util.Scanner;

public class MaxDigit {

	public static void main(String[] args) {
		int num, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = sc.nextInt();
		for(max=num%10; num>0; num=num/10)
		{
			if(num % 10 > max)
			{
				max=num%10;
			}
		}
		System.out.println(max);
		sc.close();

	}

}
