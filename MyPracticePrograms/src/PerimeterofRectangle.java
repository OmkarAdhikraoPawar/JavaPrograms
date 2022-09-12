import java.util.Scanner;

public class PerimeterofRectangle {

	public static void main(String[] args) {
		int l, b, perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length :");
		l = sc.nextInt();
		System.out.println("Enter Breadth :");
		b = sc.nextInt();
		sc.close();
		perimeter = 2 * (l + b);
		System.out.println("perimeter of Rectangle :" +perimeter);
		;
		
	}

}