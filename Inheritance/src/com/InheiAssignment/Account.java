package com.InheiAssignment;

public class Account {
	String aName;
	int aId;
	static float iRate = 5.5f;
	final static String iFSCCode = "FDRL1498";
	Account()
	{
		aName = "Ram";
		aId = 101;		
	}
	Account(int id,String name)
	{
		aId = id;
		aName = name;		
	}
	public void changeInterest()
	{
		System.out.println(iRate);
	}
	public void show()
	{
		System.out.println("Account Name :"+aName);
		System.out.println("Account id :"+aId);
		System.out.println("IFSC Code :"+iFSCCode);		
	}

	public static void main(String[] args) {
		Account a = new Account();
		Account a1 = new Account(103,"Sham");
		Account a2 = new Account(102,"Suraj");
		a.show();
		Account.iRate = 4.5f;
		a.changeInterest();
		a1.show();
		Account.iRate = 3.5f;
		a1.changeInterest();
		a2.show();
		Account.iRate = 6.5f;
		a2.changeInterest();
	
		
		

	}

}
