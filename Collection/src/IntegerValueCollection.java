
import java.util.ArrayList;

public class IntegerValueCollection 
{
	// add():- Appends(add) the specified element to the end of this list
	public void addPostion(	ArrayList <Integer> l)   
	{
		l.add(12);
		l.add(121);
		System.out.println(l);
	}
	
	// addAll():- Appends (add) all of the elements in the specified collection to the end of this list
	// use of addAll() for two ArrayList add or For UNION purpose
	public void addAll(	ArrayList <Integer> l , ArrayList <Integer> l1 )   
	{
		boolean a = l.addAll(l1);
		System.out.println(a);
		System.out.println(l);
	}
	public static void main(String[] args)
	{
		ArrayList <Integer> l = new ArrayList <>();
		l.add(123);
		l.add(35);
		
		// Create second ArrayList for addAll() method 
		ArrayList <Integer> l1 = new ArrayList <>();
		l1.add(1234);
		l1.add(22);

		IntegerValueCollection obj = new IntegerValueCollection();
		System.out.println(" add() method");
		obj.addPostion(l);
		System.out.println("\naddAll() method");
		obj.addAll(l, l1);
	}

}