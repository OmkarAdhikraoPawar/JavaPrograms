package Array.com;

public class Unique {
	public void values(int []arr){
		for (int j= 0; j < arr.length; j++)
		{
			int count1 = 0; // 
			for (int i = 0; i < arr.length; i++)
			{
			     if(arr[i] == arr[j] )
			     {    
			  
			      count1++; //
			     }
			 }
			 if(count1 == 1 )
			 
			    System.out.print(arr[j]+" ");
		     
		}
	}

	public static void main(String[] args) {
		int [] arr = {1,1,1,2,2,2,3,3,3,4,4,5,5,6,7,8,};
		Unique o = new Unique();
		o.values(arr);

		
	}

}
