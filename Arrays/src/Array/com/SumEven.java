package Array.com;

public class SumEven {
	public void doSumEven(int []n)
	{
		int evenSum = 0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
			{
				evenSum = evenSum+n[i];
			}
			
	    }
		System.out.println("Sum of Even Elements : "+evenSum);
	}
	public void alternateEven(int[]n)
	{
		System.out.println("Alternate Element of Even Location :");
		for(int i =0;i<n.length;i++)
		{
			if(n[i]%2==0)
			{
				System.out.println(n[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int n[] = {1,2,3,4,5,6,7,8,9,10};
		SumEven obj = new SumEven();
		obj.doSumEven(n);
		obj.alternateEven(n);

	}

}
