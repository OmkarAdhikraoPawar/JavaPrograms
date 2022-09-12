package twoDArray;

import java.util.Arrays;

public class SumofRowsAndCols {
	public void sum(int a[][])
	{
		 int rows = a.length;    
	     int cols = a[0].length;    	       	           
	     for(int i = 0; i < rows; i++)
	     {    
	          int sumRow = 0;    
	          for(int j = 0; j < cols; j++)
	          {    
	              sumRow = sumRow + a[i][j];    
	          }    
	          System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
	     }    	       
	     for(int i = 0; i < cols; i++)
	     {    
	         int sumCol = 0;    
	         for(int j = 0; j < rows; j++)
	         {   	                        
	               sumCol = sumCol + a[j][i];       	             
	         }   
	         System.out.println("Sum of " + (i+1) +" column: " + sumCol);
	     }
	        
	}

	public static void main(String[] args) {
		int a[][]={{1,2,3},
				   {4,5,6},
				   {7,8,9}};  
		System.out.println(Arrays.toString(a));
		SumofRowsAndCols obj = new SumofRowsAndCols();
		obj.sum(a);

	}

}
