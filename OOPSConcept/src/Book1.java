
public class Book1 {
	public void showBookDetails(Book obj)
	{
		System.out.println("Book Id : "+obj.bid);
		System.out.println("Book Name : "+obj.bName);
		System.out.println("Book Price : "+obj.price);
		System.out.println("Changing Book Price...");
		obj.price = 5000.00f;
	}

	public static void main(String[] args) {
		Book b = new Book();
		Book b1 = new Book();
		
		b.bookDetails(1, 250.00f, 3, "Shadow Scale", "Rushi Khabale");
		b.showDetails();
		b1.bid = b.bid;
		b1.price = b.price;
		b1.quantity = b.quantity;
		b1.bName = b.bName;
		b1.authName = b.authName;
		b1.showDetails();
		System.out.println("Hash code of object b is "+b.hashCode());
		System.out.println("Hash code of object b1 is "+b1.hashCode());
		Book b2;
		b2=b;
		System.out.println("Hash code of object b2 is "+b2.hashCode());
		Book1 bo = new Book1();
		bo.showBookDetails(b);
		
		b.showDetails();
	}

}
