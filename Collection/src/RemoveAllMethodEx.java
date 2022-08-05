 import java.util.ArrayList;

public class RemoveAllMethodEx 
{
	public void removeAllArrayList(ArrayList <Integer> d ,	ArrayList <Integer> d1)
	{
		// removeAll() method gives new array of without common elements in two ArrayList
		// If there is all common elements in two ArrayList then it create new empty array
		// retainAll() method gives DIFFERENCE
		boolean b = d.removeAll(d1);
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
        d1.add(444);
        d1.add(222);
        
        RemoveAllMethodEx r = new RemoveAllMethodEx();
        r.removeAllArrayList(d , d1);

	}
	
	
}	
