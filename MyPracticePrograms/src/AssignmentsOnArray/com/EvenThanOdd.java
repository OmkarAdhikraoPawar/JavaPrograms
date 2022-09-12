package AssignmentsOnArray.com;

public class EvenThanOdd {
	 static void EvenIntegerThanOdd(int arr[])
	    {
	        int left = 0, right = arr.length - 1;
	        while (left < right)
	        {
	            while (arr[left]%2 == 0 && left < right)
	                left++;
	 
	            while (arr[right]%2 == 1 && left < right)
	                right--;
	 
	            if (left < right)
	            {
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	                right--;
	            }
	        }
	    }
	    public static void main (String[] args)
	    {
	        int arr[] = {10, 38, 45, 9, 5, 7, 8, 17, 33, 90, 3, 56};
	        
	        EvenThanOdd obj = new EvenThanOdd();
	        obj.EvenIntegerThanOdd(arr);
	 
	        System.out.print("Array after Even Element First : ");
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i]+" ");
	    }

}
