package Array.com;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int a[] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();

	}

}
