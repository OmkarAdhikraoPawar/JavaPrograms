import java.util.Scanner;
//Write a Java program print total number of days in a month using switch case 

public class Assignment1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	       

	        System.out.println("Enter the month number: ");
	        int month = sc.nextInt();

	        

	        switch (month) {

	            case 1:
	               
	            case 3:
	                 
	            case 5:
	                
	            case 7:
	               
	            case 8:
	               
	            case 10:
	                
	            case 12: System.out.println("31 Days");
	                     break;
	            case 4:
	                
	            case 6:
	               
	            case 9:
	                
	            case 11: System.out.println("30 Days");
	                     break;      
	            case 2: System.out.println("Either 28 or 29 Days");
	                    break;
	            default : System.out.println("Invalid Number");       
	                
	        }
	        
	        sc.close();
	    }
	
	}


