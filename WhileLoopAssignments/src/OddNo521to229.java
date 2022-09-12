//WAP to print odd numbers from 521 to 229 using while loop
public class OddNo521to229 {

	public static void main(String[] args) {
		System.out.println("All Odd Numbers from 521 to 229 = ");
		int a = 521;
		while(a >= 229)
		{
			if(a % 2 != 0)
			{
				System.out.print(a+", ");
			}
			a--;
		}

	}

}
