package com.ForLoopAssignments;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int i,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		i = sc.nextInt();
		for(sum = 0; i!=0; i=i/10)
		{
			sum = sum + i%10;
		}
		System.out.println("Sum of Digit : "+sum);
        sc.close();
	}

}
