import java.util.ArrayList;

public class RetainAllMethodEx
{
	
	public void retainAllArrayList(ArrayList <Integer> d ,	ArrayList <Integer> d1)
	{
		// retainAll() method gives new array of only common elements in two ArrayList
		// If there is no common elements in two ArrayList then it create new empty array
		// retainAll() method gives INSERTION
		boolean b = d.retainAll(d1); 
		System.out.println(" Value of b = "+b); 
		// If there is same element in two ArrayList then it can not create new array and gives false output
		System.out.println(d);
		
	}

	public static void main(String[] args) 
	{
		ArrayList <Integer> d = new ArrayList <> ();
		d.add(345);
		d.add(444);
		d.add(222);
		d.add(111);
		
		ArrayList <Integer> d1 = new ArrayList <> ();
        d1.add(111);
        d1.add(345);
        d1.add(888);
        d1.add(999);
//        d1.add(444);
//        d1.add(222);
        
        RetainAllMethodEx r = new RetainAllMethodEx();
        r.retainAllArrayList(d , d1);

	}
	
}


