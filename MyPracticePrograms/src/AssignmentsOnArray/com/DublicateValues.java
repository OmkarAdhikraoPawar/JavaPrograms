package AssignmentsOnArray.com;

public class DublicateValues {
	public void dublicateValues(int a[])
	{
		 for (int i = 0; i < a.length-1; i++)
		 {			 
	         for (int j = i+1; j < a.length; j++)
	         {     	 
	             if ((a[i] == a[j]) && (i != j))
	             {	            	 
	                 System.out.println("Duplicate Element : "+a[j]);
	             }
	         }
	      }	
	}

	public static void main(String[] args) {
		int a[] = {3, 10, 90, 78, 56, 10, 78, 34, 61};
		DublicateValues obj = new DublicateValues();
		obj.dublicateValues(a);

	}

}
