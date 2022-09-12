import java.util.Scanner;
//1!+2!+3!.........+n! find s
public class Assignment15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to Generate sum of Series :: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				sum = sum + i;
			}
		}
		System.out.print(sum);
		sc.close();

	}

}
