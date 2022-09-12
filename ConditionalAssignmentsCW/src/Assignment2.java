import java.util.Scanner;

//Write a Program to Check Whether a Number is Divisible by 5 and 11 or not

public class Assignment2 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = sc.nextInt();
		sc.close();
		
		if((num % 5 == 0)&&(num % 11 == 0))
		{
			System.out.println(" Number "+num+" is Divisible by 5 and 12 ");
		}else
		{
			System.out.println(" Number "+num+" is Not Divisible by 5 and 12 ");
		}
		
	}

}
