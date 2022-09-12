import java.util.Scanner;

//Write a Java program to input any alphabet and check whether it is vowel or consonant 

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);
		
		switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':	
            System.out.println(ch + " is vowel");
            break;
        default:
            System.out.println(ch + " is consonant");
    }
		sc.close();
  }

}
