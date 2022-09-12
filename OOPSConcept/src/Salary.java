import java.util.Scanner;

public class Salary {
	double basicSal, hra, da, grossSal;
	public void acceptBasicSalary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary = ");
		basicSal = sc.nextDouble();
		sc.close();
	}
	public void showSalary()
	{
		hra = (basicSal * 25) / 100;
		da = (basicSal * 30) / 100;
		grossSal = basicSal + hra + da;
		System.out.println("House Rent Allowances = "+hra);
		System.out.println("Dearness Allowances = "+da);
		System.out.println("Gross salary is : "+basicSal+" + "+hra+" + "+da+" = "+grossSal);

	}

}
