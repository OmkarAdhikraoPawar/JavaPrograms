import java.util.Arrays;


public class Example {
			
	public void shiftOnePosition(int arr[])
	{
		int temp =arr[0],i;
		for( i=0;i<arr.length-3;i++)
		{
			arr[i]=arr[i+3];
		}					
		arr[i]=temp;	
		System.out.println(Arrays.toString(arr));
		
	}
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		Example obj = new Example();
		obj.shiftOnePosition(arr);
		
	}

}
