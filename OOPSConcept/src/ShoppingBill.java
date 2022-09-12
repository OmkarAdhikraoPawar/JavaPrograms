import java.util.Scanner;


public class ShoppingBill {
	int price, qty;
	double bill;
	public void insertPriceQty()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Quantity of Items you buy = ");
	    qty = sc.nextInt();
	    System.out.println("Enter the price of one Items you buy = ");
	    price = sc.nextInt();
	    sc.close();
	}
	public void showBill()
	{
		 bill = qty*price;
		System.out.println("Total Bill = "+qty+" * "+price+" = "+bill);
	}

}
