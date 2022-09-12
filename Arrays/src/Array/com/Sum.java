package Array.com;


public class Sum {
	public void doAddition(int[]n)
	{
	int sum = 0;
	for( int i : n)
	{
	    sum +=i;
	}
	

	System.out.println("Sum of all Array Elements = : "+sum);
	}
	

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5,11,7,8,9,10};
		Sum obj = new Sum();
		obj.doAddition(n);
		
		
     	
	}
}
