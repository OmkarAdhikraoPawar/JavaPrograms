import java.util.Arrays;
import java.util.Scanner;
public class Anagram1 {
	public static boolean checkAnagram(String first , String second)
	{
		boolean isAnagram = false;
		String str1 = first.toLowerCase();
		String str2 = second.toLowerCase();
		if(str1.length() != str2.length())
		{
			isAnagram = false;
		}
		else
		{
			char[]a = str1.toLowerCase().toCharArray();
			char[]b = str2.toLowerCase().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			isAnagram = Arrays.equals(a, b);
		}
		
		return isAnagram;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		
		boolean isAnagram = Anagram1.checkAnagram(first, second);
		System.out.println(isAnagram);
		

	}

}
