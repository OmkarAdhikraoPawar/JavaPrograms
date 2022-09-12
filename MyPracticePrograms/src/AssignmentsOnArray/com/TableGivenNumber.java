package AssignmentsOnArray.com;
import java.util.Scanner;

public class TableGivenNumber {
	public void table(int arr[])
	{
		for(int j = 1; j < 10; j++)
		{		
			
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int arr[] = new int[10];
		System.out.println("Enter The Number : ");
		int num1 = sc.nextInt();
		for(int i = 0; i < 10; i++)
		{ 
			arr[i] = sc.nextInt();
		}
		TableGivenNumber obj = new TableGivenNumber();
		obj.table(arr);
		sc.close();
	}

}
