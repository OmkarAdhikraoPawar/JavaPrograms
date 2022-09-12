package ForEachLoopArray;
import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[] = new int[5];
		int sum = 0;
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
		sc.close();

	}

}
