package Array.com;

public class Average {
	public void doAvg(int []n)
	{
		int sum =0;
		double avg;
		for(int i=0; i<n.length; i++)
		{
			sum = sum+n[i];
		}
		avg = sum / n.length;
		System.out.println("Average = "+avg);
	}

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5,6,7,8,9,10};
		Average obj = new Average();
		obj.doAvg(n);
		

	}

}
