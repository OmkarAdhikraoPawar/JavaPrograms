
public class ThisKeyword {
	int bookId, cost;
	String bookName, suppName;
	ThisKeyword()
	{
		this.bookId = 1;
		this.cost = 400;
		this.bookName = "Ramayan";
		this.suppName = "Ram";
	}
	
	public void thisKeyword(int bookId, int cost, String bookName, String suppName)
	{
		this.bookName = bookName;
		this.cost = cost;
		this.bookName = bookName;
		this.suppName = suppName;
	}
	
	public void showDetails()
	{
		System.out.println("Book Id "+this.bookId);
		System.out.println("Book Cost "+this.cost);
		System.out.println("Book Name "+this.bookName);
		System.out.println("Book Supplyer "+this.suppName);
	}

	public static void main(String[] args) {
		ThisKeyword t,t1;
		t = new ThisKeyword();
		t.showDetails();
		System.out.println("-----------------------------------");
		
	    t1= new ThisKeyword();
	    t1.thisKeyword(4, 300, "Data Algorithms", "Peter");
	    t1.showDetails();
		
		
		
		
	
	}
	
}
