package twoDArray;

import java.util.Arrays;

public class SumOfLTMatrix {
	public void lowerTMatrix(int a[][])
	{ 		
		int sum = 0;
		for(int i = 0; i < a.length ; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(i >= j) 
				{
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println(" The Sum of the Lower Triangle Matrix =  " + sum);
	}
	public static void main(String[] args) {
		int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
	
		SumOfLTMatrix obj = new SumOfLTMatrix();
		obj.lowerTMatrix(a);
		
		

	}

}
