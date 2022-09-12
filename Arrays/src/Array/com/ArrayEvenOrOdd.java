package Array.com;

public class ArrayEvenOrOdd {

	public static void main(String[] args) {
		int a[] = {2,4,3,5,7,6};
		int oddSum = 0,evenSum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenSum = evenSum+a[i];
			}
			else
			{
				oddSum = oddSum+a[i];
			}
		}
		System.out.println("Even Numbers : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);  
			}
		}

	}

}
