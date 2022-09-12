package AssignmentsOnArray.com;

public class Replace0To1 {
	public void replace(int[] a)
	{
		
		System.out.print("Output :: ");
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==0)
				a[i]=1;
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int[] a= {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		Replace0To1 zo=new Replace0To1();
		zo.replace(a);
	}


}
