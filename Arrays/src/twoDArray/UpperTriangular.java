package twoDArray;

public class UpperTriangular {
	public void upperTriangularMatrix(int a[][])
	{
	   int rows = a.length;    
       int cols = a[0].length;    
       if(rows != cols)
       {    
           System.out.println("Matrix should be a square matrix");    
       }    
       else 
       { 
           System.out.println("Upper triangular matrix: ");    
           for(int i = 0; i < rows; i++)
           {    
               for(int j = 0; j < cols; j++)
               {    
                   if(i > j)              	   
                      System.out.print("0 ");    
                   else 
                	  System.out.print(a[i][j] + " ");    
               }    
               System.out.println();    
           }    
       }    
   }   
	public static void main(String[] args) {
		  int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};   
		  UpperTriangular obj = new UpperTriangular();
		  obj.upperTriangularMatrix(a);

	}

}
