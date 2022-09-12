import java.util.Scanner;

public class MaxiumOfThree {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = sc.nextInt(); 
		System.out.println("Enter Second Number");
		num2 = sc.nextInt(); 
		System.out.println("Enter Third Number");
		num3 = sc.nextInt();
		sc.close();
		
	    int msg=(num1>=num2) ? ((num1>=num3)? num1 : num3 ) : ((num2>=num3)? num2 : num3);
		System.out.println("Maximum Number is "+msg);

	}

}
