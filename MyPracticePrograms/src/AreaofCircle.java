import java.util.Scanner;
public class AreaofCircle {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int r;
		double pi = 3.14,area;
		System.out.println("Enter Radius :");
		r = sc.nextInt();
		sc.close();
		area = r*r*pi;
		
		System.out.println("Area of Circle is :" + area);
	}

}
