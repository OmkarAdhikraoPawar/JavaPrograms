import java.util.Scanner;
//1 22 333 4444 5555
public class SeriesNumber_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		  int num = sc.nextInt();
		  for (int i = 1; i <= num; i++) 
		{
			for(int j=1; j<=i; j++)
			{
 			    System.out.print(i);
			}
			System.out.print(" ");
		}
		sc.close();

	}

}
