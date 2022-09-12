package ForEachLoopArray;

public class SumOfElements {
	public void showSum(int []a)
	{
		int total = 0;
		for(int ele:a)
		{
			total += ele;
		}
		System.out.println("Total = "+total);
	}
	public void evenSum(int []a)
	{
		int sum = 0;
		for(int ele:a)
		{
			if(ele%2==0)
			sum += ele;
		}
		System.out.println("Sum of Even Elements = "+sum);
	}

	public static void main(String[] args) {
		int a [] = {4,5,6,7,1,2};
		
		SumOfElements obj = new SumOfElements();
		obj.showSum(a);
		obj.evenSum(a);
	}

}
