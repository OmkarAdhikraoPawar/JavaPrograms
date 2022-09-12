
public class Account {
	long accountNo;
	String customerName;
	Account()
	{
		System.out.println("I am in Default Constructor ");
		accountNo = 123456544L;
		customerName = "alex";
	}
	Account(long an,String cn)
	{ 
		System.out.println("I am in Parameterized Constructor ");
	    accountNo = an;
	    customerName = cn;
		
	}
	public void showDetails()
	{
		System.out.println("Account Number : "+accountNo);
		System.out.println("Customer Name : "+customerName);
	}

	public static void main(String[] args) {
		Account a,a1,a2,a3;
		a = new Account();
		a.showDetails();
		
		a1 = new Account(1232123L,"Tom");
		a1.showDetails();
		
		a2 = new Account(1234543234L,"Peter");
		a2.showDetails();
		
		a3 = new Account(12343456L,"Jones");
		a3.showDetails();
		
		
		

	}

}
