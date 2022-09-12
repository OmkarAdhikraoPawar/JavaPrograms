import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int amt , a ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount for Withdraw = ");
		amt = sc.nextInt();
		sc.close();
		
		a = amt / 2000 ;
		amt = amt % 2000 ;
		System.out.println("Notes Withdraw from ATM Machine = 2000 * " +a);
		

		a = amt / 500 ;
		amt = amt % 500 ;
		System.out.println("Notes Withdraw from ATM Machine = 500 * " +a);
	
		a = amt / 200 ;
		amt = amt % 200 ;
		System.out.println("Notes Withdraw from ATM Machine = 200 * " +a);
		
		a = amt / 100 ;
		amt = amt % 100 ;
		System.out.println("Notes Withdraw from ATM Machine = 100 * " +a);
		
		a = amt / 50 ;
		amt = amt % 50 ;
		System.out.println("Notes Withdraw from ATM Machine = 50 * " +a);
		
	}

}