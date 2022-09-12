import java.util.Scanner;
//Write a Java program to check whether a number is negative, positive or zero

public class Assignment1 {

    public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num = sc.nextInt();
		sc.close();
		if(num > 0)
		{
			System.out.println( num + " is positive Number");
		}
		else if(num < 0)
		{
			System.out.println( num + " is Negative Number");
		}
		else
		{
			System.out.println( num + " Number ia Zero ");
			
		}
	}

}

