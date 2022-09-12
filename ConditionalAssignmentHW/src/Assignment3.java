import java.util.Scanner;
// Write a Java program to check whether a number is even or odd 
public class Assignment3 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num = sc.nextInt();
		sc.close();
		if (num % 2 ==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}