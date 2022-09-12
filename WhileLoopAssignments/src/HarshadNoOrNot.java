import java.util.Scanner;
//WAP to find given number is Harshad/Niven number or not
public class HarshadNoOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,digit,a,sum=0;
		System.out.println("Enter the number : ");
		a =sc.nextInt();
		i = a;
		while(i>0)
		{
			digit = i%10;
			sum = sum+digit;
			i=i/10;
		}
		if(a % sum==0)
			System.out.println("Harshad Number ");
		else
			System.out.println("Not a harshad Number ");
		    sc.close();

	}

}
