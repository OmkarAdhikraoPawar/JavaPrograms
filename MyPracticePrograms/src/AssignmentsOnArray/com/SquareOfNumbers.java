package AssignmentsOnArray.com;

public class SquareOfNumbers {
	public void square(int[] n)
	{
		int flag=0;
		for(int a=0; a<n.length;a++)
		{
		 for (int i = 1; i * i <= n[a]; i++) {
		      if ((n[a] % i == 0) && (n[a] / i == i)) {
		    	 flag=0; 
		      }
		      else
		    	 flag=1; 
		   }
		 if(flag==0)
		 System.out.print(n[a]+" ");
		}
	}

	public static void main(String[] args) {
		
		int[] n = {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
		SquareOfNumbers s=new SquareOfNumbers();
		s.square(n);
	}

}


