import java.util.Scanner;

public class AreaOfCircle {
	int r;
	double pi = 3.14,area;
	public void insertRadius()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		r = sc.nextInt();
		sc.close();
	}
	public void showArea()
	{
        area = r*r*pi;
		System.out.println("Area of Circle is :" + area); 
	}

}
