package com.ForLoopAssignments;
import java.util.Scanner;
//WAP to check given no is automorphic or not
public class AutomorphicOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int sqr = n*n;
		int flag = 0;
		for(; n>0; n=n/10, sqr = sqr/10)
		{
			
			if(n%10!= sqr%10)
			{
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("it's Automorphic ");
		}	
		else
		{
			System.out.println("it's Not Automorphic ");
		}
		sc.close();

	}

}
