package Array.com;

public class OddSum {
	public void doOddSum(int []n)
	{	
	    int oddSum = 0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2 != 0)
			{
				oddSum = oddSum + n[i];  
			}
			
		}
		System.out.println("Sum of Odd Elements : "+oddSum);
	}
	public void alternativeOdd(int []n)
	{	
	    System.out.println("Alternative Element of Odd Elements Location : ");
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2 != 0)
			{
				System.out.println(n[i]+" ");
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5,6,7,8,9,10};
		OddSum obj = new OddSum();
		obj.doOddSum(n);
		obj.alternativeOdd(n);
		
	}

}
