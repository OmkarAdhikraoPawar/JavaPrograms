package Array.com;

import java.util.Arrays;

public class SumofElements {
	public void elementSum(int a[])
	{
		int sum = 8;
		System.out.println("Indicates of the Elements Whose sum is :"+sum);
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if((a[i]+a[j] == sum && i!=j))
				{
					System.out.println(a[i]+", "+a[j]);
					
				}	
			}			
		}				
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println("The Array is Created is : "+Arrays.toString(a));
		SumofElements obj = new SumofElements();
		obj.elementSum(a);

	}

}
