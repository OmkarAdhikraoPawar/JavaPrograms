import java.util.Scanner;

public class Semester {
	int m1,m2,m3,rollNo;
	public void acceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll No.");
		rollNo = sc.nextInt();
		System.out.println("Maths : ");
	    m1 = sc.nextInt();
	    System.out.println("Physics : ");
	    m2 = sc.nextInt();
	    System.out.println("Chemistry : ");
	    m3 = sc.nextInt();
		
	}
	public void showDetails()
	{
		System.out.println("Roll no :"+rollNo);
		System.out.println("Maths :"+m1);
		System.out.println("Physics :"+m2);
		System.out.println("Chemistry :"+m3);
		
	}
	

}
