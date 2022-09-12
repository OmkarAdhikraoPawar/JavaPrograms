import java.util.Scanner;

//Write a Java program to input any character and check whether it is alphabet, digit or special character
public class Assignment2 {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character : ");
		ch = sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch+ " It is Alphabet ");
			
		}else if(ch>='0'&&ch<='9')
		{
			System.out.println(ch+ " It is Digit ");
		
		}else
		{
			System.out.println(ch+" It is Special Character ");
		}
		sc.close();

	}

}
