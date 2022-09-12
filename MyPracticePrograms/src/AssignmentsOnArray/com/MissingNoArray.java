package AssignmentsOnArray.com;
import java.util.Scanner;
public class MissingNoArray {
	public void missingNo(int a[])
	{
			System.out.print("The Missing Number is  :: ");
			for(int i=1;i<a.length;i++)
			{
				if(a[i-1]+1!=a[i])
						System.out.print(a[i-1]+1+" ");
			}	
		
	 }
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Size of Array :: ");
			int n=sc.nextInt();
			System.out.print("Enter the Element of Array :: ");
			int[] a=new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			MissingNoArray mn=new MissingNoArray();
			mn.missingNo(a);
			sc.close();
		}


}
