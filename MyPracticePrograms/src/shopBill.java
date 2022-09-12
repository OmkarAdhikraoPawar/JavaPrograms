
import java.util.Scanner;

public class shopBill {

	public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Quantity of items");
	    int q = sc.nextInt();
		System.out.println("Enter the Price of items");
		float p = sc.nextFloat();
		sc.close();
		double bill = q * p ;
		System.out.println("Total Bill is :" +q+ "*" +p+ "=" +bill);
		
		if(bill>=5000)
		{
			System.out.println(" Discount of given bill " +bill+ " is 5 %");
			double discount = (bill * 5)/100;
			double disBill = bill-discount;
			System.out.println("You get " +discount+ " rs discount");
			System.out.println("You have to Pay " +disBill+ " instead of " +bill);
		
		}
		else
		{
			System.out.println("Don't get discount " +bill);
			
		}

	}

}
