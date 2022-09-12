package string.com;
import java.util.Scanner;
public class ReverseString {
	public void reverseString()
	{
		String original, rev = "";
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a string to reverse : ");
	    original = sc.nextLine();
	    int length = original.length();
	    for (int i = length - 1 ; i >= 0 ; i--)
	      rev = rev + original.charAt(i);
	    System.out.println("Reverse String: " + rev);		
	}
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseString();
	    

	}

}
