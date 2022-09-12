import java.util.Scanner;

public class RemoveOddChar {
	public void removeOddIndex(String str)
	{
		String temp = "";
		for (int i = 0; i < str.length(); i++)
		{
            if (i % 2 == 1)
                continue;
            temp += str.charAt(i);
        }
        System.out.println(temp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		RemoveOddChar obj = new RemoveOddChar();
		obj.removeOddIndex(str);
		
		sc.close();

	}

}
