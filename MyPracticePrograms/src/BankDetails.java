import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
		double accountNo, initialBal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No. = ");
		accountNo = sc.nextDouble();
		System.out.println("Enter Initial Balance = ");
		initialBal = sc.nextDouble();
		
		double depositAmt;
		System.out.println("Enter the amount you want to deposit : ");
		depositAmt = sc.nextDouble();
		
		initialBal = initialBal + depositAmt ;
		System.out.println("Balance Updated is "+initialBal+" + "+depositAmt+" = "+initialBal);
		
		double withdrawAmt, availableBal ;
		System.out.println("Enter the amount you want to withdraw :");
		withdrawAmt = sc.nextDouble();
		sc.close();
		availableBal = initialBal - withdrawAmt ;
		
		System.out.println("Availaible Balance is = "+availableBal);
		
		
		
	}

}
