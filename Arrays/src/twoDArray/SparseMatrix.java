package twoDArray;

import java.util.Scanner; 

public class SparseMatrix { 
   public void checkSparse(int[][] a) 
 { 
	   int cnt=0, flag=0, col=a[0].length; 
       for(int i=0;i<a.length;i++) 
       { 
           for(int j=0;j<a[i].length;j++) 
           { 
                System.out.print(a[i][j]+" "); 
                if(a[i][j]==0) 
                cnt++; 
           } 
            System.out.println(); 
            if(cnt==col) 
            flag=1; 
       } 
       if(flag==1)    	   
           System.out.println("It's is a Sparse"); 
         else 
           System.out.println("It's is a Not Sparse");  
 }  
   public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in); 
       System.out.print("Enter the number of row and columns you want :: "); 
       int row=sc.nextInt(); 
       int col=sc.nextInt(); 
       int a[][]=new int[row][col]; 
       System.out.print("Enter Array Element :: "); 
       for(int i=0;i<row;i++) 
       { 
           for(int j=0;j<col;j++) 
           { 
               a[i][j]=sc.nextInt(); 
           } 
       } 
        SparseMatrix sp=new SparseMatrix(); 
        sp.checkSparse(a); 
        sc.close(); 
  } 
 
}