

import java.util.Scanner;

public class FactorOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number a = ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Number b = ");
		int b = sc.nextInt();
		sc.close();
		
		if ( a % b == 0)
		{
			System.out.println("The Given Number "+b+" is factor of "+a);
		}
		else
		{
			System.out.println("The Given Number "+b+" is Not " + "Factor of " +a);
		}
		

	}

}
