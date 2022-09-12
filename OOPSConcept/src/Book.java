
public class Book {
	int bid, quantity;
	String bName, authName;
	float price;
	public void bookDetails(int id, float p,int qty, String bn, String an)
	{
		bid = id;
		price = p;
		quantity = qty;
		bName = bn;
		authName = an;
	}
	public void showDetails()
	{
		System.out.println("-----------------------------------");
		System.out.println("Book Id :"+bid);
		System.out.println("Name of Book :"+bName);
		System.out.println("Quantity of book :"+quantity);
		System.out.println("Auther Name :"+authName);
		System.out.println("Price of Book :"+price);
		
		
		
	}

}
