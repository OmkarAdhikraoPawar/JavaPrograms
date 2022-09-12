import java.util.Scanner;


public class Power {
	int calPower(int base, int power)
	{
		if(power == 0)
		{
			return 1;
		}
		else
		{
			return (base * calPower(base,power-1));
		}
	}

	public static void main(String[] args) {
		Power o = new Power();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base : ");
		int base = sc.nextInt();
		System.out.println("Enter the Power : ");
		int power = sc.nextInt();
		System.out.println("Total : "+o.calPower(base, power));
		sc.close();
		
		
		

	}

}
