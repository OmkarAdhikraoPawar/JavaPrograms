import java.util.Scanner;

//Write a program to calculate product of digits of any number.
public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		int rem = 0, product = 1;
		for(; n !=0; n=n/10)
		{
			rem = n % 10;
			product = product * rem;
		}
		System.out.println("Product of Digit = "+product);
		sc.close();
	}

}
