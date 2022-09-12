package AssignmentsOnArray.com;

public class TemporaryArray {
	static void reverse(int a[], int n)
    {
        int[] temp = new int[n];
        int j = n;
        for (int i = 0; i < n; i++)
        {
            temp[j - 1] = a[i];
            j = j - 1;
        }
  
        System.out.println("Reversed array is: ");
        for (int k = 0; k < n; k++) {
            System.out.println(temp[k]+" ");
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {3, 90, 45, 29, 37, 78};
        reverse(arr, arr.length);
    }

}
