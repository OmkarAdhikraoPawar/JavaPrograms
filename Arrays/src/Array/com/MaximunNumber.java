package Array.com;

public class MaximunNumber {

	public static void main(String[] args) {
		
	   int a[]  = new int [] {55, 35, 1, 60, 100};  	         
	   int max = a[0];        
	   for (int i = 0; i < a.length; i++)
	   {  
		   if(a[i] > max)  
	       max = a[i];  
	   }  
	   System.out.println("Maximun Number In Given Array : " + max);  
 
	}

}
