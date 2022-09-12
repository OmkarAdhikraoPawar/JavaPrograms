import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float p , t , r , simpleInterest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter P :");
		p = sc.nextFloat();
		System.out.println("Enter T :");
		t = sc.nextFloat();
		System.out.println("Enter r :");
		r = sc.nextFloat();
		sc.close();
		simpleInterest = (p * t * r)/ 100 ;
		System.out.println("Simple Interest is ="+simpleInterest);
		
		
		
	}

}
