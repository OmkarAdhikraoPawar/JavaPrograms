import java.rmi.AccessException;
import java.util.Scanner;
public class AverageOfArray {
	public void average(int a[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Array Elements : ");
			int total = 0;
			for(int i=0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
				total += a[i];
			}
			int avg = total / a.length;
			System.out.println(avg);
			sc.close();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please do not Divided by Zero ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please give number in Numeric form. ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
		}
		
		
	}
	public static void main(String[] args) {
		int a[] = new int[5];
		
		AverageOfArray o = new AverageOfArray();
		o.average(a);
		

	}

}
