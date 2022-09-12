import java.util.Scanner;
//digit separation ofAnt Number
public class DigitSeperation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int no=sc.nextInt();
		while(no>0)
		{
			int i;
			i = no%10;
			System.out.println(i);
			no = no/10;
		}
		sc.close();
		

	}

}
