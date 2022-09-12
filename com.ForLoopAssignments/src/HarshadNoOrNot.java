import java.util.Scanner;

public class HarshadNoOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,digit,a,sum=0;
		System.out.println("Enter the number : ");
		a =sc.nextInt();
		
		for(i=a;i>0;i=i/10)
		{
			digit = i%10;
			sum = sum+digit;
		}
		if(a % sum==0)
			System.out.println("Harshad Number ");
		else
			System.out.println("Not a harshad Number ");
		    sc.close();

	}

}
