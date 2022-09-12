package Array.com;

public class SecondMax {
	int max, secondMax;
	public void doSecondMax(int []n)
	{
	   if(n[0]>n[1])
	   {
		   max = n[0];
		   secondMax = n[1];
	   }else
	   {
		   max = n[0];
		   secondMax = n[1];
	   }
	   for(int i=2;i<n.length; i++)
	   {
		   if(n[i]>max)
		   {
			   secondMax = max;
			   max = n[i];
		   }else if(n[i]>secondMax)
		   {
			   secondMax = n[i];
		   }
	   }
	   System.out.println("Second Max : "+secondMax);
	}   
	public static void main(String[] args) {
		int n[]= {1,3,4,7,-2,-5};
		SecondMax obj = new SecondMax();
		obj.doSecondMax(n);
	    
	}

}
