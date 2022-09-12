import java.util.Scanner;

public class OddNo1toN {

	public static void main(String[] args) {
		int i, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i %2 != 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of all Odd Numbers between 1 to : "+n+" = " +sum);
		sc.close();

	}

}
