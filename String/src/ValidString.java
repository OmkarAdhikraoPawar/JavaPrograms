import java.util.Scanner;
public class ValidString {
	public static boolean validateMobile(String n)
	{
		boolean result = n.matches("[0-9]{10}");
		return result; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		String s = sc.next();
		if(validateMobile(s))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		sc.close();

	}

}
