import java.util.Scanner;

public class SumOfDigit {
	public void sumOfOnlyDigits(String s)
	{
		int sum = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println("Sum of all digits : " +sum);		
	}
	static int findSum(String s)
    {
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
            else 
            {             
            	sum += Integer.parseInt(temp);      
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		SumOfDigit obj = new SumOfDigit();
		obj.sumOfOnlyDigits(s);
		System.out.println("_______________________________________");
		System.out.println("Sum of all Digits : "+findSum(s));
		sc.close();
	}

}
