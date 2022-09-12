package Array.com;

public class Ex {
	public void remove(int arr[],int n)
	{
		for(int j=0;j<arr.length;j++)
		{
			int cnt = 0;
			for(int i=j+1;i<arr.length;i++)
			{
				if(arr[i] == arr[j])
				{
					arr[i]=0;
					
				}
			}
			if(arr[j]!=0)
			{
				System.out.print(arr[j]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,5,6,3,5};
		int n = arr.length;
		
		Ex obj = new Ex();
		obj.remove(arr, n);
		

	}

}
