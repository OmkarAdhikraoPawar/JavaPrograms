import java.util.InputMismatchException;
import java.util.Scanner;
public class RuntimeException {
	public void arithmatic()
	{
		try
		{
			int a = 50, b = 0;
			int c = a/b;
			System.out.println("Division is : "+c);			
		}catch(ArithmeticException e)
		{
			System.out.println("Please do not Divided by Zero ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
		}
	}
	public void arrayIndex()
	{
		try
		{
		    int[] a = new int[] {1, 2, 3, 4, 5};
		    int n = a[5];
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Plese do not your Array out of Range ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
		}
	}
	public void stringIndex()
	{
		try
		{
			String str = "My String";
		    System.out.println(str.charAt(9));
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Plese do not your String out of Range ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
		}
	}
	public void numberFormat()
	{
		try
		{
			int c = Integer.parseInt("123djf");
		    System.out.println(c);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Plese Enter only Numbers ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
		}
	}
	public void classCast()
	{
		try
		{
			Object i = Integer.valueOf(100);
		    String s = (String)i; 
		}catch(ClassCastException e)
		{
			System.out.println("Integer cannot be cast to java.lang.String ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
		}
	}
	public void inputMismatch()
	{
		try
		{
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Num : ");
		    int x = sc.nextInt();
		    sc.close();
		   
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please give number in Numeric form. ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		RuntimeException obj = new RuntimeException();
		obj.arithmatic();
		System.out.println("______________________________________________________");
		obj.arrayIndex();
		System.out.println("______________________________________________________");
		obj.stringIndex();
		System.out.println("______________________________________________________");
		obj.numberFormat();
		System.out.println("______________________________________________________");
		obj.classCast();
		System.out.println("______________________________________________________");
		obj.inputMismatch();

	}

}
