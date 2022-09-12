import java.util.Scanner;

public class ShoppingBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Quantity of Items you buy q =");
	    int q = sc.nextInt();
	    System.out.println("Enter the price of one Items you buy p =");
	    int p = sc.nextInt();
	    sc.close();
		
		double bill = q*p;
		System.out.println("Total Bill = "+q+" * "+p+" = "+bill);
	
	}

}
