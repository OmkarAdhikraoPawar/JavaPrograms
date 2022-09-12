import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		int r;
		double pi = 3.14 ,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius:");
	    r = sc.nextInt();
	    sc.close();
		perimeter = 2 * pi * r;
		System.out.println("Perimeter of circle is :"+perimeter);

	}

}
