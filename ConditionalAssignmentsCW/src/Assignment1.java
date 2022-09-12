import java.util.Scanner;
//Write a Java Program to check whether a year is leap year or not

public class Assignment1 {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		year = sc.nextInt();
		sc.close();
		
		if (year % 400 == 0)
		{
            System.out.println(year + " is a leap year.");
        }else if (year % 100 == 0)
        {
            System.out.println(year + " is not a leap year.");
        }else if (year % 4 == 0)
        {
            System.out.println(year + " is a leap year.");
        }else
        {
            System.out.println(year + " is not a leap year.");
        }
	}

}
