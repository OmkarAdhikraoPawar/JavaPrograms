import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Marks of maths :");
		int m=sc.nextInt();
		
		System.out.println("Enter Marks of Physics :");
    	int p=sc.nextInt();
		
		System.out.println("Enter Marks of Chemistry :");
		int c=sc.nextInt();
		sc.close();
		double outOfMarks = 300;
		double percentage = ((m + p + c)*100)/(outOfMarks);
		System.out.println("Percentage :"+percentage);
		if(percentage>=80)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=60)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=40)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
