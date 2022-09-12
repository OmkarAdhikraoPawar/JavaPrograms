package Array.com;
import java.util.Scanner;
public class RemoveElement {
	public void removeEle(int []a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want to remove ");
		int elem = sc.nextInt();
		for(int i = 0; i < a.length; i++)
	    {
			
	      if(a[i] == elem)   //If element found
	      {
	        // shifting elements
	        for(int j = i; j < a.length - 1; j++)
	        {
	            a[j] = a[j+1];
	        }
	        break;
	      }
	    }
	      
	       System.out.println("Elements after deletion " );
	       for(int i = 0; i < a.length-1; i++)
	       {
	             System.out.print(a[i]+ " ");
	       }  
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		
		RemoveElement o = new RemoveElement();
		o.removeEle(a);

	}

}
