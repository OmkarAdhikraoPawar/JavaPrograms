package AssignmentsOnArray.com;

import java.util.Arrays;

public class Average {
	public void calculateAvg(int []a)
	{
		int max = a[0];
		int min = a[0];
		float sum = a[0];
		for(int i = 1; i < a.length; i++)
		{
			sum  += a[i];
			if(a[i] > max)
				max = a[i];
			else if(a[i] < min)
				min = a[i];
		}
		float x = ((sum-max-min) / (a.length - 2));
		System.out.println("Avreage of Elements accept minimum and Maximum Element : "+x);
		
	}

	public static void main(String[] args) {
		int[] a = {8, 6, 1, 4, 10};
		System.out.println("Original Array: "+Arrays.toString(a));
		Average obj = new Average();
		obj.calculateAvg(a);

	}

}
