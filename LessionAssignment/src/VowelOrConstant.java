import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'||ch == 'I' || ch=='O'|| ch == 'U')
		{
			System.out.println("It is vowel " +ch);
		}else 
		{
			System.out.println("It is Constant " +ch);
		}
	}

}
