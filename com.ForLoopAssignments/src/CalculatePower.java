import java.util.Scanner;
//WAP to accept base and index from user and calculates power
public class CalculatePower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 1;
		System.out.println("Enter Base Number : ");
		int base = sc.nextInt();
		System.out.println("Enter Index Number : ");
		int index = sc.nextInt();
		System.out.println(base+" ^ "+index+" = ");
		for(;index!=0;index--)
		{
			ans = ans * base;
		}
		System.out.print(ans);
		sc.close();

	}

}
