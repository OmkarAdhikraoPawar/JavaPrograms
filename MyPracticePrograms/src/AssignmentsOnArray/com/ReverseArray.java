package AssignmentsOnArray.com;

public class ReverseArray {
	public void arrayReverseOrder(int a[])
	{
		System.out.println("Array in reverse order: ");  
        
        for (int i = a.length-1; i >= 0; i--) {   
            System.out.print(a[i] + ", ");   
        }    
	}
	

	public static void main(String[] args) {
		int a[] = {3, 90, 45, 29, 37, 78};
		ReverseArray obj = new ReverseArray();
		obj.arrayReverseOrder(a);
		

	}

}
