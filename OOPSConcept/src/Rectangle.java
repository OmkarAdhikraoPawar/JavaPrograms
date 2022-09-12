import java.util.Scanner;

public class Rectangle {
	int length, width;
	public void insert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		length = sc.nextInt();
		System.out.println("Enter Width : ");
		width = sc.nextInt();
	}
	public void calculateArea()
	{
		System.out.println(length*width);
	}


}
