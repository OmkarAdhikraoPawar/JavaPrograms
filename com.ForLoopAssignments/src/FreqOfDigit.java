import java.util.Scanner;
//Write a program to find frequency of each digit in a given integer
public class FreqOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Digit to Check Frequency = ");
		int b = sc.nextInt();
		
		int rem = 0, count = 0;
		for(; a!=0; a=a/10)
		{
			rem = a%10;
			if( rem == a )
			{
				count++;
			}
			System.out.println("Frequency of the Digit = "+count);
			sc.close();
		}

	}

}
