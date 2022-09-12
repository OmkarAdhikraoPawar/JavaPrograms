package AssignmentsOnArray.com;

import java.util.Arrays;

public class SpecifiedElements 
{
	public static boolean result(int[] a, int num1, int num2)
	{
	    for (int number : a) 
	    {	    	
	        boolean r = number != num1 && number != num2;
	        if (r)
	        {	    	  
	            return false;
	        }
	    }
	    return true;
    }

	

	public static void main(String[] args) {
		int[] a = {77, 77, 65, 65, 65, 77};
		System.out.println("Original Array: "+Arrays.toString(a)); 
		int num1 = 77;
	    int num2 = 65;
	    System.out.println("Result: "+result(a, num1, num2));
	    SpecifiedElements obj = new SpecifiedElements();
	    obj.result(a, num1, num2);

	}

}
