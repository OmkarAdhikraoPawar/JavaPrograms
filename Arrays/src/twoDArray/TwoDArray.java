package twoDArray;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
	public void showArray(int a[][])
	{
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void square(int a[][])
	{
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = a[i][j] * a[i][j];
				System.out.print(a[i][j]+", ");
			}			
		}
		System.out.println();
	}
	public void evenElements(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				System.out.print(a[i][j]+", ");
			}			
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][];
		System.out.println("How may rows and columns? ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		a = new int[row][col];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("__________________________");
		TwoDArray o = new TwoDArray();
		o.showArray(a);
		o.square(a);
		System.out.println("__________________________");
		o.evenElements(a);
		

	}

}
