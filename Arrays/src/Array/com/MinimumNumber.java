package Array.com;

public class MinimumNumber {

	public static void main(String[] args) {
		int a[]  = new int [] {55, 35, 0, 1, 60, 100};  	         
	    int min = a[0];        
	    for (int i = 0; i < a.length; i++)	    
	    {  
			 if(a[i] < min)  
		     min = a[i];  
	    }  
	    System.out.println("Minimun Number In Given Array : " + min);  

	}

}
