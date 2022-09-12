package AssignmentsOnArray.com;

import java.util.Arrays;

public class ArrayEqual {
	public static boolean areEqual(int a[], int b[])
    {
        int n = a.length;
        int m = b.length;
 
        if (n != m)
            return false ;
 
        Arrays.sort(a);
        Arrays.sort(b);
 
        for (int i = 0; i < n; i++)
            if (a[i] != b[i])
                return false;
 
        return true ;
    }
	
	public static void main(String []args){
		int a[] = {12, 22, 32, 42, 52, 62};
		int b[] = {52, 22, 62, 12, 42, 22};
		
		if(areEqual(a,b))
		{
			System.out.println("Array are Equals");
		}else
		{
			System.out.println("Array are not Equals");
		}
		
		
	}

}
