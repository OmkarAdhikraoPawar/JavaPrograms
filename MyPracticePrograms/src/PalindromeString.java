import java.util.Scanner;
public class PalindromeString {
	public void palindrome(String str)
	{
		String reverse = "";
	    for ( int i = str.length()-1;i>=0;i--)
	    {
	         reverse = reverse + str.charAt(i);
	    }
	    if ( str.equals(reverse))
	    {
			 System.out.println(" The Given Number / String " +str+"  is Pallindrome ");
	    }
	    else
	    {
			 System.out.println(" The Given Number / String "+str+ " is  not Pallindrome ");
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    System.out.println(" Enter the Number = ");
		String str = sc.nextLine();
		PalindromeString p = new PalindromeString();
		p.palindrome(str);
	    sc.close();
		

	}

}
