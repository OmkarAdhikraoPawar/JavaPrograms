import java.util.Scanner;
//Write a Java Program to find Maximum between Three Numbers

public class Assignment3 {

	public static void main(String[] args) {
        int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		num2 = sc.nextInt();
		System.out.println("Enter Third Number : ");
		num3 = sc.nextInt();
		sc.close();
		
		if(num1 >= num2 && num1 >= num3)
		{
			System.out.println("First Number is Maximum : " +num1);
		}else if(num2 >= num3)
		{
			System.out.println("Second Number is Maximum : " +num2);
		}else
		{
			System.out.println("Third Number is Maximum : " +num3);
		}

	}


	}


