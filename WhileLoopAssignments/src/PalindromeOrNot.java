import java.util.Scanner;
//WAP to check given no is palindrome or not. 
public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int rev = 0, sum = 0;
		int i = num;
		while(i>0)
	        {
	            rev = i % 10;
	            sum= (sum * 10) + rev;
	            i=i/10;
	        }
	        if(num == sum)
	            System.out.println(num + " is a palindrome.");
	        else
	            System.out.println(num + " is not a palindrome.");
                sc.close();

	}

}
