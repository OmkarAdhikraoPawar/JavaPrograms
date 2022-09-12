package AssignmentsOnArray.com;

public class NegativeThanPositive {
	
	static void reArrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] < 0) 
            {
                if (i != j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static void printArray(int arr[], int n)
    {
    	for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    } 
    public static void main(String args[])
    {
        int arr[] = { -1, 1, 2, -3, 4, 5, 8, 6, -7, 8, 9, 10 };
        int n = arr.length;
        
        reArrange(arr, n);
        printArray(arr, n);
    }

}
