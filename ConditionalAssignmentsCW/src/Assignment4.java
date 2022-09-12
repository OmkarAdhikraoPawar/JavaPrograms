import java.util.Scanner;

//Write a Java Program to input any alphabet and Check Whether it is vowel or Constant 
public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet : ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("It is vowel " +ch);
		}else 
		{
			System.out.println("It is Constant " +ch);
		}
	}

}
