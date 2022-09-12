import java.util.Scanner;
public class Fact
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String outp = "";
		int fact = 1;
		int count = 1;
		while (true)
		{
			fact = fact * count;
			
		if(fact>num)
		{
			break;
		}
		outp = outp +fact+" ";
		count++;
		}
		System.out.println(""+outp);
		sc.close();

	}
	

}
