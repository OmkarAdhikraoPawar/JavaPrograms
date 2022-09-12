import java.util.Scanner;


public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 121, rev = 0, sum = 0;
		for(int i=num;i>0;i=i/10)
	        {
	            rev = i % 10;
	            sum= (sum * 10) + rev;
	        }
	        if(num == sum)
	            System.out.println(num + " is a palindrome.");
	        else
	            System.out.println(num + " is not a palindrome.");
                sc.close();
	}

}
