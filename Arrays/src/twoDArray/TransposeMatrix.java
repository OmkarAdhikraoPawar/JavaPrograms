package twoDArray;

public class TransposeMatrix {
	public void transposeMat(int a[][])
	{
		int transpose[][]=new int[3][3];  
		for(int i=0;i<3;i++)
		{  
		    for(int j=0;j<3;j++)
		    {    
		        transpose[i][j]=a[j][i];  
		    }    
		}    		  
		System.out.println("Printing Matrix without transpose:");  
		for(int i=0;i<3;i++)
		{    
		    for(int j=0;j<3;j++)
		    {    
		        System.out.print(a[i][j]+" ");    
		    }    
		    System.out.println();//new line    
		}    
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++)
		{ 			
		    for(int j=0;j<3;j++)
		    {    
		        System.out.print(transpose[i][j]+" ");    
		    }    
		System.out.println();    
		}    		
	}
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};  
		TransposeMatrix obj = new TransposeMatrix();
		obj.transposeMat(a);
		

	}

}
