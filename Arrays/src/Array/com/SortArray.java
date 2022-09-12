package Array.com;

import java.util.Arrays;

public class SortArray {
	public void selectionSort(int a[])
	{

		System.out.println("Array Size is : "+a.length);
		for(int i=0;i<a.length;i++)
		{
			int minIdx = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[minIdx])
				{
					minIdx=j;
				}
			}
			int temp = a[minIdx];
			a[minIdx]=a[i];
			a[i]=temp;
		}
	}
	public void bubbleSort(int a[])
	{
		System.out.println("Array Size is : "+a.length);
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println("Pass "+(i+1));
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				System.out.println(Arrays.toString(a));
			}
			System.out.println();
			System.out.println("_________________________");
		}
	}

	public static void main(String[] args) {
		int a[] = {6,1,6,3,8};
		SortArray o = new SortArray();
		System.out.println("Before Sorting Array is : ");
		System.out.println(Arrays.toString(a));
		//o.bubbleSort(a);
		o.selectionSort(a);
		System.out.println("After Sorting... ");
		System.out.println(Arrays.toString(a));
	}

}
