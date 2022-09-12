import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		sc.close();
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		
		System.out.println("Addition :"+add);
		System.out.println("Substaction :"+sub);
		System.out.println("Multiplication :"+mul);
		System.out.println("Division :"+div);
		System.out.println("Modulus :"+mod);
	}

}
