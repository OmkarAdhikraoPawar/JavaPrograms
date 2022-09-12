import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		double basicSal, hra, da, grossSal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary = ");
		basicSal = sc.nextDouble();
		sc.close();
		
		if(basicSal <= 10000 )
		{
			hra = (basicSal * 20) / 100;
			da = (basicSal * 80) / 100;
			
		}else if(basicSal <= 20000 )
		{
		    hra = (basicSal * 25) / 100;
			da = (basicSal * 90) / 100;	
			
		}else
		{
		    hra = (basicSal * 30) / 100;
			da = (basicSal * 95) / 100;
			
		}
		grossSal = basicSal + hra + da;
		System.out.println("Gross salary is : "+basicSal+" + "+hra+" + "+da+" = "+grossSal);

	}

}
