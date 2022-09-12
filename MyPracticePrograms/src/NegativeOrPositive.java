import java.util.Scanner;

public class NegativeOrPositive {

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
			System.out.println( num + " is neither Positive nor Negative");
			
		}
	}

}
