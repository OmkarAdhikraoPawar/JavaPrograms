package com.assignmentInhri;
class Account
{
	int accId;
	float balance;
	String custName;
	Account()
	{
		accId = 1;
		balance = 20000;
		custName = "Suraj Pawar";
	}
	Account(String custName, float balance)
	{
		this.custName = custName;
		this.balance = balance;
	}
	public void openAccount()
	{
		System.out.println("Account is Open");
	}
	public void showAccDetails()
	{
		System.out.println("Customer ID = "+accId);
		System.out.println("Customer Name = "+custName);
		System.out.println("Balance = "+balance);
		
	}
}
class SavingAccount extends Account
{
	public void openAccount()
	{
		System.out.println("Account is Open in Saving Account");
	}
	float iRate;
	SavingAccount()
	{
		super();
		iRate = 5.5f;
	}
	SavingAccount(float i,int accId,float balance,String custName)
	{
		super(custName,balance);
		iRate = i;
		this.accId = accId;
	}
	public void showSavingDetails()
	{
		showAccDetails();
	}
	public void deposite(float amt)
	{
		balance+=amt;
		System.out.println("After Deposite : "+balance);
	}
	public void withdraw(float amt)
	{
		balance-=amt;
		System.out.println("After withdraw : "+balance);		
	}
}

public class BankAccount {

	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		s.openAccount();
		s.showAccDetails();
		s.deposite(10000f);
		System.out.println("______________________________________");
		s.withdraw(5000f);
		
		//Account a = new SavingAccount();
		//a.openAccount();

	}

}
