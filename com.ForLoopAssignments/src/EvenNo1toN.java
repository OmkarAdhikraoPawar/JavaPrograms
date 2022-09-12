import java.util.Scanner;

public class EvenNo1toN {

	public static void main(String[] args) {
		int i, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		n = sc.nextInt();
		for(i=2; i<=n; i+=2)
		{
			if(i%2 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of all Even Numbers between 1 to "+n+" : = " +sum);
		sc.close();
	}

}
