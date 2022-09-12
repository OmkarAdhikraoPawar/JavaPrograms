package com.inheritance;
class Emplyoee
{	
	float grosSal = 25000f;
	public void salary()
	{
		System.out.println("Employee Gross Salary : "+grosSal);
	}
}
class PermanentEmp extends Emplyoee
{
	int empId = 101;
	double hra = (grosSal * 15) / 100;
	double da = (grosSal * 10) / 100;
	double totalSal = grosSal + hra + da ;
	public void hra()
	{
		System.out.println("HRA of Salary : "+hra);
	}
	public void da()
	{
		System.out.println("DA  Of Salary : "+da);
	}
	public void totSal()
	{
		System.out.println("Total Employee Salary : "+totalSal);
	}
	

	public static void main(String[] args) {
		PermanentEmp p = new PermanentEmp();
		System.out.println("Permanent Employee Id : "+p.empId);
		p.salary();
		p.hra();
		p.da();
		System.out.println("____________________________________________");
		p.totSal();


	}

}
