package Array.com;

public class ArrayFloat {

	public static void main(String[] args) {
		float a[] = new float[]{2f,3f,4f,9.55f,6f,7f};
		System.out.println("No.of Elements in array are : "+a.length);
		System.out.println("Array Elements are : ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
