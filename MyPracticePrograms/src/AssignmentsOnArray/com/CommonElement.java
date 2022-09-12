package AssignmentsOnArray.com;

public class CommonElement {
	public void commonElement(int a[], int b[])
	{
		for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if(a[i] == (b[j]))
                {               	
                    System.out.println("Common element is : "+(a[i]));
                }
            }
        }
	}

	public static void main(String[] args) {
		int a [] = {12, 23, 34, 67 ,78, 91, 56};
		int b [] = {39, 25, 15, 23, 55, 91, 66, 22};
		
		CommonElement obj = new CommonElement();
		obj.commonElement(a, b);
		
		
		
		
	}	

}
