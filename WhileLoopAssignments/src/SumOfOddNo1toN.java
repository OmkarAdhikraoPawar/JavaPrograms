import java.util.Scanner;
//Write a program to find sum of all odd numbers between 1 to n
public class SumOfOddNo1toN {

	public static void main(String[] args) {
		int i=1, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		n = sc.nextInt();
		while(i<=n)
		{
			i++;
			if(i %2 != 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of all Odd Numbers between 1 to : "+n+" = " +sum);
		sc.close();
	}

}
