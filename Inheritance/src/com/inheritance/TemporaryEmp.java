package com.inheritance;

class TemporaryEmp extends Emplyoee{
	int empId = 102; 
	double hra = (grosSal * 10) / 100;
	double da = (grosSal * 12) / 100;
	double totalSal = grosSal + hra + da ;
	public void hra()
	{
		System.out.println("HRA of Salary : "+hra);
	}
	public void da()
	{
		System.out.println("DA is Of Salary : "+da);
	}
	public void totSal()
	{
		System.out.println("Total Employee Salary : "+totalSal);
	}

	public static void main(String[] args) {
		TemporaryEmp t = new TemporaryEmp();
		System.out.println("Temporary Employee Id : "+t.empId);
		t.salary();
		t.hra();
		t.da();
		System.out.println("_____________________________________________");
		t.totSal();
		
		

	}

}
