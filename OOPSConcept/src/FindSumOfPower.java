import java.util.Scanner;


public class FindSumOfPower {
	public int countDigits(int x)
	{
		int cnt = 0;
		while(x>0)
		{
			cnt++;
			x=x/10;
		}
		return cnt;
	}
	public int findPower(int base,int power)
	{
		int multi = 1;
		for(;power>=1;power--)
		{
			multi=multi*base;
		}
		return multi;
	}
	public int calPowerSum(int number)
	{
		int sum = 0;
		int digit = countDigits(number);
		while(number>0)
		{
			int rem = number%10;
			sum+=findPower(rem, digit);
			number/=10;
			digit--;
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		FindSumOfPower p =  new FindSumOfPower();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int no = sc.nextInt();
		int sum = p.calPowerSum(no);
		System.out.println("Answer is : "+sum);
		sc.close();
		

	}

}
