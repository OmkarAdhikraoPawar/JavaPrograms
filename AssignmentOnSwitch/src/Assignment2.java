import java.util.Scanner;
//Write a Java program to check whether a number is even or odd using switch case 

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		switch(num%2){
		case 0:
		    System.out.println(num+" is a Even number");
		    break;
		case 1:
		    System.out.println(num+" is a Odd number");


	   }
		sc.close();

	}
}
