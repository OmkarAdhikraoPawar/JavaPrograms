package string.com;
import java.util.Scanner;
public class CharacterOccurence {

	public static void main(String[] args) {
		String s = "Java is a good Programming Language";
		int count = 0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		ch = sc.next().charAt(0);
		for(int i=0; i<s.length(); i++)
		  {
		      if(s.charAt(i) == ch)
		      count++;
		  }
		System.out.println(count);
		sc.close();

	}

}
