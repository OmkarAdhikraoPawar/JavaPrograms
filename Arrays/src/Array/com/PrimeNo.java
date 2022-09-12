package Array.com;

public class PrimeNo {
	public boolean isPrime(int no)
	{
		boolean flag = true;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public void checkPrime(int []n)
	{
		for(int i: n)
		{
			if(isPrime(i))
				System.out.println(i+" is Prime");
		}
	}

	public static void main(String[] args) {
		int n[] = {2,3,4,5,6,7,8,9,10};
		PrimeNo obj = new PrimeNo();
		int no =0;
		obj.isPrime(no);
		obj.checkPrime(n);

	}

}
