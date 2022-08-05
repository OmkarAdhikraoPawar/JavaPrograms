import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx {
	public void removeLength(ArrayList<String>l)
	{
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			String o = itr.next();
			int size = o.length();
			if(size>5)
			{
				itr.remove();
			}
		}
		System.out.println(l);
	}
	public void reverseString(ArrayList<String>l)
	{
		ListIterator<String> litr = l.listIterator(l.size());
		while(litr.hasPrevious())
		{
			String s = litr.previous();
			System.out.print(s+ " ");
		}
		
	}

	public static void main(String[] args) {
		ArrayList <String> l = new ArrayList <>();
		System.out.println(l);
		System.out.println(l.size());
		l.add("I");
		l.add("Like");
		l.add("Java");
		l.add("Programming");
		System.out.println(l);
			
		
		IteratorEx obj = new IteratorEx();
		obj.removeLength(l);
		obj.reverseString(l);
		
		

	}

}
