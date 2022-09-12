import java.util.Scanner;
public class Palindrome {
	public void palindrome(int a)
	{
		 int digit , sum = 0;
		 int temp =a;		    
		 while (temp > 0)
		 {
		      digit = temp % 10;
		      sum = (sum*10)+digit;
		      temp=temp/10;
		 }
		 if(a==sum)
		    System.out.println(a+" is Palindrome number.");
		 else
		    System.out.println(a+" is not Palindrome number.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number = ");
		int a = sc.nextInt();
		Palindrome p = new Palindrome();
		p.palindrome(a);
	   
        
		sc.close();

	}

}
