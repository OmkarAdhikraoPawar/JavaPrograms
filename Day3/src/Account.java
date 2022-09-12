import java.util.Scanner;

public class Account {
	  String accno,name,acc_type;   
	  long balance, amt;  
	  
	  Scanner sc = new Scanner(System.in);
	  public void insert()
	  {
		  System.out.print("Enter Account No: ");  
	      accno = sc.next();  
	      System.out.print("Enter Account type: ");  
	      acc_type = sc.next();  
	      System.out.print("Enter Name: ");  
	      name = sc.next();  
	      System.out.print("Enter Balance: ");  
	      balance = sc.nextLong();  
	  }
	  public void display()
	  {
		  System.out.println("Name of account holder: " + name);  
	      System.out.println("Account no.: " + accno);  
	      System.out.println("Account type: " + acc_type);  
	      System.out.println("Balance: " + balance);  
	  }
	  public void deposit()
	  {  
	      System.out.println("Enter the amount you want to deposit: ");  
	      amt = sc.nextLong();  
	      balance = balance + amt; 
	      System.out.println("Balance = "+balance);
	  }
	  public void withdrawal()
	  { 
	      System.out.println("Enter the amount you want to withdraw: ");  
	      amt = sc.nextLong(); 
	      balance = balance - amt;
	     
	  }
	  public void check_balance()
	  {
		  System.out.println("Total Balance = "+balance);
		 	  
	  }
	     

	
}
