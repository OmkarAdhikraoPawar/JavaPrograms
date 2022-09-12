import java.util.Scanner;

//Write a Java Program to Create Simple Calculator
public class Assignment5 {

	public static void main(String[] args) {
		char operator;
		double num1, num2, sum ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		num1 = sc.nextDouble();
		System.out.println("Enter Second Number : ");
		num2 = sc.nextDouble();
		System.out.println("Choose an operator: +, -, *, or /");
		operator = sc.next().charAt(0);
		sc.close();
		
		switch(operator)
		{
		   case '+' :
			    sum = num1 + num2;
			    System.out.println(num1 + " + " +num2+ " = " +sum );
				break;
			    
		   case '-' :
			    sum = num1 + num2;
				System.out.println(num1 + " - " +num2+ " = " +sum );
				break;
		   case '*' :
			    sum = num1 + num2;
				System.out.println(num1 + " * " +num2+ " = " +sum );
				break;
		   case '/' :
			    sum = num1 + num2;
				System.out.println(num1 + " / " +num2+ " = " +sum );
				break;
		   default :
			    System.out.println("Invalid Operator");
				
				  
				
		}
		

	}

}
