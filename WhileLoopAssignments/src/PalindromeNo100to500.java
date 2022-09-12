//Print all palindrome numbers from 100 to 500
public class PalindromeNo100to500 {

	public static void main(String[] args) {
		
		for(int num =100; num<=500; num++)
		{
			int digit = 0,sum = 0;
			int i = num;
			while(i>0)
			{
				digit=i%10;
				i=i/10;
				sum=(sum*10)+digit;
			}
			if(num == sum)
			{
				System.out.print(num+", ");
			}
		}
	}

}
