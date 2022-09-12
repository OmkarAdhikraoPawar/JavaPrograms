import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		int num, i, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		num = sc.nextInt();
		for(i =1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println("Factorial of "+num+" is : "+fact);
		sc.close();
	}

}
