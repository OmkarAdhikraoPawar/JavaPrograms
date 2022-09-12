package AssignmentsOnArray.com;

public class SecondMin {
	public void doSecondSmallest(int a[])
	{
		int min = Integer.MAX_VALUE;
	    int secondMin = Integer.MAX_VALUE;
	    for (int i = 0; i < a.length; i++)
	    {
	        if(a[i]==min)
	        {
	          secondMin=min;
	        } else if (a[i] < min)
	        {
	            secondMin = min;
	            min = a[i];
	        } else if (a[i] < secondMin)
            {
	            secondMin = a[i];
	        }

	    }
	    System.out.println("Second Smallest is : "+secondMin);
	}

	public static void main(String[] args) {
		int a[] = {-20, 0, -25, 15, 19, 37, 23};
		SecondMin obj = new SecondMin();
		obj.doSecondSmallest(a);

	}

}
