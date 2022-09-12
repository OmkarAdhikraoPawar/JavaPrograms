package AssignmentsOnArray.com;

public class ReplaceNegative {
	public void replace(int[] a)
	{
		
		System.out.print("Output :: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, -3, -19, 29, 5, -61, 44, 7, -9};
		ReplaceNegative ns=new ReplaceNegative();
		ns.replace(a);
	}

}


