import java.util.ArrayList;

public class RevArrayList {
	public void arrayAdd()
	{
		ArrayList <String> l = new ArrayList <>();
		System.out.println(l);
		System.out.println(l.size());
		l.add("I");
		l.add("Like");
		l.add("Java");
		l.add("Programming");
		System.out.println(l);
		reverse(l);
		
		
	}
	public void reverse(ArrayList<String>l)
	{
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.println(l.get(i));
		}
	}
	public void evenNo()
	{
		ArrayList<Integer> l = new ArrayList<>();
		System.out.println(l);
		System.out.println(l.size());
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				l.add(i);
			}
		}
		System.out.println(l);
	}

	public static void main(String[] args) {
		RevArrayList obj = new RevArrayList();
		obj.arrayAdd();
		System.out.println("________________________________");
		obj.evenNo();
		

	}

}
