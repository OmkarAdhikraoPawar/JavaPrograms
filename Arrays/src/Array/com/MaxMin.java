package Array.com;

public class MaxMin {
	public void maxElement(int []n)
	{
		int max = n[0];
		for(int i=0;i<n.length;i++)
		{
			if(n[i]> max)
			{
				max = n[i];
			}
		}
		System.out.println("Maximum Element : "+max);
	}
	public void minElement(int []n)
	{
		int min = n[0];
		for(int i=0;i<n.length;i++)
		{
			if(n[i]< min)
			{
				min = n[i];
			}
		}
		System.out.println("Maximum Element : "+min);
	}


	public static void main(String[] args) {
		int n[] = {1,2,3,4,5,6,7,8,9,10};
		MaxMin obj = new MaxMin();
		obj.maxElement(n);
		obj.minElement(n);
		
	}

}
