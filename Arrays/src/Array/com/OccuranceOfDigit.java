package Array.com;

public class OccuranceOfDigit {
	public void occurance(int[] n) 
    { 	
	    int[] a = new int[n.length]; 
	    for(int x : n)
	    { 	    	
	        a[x]++; 
	    }   
	    for(int j=0;j<a.length;j++)
	    { 	    	
		    if (a[j] > 0)
		    { 		    	
	            System.out.println(j+" Occurs "+a[j]+" times "); 
	        } 
		   
        } 
    } 	 
	 public static void main(String[] args) {
			  
	     int[] n= {1, 4, 3, 4, 1, 6, 4, 2, 5}; 	   
	     OccuranceOfDigit od=new OccuranceOfDigit(); 
	     od.occurance(n); 
	
     } 
	 
}
