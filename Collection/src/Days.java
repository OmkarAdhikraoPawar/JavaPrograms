import java.util.ArrayList;
import java.util.Iterator;

public class Days {
	public void remove(ArrayList<String>l)
	{
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			String o = itr.next();
			int size = o.length();
			if(size>7)
			{
				itr.remove();
			}
		}
		System.out.println(l);
	}
	public static void main(String[] args) {
		ArrayList <String> l = new ArrayList <>();
		System.out.println(l);
		System.out.println(l.size());
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wenesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
		System.out.println(l);
		
		Days obj = new Days();
		obj.remove(l);

	}

}
